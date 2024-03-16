package inheritanceTest;

import eStore.StoreCustomer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstoreTest{
    private StoreCustomer customer;

    @BeforeEach
    void initialize(){
        customer=new StoreCustomer( );
    }

    @Test
    void userGetCartInStore(){
        customer.getCart( );
    }
}
