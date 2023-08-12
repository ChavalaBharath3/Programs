import java.lang.annotation.Target;

/*
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 */
public class FirstandLastPosition {

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 7, 7, 7, 12, 15 };
        int target = 7;
        int results[] = searchRange(arr, target);
        for (int i = 0; i <= results.length - 1; i++) {
            System.out.println(results[i]);
        }
        System.out.println();
    }

    static int[] searchRange(int arr[], int target) {
        int ans[] = { -1, -1 };
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int arr[], int target, boolean firstOccurance) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {

                ans = mid;
                if (firstOccurance == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;

    }
}