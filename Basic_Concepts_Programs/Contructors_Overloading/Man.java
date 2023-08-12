public class Man {
    int num;
    double weight;
    float height;

    public Man() {
        System.out.println("default constructor");
    }

    public Man(int num) {
        this.num = num;
        System.out.println("The num is: " + num);
    }

    public Man(double weight, float height) {
        this.weight = weight;
        this.height = height;
        System.out.println("The weight of the man: " + weight + "\n The height of the man: " + height);
    }

    public static void main(String[] args) {
        Man m = new Man();
        Man m1 = new Man(3);
        Man m2 = new Man(45.2, 6);

    }
}