package game;

import static game.Cell.*;

public class Game{
    private final Enum[][] board=new Enum[3][3];
    private int count;

    public Game(){
        fillBoard( );
        count=0;
    }
    public Enum check(int row, int column){
        return board[row][column];
    }

    private void fillBoard(){
        for( int counter=0; counter<3; counter++ )
            for( int count=0; count<3; count++ )
                board[counter][count]=EMPTY;
    }

    private Enum button(){
        if( count%2==0 )
            return X;
        return O;
    }

    public void play(int[] position){
        board[position[0]][position[1]]=button( );
        count++;
    }

    private void checkWinner(){

    }
}
