package ecommerceStore;

public class BillingInfo{
    private final String name;
    private final String number;
    public BillingInfo(String name, String number, Address address){
        this.name = name;
        this.number= number;
    }

    public String getName(){
        return this.name;
    }

    public String getNumber(){
        return this.number;
    }
}
