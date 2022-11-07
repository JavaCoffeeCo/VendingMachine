package javacoffee;
//Alex Thomas ABT190000
/*
 * CometCard class creates CometCard object
 */
public class CometCard{
  private String studentName;
  private int studentID;

  public CometCard(String studentName, int studentID){
    this.studentName = studentName;
    this.studentID = studentID;
  }

  public String getStudentName(){
    return studentName;
  }

  public int getStudentID(){
    return studentID;
  }
}