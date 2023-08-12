
/*
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * This program is done by using the ArrayList concept
 */
import java.util.*;

public class InsertPostion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int noElements = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(noElements);
        for (int i = 0; i < noElements; i++) {
            System.out.print("Enter the element at index: " + i + ": ");
            list.add(sc.nextInt());
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        System.out.println(list.toString());
        System.out.println("The element occur at the index: " + list.indexOf(target));
    }
}