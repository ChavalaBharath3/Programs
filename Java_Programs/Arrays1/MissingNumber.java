import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the noOf elements: ");
        int noOfEle = sc.nextInt();
        int arr[] = new int[noOfEle];
        for (int i = 0; i < noOfEle; i++) {
            System.out.print("Enter the element at index[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNo(arr, noOfEle));
    }

    /*
     * Input: nums = [3,0,1]
     * Output: 2
     * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range
     * [0,3]. 2 is the missing number in the range since it does not appear in nums.
     * Steps:
     * 1)for until the length equals to the number i if any number not equals to
     * that
     * number break and return the number
     */
    public static int missingNo(int[] arr, int noOfEle) {
        Arrays.sort(arr);
        for (int i = 0; i < noOfEle; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return -1;
    }
}