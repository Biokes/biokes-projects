package eStore;

public enum StoreProductCategory{
    GROCERIES,
    UTENSILS,
    ELECTRONICS,
    CLOTHING;


    public double getPrice(){
        if( this==GROCERIES )
            return 70.0;
        if( this==UTENSILS )
            return 120.0;
        if( this==ELECTRONICS )
            return 200.0;
        else
            return 150.0;
    }
}
