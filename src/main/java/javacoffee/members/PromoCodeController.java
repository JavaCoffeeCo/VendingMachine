package javacoffee.members;

import java.util.*;

public class PromoCodeController {
    // Promo Code List
    PromoCodeList pCodeList;

    // Controller Constructor
    public PromoCodeController() {pCodeList = new PromoCodeList()}

    // PromoCode Getters
    public String getPromoName(PromoCode pCode) { return pCode.getName(); }

    public int getPromoDiscount(PromoCode pCode) { return pCode.getDiscount(); }

    public String getPromoCode(PromoCode pCode) { return pCode.getCode(); }

    // Create PromoCode
    public void createPromoCode(Scanner scnr) {

        // Promo Code variables
        String name, code;
        int discount;

        // Prompt for promo name
        System.out.println("Enter the name for the promo code: ");
        name = scnr.nextLine();

        // Prompt for discount
        System.out.println("Enter the discount for the promo code: ");
        discount = Integer.parseInt(scnr.nextLine());

        // Prompt for input code
        System.out.println("Enter the code for the promo code: ");
        code = scnr.nextLine();

        // Create promo code
        PromoCode pCode = new PromoCode(name, discount, code);    // Creates new promo code

        // Save promo code to database
        pCodeList.add(pCode);
    }

    // Delete PromoCode
    public void deletePromoCode(PromoCode pCode) {
        pCodeList.remove(pCode);
    }

    // Edit pre-existing promo code
    public void editPromoCode(PromoCode pCode, Scanner scnr) {

        // User input variable
        String answ;

        // Display promo code you are editing
        System.out.println("Old Promo Code:" + '\n' + pCode.printPromo());

        // Instructions
        System.out.println("If you want to keep something the same, than answer with blank.");

        // Change name
        System.out.println("Enter new name: ");
        answ = scnr.nextLine();
        if (!answ.equals("")) {
            pCode.setName(answ);
        }

        // Change discount amount
        System.out.println("Enter new discount: ");
        answ = scnr.nextLine();
        if (!answ.equals("")) {
            pCode.setDiscount(Integer.parseInt(answ));
        }

        // Change user code needed for promotion
        System.out.println("Enter new user code: ");
        answ = scnr.nextLine();
        if (!answ.equals("")) {
            pCode.setCode(answ);
        }
    }
}
