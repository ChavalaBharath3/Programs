
/*
 * You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. The string is separated into n + 1 groups by n dashes. You are also given an integer k.

We want to reformat the string s such that each group contains exactly k characters, except for the first group, which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.

Return the reformatted license key.

 

Example 1:

Input: s = "5F3Z-2e-9-w", k = 4
Output: "5F3Z-2E9W"
Explanation: The string s has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.
 */
import java.util.*;

public class LicenceKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the group value: ");
        int groupValue = scanner.nextInt();
        System.out.println(checkLicencekey(str, groupValue));

    }

    /*
     * Steps:
     * 1)find total char in string
     * 2)assign sizeOfFirstGroup if given totalchar%k or sizeOFFirst ==0 ->size = k;
     * 3)sb ans
     * 4)i,count,while->condition using if condition when to break the loop and
     * assign uppper
     * case to string builder using if condition
     * 5)i is to be incremented after complition of firstgroup append '-'
     * 6)secound group taking i value and iterating the while loop, assign
     * char to the sb the char that doesnot contain '-', assign to upper case,
     * increment the count and check
     * the condition to append dash '-'
     * 7)return sb.toString();
     * Input: s = "5F3Z-2e-9-w", k = 4
     * Output: "5F3Z-2E9W"
     */
    public static String checkLicencekey(String string, int groupValue) {
        // finding total char of the string
        int totalChars = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != '-') {
                totalChars++;
            }
        }
        // if totalchar contains odd value sizeofFirstGroup = toatalchar % k
        // else sizeOfFirstGroup = k
        int sizeOfFirstGroup = (totalChars % groupValue);
        if (sizeOfFirstGroup == groupValue) {
            sizeOfFirstGroup = groupValue;
        }
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int count = 0;
        while (i < string.length()) {
            if (count == sizeOfFirstGroup) {
                count = 0;
                break;
            }
            if (string.charAt(i) != '-') {
                ans.append(Character.toUpperCase(string.charAt(i)));
                count++;
            }
            i++;
        }
        ans.append('-');
        while (i < string.length()) {
            if (string.charAt(i) != '-') {
                if (count == groupValue) {
                    ans.append('-');
                    count = 0;
                }
                ans.append(Character.toUpperCase(string.charAt(i)));
                count++;
            }
            i++;
        }
        return ans.toString();
    }
}