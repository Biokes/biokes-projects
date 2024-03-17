package eStore;

public class StoreCustomer{
    public int countItemsInside(Cart cart){
        return cart.numberOfItems( );
    }
    public void addItemToCart(Cart cart, StoreItem item){
        cart.addItem(item);
    }

    public void removeItem(Cart cart, ProductsCategory category, String itemName){
        cart.remove(category, itemName);

    }
    public boolean checkItem(Cart cart, StoreItem item1){
        return cart.checkItem(item1);
    }
}

