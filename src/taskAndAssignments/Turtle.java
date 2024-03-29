package taskAndAssignments;

import java.util.Arrays;

import static taskAndAssignments.Direction.*;

public class Turtle{
    private boolean isPenUp=true;
    private Direction direction=EAST;
    private int[][] board=new int[20][20];
    private int row=0;
    private int column=0;
    private boolean isLeft=true;

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
        isLeft=true;
    }

    public void turnRight(){
        direction=direction.turnRight( );
        isLeft=false;
    }

    public void move(int size){
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

    public String toString(){
        StringBuilder output=new StringBuilder( );
        for( int[] numbers : board ){
            output.append(Arrays.toString(numbers));
            output.append("\n");
        }
        return String.valueOf(output);
    }
}
