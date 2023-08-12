
/*
 * Equi-directional
 * input:[1,9,-1,-2,7,3,-1,2]
 * output:13
 * Explanation: [9,-1,-2,7]
 */
/*
 * Brute Force Solution:
 */
import java.util.*;
import java.math.*;

public class EquiDirectional {
    public static void main(String[] args) {
        int[] arr = { 1, 9, -1, -2, 7, 3, -1, 2 };
        int k = 4;
        System.out.println(maxSum(arr, k));
    }

    public static int maxSum(int arr[], int k) {

        int mSum = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            int wSum = 0;
            for (int j = i; j < i + k; j++) {
                wSum = wSum + arr[j];
            }
            mSum = Math.max(wSum, mSum);
        }
        return mSum;
    }
}