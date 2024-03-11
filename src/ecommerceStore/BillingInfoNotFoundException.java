package ecommerceStore;

public class BillingInfoNotFoundException extends RuntimeException{
    public BillingInfoNotFoundException(){
        super("No Billing info found.");
    }
}
