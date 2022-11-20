package javacoffee.payment;
//Alex Thomas ABT190000
/*
 * CometCard class creates CometCard object
 */
public class CometCard{
  private String studentName;
  private int studentID;
  private float currentAmount;

  public CometCard(String studentName, int studentID){
    this.studentName = studentName;
    this.studentID = studentID;
    this.currentAmount = 100;
  }

  public String getStudentName(){
    return studentName;
  }

  public int getStudentID(){
    return studentID;
  }

  public boolean chargeCard(float amount){
    if(currentAmount >= amount){
      currentAmount -= amount;
      return true;
    }
    return false;
  }
}
