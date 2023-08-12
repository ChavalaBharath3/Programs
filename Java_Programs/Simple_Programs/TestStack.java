// Java code for stack implementation

import java.io.*;
import java.util.*;

class TestStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 3);
        stack_search(stack, 6);
    }

    public static void stack_push(Stack<Integer> stack) {
        int i;
        for (i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    public static void stack_pop(Stack<Integer> stack) {
        System.out.println("Removing all the elements from the stack");
        for (int i = 0; i < 5; i++) {
            Integer p = (Integer) stack.pop();
            System.out.println(p);
        }
    }

    public static void stack_peek(Stack<Integer> stack) {
        System.out.println("This method peek return the first element in the stack");
        Integer st_peek = (Integer) stack.peek();
        System.out.println("Element of the stack top: " + st_peek);
    }

    public static void stack_search(Stack<Integer> stack, int val) {
        Integer search_val = (Integer) stack.search(val);
        System.out.println(search_val);
    }
}
