package estoreTest;

import eStore.StoreCustomer;
import org.junit.jupiter.api.BeforeEach;

public class StoreCustomerTest{
    private StoreCustomer customer;

    @BeforeEach
    void initialize(){
        customer=new StoreCustomer( );
    }
}
