
/*Practical Application : This quality of “flexible addition” of these functions
 can be done in cases of priority addition in queues where elements having a 
 greater no. than threshold have to be handled before the elements lesser than 
 that. Small piece of code below discusses this.  
 Example : list has 12,4,8,10,3,15 output : 15,10,12,4,8,3 */
import java.util.*;

public class LinkedListOfferLast {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList str_List = new LinkedList<>();
        list.add(12);
        list.add(4);
        list.add(8);
        list.add(10);
        list.add(3);
        list.add(15);
        while (!list.isEmpty()) {
            // here it gets the first node value in poll_Value
            int poll_Value = list.poll();
            if (poll_Value >= 10) {
                str_List.offerFirst(poll_Value);
            } else {
                str_List.offerLast(poll_Value);
            }

        }
        System.out.println(str_List);
    }
}