
/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

 

Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
*/
import java.util.*;

public class Add_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String value1: ");
        String str1 = sc.next();
        System.out.print("Enter the String value2: ");
        String str2 = sc.next();
        String results = add(str1, str2);
        System.out.println(results);
    }

    /*
     * Steps:
     * 1)convert the s1 and s2 into integer using the method valueOf(String arg) or
     * parseInt(String arg)
     * 2)after that add two values and return in the form of string
     */
    public static String add(String s1, String s2) {
        int s1_Int = Integer.parseInt(s1);
        int s2_Int = Integer.parseInt(s2);
        int result = s1_Int + s2_Int;
        // System.out.println(result);
        String result_In_Str = Integer.toString(result);
        return result_In_Str;
    }
}