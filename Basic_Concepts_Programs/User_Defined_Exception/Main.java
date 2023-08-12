public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("GeeksGeeks");
        } catch (MyException my) {
            System.out.println("Exception Caught");
            System.out.println(my.getMessage());
        }
    }
}