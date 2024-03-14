package game;

import java.util.Scanner;

public class GameMain{
    private GamePlayer gamePlayer1=new GamePlayer( );
    private GamePlayer player2=new GamePlayer( );
    private Game game=new Game( );
    private Scanner scanner=new Scanner(System.in);

    public static void main(String[] args){
        GameMain game=new GameMain( );
    }

    private int collectInput1(String playerName){
        System.out.println(String.format("\n%s Enter a number between 1 and 9 to specify where to play: ", playerName));
        int number=scanner.nextInt( );
        return number;
    }

    private void validate1(){
        try{
            int number=collectInput1("player One");
            gamePlayer1.play(game, number);
        }catch( Exception exception ){
            System.out.println(exception.getMessage( )+"\nEnter a valid input.");
            validate1( );
        }
    }

    private void validate2(){
        try{
            int number=collectInput1("Player two");
            gamePlayer1.play(game, number);
        }catch( Exception exception ){
            System.out.println(exception.getMessage( )+"\nEnter a valid input.");
            validate2( );
        }
    }

    private void gameMenu(){
        System.out.println(game.printBoard( ));
        validate1( );
        System.out.println(game.printBoard( ));
        if( game.checkWinner( )!=null )
            validate2( );
        System.out.println(game.printBoard( ));
    }
}
