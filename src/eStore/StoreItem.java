package eStore;

public class StoreItem{
    private StoreProduct product;

    public StoreItem(StoreProduct product, int quantityOfProducts){
        this.product=product;
    }

    public String getProductName(){
        return product.getStoreProductName( );
    }

    public void setProductName(String newName){
        this.product.setStoreProductName(newName);
    }

    public Enum getProductType(){
        return this.product.getStoreProductType( );
    }

    public void setProductType(ProductsCategory productsCategory){
        this.product.setStoreProductType(productsCategory);
    }
}
