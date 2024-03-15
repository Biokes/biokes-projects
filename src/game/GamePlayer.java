package game;

import TicTacToe.InvalidCellNumberException;

public class GamePlayer{
    int number;

    public GamePlayer(int number){
        this.number=number;
    }
    public void play(Game game, int position){
        validatePosition(position);
        game.play(convertNumber(position));
    }

    private void validatePosition(int position){
        if( position<1||position>=10 )
            throw new InvalidCellNumberException( );
    }

    private int[] convertNumber(int number){
        int[] returnValue=new int[2];
        returnValue[0]=(number-1)/3;
        returnValue[1]=(number-1)%3;
        return returnValue;
    }

    public int getNumber(){
        return this.number;
    }
}
