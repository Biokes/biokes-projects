package eStore;

public class StoreItemNotFoundExcetption extends RuntimeException{
    public StoreItemNotFoundExcetption(){
        super("Item not found in cart.");
    }
}
