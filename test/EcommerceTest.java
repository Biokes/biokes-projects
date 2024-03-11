import ecommerceStore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ecommerceStore.ProductCategory.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
    void test_customerRemoveItemFromCart_itemIsRemoved(){
        customer.addItem(GROCERIES,"food");
        assertEquals(1, customer.getNumberOfCartItems ());
        customer.addItem(UTENSILS,"spoons and plates");
        assertEquals(2, customer.getNumberOfCartItems ());
        customer.removeItem(GROCERIES, "food");
    }
    @Test
    void test_customerRemoveItemNotAdded_throwException(){
        assertThrows(ItemNotFoundException.class,()->customer.removeItem(ELECTRONICS,"name"));
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
        customer.addBillingInfo(new BillingInfo("0909897", "name1", new Address("12",
                "street","city","state","country")));
        assertEquals(2, customer.numberOfBillingInfos());

    }
    @Test
    void Test_userRemoveBillingInfo_billingInfoIsRemoved(){
        customer.addBillingInfo(new BillingInfo("name", "0909897", new Address("12",
                "street","city","state","country")));
        assertEquals(1, customer.numberOfBillingInfos());
        customer.removeBillingInfo("name", "0909897");
        assertEquals(0, customer.numberOfBillingInfos());
    }
    @Test
    void test_customerRemoveInfoNotCreated_ExceptionIsThrown(){
        assertThrows(BillingInfoNotFoundException.class,()->customer.removeBillingInfo("name", "0909897"));
        assertThrows(BillingInfoNotFoundException.class,()->customer.removeBillingInfo("nameGiven", "09098978923"));

    }
    @Test
    void test_multipleBillingWithSameNameAdded_exceptionIsTHrown(){
        customer.addBillingInfo(new BillingInfo("name", "0909897", new Address("12",
                "street","city","state","country")));
        assertThrows(InfoDetailsAlreadyExistException.class,()->customer.addBillingInfo(
                new BillingInfo("name", "0909897", new Address("12",
                "street","city","state","country"))));
    }
    @Test
    void test_CustomerAddItemToCartAndAddBillingInfo_itemAndInfoIsAdded(){
        assertEquals(0, customer.getNumberOfCartItems ());
        customer.addItem(GROCERIES,"food");
        assertEquals(1, customer.getNumberOfCartItems ());
        customer.addBillingInfo(new BillingInfo("0909897", "name", new Address("12",
                "street","city","state","country")));
        assertEquals(1, customer.numberOfBillingInfos());
    }
}
