package javacoffee.order;

import java.util.LinkedList;

/*
 * OrderQueue keeps track of the orders to be made.
 */
public class OrderQueue {
    private LinkedList<Drink> drinkQueue;

    // Constructor
    public OrderQueue() {
        this.drinkQueue = new LinkedList<Drink>();
    }

    // Add a drink to the order queue
    public void addOrder(Drink drink) {
        this.drinkQueue.add(drink);
    }

    // Remove a drink from the order queue
    public boolean removeOrder(Drink drink) {
        return this.drinkQueue.remove(drink);
    }

    // Get the next order in the queue
    public Drink getNextOrder() {
        if(!this.drinkQueue.isEmpty()) {
            return this.drinkQueue.getFirst();
        } else {
            return null;
        }
    }
}
