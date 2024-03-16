package eStore;

public class StoreCustomer{
    public int countItemsInside(Cart cart){
        return cart.numberOfItems( );
    }
    public void addItemToCart(Cart cart, StoreItem item){
        cart.addItem(item);
    }

    public void removeItem(Cart cart, StoreItem itemName){

    }
}
