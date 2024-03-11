package ecommerceStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class User{
private final String name;
private final List<BillingInfo> infos = new ArrayList<>();
    public User(String name, int age, String mail, String address, String password, String number) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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
        return infos.size();
    }

    public void removeBillingInfo(String name, String number){
        for(int counter = 0; counter < infos.size(); counter++){
            if( infos.get(counter).getName( ).equalsIgnoreCase(name) )
                if( infos.get(counter).getNumber( ).equalsIgnoreCase(number) ){
                    infos.remove(infos.get(counter));
                    return;
                }
        }
        throw new BillingInfoNotFoundException();
    }
}
