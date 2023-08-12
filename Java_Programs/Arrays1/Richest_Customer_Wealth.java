import java.util.ArrayList;
import java.util.List;

/*
 * Input: accounts = [[1,5],[7,3],[3,5]]
 * Output: 10
 * Explanation:
 * 1st customer has wealth = 6
 * 2nd customer has wealth = 10
 * 3rd customer has wealth = 8
 * The 2nd customer is the richest with a wealth of 10.
 */
/*
 * Steps:
 * step1-->ArrayList with list taking each list by adding elements keep that
 * element as max
 * step2--> return the maximum element
 */
import java.util.*;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        // ArrayList<ArrayList<Integer>> NestedList = new
        // ArrayList<ArrayList<Integer>>();
        int arr[][] = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        int results = maxValue(arr);
        System.out.println(results);
    }

    static int maxValue(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int rowSum = 0;
            for (int column = 0; column < arr[row].length; column++) {
                rowSum = rowSum + arr[row][column];
            }
            // max = Integer.max(max, rowSum);
            if (rowSum > max) {
                max = rowSum;
            }
        }
        return max;
    }
}