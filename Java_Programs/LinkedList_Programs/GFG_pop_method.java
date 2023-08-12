
// Java code to demonstrate pop method in LinkedList
//pop() this method removes the last element present in the stack/list
import java.util.LinkedList;

public class GFG_pop_method {
    // Main method
    public static void main(String[] args) {

        // Creating a LinkedList object to represent a stack.
        LinkedList<Integer> stack = new LinkedList<>();

        // Pushing an element in the stack
        stack.push(10);

        // Pushing an element in the stack
        stack.push(20);

        // Pop an element from stack
        Integer ele = stack.pop();

        // Printing the popped element.
        System.out.println(ele);

        // Pop an element from stack
        ele = stack.pop();

        // Printing the popped element.
        System.out.println(ele);

        // Throws NoSuchElementException
        ele = stack.pop();

        // Throwsca runtime exception
        System.out.println(ele);

        // Printing the complete stack.
        System.out.println(stack);
    }
}
