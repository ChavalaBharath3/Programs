import java.util.*;

public class Valid_Anagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1 value: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the string2 value: ");
        String t1 = sc.nextLine();
        System.out.println(Valid_Anagram.isAnagram(s1, t1));
        sc.close();
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch2.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }
}