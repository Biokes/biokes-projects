package eStore;

public class StoreItem{
    private int quantity;
    private StoreProduct product;

    public StoreItem(String productName, StoreProductCategory category, int quantity){
        this.quantity=quantity;
        this.product=new StoreProduct(productName, category);
    }

    public void chageProductName(String sweet){
        this.product.setName(sweet);
    }

    public String getProductName(){
        return this.product.getProductName( );
    }

    public String getProductDetails(){
        return this.product.getDescription( );
    }

    public double getPrice(){
        return this.quantity*this.product.getPrice( );
    }
}