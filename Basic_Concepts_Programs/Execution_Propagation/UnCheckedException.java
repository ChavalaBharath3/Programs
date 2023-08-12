/*
 * Runtime Exceptions are Unchecked exceptions example arthematic exceptions
 */
public class UnCheckedException {
    public int i = 10;
    public int j = 0;
    public int k;

    public void m() {
        p();
    }

    public void n() {
        try {
            k = i / j;
        } catch (Exception e) {
            System.out.println("Arthematic exception");
        }
    }

    public void p() {
        n();
    }

    public static void main(String[] args) {
        UnCheckedException ce = new UnCheckedException();
        ce.m();

    }
}