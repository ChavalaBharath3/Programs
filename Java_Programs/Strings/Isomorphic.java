import java.util.Scanner;
// import java.Arrays;
import java.util.Arrays;

class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || t.length() <= 0) {
            return false;
        }
        int[] mappingDictStoT = new int[256];
        Arrays.fill(mappingDictStoT, -1);

        int[] mappingDictTtoS = new int[256];
        Arrays.fill(mappingDictTtoS, -1);
        // get each char from s and t
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (mappingDictStoT[ch1] == -1 && mappingDictTtoS[ch2] == -1) {
                mappingDictStoT[ch1] = ch2;
                mappingDictTtoS[ch2] = ch1;
            } else {
                if (mappingDictStoT[ch1] != ch2 && mappingDictTtoS[ch2] != ch1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1 value: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the string2 value: ");
        String t1 = sc.nextLine();
        System.out.println(Isomorphic.isIsomorphic(s1, t1));
        sc.close();
    }
}