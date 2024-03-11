package ecommerceStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class User{
private final String name;
private final String mail;
private final List<BillingInfo> infos = new ArrayList<>();
    public User(String name, int i, String mail, String address, String password, String number) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return this.name;
    }
    private String getMail(){
        return mail;
    }

    public int getNumberOfCartItems() {
        return listOfItems.size();
    }
    public void addItem(ProductCategory category, String itemName){
        this.listOfItems.put(category,itemName);
    }
    private final HashMap<ProductCategory, String> listOfItems= new HashMap<>();

    public void removeItem(ProductCategory productCategory, String food) {
        listOfItems.remove(productCategory, food );
    }

    public void addBillingInfo(BillingInfo billingInfo){
        this.infos.add(billingInfo);
    }

    public int numberOfBillingInfos(){
        return 0;
    }
}
