package Bicycle;

public class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nSeat height: " + seatHeight);
    }
}