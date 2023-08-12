import java.io.IOException;

/*
 * compile time exceptions are checked exception ex: IOexceptions, ClassNotFoundException,
 * FileNotFoundException
 */
public class CheckedException {
    public void n() throws IOException {
        m();
    }

    public void m() throws IOException {

        throw new IOException();
    }

    public void p() throws IOException {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) throws IOException {
        CheckedException ce = new CheckedException();
        ce.p();
        System.out.println("Normal Flow");
    }
}