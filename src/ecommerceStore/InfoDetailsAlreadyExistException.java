package ecommerceStore;

public class InfoDetailsAlreadyExistException extends RuntimeException{
    public InfoDetailsAlreadyExistException(){
        super("Details provided already Exist.");
    }
}
