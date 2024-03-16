package eStore;

public class StoreCustomer{
    public int countItemsInside(Cart cart){
        return cart.numberOfItems( );
    }
    public void addItemToCart(Cart cart, StoreItem item){
        cart.addItem(item);
    }

    public void removeItem(Cart cart, StoreItem itemName){
        for( int counter=0; counter<cart.numberOfItems( ); counter++ )
            if( itemName.equals(cart.getItem(counter).getProductName( )) )
                if( item.getName( ).equals(counter.getName( )) )
                    cart.removeItem( )

    }
}
