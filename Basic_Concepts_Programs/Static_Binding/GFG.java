//Dynamic binding is done according to the object creation 
//Note: It compulsory contains orveriding methods in super class as well in sub class
public class GFG {
    public static class SuperClass {
        public void print() {
            System.out.println("print() in the super class");
        }
    }

    public static class SubClass extends SuperClass {
        public void print() {
            System.out.println("print() in the sub class");
        }
    }

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.print();
        SubClass subClass = new SubClass();
        subClass.print();
    }
}