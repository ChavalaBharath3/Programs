public class MaxElement {
    public static void main(String[] args) {
        int arr[][] = {
                { 12, 3, 72 },
                { 35, 87, 65, 9 },
                { 45, 78, 2 },
                { 34, 5, 1, 7, 67, 45, 5 }
        };
        int results = maxElement(arr);
        System.out.println(results);
    }

    public static int maxElement(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] > max) {
                    max = arr[row][column];
                }
            }
        }
        return max;
    }
}