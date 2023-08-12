import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(new Student(121, "Bharath", "NandyalCheckpost"));
        arr.add(new Student(100, "Ganesh", "SharifNagar"));
        arr.add(new Student(34, "Abc", "abc"));
        // Unsorted List
        System.out.println("Unsorted Array");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println("---------------------------");
        System.out.println("Sorted Array using the RollNo");
        Collections.sort(arr, new SortByRollNo());
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println("---------------------------");
        System.out.println("Sorted Array using the Name");
        Collections.sort(arr, new SortByName());
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}