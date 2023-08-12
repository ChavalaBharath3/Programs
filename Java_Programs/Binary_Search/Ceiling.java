/*
 * input:arr= {7,3,5,9,14,16,18},target = 15
 * output : 16 or index 5
 * Ceiling means return the index or value that the smallest value form the greater number
 * smallest number from greater values >=target
 */
public class Ceiling {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 8, 12, 45, 55 };
        int target = 14;
        int results = searchValueOrIndex(arr, target);
        System.out.println(results);
    }

    public static int searchValueOrIndex(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return arr[start];
    }
}