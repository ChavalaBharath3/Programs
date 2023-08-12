
/*
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not
 * matter.
 */
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> tripletsList = threeSum(arr);
        System.out.println(tripletsList.toString());
    }

    public static List<List<Integer>> threeSum(int arr[]) {
        Arrays.sort(arr);
        int len = arr.length;
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        for (int i = 0; i < len; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == 0) {
                    triplets.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
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
        return triplets;
    }
}
