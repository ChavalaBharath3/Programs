import java.util.*;

public class DriverClass {
    public static void main(String[] args) {
        ArrayList<Customer> arr = new ArrayList<Customer>();
        arr.add(new Customer("Bharath", 12));
        arr.add(new Customer("Abc", 20));
        arr.add(new Customer("Ganesh", 30));
        arr.add(new Customer("Abc", 24));
        System.out.println("Unsorted array");
        Iterator itr = arr.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("----------------------");
        System.out.println("Sorted Array by name");
        Collections.sort(arr, new SortByName());
        for (Customer c : arr) {
            System.out.println(c);
        }
    }

}
