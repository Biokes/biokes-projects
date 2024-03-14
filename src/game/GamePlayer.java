package game;

public class GamePlayer{
    public void play(Game game, int position){
        int[] given=convertNumber(position);
        game.play(convertNumber(position));
    }

    private int[] convertNumber(int number){
        int[] returnValue=new int[2];
        returnValue[0]=(number-1)/3;
        returnValue[1]=(number-1)%3;
        return returnValue;
    }
}
