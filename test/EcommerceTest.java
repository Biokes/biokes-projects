import ecommerceStore.Customer;
import ecommerceStore.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ecommerceStore.ProductCategory.*;
import static org.junit.Assert.assertEquals;

public class EcommerceTest {
    private User user;
    @BeforeEach
    void newUser(){
        user = new Customer ("name", 12, "email@gmail.com","address","password","12345678");
    }

    @Test
    void test_customerNameIsGotten(){
        assertEquals("name",user.getName());
    }
    @Test
    void testUserCanGetCanAddItemstoCart(){
        assertEquals(0,user.getNumberOfCartItems ());
        user.addItem(GROCERIES,"food");
        assertEquals(1,user.getNumberOfCartItems ());
    }
    @Test
    void testUserCanGetCanAddMultipleItemstoCart(){
        assertEquals(0,user.getNumberOfCartItems ());
        user.addItem(GROCERIES,"food");
        assertEquals(1,user.getNumberOfCartItems ());
        user.addItem(UTENSILS,"spoons and plates");
        assertEquals(2,user.getNumberOfCartItems ());
        user.addItem(ELECTRONICS,"iron");
        assertEquals(3,user.getNumberOfCartItems ());
        user.addItem(CLOTHING,"gown");
        assertEquals(4,user.getNumberOfCartItems ());
    }
    @Test
    void testUserCAnAddAndRemoveItemsFormCart(){
        user.addItem(GROCERIES,"food");
        assertEquals(1,user.getNumberOfCartItems ());
        user.addItem(UTENSILS,"spoons and plates");
        assertEquals(2,user.getNumberOfCartItems ());
        user.addItem(ELECTRONICS,"iron");
        assertEquals(3,user.getNumberOfCartItems ());
        user.removeItem(GROCERIES,"food");
        assertEquals(2,user.getNumberOfCartItems ());
    }

}
