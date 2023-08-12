
//Not Resolved
/*
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by 
 * array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) 
 * the container can contain is 49.
 * Steps:
 * 1)sort the array
 * 2)take last two elements if last two elements have same value take last but one value
 * 3)place that two values in new array and multiply that two values in the array 
 *   and return
 */
import java.util.*;

public class Container {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        Arrays.sort(arr);
        int lenArr = arr.length;
        System.out.println(waterContains(arr, lenArr));
    }

    public static int waterContains(int arr[], int lenArr) {
        int newArr[] = new int[2];
        int results = 0;
        int lenArr1 = lenArr - 1;
        for (int i = 0; i <= lenArr1; i++) {
            newArr[i] = arr[lenArr1];
            if (arr[lenArr1] != arr[lenArr1 - 1]) {
                // sorted array -> {1,2,3,4,5,6,7,8,8}
                newArr[i + 1] = arr[lenArr - 1];
            } else {
                newArr[i + 1] = arr[lenArr1 - 2];
            }
        }
        for (int j = 0; j < 1; j++) {
            results = newArr[j] * newArr[j + 1];
        }
        return results;
    }
}