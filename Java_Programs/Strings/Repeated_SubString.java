
/*
 * Given a string s, check if it can be constructed by taking a substring of it
 * and appending multiple copies of the substring together.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "abab"
 * Output: true
 * Explanation: It is the substring "ab" twice.
 */
import java.security.Key;
import java.util.*;

public class Repeated_SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.nextLine();
        boolean bl = subStringMethod(str);
        System.out.println(bl);
    }

    /*
     * steps:
     * 1)Taking string input from keyboard
     * 2)using hashmap count the character occurance
     * 3) if each character occurance twice/four return true
     * 4)else return false
     */
    public static boolean subStringMethod(String str) {
        int str_len = str.length();
        int k = 0;
        char arr[] = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str_len; i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map.toString());
        int value = map.get(arr[k]);
        boolean bl = map.values().stream().allMatch(val -> val == value);
        return bl;
    }
}