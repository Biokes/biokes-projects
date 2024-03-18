package eStore;

public class StoreItemNotFoundException extends RuntimeException{
    public StoreItemNotFoundException(){
        super("Item not found in cart.");
    }
}
