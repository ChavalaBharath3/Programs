import java.util.*;

public class Hello1 {
    public static void main(String[] args) {
        System.out.print("Enter the Sentence: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(sentence);
        System.out.println(isPalindrome(sentence));
    }

    public static boolean isPalindrome(String s) {
        char ch;
        String new_String = "";
        String s2 = s.replace("[\\-,\\+,\\.,\\^:]", "");
        String s1 = s2.replaceAll("\\s", "");
        String s1_Lower = s1.toLowerCase();
        System.out.println(s1_Lower);
        for (int i = 0; i <= s1_Lower.length() - 1; i++) {
            ch = s1_Lower.charAt(i);
            new_String = ch + new_String;
        }
        if (new_String.equals(s1_Lower)) {
            return true;
        } else {
            return false;
        }
    }
}