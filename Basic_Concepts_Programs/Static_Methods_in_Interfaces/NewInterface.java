interface NewInterface {
    // static methods can't be overide in the class
    public static void showStatic() {
        System.out.println("Hello, this is a static method in the interface");
    }

    // default method in java 8 can be overide
    public default void overideDefaultMethod() {
        System.out.println("This over ride method in the interface");
    }

    public void overideMethod();
}
