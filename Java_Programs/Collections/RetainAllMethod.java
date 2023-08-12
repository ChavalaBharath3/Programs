import java.util.*;

public class RetainAllMethod {
    public static void main(String[] args) {
        ArrayList<String> boxes = new ArrayList<String>();
        boxes.add("pen");
        boxes.add("pencil");
        boxes.add("eraser");
        ArrayList<String> bags = new ArrayList<String>();
        bags.add("pencil");
        bags.add("pen");
        bags.add("books");
        bags.retainAll(boxes);
        System.out.println(boxes.toString());
        System.out.println(bags.toString());

    }
}