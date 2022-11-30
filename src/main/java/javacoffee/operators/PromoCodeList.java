package javacoffee.operators;

import java.util.*;

public class PromoCodeList {

    private LinkedList<PromoCode> promoList;

    // Default constructor
    public PromoCodeList() { promoList = new LinkedList<PromoCode>(); }

    // Constructor
    public PromoCodeList(LinkedList<PromoCode> l) { promoList = l; }

    // Add promo code to list
    public void add(PromoCode pCode) { promoList.add(pCode); }

    // Remove promo code from list
    public PromoCode remove(int i) {
        if (i > 0 && i <= promoList.size()) {
            System.out.println("Removing " + promoList.get(i - 1).getName());
            return promoList.remove(i - 1);
        }
        else {
            System.out.println("Promo Code not found");
            return null;
        }
    }

    // Remove promo code from list
    public PromoCode remove(PromoCode pCode) {
        if(promoList.remove(pCode)) {;
            return pCode;
        } else {
            return null;
        }
    }

    // Get promo code from list
    public PromoCode get(int i) {
        if (i > 0 && i <= promoList.size()) {
            return promoList.get(i - 1);
        }
        else {
            System.out.println("Promo Code not found");
            return null;
        }
    }

    // Display all promo codes
    public void display() {
        for (int i = 0; i < promoList.size(); i++) {
            promoList.get(i).printPromo(i);
        }
    }

    // Confirmation message
    public void confirm() {
        System.out.println(promoList.getLast().getName() + " has been saved!");
    }
}
