package javacoffee.payment;
import java.util.*;
//Alex Thomas ABT190000
/*
 * Payment Controller handles all payment functionality
 */
public class PaymentController{
  public PaymentController(){}

  public boolean validateCard(String creditCardNumber){
    if(creditCardNumber.length() == 16){
      return true;
    }
    else{
      return false;
    }
  }

  public boolean payWithCash(Cash insertedAmount, float amountDue){
    if(insertedAmount.totalAmount() >= amountDue){
      System.out.print("Balance: $" + (insertedAmount.totalAmount() - amountDue) + "\n");
      return true;
    }
    return false;
  }

  public boolean payWithCredit(CreditCard cc, float amountDue){
    return cc.chargeCard(amountDue); 
  }

  public boolean payWithCometCard(CometCard cc, float amountDue){
    return cc.chargeCard(amountDue);
  }

  public void prompt(Scanner scan, float amountDue){
    //prompt user for payment method
    System.out.print("1. Cash\n2. Credit Card\n3. Comet Card\n");
    System.out.print("Enter option #: ");
    int option = scan.nextInt();
    //if option chosen is cash then prompt details, create cash object, call paywithcash method
    if(option == 1){
      System.out.print("Enter Bill Amount: ");
      int billAmount = scan.nextInt();
      System.out.print("Enter Coin Amount: ");
      float coinAmount = scan.nextFloat();
      Cash insertedCash = new Cash(billAmount, coinAmount);
      if(payWithCash(insertedCash, amountDue) == true){
        System.out.print("Transaction Successful\n");
        System.out.println("Please pick up your drink below!\n");
      }
      else{
        System.out.println("Transaction Failed\n");
      }
    }
    //if option chosen is credit then prompt details, create creditcard object, call paywithcredit method
    else if(option == 2){
      scan.nextLine();
      System.out.print("Enter Credit Card #: ");
      String ccn = scan.nextLine();
      System.out.print("Enter Security Code: ");
      int sc = scan.nextInt();
      System.out.print("Enter Name: ");
      String n = scan.nextLine();
      scan.nextLine();
      System.out.print("Enter Expiration Date: ");
      String ed = scan.nextLine();
      if(validateCard(ccn)){
        CreditCard insertedCard = new CreditCard(ccn, sc, n, ed);
        if(payWithCredit(insertedCard, amountDue) == true){
          System.out.print("Transaction Successful\n");
          System.out.println("Please pick up your drink below!\n");
        }
        else{
          System.out.println("Transaction Failed\n");
        }
      }
      else{
        System.out.println("Invalid Credit Card Number");
      }
    }
    //if option chosen is cometcard then prompt details, create cometcard object, call paywithcomet method
    else if(option == 3){
      scan.nextLine();
      System.out.print("Enter Student Name: ");
      String n = scan.nextLine();
      System.out.print("Enter Student ID#: ");
      int si = scan.nextInt();
      CometCard insertedCard = new CometCard(n, si);
      if(payWithCometCard(insertedCard, amountDue) == true){
        System.out.print("Transaction Successful\n");
        System.out.println("Please pick up your drink below!\n");
      }
      else{
        System.out.println("Transaction Failed\n");
      }
    }
    //if option chosen is out of bounds print invalid option
    else{
      System.out.print("Invalid Option\n");
    }
  } 
}
