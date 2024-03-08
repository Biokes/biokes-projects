package diary;

public class InvalidUserDetailsException extends RuntimeException{
    public InvalidUserDetailsException() {

        super ("Name or password cannot be empty");
    }
    public InvalidUserDetailsException(String message) {


        super (message);
    }
}
