package javacoffee.order;

import java.util.Scanner;
import javacoffee.members.Member;
import javacoffee.members.SavedDrinkList;

/*
 * OrderManager allows orders to be submitted and carries them out.
 */
public class OrderManager {
    private OrderQueue orderQueue;
    private Member currentMember;

    public void menuPrompt(Scanner scnr) {
        System.out.println("Choose one drink from the list below:");
        for(int i = 0; i < Menu.defaultDrinks.size(); ++i) {
            String name = Menu.defaultDrinks.get(i).toString();
            System.out.println((i+1) + " - " + name);
        }
        int choice = scnr.nextInt() - 1;
        if(choice >= 0 && choice < Menu.defaultDrinks.size()) {
            this.orderDrink(Menu.defaultDrinks.get(choice));
        }
        System.out.println("Ordered " + orderQueue.getNextOrder());
        this.makeNextDrink();
    }

    public void savedDrinkPrompt(Scanner scnr) {
        System.out.println("Choose one drink from the list below:");
        currentMember.getRewards().displayDrinks();
        int choice = scnr.nextInt();
        this.orderDrink(currentMember.getRewards().getDrink(choice));
        System.out.println("Ordered " + orderQueue.getNextOrder());
        this.makeNextDrink();
    }

    // Submit a drink to the order queue
    public void orderDrink(Drink d) {
        if(this.validateDrink(d)) {
            this.orderQueue.addOrder(d);
        }
    }

    // Ensure a drink contains items on the menu
    public boolean validateDrink(Drink d) {
        if(!Menu.drinkTypes.contains(d.getType())) return false;
        if(!Menu.flavors.contains(d.getFlavor())) return false;
        for(String ao : d.getAddOns()) {
            if(!Menu.addOns.contains(ao)) return false;
        }

        return true;
    }

    // Make the next drink in the order queue
    public void makeNextDrink() {
        Drink d = this.orderQueue.getNextOrder();
        /* Making the drink */
        //System.out.println("Please pick up your drink below!\n");
        System.out.println("\n");
        this.orderQueue.removeOrder(d);
    }

    // Constructor
    public OrderManager() {
        this.orderQueue = new OrderQueue();
        this.currentMember = null;
    }

    // Set the currently logged in member
    public void setMember(Member m) {
        this.currentMember = m;
    }

    // Clear the currently logged in member (for logout)
    public void clearMember() {
        this.currentMember = null;
    }

    // Get the currently logged in member
    public Member getMember() {
        return this.currentMember;
    }
}
