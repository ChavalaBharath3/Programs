
/*
 * steps: Two ArrayList list1, List2
 * list.addAll(list2);
 * 
 */
import java.util.*;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int noOfEle = scanner.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>(noOfEle);
        for (int i = 0; i < noOfEle; i++) {
            System.out.print("Enter the element at index: " + i + ": ");
            list1.add(scanner.nextInt());
        }
        System.out.print("Enter the number of elements: ");
        int noOfEle2 = scanner.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>(noOfEle2);
        for (int i = 0; i < noOfEle2; i++) {
            System.out.print("Enter the element at index: " + i + ": ");
            list2.add(scanner.nextInt());
        }
        System.out.println(mergeList(list1, list2).toString());

    }

    public static ArrayList<Integer> mergeList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(0, list2);
        Collections.sort(list1);
        return list1;
    }
}