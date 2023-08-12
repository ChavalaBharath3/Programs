/*
 * input: {87,56,42,34,31,22,13}
 * target = 31;
 * output = 31
 */
public class BinarySearchDsc {
    public static void main(String[] args) {
        int arr[] = { 87, 56, 42, 34, 31, 22, 13 };
        int target = 31;
        int results = search(arr, target);
        System.out.println(results);
    }

    static int search(int arr[], int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (target < arr[midIndex]) {
                startIndex = midIndex + 1;
            } else if (target > arr[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }
}