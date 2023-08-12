import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Program1 {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 12, 54, 123 };
        System.out.println(arr.length);
        System.out.print("Before sorting the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.print("After sorting the Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        String arr_String[] = { "Bharath", "Ganesh", "Vishnu", "Manoj", "kalyan", "Ravi" };
        Arrays.sort(arr_String);
        System.out.println("After sorting String: ");
        for (String i : arr_String) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr_String, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr_String));
    }
}