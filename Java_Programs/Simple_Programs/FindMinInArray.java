import java.util.*;

class FindMinArray {
    public static void main(String args[]) {
        String arr[] = { "Bharath", "Vishnu", "Manojxhsjel" };
        int size = arr.length;
        int min = Math.min(arr[0].length(), arr[size - 1].length());
        System.out.println(min);
    }
}