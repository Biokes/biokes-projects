package eStore;

public class StoreItem{
    private int quantity;
    private StoreProduct product;

    public StoreItem(String productName, StoreProductCategory category, int quantity){
        validateQuantity(quantity);
        this.product=new StoreProduct(productName, category);
    }

    private void validateQuantity(int quantity){
        if( quantity<1 )
            throw new InvalidQuantityException( );
        this.quantity=quantity;
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

    public void chageProductType(StoreProductCategory category){
        this.product.setProductCategory(category);
    }

    public void changeQuantity(int quantity){
        validateQuantity(quantity);
        this.quantity=quantity;
    }
}