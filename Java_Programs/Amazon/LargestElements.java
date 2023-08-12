
/*
 * Input:  [1, 23, 12, 9, 30, 2, 50], K = 3
   Output: 50, 30, 23

   Input:  [11, 5, 12, 9, 44, 17, 2], K = 2
   Output: 44, 17  
 */
/*
        * Steps:
        * input = 2 print the last two elements
        * 1)reverse the list after taking the input as 2 print the first two numbers
        */
import java.util.*;

public class LargestElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 23, 12, 9, 30, 2, 50));
        int noOfEle = list.size();
        int k = 3;
        System.out.println("Before sorting: " + list.toString());
        Collections.sort(list);
        System.out.println("After sorting the list" + list.toString());
        int count = 0;
        Object arr[] = list.toArray();
        for (int i = noOfEle - 1; i < noOfEle; i--) {
            System.out.println(arr[i]);
            count++;
            if (count == k) {
                break;
            }
        }
    }
}