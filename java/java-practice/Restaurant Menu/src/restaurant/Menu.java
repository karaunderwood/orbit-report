package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {

    //Properties
    private Date lastUpdated;
    private ArrayList<MenuItem> items;
    //private HashMap<String, ArrayList<MenuItem>> categoryToItemsMap = new HashMap<>();


    // Constructors
    public Menu(Date d, ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = d;
    }

    //Getters
    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return this.items;
    }

    public String getMenuString() {
        String str = "";
        for (MenuItem item: this.items) {
            str += item.getCategory()  + " (" + item.getPrice() + ")" + "-" + item.getDescription();
        }
        return str;
    }

    //Setters
    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date;
    }

    // Instance Methods

    public void addItem(MenuItem item) {
        if(this.items.contains((item))) {
            System.out.println("This item already exists");
            return;
        }
        this.items.add(item);
        this.lastUpdated = new Date();
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
    }

    public void printItem(MenuItem item) {
        System.out.println(item.getDescription());
    }

    public void printMenu() {
        for (int i = 0; i< items.size(); i++){
            System.out.println(items.get(i).getDescription());
        }
    }


}
