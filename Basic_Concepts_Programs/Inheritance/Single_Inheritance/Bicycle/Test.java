package Bicycle;

public class Test {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 50, 25);
        String results = mb.toString();
        System.out.println(results);
        mb.applyBreaks(5);
        mb.speedUp(60);
        System.out.println(mb.a);
    }
}