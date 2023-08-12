import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file = null;
        try {
            file = new FileInputStream(".txt");

        } catch (Exception e) {
            System.out.println("File not found,please check the file");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}