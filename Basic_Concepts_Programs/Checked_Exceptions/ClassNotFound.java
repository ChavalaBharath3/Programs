import java.lang.Class;
import java.util.*;

public class ClassNotFound {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class temp = Class.forName("Exa1");
        } catch (ClassNotFoundException e) {
            // block executes when mention exception occur
            System.out.println(
                    "Class does not exist check the name of the class");
        }

    }
}