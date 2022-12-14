package javacoffee.order;

import java.util.HashSet;
import java.util.LinkedList;

public class Menu {
    public static LinkedList<Drink> defaultDrinks = new LinkedList<Drink>();
    public static HashSet<String> drinkTypes = new HashSet<String>();
    public static HashSet<String> flavors = new HashSet<String>();
    public static HashSet<String> addOns = new HashSet<String>();

    // Temporary, initializes the menu with some example drinks and drink components
    static {
        // Add default drinks
        Menu.registerDrink(new Drink("Mocha", "Peppermint", new String[]{"Syrup"}));
        Menu.registerDrink(new Drink("Latte", "Hazelnut", new String[]{"Cream"}));
        Menu.registerDrink(new Drink("Black", "Vanilla", new String[]{}));

        // Add drink types
        Menu.registerDrinkType("Water");
        Menu.registerDrinkType("Latte");
        Menu.registerDrinkType("Black");
        Menu.registerDrinkType("Mocha");

        // Add flavors
        Menu.registerFlavor("None");
        Menu.registerFlavor("Hazelnut");
        Menu.registerFlavor("Peppermint");
        Menu.registerFlavor("Vanilla");

        // Add Add-Ons
        Menu.registerAddOn("Ice");
        Menu.registerAddOn("Cream");
        Menu.registerAddOn("Sugar");
        Menu.registerAddOn("Syrup");
    }

    // Add a new drink to the menu
    private static void registerDrink(Drink d) {
        Menu.defaultDrinks.add(d);
    }

    // Add a new drinkType to the menu
    private static void registerDrinkType(String dt) {
        Menu.drinkTypes.add(dt);
    }

    // Add a new flavor to the menu
    private static void registerFlavor(String f) {
        Menu.flavors.add(f);
    }

    // Add a new addOn to the menu
    private static void registerAddOn(String ao) {
        Menu.addOns.add(ao);
    }
}
