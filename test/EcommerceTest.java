import ecommerceStore.Customer;
import ecommerceStore.User;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class EcommerceTest {
    @Test
    void test_customerNameIsGotten(){
        User user = new Customer ("name", 12, "email@gmail.com","address","password","12345678");
        assertEquals("name",user.getName());
    }
}
