package estoreTest;

import eStore.Cart;
import eStore.StoreItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static eStore.StoreProductCategory.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreCartTest{
    private Cart cart;
    @BeforeEach
    void setUp(){
        cart=new Cart( );
    }
    @Test
    void addItemToCart_testItemISAdded(){
        StoreItem item=new StoreItem("sweet", GROCERIES, 3);
        cart.addItem(item);
        assertEquals(1, cart.numberOfItems( ));
    }

    @Test
    void addAndRemoveItem_testItemIsSAddedAndRemoved(){
        cart.addItem(new StoreItem("Laptops", ELECTRONICS, 10));
        assertEquals(1, cart.numberOfItems( ));
        cart.removeItem("laptops");
        assertEquals(0, cart.numberOfItems( ));
    }
}
