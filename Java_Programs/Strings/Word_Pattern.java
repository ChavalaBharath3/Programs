import java.util.*;

public class Word_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string1 value: ");
        String pattern = sc.nextLine();
        System.out.print("Enter the string2 value: ");
        String s = sc.nextLine();
        System.out.println(Word_Pattern.isWordPattern(pattern, s));
        sc.close();
    }

    public static boolean isWordPattern(String pattern, String s) {
        // input pattern = 'aba'
        // str s = "ram sai ram"
        // output return true
        // a-ram, b-sai
        String arr[] = s.split(" ");
        char ch_Arr[] = pattern.toCharArray();
        // hashmap
        HashMap<String, Character> map = new HashMap<>();
        for (int i = 0; i < ch_Arr.length; i++) {
            if (!map.containsKey(arr[i]) && !map.containsValue(ch_Arr[i])) {
                map.put(arr[i], ch_Arr[i]);
            } else if (!map.containsKey(arr[i]) && map.containsValue(ch_Arr[i])) {
                return false;
            } else {
                if (ch_Arr[i] != map.get(arr[i]))
                    return false;
            }
        }
        return true;
    }
}