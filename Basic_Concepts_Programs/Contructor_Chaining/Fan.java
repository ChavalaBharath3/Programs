public class Fan {
    String brand;
    int speed;
    int weight;
    String color;

    public Fan() {
        System.out.println("Default constructor");
    }

    public Fan(String brand, int speed, int weight, String color) {
        this.brand = brand;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        System.out.println("Brand: " + brand + "\nspeed: " + speed + "\nweight: " + weight + "\ncolor: " + color);
    }
}