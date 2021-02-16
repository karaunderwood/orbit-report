package restaurant;

import java.math.BigDecimal;

public class MenuItem {

    // Properties
    private String name;
    private String description;
    private double price;
    private boolean isNew;
    private static final String[] CATEGORIES = {"Entree", "Dessert", "Appetizer"};
    private String category;

    // Create a constructor that sets the properties values
    public MenuItem(String name, String description, double price, boolean isNew, String category) {
        //TODO: validation
        this.name = name;
        this.description = description;
        this.price = price;
        this.isNew = false;
        //Check valid category
        this.category = category;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean getIsNew() {
        return isNew;
    }

    // Setters. Add a conditional to make sure they name is NOT null or empty
    public void setName(String aName) {
        if(name == null || name.isEmpty()) {
            System.out.println("That's not a valid name");
            return;
        }
        this.name = aName;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public void setPrice(double aPrice) {
        //TODO: validation
        price = aPrice;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public void setIsNew(boolean aIsNew) {
        isNew = aIsNew;
    }

    public static void main(String[] args) {

    }

    //Instance methods

    public boolean equals(MenuItem comparison) {
        if (comparison == this) {
            return true;
        }

        if (comparison == null) {
            return false;
        }

        if(comparison.getClass() != getClass()) {
            return false;
        }
        MenuItem theItem = (MenuItem) comparison;
        return theItem.getDescription() == getDescription();
    }
    


}
