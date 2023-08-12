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

        System.out.println("------------------------");
        SuperClass sp = new SubClass();
        sp.print();
    }
}

/*
 * During compilation, the compiler has no idea as to which print has to be
 * called
 * since the compiler goes only by referencing variable not by the type of
 * object, and
 * therefore the binding would be delayed to runtime and therefore the
 * corresponding
 * version of the print will be called based on type on an object.
 */