public class Animal {
    int height;
    String name;
    String color;
    int weight;

    public Animal() {

    }

    public void animalBehaviour() {
        System.out.println("This is super class method");
    }

    public void info() {
        System.out.println("The height of animal: " + height + "ft" + "\n" +
                "Animal Name: " + name + "\n" + "Color: " + color + "\n" + "Weight: " + weight + "kgs");
        System.out.println("Hello");
    }
}