import java.util.*;
import java.io.*;

public class knn_classify {
    private List<double[]> trainingData;
    private List<double[]> testData;
    private int k;

    public knn_classify(String trainingFile, String testFile, int k) {
        this.trainingData = readFile(trainingFile);
        this.testData = readFile(testFile);
        this.k = k;
    }

    // Reads data from a file and returns a list of double arrays
    private List<double[]> readFile(String filename) {
        List<double[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.trim().split("\\s+");
                double[] instance = new double[values.length];
                for (int i = 0; i < values.length; i++) {
                    instance[i] = Double.parseDouble(values[i]);
                }
                data.add(instance);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    // Calculates the mean and standard deviation of each column in the dataset
    private List<Map<String, Double>> getMeanNdStdDeviation(List<double[]> dataSet) {
        List<Map<String, Double>> meanStd = new ArrayList<>();
        int numColumns = dataSet.get(0).length;
        for (int i = 0; i < numColumns - 1; i++) {
            List<Double> column = new ArrayList<>();
            for (double[] row : dataSet) {
                column.add(row[i]);
            }
            double mean = column.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            double std = Math.sqrt(column.stream().mapToDouble(x -> Math.pow(x - mean, 2)).average().orElse(0.0));
            Map<String, Double> stats = new HashMap<>();
            stats.put("mean", mean);
            stats.put("std", std);
            meanStd.add(stats);
        }
        return meanStd;
    }

    // Normalize the dataset using the calculated mean and standard deviation
    private void dataNormalizer(List<Map<String, Double>> meanStd, List<double[]> dataSet) {
        for (double[] row : dataSet) {
            for (int i = 0; i < row.length - 1; i++) {
                double mean = meanStd.get(i).get("mean");
                double std = meanStd.get(i).get("std");
                row[i] = (row[i] - mean) / std;
            }
        }
    }

    // Calculates the Euclidean distance between two data points
    private double getDistance(double[] row1, double[] row2) {
        double dist = 0.0;
        for (int i = 0; i < row1.length - 1; i++) {
            dist += Math.pow(row1[i] - row2[i], 2);
        }
        return Math.sqrt(dist);
    }

    // Finds the k nearest neighbors for a given test row
    private List<double[]> findNeighbors(List<double[]> trainingData, double[] testRow, int k) {
        List<double[]> distances = new ArrayList<>();
        for (double[] trainingRow : trainingData) {
            double dist = getDistance(trainingRow, testRow);
            distances.add(new double[]{dist, trainingRow[trainingRow.length - 1]});
        }
        distances.sort(Comparator.comparingDouble(a -> a[0]));
        List<double[]> neighbors = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            neighbors.add(distances.get(i));
        }
        return neighbors;
    }

    // Predicts the class label for a given test row based on the k nearest neighbors
    private int classPredictor(List<double[]> trainingData, double[] testRow, int k) {
        List<double[]> neighbors = findNeighbors(trainingData, testRow, k);
        Map<Double, Integer> counts = new HashMap<>();
        for (double[] neighbor : neighbors) {
            double output = neighbor[1];
            counts.put(output, counts.getOrDefault(output, 0) + 1);
        }
        List<Integer> v = new ArrayList<>(counts.values());
        int maxCount = Collections.max(v);
        int prediction = 0;
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == maxCount) {
                prediction = entry.getKey().intValue();
                break;
            }
        }
        return prediction;
    }

    // Returns a map of class labels and their corresponding counts for a given test row
    private Map<Double, Integer> fetchCount(List<double[]> trainingData, double[] testRow, int k) {
        List<double[]> neighbors = findNeighbors(trainingData, testRow, k);
        Map<Double, Integer> counts = new HashMap<>();
        for (double[] neighbor : neighbors) {
            double output = neighbor[1];
            counts.put(output, counts.getOrDefault(output, 0) + 1);
        }
        return counts;
    }

    // Prints the classification results for a test instance
    private void printResults(int id, int predictedClass, int trueClass) {
        System.out.printf("ID=%5d, predicted=%3d, true=%3d%n", id, predictedClass, trueClass);
    }

    // Performs classification on the test data and prints the accuracy
    public void classify() {
        List<Map<String, Double>> meanStd = getMeanNdStdDeviation(trainingData);
        dataNormalizer(meanStd, trainingData);
        dataNormalizer(meanStd, testData);
        double classificAccuracy = 0.0;
        for (int i = 0; i < testData.size(); i++) {
            double[] testRow = testData.get(i);
            int predictedClass = classPredictor(trainingData, testRow, k);
            int trueClass = (int) testRow[testRow.length - 1];
            double accuracy = 0.0;
            Map<Double, Integer> counts = fetchCount(trainingData, testRow, k);
            List<Integer> v = new ArrayList<>(counts.values());
            if (v.indexOf(Collections.max(v)) == v.lastIndexOf(Collections.max(v)) && predictedClass == trueClass) {
                accuracy = 1.0;
            } else if (v.indexOf(Collections.max(v)) != v.lastIndexOf(Collections.max(v))
                    && counts.get((double) predictedClass) == Collections.max(v)) {
                accuracy = 1.0 / Collections.frequency(v, Collections.max(v));
            }
            printResults(i, predictedClass, trueClass);
            classificAccuracy += accuracy;
        }
        classificAccuracy /= testData.size();
        System.out.printf("classification accuracy = %6.4f%n", classificAccuracy);
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java knn_classify <training_file> <test_file> <k>");
            return;
        }
        String trainingFile = "/Users/bharathchowdary/Downloads/6234503996628556_File (1)/nearest neighbors/pendigits_training.txt";
        String testFile = "/Users/bharathchowdary/Downloads/6234503996628556_File (1)/nearest neighbors/pendigits_test.txt";
        int k = Integer.parseInt(args[2]);
        knn_classify knn = new knn_classify(trainingFile, testFile, k);
        knn.classify();
    }
}
