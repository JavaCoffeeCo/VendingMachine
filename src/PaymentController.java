package javacoffee;
import java.util.*;

public class PaymentController{
    public PaymentController(){}
  
    public boolean payWithCredit(CreditCard cc, float amountDue){
     return false; 
    }
  
    public boolean payWithCash(Cash insertedAmount, float amountDue){
      return false;
    }
  
    public boolean payWithCometCard(CometCard cc, float insertedAmount){
      return false;
    }

    public void prompt(Scanner scan, float chargedAmount){
      System.out.print("1. Cash\n2. Credit Card\n3.Comet Card");
      int option = scan.nextInt();
      if(option == 1){
        System.out.print("Enter Bill Amount: ");
        int billAmount = scan.nextInt();
        System.out.print("Enter Coin Amount: ");
        float coinAmount = scan.nextFloat();
        Cash insertedCash = new Cash(billAmount, coinAmount);
        if(insertedCash.totalAmount < chargedAmount){
          System.out.print("Invalid Amount\n");
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
      }
      else if(option == 3){
        System.out.print("Enter Student Name: ");
        String n = scan.nextLine();
        System.out.print("Enter Student ID#: ");
        int si = scan.nextInt();
        CometCard insertedCard = new CometCard(n, si);
      }
      else{
        System.out.print("Invalid Option\n");
      }
  }
}