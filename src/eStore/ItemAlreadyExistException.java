package eStore;

public class ItemAlreadyExistException extends RuntimeException{
    public ItemAlreadyExistException(){
        super("Item already Exist");
    }
}