package eStore;

public class StoreItem{
    private final String itemName;
    private final Enum category;

    public StoreItem(ProductsCategory category, String itemName){
        this.category=category;
        this.itemName=itemName;
    }

    public String getProductName(){
        return this.itemName;
    }

    public Enum getProductType(){
        return this.category;
    }
}
