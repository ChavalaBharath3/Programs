
/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
*/
/*Steps: 
 * Taking two strings input 
 * The string2 should be greater than string1
 * finding does string1 value contains in string2
 * Taking single character from string1 and finding where that value present in string2
 * count the value in string1 and that count value should be equal to string2 value
 */
import java.util.*;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the string1: ");
        String str1 = sc.nextLine();
        // System.out.print("Enter the string2: ");
        String str2 = sc.nextLine();
        Boolean bl = subsequence_Method(str1, str2);
        System.out.println(bl);
    }
    /*
     * Steps:
     * Taking two strings input
     * The string2 should be greater than string1
     * finding does string1 value contains in string2
     * Taking single character from string1 and finding where that value present in
     * string2
     * count the value in string1 and that count value should be equal to string2
     * value
     */

    public static boolean subsequence_Method(String str1, String str2) {
        int count = 0;
        char ch_Arr1[] = str1.toCharArray();
        char ch_Arr2[] = str2.toCharArray();
        if (str1.length() > str2.length()) {
            return false;
        }
        for (int i = 0; i < ch_Arr1.length; i++) {
            for (int j = 0; j < ch_Arr2.length; j++) {
                if (ch_Arr1[i] == ch_Arr2[j]) {
                    count++;
                }
            }
        }
        if (count == ch_Arr1.length) {
            return true;
        }
        return false;
    }
}