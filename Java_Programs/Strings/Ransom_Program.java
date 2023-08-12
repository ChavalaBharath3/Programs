
// Input: ransomNote = "aa", magazine = "aab"
// Output: true
import java.util.*;

public class Ransom_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word ransom: ");
        String ransom = sc.nextLine();
        System.out.print("Enter the word magzine: ");
        String magzine = sc.nextLine();
        System.out.println(canConstruct(ransom, magzine));
    }

    public static boolean canConstruct(String ransom, String magzine) {
        // magzine length >= ranson
        // comparing the character of ransom in the magzine present or not
        // if magize contains the word replace that first occurance of word to ""(with
        // empty space)
        // else return false
        int ransom_Length = ransom.length();
        int magzine_Length = magzine.length();
        char[] ransom_Ch_Arr = ransom.toCharArray();
        if (magzine_Length <= ransom_Length) {
            return false;
        }
        for (char ransom_Ch : ransom_Ch_Arr) {
            if (magzine.contains(Character.toString(ransom_Ch))) {
                magzine = magzine.replaceFirst(Character.toString(ransom_Ch), "");
            } else {
                return false;
            }
        }
        return true;
    }
}