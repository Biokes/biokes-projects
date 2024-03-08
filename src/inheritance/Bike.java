package inheritance;

public class Bike extends Vehicle{

    public Bike(int wheels, int gear, int speed) {
        super(wheels, 0, speed);
    }
    public void move(){
        this.increaseSpeed();
        this.increaseSpeed();
    }

}
