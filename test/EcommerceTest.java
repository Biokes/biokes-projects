import ecommerceStore.Address;
import ecommerceStore.BillingInfo;
import ecommerceStore.Customer;
import ecommerceStore.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ecommerceStore.ProductCategory.*;
import static org.junit.Assert.assertEquals;

public class EcommerceTest {
    private User customer;
    @BeforeEach
    void newUser(){
        customer= new Customer ("name", 12, "email@gmail.com","address","password","12345678");
    }

    @Test
    void test_customerNameIsGotten(){
        assertEquals("name", customer.getName());
    }
    @Test
    void testUserCanGetCanAddItemstoCart(){
        assertEquals(0, customer.getNumberOfCartItems ());
        customer.addItem(GROCERIES,"food");
        assertEquals(1, customer.getNumberOfCartItems ());
    }
    @Test
    void testUserCanGetCanAddMultipleItemstoCart(){
        assertEquals(0, customer.getNumberOfCartItems ());
        customer.addItem(GROCERIES,"food");
        assertEquals(1, customer.getNumberOfCartItems ());
        customer.addItem(UTENSILS,"spoons and plates");
        assertEquals(2, customer.getNumberOfCartItems ());
        customer.addItem(ELECTRONICS,"iron");
        assertEquals(3, customer.getNumberOfCartItems ());
        customer.addItem(CLOTHING,"gown");
        assertEquals(4, customer.getNumberOfCartItems ());
    }
    @Test
    void testUserCAnAddAndRemoveItemsFormCart(){
        customer.addItem(GROCERIES,"food");
        assertEquals(1, customer.getNumberOfCartItems ());
        customer.addItem(UTENSILS,"spoons and plates");
        assertEquals(2, customer.getNumberOfCartItems ());
        customer.addItem(ELECTRONICS,"iron");
        assertEquals(3, customer.getNumberOfCartItems ());
        customer.removeItem(GROCERIES,"food");
        assertEquals(2, customer.getNumberOfCartItems ());
    }
    @Test
    void test_userAddBillingInfo_BillingInfoIsAdded(){
        customer.addBillingInfo(new BillingInfo("0909897", "name", new Address("12",
                "street","city","state","country")));
        assertEquals(1, customer.numberOfBillingInfos());
    }
}
