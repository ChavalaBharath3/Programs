/*static methods in the interface can be executed only in the main method by callling 
interfaceName.methodName();*/
public class Test {
    public static void main(String[] args) {
        NewInterface.showStatic();
        Hello hl = new Hello();
        hl.overideDefaultMethod();
        hl.overideMethod();
    }
}