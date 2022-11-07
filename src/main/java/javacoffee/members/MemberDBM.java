package javacoffee.members;

//Ezrela Amoako EBA190002
/*
 * Member Database Manager holds a list of all the users who have membership accounts with
 * the Java Coffee Company Vending Machine
 */
import java.util.*;
import java.io.*;

public class MemberDBM {
	private static LinkedList<Member> memberList = new LinkedList<Member>();
	
	// Default Constructor
	 public MemberDBM(){}
	 
	 // Constructor
	 // Constructor reads database file, creates membership accounts, and puts them into memberlist
	 public MemberDBM(File dBFile) throws FileNotFoundException
	 {
		 // check if file is readable
		 if(dBFile.canRead())
		 {
			 // Create database
			Scanner scnr = new Scanner(dBFile);
			 
			 while(scnr.hasNext())
			 {
				// create new member
				Member m = new Member();
				
				// set username and password
				m.setUser(scnr.nextLine());
				m.setPassword(scnr.nextLine());
				
				String nextLine;
				
				// Get next line of file if file has not ended
				if(scnr.hasNextLine())
				{
					nextLine = scnr.nextLine();
					
					// If next line isn't blank, get user's saved drinks
					while(! nextLine.isBlank())
					{
						// create saved drink
						SavedDrink sd = new SavedDrink();
						
						sd.setName(nextLine);
						sd.setType(scnr.nextLine());
						sd.setFlavor(scnr.nextLine());
						
						// set add ons
						String addOnsList = scnr.nextLine();
						
						// set array size
						String [] addOnsArr = new String [Integer.parseInt(addOnsList.substring(0, 1))];
						
						// remove number from string
						addOnsList = addOnsList.substring(2);
						
						// populate array
						for(int i = 0; i < addOnsArr.length; i++)
						{
							// if end of the list not reached
							if(addOnsList.indexOf(' ') != -1)
							{
								// Add add on and remove it from list
								addOnsArr[i] = addOnsList.substring(0 , addOnsList.indexOf(' '));
								addOnsList = addOnsList.substring(addOnsList.indexOf(' ') + 1);
								
							}
							else // end of the list reached
							{
								addOnsArr[i] = addOnsList;
							}
								
						} // end for loop
						
						// set Saved Drink addOns 
						sd.setAddOns(addOnsArr);
						
						// add saved drink to saved drink list
						m.getRewards().saveDrink(sd);
						
						
						// get next line in file
						if(scnr.hasNext())
							nextLine = scnr.nextLine();
						else
							break; // end loop if end of file reached
						
					} // end of inner while loop

				} // end of if not end of file
				
				// add member to member list
				add(m);
				
			 } // end of outer while loop
			 
			 scnr.close();
		 } // end of if file readable
		 else
			 System.out.println("Member Database file could not be read");
		 
	 }
	 
	 // Add new account to the database
	 public void add(Member m)
	 {
		 memberList.add(m);
		 //confirm();
		
	 }
	 
	 // Search for username in database, return index if found, else return -1
	 public int searchUsr(String usr)
	 {
		 Member curr;
		 int ind = -1;
		 
		 for( int i = 0; i < memberList.size(); i++)
		 {
			 curr = memberList.get(i);
			 
			 if (curr.getUser().compareTo(usr) == 0)
			 {
				 ind = i;
				 
				 break;			// end loop
			 }
			 	 
		 }		
		
		 
		 return ind;
	 }
	 
	 // Password confirmation
	 public boolean confirmPassword(int ind, String pswd)
	 {
		 if(memberList.get(ind).getPassword().compareTo(pswd) != 0)
			 return false;
		 else
			 return true;
	 }
	 
	 // Remove account from database
	 public Member remove(String usr)
	 {
		 int ind = searchUsr(usr);
		 
		 if (ind != -1)
		 {
			 System.out.println("removing " + memberList.get(ind));
			 return memberList.remove(ind);
		 }
		 else
		 {
			 System.out.println("Account not found");
			 return null;
		 }
		 
	 }
	 
	 // Get account from database
	 public Member get(String usr)
	 {
		 int ind = searchUsr(usr);
		 
		 if (ind != -1)
		 {
			 return memberList.get(ind);
		 }
		 else
		 {
			 System.out.println("Account not found");
			 return null;
		 }
		 
	 }
	 
	 // Display Member database
	 public void display()
	 {
		for (int i = 0; i < memberList.size(); i++)
		{
			System.out.println("Username: " + memberList.get(i).getUser() + "\nPassword: " + memberList.get(i).getPassword());
			System.out.println("Saved Drinks:");
			memberList.get(i).getRewards().displayDrinks();
			System.out.println();
		}
	 }
	 
	 // Confirmation message
	 public void confirm()
	 {
		 System.out.println("Your account has been created, " + memberList.getLast().getUser() + " !");
	 } 

}
