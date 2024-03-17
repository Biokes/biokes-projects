package eStore;

public class StoreProduct{
    private String itemName;
    private Enum category;

    public StoreProduct(ProductsCategory category, String itemName){
        this.category=category;
        this.itemName=itemName;
    }

    public String getStoreProductName(){
        return this.itemName;
    }

    public void setStoreProductName(String name){
        this.itemName=name;
    }

    public Enum getStoreProductType(){
        return this.category;
    }

    public void setStoreProductType(ProductsCategory productsCategory){
        this.category=productsCategory;
    }
}
