import java.util.*;

/*Steps to implement 
1.empty string array --> return ""
2.having only one string ---> return arr[0]
3.sorting of array
4.finding the min value--> end
5.Reading the value using while condition until the two strings equals
6.substring using the iterator value
*/
class CommonPrefix {
    public String longestCommonPrefix(String[] aStrings) {
        int size = aStrings.length;
        if (size == 0) {
            return "";
        }
        if (size = 1) {
            return aStrings[0];
        }
        Arrays.sort(aStrings);
        int end = Math.min(arr[0], arr[size - 1].length());
        int i = 0;
        while (i < end && arr[0].charAt[i] == arr[size - 1].charAt[i]) {
            i++;
        }
        String pre = aStrings[0].substring(0, i);

        return pre;
    }

    public static void main(String args[]) {
        String arr[] = { "Geeks", "GeeksForOne", "GeeksForGeeks" };
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        CommonPrefix cp = new CommonPrefix();
        System.out.println(cp.longestCommonPrefix(arr));
    }
}