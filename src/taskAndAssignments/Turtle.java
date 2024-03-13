package taskAndAssignments;

public class Turtle{
    private boolean isPenUp=true;
    private final Direction direction=Direction.EAST;
    public boolean isPenUp(){
        return isPenUp;
    }

    public void penDown(){
        isPenUp=false;
    }

    public void penUp(){
        isPenUp=true;
    }

    public Direction currentDirection(){
        return direction;
    }
}
