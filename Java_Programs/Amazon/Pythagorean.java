
/*
   Input: arr[] = {3, 1, 4, 6, 5} 
   Output: True 
   There is a Pythagorean triplet (3, 4, 5).
   formula a^2+b^2 = c^2
   Here 3^2 + 4^2 = 5^2 -> 9+16 = 25 (True)
   Find the possibilities that two number equals to the number of that square
*/
import java.util.*;
import java.math.*;

public class Pythagorean {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 6, 5 };
        System.out.println("Array before sorting and square: ");
        System.out.println(Arrays.toString(arr));
        /*
         * Steps:
         * 1) square the array
         * 2) sort the array -> {1,9,16,25,36}
         * 2) taking index i=0 and lastelement of the array as 36,
         * let take r as the last but one element if arr[i]+arr[r]<36
         * increment the i value index else decrement
         * 3) arr[i] = arr[r] return true;
         */
        // sqaure the array
        int squareArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            squareArr[i] = arr[i] * arr[i];
        }
        Arrays.sort(squareArr);
        System.out.println("After sorting and square the values: \n" + Arrays.toString(squareArr));
        System.out.println(checkPthagorean(squareArr));
    }

    public static boolean checkPthagorean(int[] squareArr) {
        int r = squareArr.length - 2;
        int l = squareArr.length - 1;
        int j = 0;
        for (int i = 0; i < squareArr.length; i++) {
            if ((squareArr[j] + squareArr[r]) < squareArr[l]) {
                j++;
            } else if ((squareArr[j] + squareArr[r]) > squareArr[l]) {
                j = 0;
                r = r - 1;
                l = l - 1;

            } else if (squareArr[j] + squareArr[r] == squareArr[l]) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
