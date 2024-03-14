package taskAndAssignments;

import static taskAndAssignments.Direction.*;

public class Turtle{
    private boolean isPenUp=true;
    private Direction direction=EAST;
    private int[][] board=new int[20][20];
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
        direction=direction.turnLeft( );
    }

    public void turnRight(){
        direction=direction.turnRight( );
    }

    public void move(int movementpace){

    }

    public int checkBoard(int i, int counter){
        return 0;
    }
}
