package eStore;


public class StoreProduct{
    private String id;
    private double price;
    private String name;
    private StoreProductCategory productCategory;
    public StoreProduct(String productName, StoreProductCategory productCategory){
        this.name=productName;
        this.price=productCategory.getPrice( )*this.name.length( );
        this.productCategory=productCategory;
        this.id=String.valueOf(this.name.charAt(0)).toUpperCase( )+this.name.charAt(1)+"001";
        this.description=String.format("""
                Item Id : %s
                Category Of Goods : %s
                price At per : %s
                """, this.getId( ), this.productCategory, getPrice( ));
    }
    private String description;

    public String getId(){
        return this.id;
    }

    public double getPrice(){
        return this.price;
    }
    public String getDescription(){
        return this.description;
    }

    public void setName(String name){
        this.name=name;
        this.id=String.valueOf(this.name.charAt(0)).toUpperCase( )+this.name.charAt(1)+"001";
        this.price=productCategory.getPrice( )*this.name.length( );
        this.description=String.format("""
                Item Id : %s
                Category Of Goods : %s
                price At per : %s
                """, this.getId( ), this.productCategory, getPrice( ));
    }

    public String getProductName(){
        return this.name;
    }
}