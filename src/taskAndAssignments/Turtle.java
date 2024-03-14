package taskAndAssignments;

import static taskAndAssignments.Direction.*;

public class Turtle{
    private boolean isPenUp=true;
    private Direction direction=EAST;
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

    public void turnLeft(){
        if( currentDirection( )==SOUTH ) direction=EAST;
        if( currentDirection( )==WEST ) direction=SOUTH;
        if( currentDirection( )==NORTH ) direction=WEST;
        if( currentDirection( )==EAST ) direction=NORTH;
    }
}
