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
    public void removeItem(String productName){
        for( StoreItem item : cart ){
            if( item.getProductName( ).equalsIgnoreCase(productName) ){
                cart.remove(item);
                break;
            }
        }
    }
    public StoreItem findItem(String givenName){
        for( StoreItem items : cart )
            if( items.getProductName( ).equalsIgnoreCase(givenName) )
                return items;
        throw new StoreItemNotFoundException( );
    }

}