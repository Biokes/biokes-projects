package eStore;

import MentrualApp.MenstrualApp;
import ecommerceStore.ProductCategory;

public class StoreProduct{

    private String productName;
    private String description;

    public StoreProduct(String productName, ProductCategory productCategory){
        this.productName=productName;
    }

    public double getPrice(){
        return calculateProductPrice( );
    }

    private double calculateProductPrice(){
        return this.productName.length( )*10.0;
    }

    public String getDescription(){
        return this.description;
    }
}