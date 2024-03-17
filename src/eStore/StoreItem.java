package eStore;

public class StoreItem{
    private String itemName;
    private Enum category;

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

    public void setProductType(ProductsCategory productsCategory){
        this.category=productsCategory;
    }

    public void setProductName(String name){
        this.itemName=name;
    }
}
