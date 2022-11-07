package javacoffee;
import java.util.*;

public class PaymentController{
  public PaymentController(){}

  public boolean payWithCash(Cash insertedAmount, float amountDue){
    if(insertedAmount.totalAmount >= amountDue){
      System.out.print("Balance: " + (insertedAmount.totalAmount - amountDue));
      return true;
    }
    return false;
  }

  public boolean payWithCredit(CreditCard cc, float amountDue){
    //need to implement
    return false; 
  }

  public boolean payWithCometCard(CometCard cc, float insertedAmount){
    //need to implement
    return false;
  }

  public void prompt(Scanner scan, float amountDue){
    System.out.print("1. Cash\n2. Credit Card\n3.Comet Card");
    int option = scan.nextInt();
    if(option == 1){
      System.out.print("Enter Bill Amount: ");
      int billAmount = scan.nextInt();
      System.out.print("Enter Coin Amount: ");
      float coinAmount = scan.nextFloat();
      Cash insertedCash = new Cash(billAmount, coinAmount);
      if(payWithCash(insertedCash, amountDue) == true){
        System.out.print("Transaction Successful\n");
      }
      else{
        System.out.print("Transaction Failed\n");
      }

      
    }
    else if(option == 2){
      System.out.print("Enter Credit Card #: ");
      String ccn = scan.nextLine();
      System.out.print("Enter Security Code: ");
      int sc = scan.nextInt();
      System.out.print("Enter Name: ");
      int n = scan.nextLine();
      System.out.print("Enter Expiration Date: ");
      int ed = scan.nextLine();
      CreditCard insertedCard = new CreditCard(ccn, sc, n, ed);
      if(payWithCredit(insertedCard, amountDue) == true){
        System.out.print("Transaction Successful\n");
      }
      else{
        System.out.print("Transaction Failed\n");
      }
    }
    else if(option == 3){
      System.out.print("Enter Student Name: ");
      String n = scan.nextLine();
      System.out.print("Enter Student ID#: ");
      int si = scan.nextInt();
      CometCard insertedCard = new CometCard(n, si);
      if(payWithCometCard(insertedCard, amountDue) == true){
        System.out.print("Transaction Successful\n");
      }
      else{
        System.out.print("Transaction Failed\n");
      }
    }
    else{
      System.out.print("Invalid Option\n");
    }
  } 
}