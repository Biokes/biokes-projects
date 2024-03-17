package eStore;

public class MaximumCartNumberException extends RuntimeException{
    public MaximumCartNumberException(){
        super("Number Of Cart For a customer Exceeded");
    }
}
