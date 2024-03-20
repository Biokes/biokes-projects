package eStore;

public class StoreCustomer{
    private Cart cart;
    private Estore store;
    public StoreCustomer(Estore estore){
        this.store = estore;
    }

    public void getCart(){
        cart = store.getCart();
    }

    public void addItemToCart(StoreItem item){
        cart.addItem(item);
    }

    public int numberOfItemsInCart(){
        return cart.numberOfItems();
    }

    public void removeItemFromCart(String productName){
        cart.removeItem(productName);
    }
}