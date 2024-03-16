package eStore;

import java.util.ArrayList;
import java.util.List;

public class Cart{
    private List<StoreItem> cart=new ArrayList<>( );

    public void addItem(StoreItem item){
    }

    public int numberOfItems(){
        return cart.size( );
    }
}
