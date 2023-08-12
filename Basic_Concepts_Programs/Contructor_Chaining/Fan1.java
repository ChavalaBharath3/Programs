
public class Fan1 extends Fan {

    public Fan1(String brand, int speed, int weight, String color) {
        super(brand, speed, weight, color);
    }

    public static void main(String[] args) {
        Fan1 f1 = new Fan1("Bajaj", 45, 25, "Black");
    }
}