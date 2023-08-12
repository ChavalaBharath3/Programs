import java.util.*;

/*
 * Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr = { -1, 2, 1, -4 };
        int target = 1;
        int results = threeSum(arr, target);
        System.out.println(results);
    }

    public static int threeSum(int arr[], int target) {
        Arrays.sort(arr);
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == target) {
                    count++;
                    while (j < 0 && arr[j] == arr[j - 1]) {
                        j++;
                    }
                } else if (arr[i] + arr[j] + arr[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return count;
    }
}