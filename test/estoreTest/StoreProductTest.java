package estoreTest;

import eStore.StoreProduct;
import ecommerceStore.ProductCategory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreProductTest{
    @Test
    void productPriceIsQueried_testProductPriceIsGotten(){
        StoreProduct product=new StoreProduct("biscuit", ProductCategory.GROCERIES);
        assertEquals(70, product.getPrice( ));
    }
}
