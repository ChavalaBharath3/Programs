import java.util.Arrays;

public class FindFirstAndLastPostion {
    public static void main(String[] args) {
        int results[] = new int[2];
        int arr[] = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;
        int firstOccurance = firstIndex(arr, target);
        int lastOccurance = lastIndex(arr, target);
        results[0] = firstOccurance;
        results[1] = lastOccurance;
        System.out.println(Arrays.toString(results));

    }

    public static int firstIndex(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (arr[mid] == target) {
                ans = mid;
            }
        }
        return ans;
    }

    public static int lastIndex(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (arr[mid] == target) {
                ans = mid;
            }
        }
        return ans;
    }
}