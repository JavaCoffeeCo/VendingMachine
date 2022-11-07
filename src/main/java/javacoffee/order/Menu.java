package javacoffee.order;

import java.util.HashSet;

public class Menu {
    public static HashSet<Drink> defaultDrinks;
    public static HashSet<String> drinkTypes;
    public static HashSet<String> flavors;
    public static HashSet<String> addOns;

    // Temporary, initializes the menu with some example drinks and drink components
    static {
        // Add default drinks
        Menu.registerDrink(new Drink("Water", "None", new String[]{"Ice"});

        // Add drink types
        Menu.registerDrinkType("Water");
        Menu.registerDrinkType("Latte");
        Menu.registerDrinkType("Black");
        Menu.registerDrinkType("Mocha");

        // Add flavors
        Menu.registerFlavor("None");
        Menu.registerFlavor("Hazelnut");
        Menu.registerFlavor("Peppermint");

        // Add Add-Ons
        Menu.registerAddOn("None");
        Menu.registerAddOn("Ice");
        Menu.registerAddOn("Cream");
        Menu.registerAddOn("Suger");
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
