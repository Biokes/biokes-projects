package taskAndAssignments;

public class Turtle{
    private boolean isPenUp=true;
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
        return null;
    }
}
