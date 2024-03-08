package inheritance;

public class Cars extends Vehicle{
    public Cars(int carDoors,int numberOfDoors, String colour, int speed ){
        super(4, 1,speed);
        this.carDoors = carDoors;
        this.colour = colour;
        this.numberOfDoors = numberOfDoors;
    }
    private int carDoors;
    private int numberOfDoors;
    private String colour;


}
