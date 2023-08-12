import java.util.*;

/*
 * steps:
 * 1)convert arr[] to Arraylist
 * 2)remove all the elements that contains the value of ele_Remove element using while loop
 * 3)conver that arraylist to array
 */
public class RemoveEleMethod2 {
    public static void main(String[] args) {
        int arr_Elements[] = { 3, 2, 2, 3 };
        int ele_Remove = 2;
        ArrayList<Integer> al = new ArrayList<Integer>();
        // ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i = 0; i < arr_Elements.length; i++) {
            al.add(arr_Elements[i]);
        }
        // System.out.println(al.toString());
        while (al.remove((Integer) ele_Remove)) {

        }
        int arr[] = new int[al.size()];
        for (int index = 0; index < al.size(); index++) {
            arr[index] = al.get(index);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(al.toString());
        Integer arr1[] = al.toArray(new Integer[al.size()]);
        System.out.println("____________");
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            System.out.print(",");
        }
        System.out.print("]");

    }
}