package inheritanceTest;

import eStore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstoreTest{
    private StoreCustomer customer;

    @BeforeEach
    void initialize(){
        Estore store=new Estore( );
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
        customer.addItemToCart(new StoreProduct(ProductsCategory.GROCERIES, "name"));
        assertEquals(1, customer.countCartItems( ));
    }
    @Test
    void customerAddItemToCartAndRemoveItem_testItemIsAddedAndremoved(){
        assertEquals(0, customer.countCartItems( ));
        StoreProduct item1=new StoreProduct(ProductsCategory.GROCERIES, "name");
        StoreProduct item2=new StoreProduct(ProductsCategory.CLOTHING, "clothes");
        customer.addItemToCart(item1);
        customer.addItemToCart(item2);
        assertEquals(2, customer.countCartItems( ));
        customer.removeItem(ProductsCategory.CLOTHING, "clothes");
        assertEquals(1, customer.countCartItems( ));
    }
    @Test
    void customerAddItemsToCart_testItemsAreAdded(){
        assertEquals(0, customer.countCartItems( ));
        customer.addItemToCart(new StoreProduct(ProductsCategory.GROCERIES, "name"));
        customer.addItemToCart(new StoreProduct(ProductsCategory.GROCERIES, "name"));
        customer.addItemToCart(new StoreProduct(ProductsCategory.GROCERIES, "name"));
        assertEquals(3, customer.countCartItems( ));
    }
    @Test
    void customerAddAndRemoveItem_testItemAreAddedAndRemoved(){
        assertEquals(0, customer.countCartItems( ));
        StoreProduct item1=new StoreProduct(ProductsCategory.GROCERIES, "spoon");
        StoreProduct item2=new StoreProduct(ProductsCategory.UTENSILS, "spoon");
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
        StoreProduct item2=new StoreProduct(ProductsCategory.UTENSILS, "spoon");
        customer.addItemToCart(item2);
        customer.changeProductType("spoon", ProductsCategory.ELECTRONICS);
        assertSame(item2.getProductType( ), ProductsCategory.ELECTRONICS);
    }
    @Test
    void customerChangesItemName_testItemNameIsChanged(){
        assertEquals(0, customer.countCartItems( ));
        StoreProduct items=new StoreProduct(ProductsCategory.GROCERIES, "biscuit");
        customer.addItemToCart(items);
        customer.changeProductName("biscuit", "sweets");
    }

    @Test
    void customerGetTwoCartFromStore_ExceptioIsThrown(){
        assertThrows(MaximumCartNumberException.class, ()->customer.getCartFromStore( ));
    }

    @Test
    void customerChangesNumberOfProducts_numberOfItemsIsChanged(){
        customer.addItemToCart(new StoreProduct(ProductsCategory.GROCERIES, "name"));
        assertEquals(1, customer.countCartItems( ));
    }
    // test customer change number of items in cart
    // test customer can give card admin matches customer and seller
}
