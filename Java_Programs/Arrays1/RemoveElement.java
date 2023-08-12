import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int noOfElements = sc.nextInt();
        ArrayList<Integer> oldList = new ArrayList<Integer>(noOfElements);
        for (int i = 0; i < noOfElements; i++) {
            System.out.print("Enter the element at index[" + i + "]");
            oldList.add(sc.nextInt());
        }
        System.out.println("Enter the value that to be removed in the list: ");
        int element_Value = sc.nextInt();
        System.out.println("Old list elements: " + oldList.toString());
        ArrayList<Integer> results = removeElements(oldList, element_Value);
        System.out.println("New list elements: " + results.toString());
    }

    /*
     * Input: nums = [3,2,2,3], val = 3
     * Output: 2, nums = [2,2,_,_]
     * Explanation: Your function should return k = 2, with the first two elements
     * of nums being 2.
     * It does not matter what you leave beyond the returned k (hence they are
     * underscores).
     * steps:
     * 1)sort the old array -> [2,2,3,3]
     * 2)remove the elements that contains the value given by user, for loop
     * condition
     * i<sizeof Old List if oldList contains the the value
     * 
     */
    public static ArrayList<Integer> removeElements(ArrayList<Integer> oldList, int element_Value) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        Collections.sort(oldList);
        while (oldList.remove((Integer) element_Value)) {

        }
        newList = (ArrayList) oldList.clone();
        return newList;
    }
}