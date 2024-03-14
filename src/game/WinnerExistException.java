package game;

public class WinnerExistException extends RuntimeException{
    public WinnerExistException(String message){
        super(message);
    }
}
