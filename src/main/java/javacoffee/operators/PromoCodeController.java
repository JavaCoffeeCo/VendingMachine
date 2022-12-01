package javacoffee.operators;

import java.util.*;

public class PromoCodeController {
    // Promo Code List
    private PromoCodeList pCodeList;

    // Controller Constructor
    public PromoCodeController() { pCodeList = new PromoCodeList(); }

    // Create PromoCode
    public void createPromoCode(Scanner scnr) {

        // Promo Code variables
        String name, code;
        int discount;
        scnr.nextLine();

        // Prompt for promo name
        System.out.println("\nCreate New Promo Code:");
        System.out.println("Enter the name for the promo code: ");
        name = scnr.nextLine();

        // Prompt for discount
        System.out.println("\nEnter the discount for the promo code: ");
        discount = scnr.nextInt();
        scnr.nextLine();

        // Prompt for input code
        System.out.println("\nEnter the code for the promo code: ");
        code = scnr.nextLine();

        // Create promo code
        PromoCode pCode = new PromoCode(name, discount, code);    // Creates new promo code

        // Print new promo code
        pCode.printPromo();
        System.out.println();

        // Save promo code to database
        pCodeList.add(pCode);
    }

    // Delete PromoCode
    public void deletePromoCode(PromoCode pCode) { pCodeList.remove(pCode); }

    // Edit pre-existing promo code
    public void editPromoCode(PromoCode pCode, Scanner scnr) {

        // User input variable
        String answ;

        // Display promo code you are editing
        System.out.println("\nOld Promo Code:");
        pCode.printPromo();

        // Instructions
        System.out.println("\nTo keep a value the same, leave blank.");
        scnr.nextLine();

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

    public void prompt(Scanner scnr) {
        int opChoice;   // Operator choice
        int tmpCode;  // Promo code name
        PromoCode tmpPromo;

        do {
            // Give operator options
            System.out.println("\nOperator Home Screen:");
            System.out.println("1. Add Promo Code\n2. Delete Promo Code\n3. Edit Promo Code\n4. Display Promo Codes\n5. Return to operator screen");
            System.out.println("Select the action you would like preformed: ");
            opChoice = scnr.nextInt();

            switch (opChoice) {
                case 1:
                    createPromoCode(scnr);
                    break;
                case 2:
                    // Delete Promo Code
                    pCodeList.display();    // display all current promo codes
                    System.out.println("\nWhich promo code would you like to delete? (0, 1, 2, ...)");
                    tmpCode = scnr.nextInt();
                    tmpPromo = pCodeList.get(tmpCode + 1);  //move all index up by 1
                    deletePromoCode(tmpPromo);  // delete selected promo code
                    System.out.println(tmpPromo.getName() + " has been deleted\n");
                    break;
                case 3:
                    // Edit Promo Code
                    pCodeList.display();    // display all current promo codes
                    System.out.println("\nWhich promo code would you like to edit? (0, 1, 2, ...)");
                    tmpCode = scnr.nextInt();
                    tmpPromo = pCodeList.get(tmpCode + 1);
                    editPromoCode(tmpPromo, scnr);  // edit selected promo code
                    System.out.println("\nSuccess");
                    System.out.println(tmpPromo.getName() + " has been changed");
                    break;
                case 4:
                    // Display Promo Code
                    pCodeList.display();
                    break;
                case 5:
                    // Exit to Homepage
                    break;
            }
        } while(opChoice != 5);
    }
}
