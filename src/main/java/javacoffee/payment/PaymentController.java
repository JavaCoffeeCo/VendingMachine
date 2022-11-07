package javacoffee.payment;

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
  }
