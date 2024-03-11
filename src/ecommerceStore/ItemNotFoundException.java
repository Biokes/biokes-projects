package ecommerceStore;

public class ItemNotFoundException  extends RuntimeException{
    public ItemNotFoundException(){
        super("Item not found.");
    }

}
