package eStore;

public class StoreCustomer{
    public int countItemsInside(Cart cart){
        return cart.numberOfItems( );
    }
    public void addItemToCart(Cart cart, StoreItem item){
        cart.addItem(item);
    }

    public void removeItemByItemName(Cart cart, String itemName){
        cart.remove(itemName);
    }

    public boolean checkItem(Cart cart, StoreItem item1){
        return cart.checkItem(item1);
    }
}
