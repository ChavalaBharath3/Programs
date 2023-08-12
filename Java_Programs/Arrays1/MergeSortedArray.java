
/*
 * Steps: 
 * 1)Scanner object taking to 4 inputs array values and their sizes
 * 2)passing those values to the method 
 * 3)example input: Input: nums1 = [1,2] m = 2, nums2 = [2,5], n = 2
     Output: [1,2,2,5]
 * 4)define a for loop start the index from i=length of the array -1 
 * and condition i<m+n i++
 * 5)In this is for loop append all the num2 values into the num1
 * 6)return the num1 array values
 */
import java.util.*;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in array1: ");
        int m = sc.nextInt();
        System.out.print("Enter no of elements in array2: ");
        int n = sc.nextInt();
        int num1[] = new int[m];
        int num2[] = new int[n];
        for (int i = 0; i < num1.length; i++) {
            System.out.print("Enter the element for the array1 at index[" + i + "]");
            num1[i] = sc.nextInt();
        }
        for (int i = 0; i < num2.length; i++) {
            System.out.print("Enter the element for the array2 at index[" + i + "]");
            num2[i] = sc.nextInt();
        }

        MergeSortedArray ma = new MergeSortedArray();

        System.out.println(Arrays.toString(ma.mergeSort(num1, m, num2, n)));
    }

    public int[] mergeSort(int[] num1, int m, int[] num2, int n) {
        int results[] = new int[m + n];
        int j = 0;
        for (int i = 0; i < m; i++) {
            results[i] = num1[i];
        }
        for (int i = m; i < m + n; i++) {
            results[i] = num2[j++];
        }
        Arrays.sort(results);
        return results;
    }
}
