package inheritance;

public class Vehicle {
    public int getGear(){
        return gear;
    }
    public int getWheels(){
        return wheels;
    }
    public int getSpeed(){
        return speed;
    }
    public void increaseSpeed(){
        speed++;
    }
    public void setWheels(int wheel){
        this.wheels = wheel;
    }
    public Vehicle(int wheels, int gear, int speed) {
        this.gear = gear;
        this.wheels = wheels;
        this.speed = speed;
    }
    private int gear;
    private int wheels;
    private int speed;

}
