
/*
Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

 

Example 1:

Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
*/
import java.util.*;

public class Segements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();
        int results = segmentFind(str);
        System.out.println(results);
    }

    /*
     * steps:
     * 1)split the string using split method containing spaces
     * 2)create a String array assign the all the splited word into the array and
     * count the number of elements in the array
     */
    public static int segmentFind(String s1) {
        int count = 0;
        String arr[] = s1.split(" ");
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }
}