package javacoffee.payment;
//Alex Thomas ABT190000
/*
 * CreditCard class creates CreditCard object
 */
public class CreditCard{
  private String creditCardNumber;
  private int securityCode;
  private String name;
  private String expirationDate;
  private float totalCredit;

  public CreditCard(String creditCardNumber, int securityCode, String name, String expirationDate){
    this.creditCardNumber = creditCardNumber;
    this.securityCode = securityCode;
    this.name = name;
    this.expirationDate = expirationDate;
    this.totalCredit = 1500;
  }

  public String getCreditCardNumber(){
    return creditCardNumber;
  }

  public int getSecurityCode(){
    return securityCode;
  }

  public String getName(){
    return name;
  } 

  public String getExpirationDate(){
    return expirationDate;
  }

  public boolean chargeCard(float chargedAmount){
    if(totalCredit >= chargedAmount){
      totalCredit -= chargedAmount;
      return true;
    }
    return false;
  }


  
}
