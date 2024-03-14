package game;

import java.util.Arrays;

import static game.Cell.EMPTY;

public class Game{
    private final Enum[][] board=new Enum[3][3];
    public Enum check(int row, int column){

        return board[row][column];
    }

    private void fillBoard(){
        for( Enum[] value : board )
            for( Enum column : value )
                column=EMPTY;
    }
}
