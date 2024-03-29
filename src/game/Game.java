package game;

import TicTacToe.CellOccupiedException;

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

    private Enum cell(){
        if( count%2==0 )
            return X;
        return O;
    }
    public void play(int[] position){
        if( checkWinner( )!=null||isBoardFull( ) )
            throw new WinnerExistException("There is a winner already");
        if( check(position[0], position[1])!=EMPTY )
            throw new CellOccupiedException( );
        board[position[0]][position[1]]=cell( );
        count++;
    }

    public String checkWinner(){
        if( (board[0][0]==X&&board[0][1]==X&&board[0][2]==X)||
                    (board[1][0]==X&&board[1][1]==X&&board[1][2]==X)||
                    (board[2][0]==X&&board[2][1]==X&&board[2][2]==X)||
                    (board[0][0]==X&&board[1][0]==X&&board[2][0]==X)||
                    (board[0][1]==X&&board[1][1]==X&&board[2][1]==X)||
                    (board[0][2]==X&&board[1][2]==X&&board[2][2]==X)||
                    (board[0][0]==X&&board[1][1]==X&&board[2][2]==X)||
                    (board[2][0]==X&&board[1][1]==X&&board[0][2]==X) )
            return "Player 1 wins";
        else if( (board[0][0]==O&&board[0][1]==O&&board[0][2]==O)||
                         (board[0][1]==O&&board[1][1]==O&&board[2][1]==O)||
                         (board[0][2]==O&&board[1][2]==O&&board[2][2]==O)||
                         (board[0][0]==O&&board[1][0]==O&&board[2][0]==O)||
                         (board[1][0]==O&&board[1][1]==O&&board[1][2]==O)||
                         (board[2][0]==O&&board[2][1]==O&&board[2][2]==O)||
                         (board[0][0]==O&&board[1][1]==O&&board[2][2]==O)||
                         (board[2][0]==O&&board[1][1]==O&&board[0][2]==O) )
            return "Player 2 wins.";
        return null;
    }

    public boolean isBoardFull(){
        int check=0;
        for( int counter=0; counter<3; counter++ )
            for( int count=0; count<3; count++ )
                if( board[counter][count]==EMPTY )
                    check++;
        return check==0;
    }

    private String stringValue(Enum[] values){
        StringBuilder output=new StringBuilder("|");
        for( Enum value : values ){
            if( value==EMPTY )
                output.append(String.format(" %s |", " "));
            if( value==X )
                output.append(String.format(" %s |", X));
            if( value==O )
                output.append(String.format(" %s |", O));
        }
        return output.toString( );
    }

    public String printBoard(){
        StringBuilder output=new StringBuilder( );
        for( int count=0; count<3; count++ ){
            output.append(stringValue(board[count]));
            output.append("\n");
        }
        return output.toString( );
    }
}
