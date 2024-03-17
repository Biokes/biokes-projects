package eStore;

public class StoreCustomer{
    private Cart cart;
    private Estore store;
    public StoreCustomer(Estore store){
        this.store=store;
    }

    public int countCartItems(){
        return cart.numberOfItems( );
    }

    public void addItemToCart(StoreItem item){
        cart.addItem(item);
    }

    public void removeItem(ProductsCategory category, String itemName){
        cart.remove(category, itemName);

    }

    public boolean checkItem(StoreItem item1){
        return cart.checkItem(item1);
    }

    public void changeProductType(String commodity, ProductsCategory productsCategory){
        for( int counter=0; counter<cart.numberOfItems( ); counter++ )
            if( commodity.equalsIgnoreCase(cart.getItem(counter).getProductName( )) )
                cart.getItem(counter).setProductType(productsCategory);
    }

    public void getCartFromStore(){
        cart=store.giveCart( );
    }

    public void changeProductName(String newName, String oldName){
        for( int counter=0; counter<cart.numberOfItems( ); counter++ )
            if( cart.getItem(counter).getProductName( ).equalsIgnoreCase(oldName) )
                cart.getItem(counter).setProductName(newName);
    }
}

