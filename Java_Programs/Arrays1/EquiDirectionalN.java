import java.math.*;

public class EquiDirectionalN {
    public static void main(String[] args) {
        int[] arr = { 1, 9, -1, -2, 7, 3, -1, 2 };
        int k = 4;
        int windowSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length - k; i++) {
            windowSum = windowSum + arr[i];
        }
        for (int end = k; end < arr.length; end++) {
            windowSum = windowSum + arr[end] - arr[end - k];
            maxSum = Math.max(windowSum, maxSum);
        }
        System.out.println(maxSum);
    }

}