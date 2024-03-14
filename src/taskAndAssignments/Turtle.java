package taskAndAssignments;

import java.util.Arrays;

import static taskAndAssignments.Direction.*;

public class Turtle{
    private boolean isPenUp=true;
    private Direction direction=EAST;
    private int[][] board=new int[20][20];
    private int row=0;
    private int column=0;

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

    public void move(int size){
        boolean isLeft=true;
        if( isLeft )
            for( int counter=0; counter<size; counter++ ){
                board[row][column++]=1;
            }
        if( !isLeft )
            for( int counter=0; counter<size; counter++ )
                board[row++][column]=1;
    }
    public int checkBoard(int row, int counter){
        return board[row][counter];
    }

    public String board(){
        return Arrays.toString(this.board);
    }
}
