package inheritanceTest;

import eStore.Cart;
import eStore.StoreCustomer;
import eStore.StoreItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstoreTest{
    private StoreCustomer customer;
    @BeforeEach
    void initialize(){
        customer=new StoreCustomer( );
    }
    @Test
    void userGetCartInStore_testCartIsEmpty(){
        Cart cart=new Cart( );
        assertEquals(0, customer.countItemsInside(cart));
    }
    @Test
    void customerAddItemToCart_testItemsIsAdded(){
        Cart cart=new Cart( );
        assertEquals(0, customer.countItemsInside(cart));
        customer.addItemToCart(cart, new StoreItem( ));
        assertEquals(1, customer.countItemsInside(cart));
    }
    @Test
    void customerAddItemsToCart_testItemsAreAdded(){
        Cart cart=new Cart( );
        assertEquals(0, customer.countItemsInside(cart));
        customer.addItemToCart(cart, new StoreItem( ));
        customer.addItemToCart(cart, new StoreItem( ));
        customer.addItemToCart(cart, new StoreItem( ));
        assertEquals(3, customer.countItemsInside(cart));
    }

    @Test
    void customerAddItemToCartAndRemoveItem_testItemIsAddedAndremoved(){
        Cart cart=new Cart( );
        assertEquals(0, customer.countItemsInside(cart));
        StoreItem item1=new StoreItem( );
        StoreItem item2=new StoreItem( );
        customer.addItemToCart(cart, item1);
        customer.addItemToCart(cart, item2);
        assertEquals(2, customer.countItemsInside(cart));
        customer.removeItem(cart, item2);
        assertEquals(1, customer.countItemsInside(cart));
    }

}
