package MentrualApp;

public class InvalidDateException extends RuntimeException {
    public InvalidDateException(String message) {
        super(message);
    }
    public InvalidDateException() {
        super("Invalid date");
    }
}
