package TicTacToe;

public class CellOccupiedException extends RuntimeException{
    public CellOccupiedException(){
        super("Pls Choose Another Cell.\nCurrent Game cell is Occupied");
    }
}
