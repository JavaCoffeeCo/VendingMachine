package javacoffee.operators;

import java.util.*;
import java.io.*;

public class OperatorDBM {
    private static LinkedList<Operator> opList = new LinkedList<Operator>();

    // Default Constructor
    public OperatorDBM() {}

    // Constructor
    public OperatorDBM(File dBFile) throws FileNotFoundException {
        // Check if file is readable
        if(dBFile.canRead()) {
            // Create database
            Scanner scnr = new Scanner(dBFile);

            while(scnr.hasNext()) {
                // Create new operator
                Operator o = new Operator();

                // Set operatorID and password
                o.setOperatorID(scnr.nextLine());
                o.setPassword(scnr.nextLine());

                add(o);
            }
            // Close scanner
            scnr.close();
        } else {
            System.out.println("Operator Database file could not be read");
        }
    }

    // Add operator to Database
    public void add(Operator o) {
        opList.add(o);
    }

    // Search Database for operator
    public int searchOperator(String oID) {
        Operator o;
        int index = -1;

        for (int i = 0; i < opList.size(); i++) {
            o = opList.get(i);

            if(o.getOperatorID().compareTo(oID) != 0) {
                index = i;
                break;  // Break loop
            }
        }
        return index;
    }

    // Password verification
    public boolean confirmPassword(int index, String pswd) {
        if(opList.get(index).getPassword().compareTo(pswd) != 0) {
            return false;
        } else {
            return true;
        }
    }

    // Remove account from the Database
    public Operator remove(String oID) {
        int index = searchOperator(oID);

        if(index != -1) {
            System.out.println("removing " + opList.get(index));
            return opList.remove(index);
        } else {
            System.out.println("Operator ID not found");
            return null;
        }
    }

    // Get Operator from Database
    public Operator get(String oID) {
        int index = searchOperator(oID);

        if(index != -1) {
            return opList.get(index);
        } else {
            System.out.println("Operator ID not found");
            return null;
        }
    }

    // Print out list of operator accounts
    public void display() {
        for (int i = 0; i < opList.size(); i++) {
            System.out.println("Operator ID: " + opList.get(i).getOperatorID());
            System.out.println("Password: " + opList.get(i).getPassword());
            System.out.println();
        }
    }
}
