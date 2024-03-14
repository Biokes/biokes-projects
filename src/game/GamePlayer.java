package game;

import TicTacToe.InvalidCellNumberException;

public class GamePlayer{
    public void play(Game game, int position){
        validatePosition(position);
        game.play(convertNumber(position));
    }

    private void validatePosition(int position){
        if( position<1||position>9 )
            throw new InvalidCellNumberException( );
    }

    private int[] convertNumber(int number){
        int[] returnValue=new int[2];
        returnValue[0]=(number-1)/3;
        returnValue[1]=(number-1)%3;
        return returnValue;
    }
}
