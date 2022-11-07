package javacoffee.order;

import javacoffee.members.Member;

/*
 * OrderManager allows orders to be submitted and carries them out.
 */
public class OrderManager {
    private OrderQueue orderQueue;
    private Member currentMember;

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
        System.out.println("Please pick up your drink below!");
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
