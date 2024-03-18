package estoreTest;

import eStore.StoreProduct;

import org.junit.jupiter.api.Test;

import static eStore.StoreProductCategory.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreProductTest{
    @Test
    void productPriceIsQueried_testProductPriceIsGotten(){
        StoreProduct product=new StoreProduct("biscuit", GROCERIES);
        assertEquals(490, product.getPrice( ));
    }

    @Test
    void queryProductDescription_testProductDescriptionIsGotten(){
        StoreProduct product=new StoreProduct("biscuit", GROCERIES);
        String desc=String.format("""
                Item Id : %s
                Category Of Goods : %s
                price At per : %s
                """, "Bi001", "GROCERIES", 490.0);
        assertEquals(desc, product.getDescription( ));
    }

    @Test
    void getPriceForDifferentCategoriesOfGoods_testPriceIsGotten(){
        StoreProduct product=new StoreProduct("biscuit", GROCERIES);
        assertEquals(490, product.getPrice( ));
        product=new StoreProduct("Knife", UTENSILS);
        assertEquals(600, product.getPrice( ));
        product=new StoreProduct("Cloths", CLOTHING);
        assertEquals(900, product.getPrice( ));
        product=new StoreProduct("wire", ELECTRONICS);
        assertEquals(800, product.getPrice( ));
    }
}
