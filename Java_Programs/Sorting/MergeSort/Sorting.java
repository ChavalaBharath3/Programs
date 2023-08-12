
import java.util.Arrays;

/*{5,4,3,2,1} -> n
 * n/2*/
public class Sorting {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int sortedArray[] = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] mergeSort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] sortedArray = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                sortedArray[k] = first[i];
                i++;
            } else {
                sortedArray[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            sortedArray[k] = first[i];
            i++;
            k++;
        }
        while (j < first.length) {
            sortedArray[k] = second[j];
            j++;
            k++;
        }
        return sortedArray;
    }
}

