package game;

import TicTacToe.CellOccupiedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMain{
    private GamePlayer player1=new GamePlayer( );
    private GamePlayer player2=new GamePlayer( );
    private Game game=new Game( );
    private Scanner scanner=new Scanner(System.in);

    private int counter=0;

    public static void main(String[] args){
        GameMain game=new GameMain( );
        game.gameMenu( );
    }

    private int getCounter(){
        counter++;
        return (counter%2)+1;
    }

    private int collectInput(){
        System.out.printf("Player %s Enter a number between 1 and 9 to specify where to play: %n", getCounter( ));
        int number=scanner.nextInt( );
        return number;
    }

    private void validate(GamePlayer player){
        try{
            int number=collectInput( );
            player.play(game, number);
        }catch( InputMismatchException exception ){
            System.out.println(exception.getMessage( )+"\nEnter a valid input.");
            scanner.next( );
            validate(player);
        }catch( CellOccupiedException exception ){
            System.out.println(exception.getMessage( )+"\nEnter a valid input.");
            scanner.next( );
            validate(player);
        }catch( IllegalArgumentException exception ){
            System.out.println(exception.getMessage( )+"\nEnter a valid input.");
            scanner.next( );
            validate(player);
        }
    }

    private void gameMenu(){
        while(!game.boardIsFull( )){
            validate(player1);
            System.out.println(game.printBoard( ));
            if( game.checkWinner( )!=null )
                validate(player2);
            System.out.println(game.printBoard( ));
        }
    }
}
