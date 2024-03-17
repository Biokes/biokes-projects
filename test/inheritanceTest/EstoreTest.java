package inheritanceTest;

import eStore.Cart;
import eStore.ProductsCategory;
import eStore.StoreCustomer;
import eStore.StoreItem;
import ecommerceStore.ItemNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        customer.addItemToCart(cart, new StoreItem(ProductsCategory.GROCERIES, "name"));
        assertEquals(1, customer.countItemsInside(cart));
    }
    @Test
    void customerAddItemToCartAndRemoveItem_testItemIsAddedAndremoved(){
        Cart cart=new Cart( );
        assertEquals(0, customer.countItemsInside(cart));
        StoreItem item1=new StoreItem(ProductsCategory.GROCERIES, "name");
        StoreItem item2=new StoreItem(ProductsCategory.CLOTHING, "clothes");
        customer.addItemToCart(cart, item1);
        customer.addItemToCart(cart, item2);
        assertEquals(2, customer.countItemsInside(cart));
        customer.removeItem(cart, ProductsCategory.CLOTHING, "clothes");
        assertEquals(1, customer.countItemsInside(cart));
    }

    @Test
    void customerAddItemsToCart_testItemsAreAdded(){
        Cart cart=new Cart( );
        assertEquals(0, customer.countItemsInside(cart));
        customer.addItemToCart(cart, new StoreItem(ProductsCategory.GROCERIES, "name"));
        customer.addItemToCart(cart, new StoreItem(ProductsCategory.GROCERIES, "name"));
        customer.addItemToCart(cart, new StoreItem(ProductsCategory.GROCERIES, "name"));
        assertEquals(3, customer.countItemsInside(cart));
    }
    @Test
    void customerAddAndRemoveItem_testItemAreAddedAndRemoved(){
        Cart cart=new Cart( );
        assertEquals(0, customer.countItemsInside(cart));
        StoreItem item1=new StoreItem(ProductsCategory.GROCERIES, "spoon");
        StoreItem item2=new StoreItem(ProductsCategory.UTENSILS, "spoon");
        customer.addItemToCart(cart, item1);
        customer.addItemToCart(cart, item2);
        assertEquals(2, customer.countItemsInside(cart));
        customer.removeItem(cart, ProductsCategory.UTENSILS, "spoon");
        assertEquals(1, customer.countItemsInside(cart));
        assertTrue(customer.checkItem(cart, item1));
    }

    @Test
    void customerCanRemoveItemThatIsNotCart_testExceptionISThrown(){
        Cart cart=new Cart( );
        assertThrows(ItemNotFoundException.class, ()->customer.removeItem(cart, ProductsCategory.CLOTHING, "clothes"));
    }
}
