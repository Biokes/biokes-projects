package eStore;

public class StoreCustomer{
    private Cart cart;

    public StoreCustomer(Estore store){
    }
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

    public void changeProductType(Cart cart, StoreItem itemName, ProductsCategory productsCategory){

    }
}

