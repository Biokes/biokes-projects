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

    @Test
    void queryProductDescription_testProductDescriptionIsGotten(){
        StoreProduct product=new StoreProduct("biscuit", ProductCategory.GROCERIES);
        String desc=String.format("""
                itemID : %s
                ItemName : %s
                Category : %s
                Description : biscuit
                price(at per) : %s
                """, "GRObis01", "biscuit", "GROCERIES", 70.0);
        assertEquals(desc, product.getDescription( ));
    }
}
