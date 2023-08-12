import java.lang.annotation.Target;
import java.util.Arrays;

public class SearchElementIndex {
    public static void main(String[] args) {
        int arr[][] = {
                { 12, 3, 72 },
                { 35, 87, 65, 9 },
                { 45, 78, 2 },
                { 34, 5, 1, 7, 67, 45, 5 }
        };
        int target = 78;
        int[] results = search(arr, target);
        System.out.println(Arrays.toString(results));
    }

    // search eleemnt
    // input: arr[][] target 78
    // output: [row][coloumn] = [2][1]
    public static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[] { row, column };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}