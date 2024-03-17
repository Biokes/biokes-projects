package inheritanceTest;

import eStore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstoreTest{
    private StoreCustomer customer;
    private Estore store;
    @BeforeEach
    void initialize(){
        store=new Estore( );
        customer=new StoreCustomer(store);
        customer.getCartFromStore( );
    }
    @Test
    void userGetCartInStore_testCartIsEmpty(){
        assertEquals(0, customer.countCartItems( ));
    }
    @Test
    void customerAddItemToCart_testItemsIsAdded(){
        assertEquals(0, customer.countCartItems( ));
        customer.addItemToCart(new StoreItem(ProductsCategory.GROCERIES, "name"));
        assertEquals(1, customer.countCartItems( ));
    }
    @Test
    void customerAddItemToCartAndRemoveItem_testItemIsAddedAndremoved(){
        Cart cart=new Cart( );
        assertEquals(0, customer.countCartItems( ));
        StoreItem item1=new StoreItem(ProductsCategory.GROCERIES, "name");
        StoreItem item2=new StoreItem(ProductsCategory.CLOTHING, "clothes");
        customer.addItemToCart(item1);
        customer.addItemToCart(item2);
        assertEquals(2, customer.countCartItems( ));
        customer.removeItem(ProductsCategory.CLOTHING, "clothes");
        assertEquals(1, customer.countCartItems( ));
    }
    @Test
    void customerAddItemsToCart_testItemsAreAdded(){
        assertEquals(0, customer.countCartItems( ));
        customer.addItemToCart(new StoreItem(ProductsCategory.GROCERIES, "name"));
        customer.addItemToCart(new StoreItem(ProductsCategory.GROCERIES, "name"));
        customer.addItemToCart(new StoreItem(ProductsCategory.GROCERIES, "name"));
        assertEquals(3, customer.countCartItems( ));
    }
    @Test
    void customerAddAndRemoveItem_testItemAreAddedAndRemoved(){
        Cart cart=new Cart( );
        assertEquals(0, customer.countCartItems( ));
        StoreItem item1=new StoreItem(ProductsCategory.GROCERIES, "spoon");
        StoreItem item2=new StoreItem(ProductsCategory.UTENSILS, "spoon");
        customer.addItemToCart(item1);
        customer.addItemToCart(item2);
        assertEquals(2, customer.countCartItems( ));
        customer.removeItem(ProductsCategory.UTENSILS, "spoon");
        assertEquals(1, customer.countCartItems( ));
        assertTrue(customer.checkItem(item1));
    }
    @Test
    void customerRemoveItemThatIsNotCart_testExceptionISThrown(){
        assertThrows(ItemNotFoundException.class, ()->customer.removeItem(ProductsCategory.CLOTHING, "clothes"));
    }

    @Test
    void customerChangeProductType_testItemProductTypeIsChaged(){
        assertEquals(0, customer.countCartItems( ));
        StoreItem item2=new StoreItem(ProductsCategory.UTENSILS, "spoon");
        customer.addItemToCart(item2);
        customer.changeProductType("spoon", ProductsCategory.ELECTRONICS);
        assertTrue(item2.getProductType( )==ProductsCategory.ELECTRONICS);
    }
    @Test
    void customerChangesItemName_testItemNameIsChanged(){
        assertEquals(0, customer.countCartItems( ));
        StoreItem items=new StoreItem(ProductsCategory.GROCERIES, "biscuit");
        customer.addItemToCart(items);
        customer.changeProductName("biscuit", "sweets");
    }

    @Test
    void customerGetTwoCartFromStore_ExceptioIsThrown(){
        customer.getCartFromStore( );
        assertThrows(MaximumCartNumberException.class, ()->customer.getCartFromStore( ));
    }
    //test customer cannot have two carts
    // test customer change number of items in cart
    // test customer can give card admin matches customer and seller
}
