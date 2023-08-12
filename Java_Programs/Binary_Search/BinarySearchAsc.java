/*
 * input arr = {2,5,6,8,12,45,55}
 * target = 12
 * output 4, Index 4 is the element of 12
 */
public class BinarySearchAsc {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 8, 12, 45, 55 };
        int target = 12;
        int results = search(arr, target);
        System.out.println(results);

    }

    static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}