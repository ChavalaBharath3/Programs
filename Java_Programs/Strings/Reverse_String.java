import java.util.*;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String str = sc.next();
        char ch_Arr[] = str.toCharArray();
        System.out.println(Arrays.toString(ch_Arr));
        reverse_String(ch_Arr);
    }

    public static void reverse_String(char[] ch_Arr) {
        int left = 0;
        int right = ch_Arr.length - 1;
        while (left < right) {
            char temp = ch_Arr[left];
            ch_Arr[left] = ch_Arr[right];
            ch_Arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(ch_Arr));
    }
}