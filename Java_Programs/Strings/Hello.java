import java.util.*;
import java.Scanner;

public class Hello {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pharase: ");
        String string_Value = sc.nextLine();
        System.out.println(string_Value);
        String last_Word = string_Value.substring(string_Value.lastIndexOf(" ") + 1);
        System.out.println(last_Word);
        for (int i = 0; i < last_Word.length(); i++) {
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}