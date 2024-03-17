package eStore;

import java.util.ArrayList;
import java.util.List;

public class Cart{
    private final List<StoreItem> cart=new ArrayList<>( );

    public void addItem(StoreProduct item){
        cart.add(item);
    }
    public int numberOfItems(){
        return cart.size( );
    }

    public StoreItem getItem(int index){
        return cart.get(index);
    }

    public void removeItem(StoreItem item){
        for( int count=0; count<numberOfItems( ); count++ ){
            if( getItem(count).getProductName( ).equalsIgnoreCase(itemName) )
                if( getItem(count).getProductType( ).equals(category) ){
                    cart.remove(count);
                    return;
            }
        }
        throw new ItemNotFoundException( );
    }

    public boolean checkItem(StoreProduct item1){
        for( StoreProduct items : cart ){
            if( items.getStoreProductName( ).equals(item1.getStoreProductName( )) ){
                if( items.getStoreProductType( ).equals(item1.getStoreProductType( )) )
                    return true;
            }
        }
        return false;
    }
}
