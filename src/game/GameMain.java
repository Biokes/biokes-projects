package game;

import TicTacToe.CellOccupiedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMain{
    private GamePlayer player1=new GamePlayer(1);
    private GamePlayer player2=new GamePlayer(2);
    private Game game=new Game( );
    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        GameMain game=new GameMain( );
        game.gameMenu( );
    }

    private int collectInput(int number){
        System.out.printf("Player %s Enter a number between 1 and 9 to specify where to play: %n", number);
        int numberGiven=scanner.nextInt( );
        return numberGiven;
    }

    private void playGameFor(GamePlayer player){
        try{
            int number=collectInput(player.getNumber( ));
            player.play(game, number);
        }catch( InputMismatchException exception ){
            System.out.println("Wrong input for game.\nPluease Enter the right input.");
            scanner.next( );
            playGameFor(player);
        }catch( CellOccupiedException|IllegalArgumentException exception ){
            System.out.println(exception.getMessage( ));
            scanner.next( );
            playGameFor(player);
        }
    }

    private void gameMenu(){
        while(!game.isBoardFull( )){
            playGameFor(player1);
            System.out.println(game.printBoard( ));
            end(game);
            playGameFor(player2);
            System.out.println(game.printBoard( ));
            end(game);
        }
        System.out.println("Its a Draw.");
    }

    private void end(Game game){
        if( game.checkWinner( )!=null ){
            System.out.println(game.checkWinner( ));
            System.exit(1000);
        }
    }
}
