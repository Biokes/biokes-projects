package eStore;

import java.util.ArrayList;
import java.util.List;

public class Cart{
    private final List<StoreItem> cart=new ArrayList<>( );
    public void addItem(StoreItem item){
        cart.add(item);
    }
    public int numberOfItems(){
        return cart.size( );
    }
    public StoreItem getItem(int index){
        return cart.get(index);
    }
    public void remove(String itemName){
        for( int count=0; count<numberOfItems( ); count++ ){
            if( getItem(count).getProductName( ).equalsIgnoreCase(itemName) ){
                cart.remove(count);
                break;
            }
        }
    }

    public boolean checkItem(StoreItem item1){
        for( StoreItem items : cart )
            if( items.getProductName( ).equals(item1.getProductName( )) )
                if( items.getProductType( ).equals(item1.getProductType( )) )
                    return true;
        return false;
    }
}
