package estoreTest;
import eStore.Estore;
import eStore.StoreCustomer;
import eStore.StoreItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static eStore.StoreProductCategory.GROCERIES;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StoreCustomerTest{
    private StoreCustomer customer;
    @BeforeEach
    void initialize(){
        customer=new StoreCustomer(new Estore());
    }
    @Test
    void addItemToCart_test_itemIsAdded(){
        StoreItem item = new StoreItem("sweet",GROCERIES, 3);
        customer.getCart();
        customer.addItemToCart(item);
        assertEquals(1,customer.numberOfItemsInCart());
    }
    @Test
    void customerAddAndRemoveItem_testItemIsAddedAndRemoved(){
        StoreItem item = new StoreItem("sweet",GROCERIES, 3);
        customer.getCart();
        customer.addItemToCart(item);
        assertEquals(1,customer.numberOfItemsInCart());
        customer.removeItemFromCart("Sweet");
        assertEquals(0,customer.numberOfItemsInCart());
    }
    @Test
    void changeProductName_testProductNameIsChanged(){

    }
}
