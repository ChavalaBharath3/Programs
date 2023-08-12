
import java.util.*;

class LinkedList_Programs {
    public static void main(String[] args) throws Exception {
        try {
            LinkedList<String> list = new LinkedList<String>();
            list.add("Geeks");
            list.add("for");
            list.add("Bharath");
            list.add("Ganesh");
            // This method returns the list of values in reverse order (descendingIterator)
            Iterator it = list.descendingIterator();
            while (it.hasNext()) {
                System.out.println("Value is: " + it.next());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Geeks");
        ll.add("for");
        ll.add("12");
        ll.add("34");
        ll.add("12");
        System.out.println(ll);
        LinkedList<String> sec_list = new LinkedList<String>();
        // This method clone copy the collection of elements into another collection
        sec_list = (LinkedList) ll.clone();
        System.out.println(sec_list);
        // contains(Object e) returns true if element contains else return false
        System.out.println(
                "Does the element contains Hello:[if presents returns true else false] " + sec_list.contains("Hello"));
        System.out.println("Does list contains for element: " + sec_list.contains("for"));
        // getFirst() returns first node of the element
        System.out.println("Print the fisrtNode: " + sec_list.getFirst());
        // indexOf(Object o) this method returns the index of the element
        System.out.println("Index of the element Geeks: " + ll.indexOf("Geeks"));
        // indexOfLast(Object o) returns the index of last occurance of the object
        System.out.println("last occurances of the object 12: " + ll.lastIndexOf("12"));
        // listIterator(int index) this method is used to return the elements starting
        // from the specified index
        Iterator itr = sec_list.listIterator(3);
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
