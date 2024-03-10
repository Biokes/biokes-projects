package ecommerceStore;

import java.util.ArrayList;
import java.util.List;

public class User{
private final String name;
    public User(String name, int i, String mail, String address, String password, String number) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfCartItems() {
        return listOfItems.size();
    }
    public void addItem(ProductCategory category, String itemName){
        this.listOfItems.add(itemName);
    }
    private List<String> listOfItems= new ArrayList<> ();
}
