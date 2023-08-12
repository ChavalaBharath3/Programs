public class Person {
    int height;
    int weight;
    String color;
    String name;

    public Person() {
        this(6, 75, "Black");
        System.out.println("Default constructor");
    }

    public Person(int height, int weight, String color) {
        this("kamal");
        this.height = height;
        this.color = color;
        this.weight = weight;
        System.out.println("Height: " + height + "\ncolor: " + color + "\nweight: " + weight);
    }

    public Person(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Person p = new Person();
    }
}