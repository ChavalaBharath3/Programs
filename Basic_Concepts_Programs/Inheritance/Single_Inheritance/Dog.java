public class Dog extends Animal {
    public void animalBehaviour() {
        System.out.println("The animal Behaviour dog is Barking");
    }

    public Dog(int height, String name, String color, int weight) {
        this.height = height;
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Dog dog = new Dog(2, "German shepard", "Black", 19);
        dog.info();
        dog.animalBehaviour();
    }
}