package javacoffee.operators;

public class Operator {
    private String operatorID;
    private String password;

    // Default Constructors
    public Operator() {}

    // Constructor
    public Operator(String oID, String oPassword) {
        operatorID = oID;
        password = oPassword;
    }

    // Getters
    public String getOperatorID() {
        return operatorID;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setOperatorID(String oID) {
        operatorID = oID;
    }

    public void setPassword(String oPassword) {
        password = oPassword;
    }
}
