//Static Binding
public class NewClass {
    public static class SuperClass {
        public static void print() {
            System.out.println("print() in the super class");
        }
    }

    public static class SubClass extends SuperClass {
        public static void print() {
            System.out.println("print() in the sub class");
        }
    }

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.print();
        System.out.println("----------------------------");
        SuperClass sb = new SubClass();
        sb.print();
    }
}