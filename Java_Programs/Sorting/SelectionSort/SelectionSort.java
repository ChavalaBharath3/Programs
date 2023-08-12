import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 4,5,3,2,1 };
        slectionElement(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void slectionElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    public static void swap(int arr[], int first, int secound) {
        int temp = arr[first];
        arr[first] = arr[secound];
        arr[secound] = temp;
    }

    public static int getMaxIndex(int arr[], int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}