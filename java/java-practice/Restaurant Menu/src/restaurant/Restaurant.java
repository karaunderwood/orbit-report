package restaurant;

import java.util.Calendar;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem newItem1 = new MenuItem("Garlic linguine", "Yada yada here is a description", 4.99, true, "Dinner");

        MenuItem newItem2 = new MenuItem("Really good steak", "Here is a description of why so good", 6.99, false, "Dinner");

        MenuItem newItem3 = new MenuItem("Delicious wings", "Here's why these wings are so good", 2.99, true, "Appetizer");


        Date today = Calendar.getInstance().getTime();

        // new instance of the Menu class
        Menu ourMenu = new Menu(today, {"name", "description", 5.00, "dinner", new});

        ourMenu.addItem(newItem1);
        ourMenu.addItem(newItem2);
        ourMenu.addItem(newItem3);

        ourMenu.printMenu();

        ourMenu.removeItem(newItem2);

        ourMenu.printMenu();

    }
}
