
/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
*/
import java.util.*;

public class First_Unique_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int index_Value = unique_Char(str);
        System.out.println(index_Value);
    }

    public static int unique_Char(String s) {
        // hashmap<Character, integer>
        // character key and integer value constists of times that character has
        // map does not allows duplicate values
        // for loop to get the first index of the unique char in the hashmap
        int str_Length = s.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str_Length; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map.toString());
        for (int i = 0; i < map.size(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}