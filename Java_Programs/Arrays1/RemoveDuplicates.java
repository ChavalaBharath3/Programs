
/*
 * input: 11223
 * output: 123
 */
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();
        ArrayList<Integer> oldList = new ArrayList<Integer>(num);
        ArrayList<Integer> no_Duplicates = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the element" + "[" + i + "]: ");
            oldList.add(sc.nextInt());
        }
        Collections.sort(oldList);
        System.out.println(removeDuplicates(oldList));
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> oldList) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer element : oldList) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
}