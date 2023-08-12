package Bicycle;

public class Bicycle {
    int gear;
    int speed;
    static int a = 2;

    public Bicycle() {

    }

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreaks(int decrement) {
        speed = speed - decrement;
        System.out.println("The speed of the bike " + speed);
    }

    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("The speed of the after speedUp: " + speed);
    }

    public String toString() {
        return ("No of gears: " + gear + "\nSpeed of the Bicycle: " + speed);
    }
}