package estoreTest;

import eStore.InvalidQuantityException;
import eStore.StoreItem;
import org.junit.jupiter.api.Test;

import static eStore.StoreProductCategory.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StoreItemTest{
    @Test
    void changeProductDetails_testProductdetailsIsChanged(){
        StoreItem item=new StoreItem("biscuit", GROCERIES, 2);
        item.chageProductName("sweet");
        assertEquals("sweet", item.getProductName( ));
        String details=String.format("""
                Item Id : %s
                Category Of Goods : %s
                price At per : %s
                """, "Sw001", "GROCERIES", 350.0);
        assertEquals(details, item.getProductDetails( ));
        assertEquals(700.0, item.getPrice( ));
    }

    @Test
    void testNegativeQuantityAndZeroUtemQuantityThrowsException(){
        assertThrows(InvalidQuantityException.class, ()->new StoreItem("name", UTENSILS, 0));
        assertThrows(InvalidQuantityException.class, ()->new StoreItem("name", UTENSILS, -4));
        assertThrows(InvalidQuantityException.class, ()->new StoreItem("name", UTENSILS, -90));
    }
}
