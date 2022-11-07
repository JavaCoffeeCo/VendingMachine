package javacoffee;

// Ezrela Amoako EBA190002
/*
 *  VendingMachineController is the main controller. It directs the user to all the other controllers
 *  (depending on if the user has access to them). 
 */
import java.util.*;
import java.io.*;

public class VendingMachineController {
	private CustomizeController customController;
	private MemberDBM memberDataBase;
	private GUI gui = new GUI();
	
	// Constructor
	public VendingMachineController() {}
	
	public void setMemberDatabase(MemberDBM m)
	{
		memberDataBase = m;
	}
	
	public void setMemberDatabase(File data) throws FileNotFoundException
	{
		memberDataBase = new MemberDBM(data);
	}
	
	public MemberDBM getMemberDatabase()
	{
		return memberDataBase;
		
	}
	
	public void setCustomController(Member m)
	{
		customController = new CustomizeController(m);
	}
	
	public CustomizeController getCustomController()
	{
		return customController;
	}
	
	public void prompt(Scanner scnr)
	{
		int homeChoice;
		do 
		{
			// Print home screen
			
			System.out.println("Welcome to the Java Coffee Company Vending Machine!");
			System.out.print("1. Log in as member\n2. Log in as staff\n3. Order drink\n4. Exit\n");
			System.out.print("Select the action you would like performed: ");
			homeChoice = scnr.nextInt();
			System.out.println();
			
			switch(homeChoice)
			{
				case 1: // Log in as member
				{
					System.out.print("Enter username: ");
					String usr = scnr.next();
					System.out.print("Enter password: ");
					String pswrd = scnr.next();
					System.out.println();
					
					
					
					int ind = memberDataBase.searchUsr(usr);
					if(ind == -1)
					{
						gui.runGUI("Invalid username");
					} // end of invalid username
					else if(!(memberDataBase.confirmPassword(ind, pswrd)))
					{
						gui.runGUI("Invalid password");
					} // end of invalid password
				
					else
					{
						// Print member screen
						
						gui.runGUI("\nWelcome, " + memberDataBase.get(usr).getUser());
						
						// Set customize controller
						setCustomController(memberDataBase.get(usr));
						// set order drinks as well
						
						int memberChoice; // for switch
						
						do
						{
							// Print membership options
							System.out.println(memberDataBase.get(usr).getUser() + "'s rewards:\n1. Save custom drink\n2. Show custom drink list\n3. Return to home screen");
							System.out.print("Select the action you would like performed: ");
							memberChoice = scnr.nextInt();
							System.out.println();
						
						
							switch(memberChoice)
							{
								case 1: // Save custom drink
								{
									// run customize controller
									scnr.nextLine();
									customController.prompt(scnr);
									break;
									
								} // end of Save custom drink
								case 2: // Show custom drink list
								{
									System.out.println(memberDataBase.get(usr).getUser() + "'s custom drinks:");
									memberDataBase.get(usr).getRewards().displayDrinks();
									break;
								} // end of Show custom drink list
								case 3: // Back to home screen
								{
									break;
								} // end of Back to home screen
								
							} // end of member screen
							
						} while( memberChoice != 3); // end of do while
						
					} // end of valid username and password
					
					break;
				} // end of Log in as member
				
				
				case 2: // Log in as staff
				{
					// check for valid ID from staffDatabase
					// if valid
						// ask if staff member wants to: 1. set promocodes (call set promocodes controller), 2. Return to home screen
					// else send error message
					break;
				} // end of Log in as staff
				
				case 3: // Order drink
				{
					// check if user is a member
						// if member ask if member wants to: 1. order off menu 2. order from saved drinks
						// else display menu for user to order
					
						// pay for order (call payment controller)
					break;
				} // end of Order drink
				
				case 4: // exit
				{
					System.out.println("Exiting");
					break;
				}
				
			} // end of switch
			
		} while (homeChoice != 4); // end of do while
	}

}
