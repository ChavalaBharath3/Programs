import java.util.*;

public class Longest_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s1 = sc.nextLine();
        String results = isPalindrome(s1);
        System.out.println(results);
    }

    /*
     * A palindrome consists of letters with equal partners, plus possibly a unique
     * center (without a partner). The letter i from the left has its partner i from
     * the
     * right. For example in 'abcba', 'aa' and 'bb' are partners,
     * and 'c' is a unique center.
     */
    /*
     * Given a string s which consists of lowercase or uppercase letters, return the
     * length of the longest palindrome that can be built with those letters.
     * 
     * Letters are case sensitive, for example, "Aa" is not considered a palindrome
     * here.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "abccccdd"
     * Output: 7
     * Explanation: One longest palindrome that can be built is "dccaccd", whose
     * length is 7.
     */
    /*
     * input :abcba
     * output :aacbb
     * conditions : 1)partterns value should come first and unique value in the
     * center
     * Steps:
     * 1)Taking single string from the input using scanner and passing value to the
     * method
     * 2)forming string value to character array
     * 3)HashMap<Character, Integer> map = new HashMap<Character, Integer>()use
     * hashmap
     * map.put(ch[i],map.getOrDefault(ch[i],0)+1)
     * 
     */
    public static String isPalindrome(String s1) {
        char ch_Arr[] = s1.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ch_Arr.length; i++) {
            char c = s1.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map.toString());
        StringBuilder sb = new StringBuilder();
        for (Character key : map.keySet()) {
            int value = map.get(key);
            for (int i = 0; i < value; i++) {
                sb.append(key);
            }
        }
        String str = sb.toString();
        return str;
    }

}