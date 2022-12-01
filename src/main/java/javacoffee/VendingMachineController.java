package javacoffee;

// Ezrela Amoako EBA190002
/*
 *  VendingMachineController is the main controller. It directs the user to all the other controllers
 *  (depending on if the user has access to them). 
 */
import java.util.*;
import java.io.*;

import javacoffee.operators.OperatorDBM;
import javacoffee.operators.PromoCodeController;
import javacoffee.order.OrderManager;
import javacoffee.payment.PaymentController;
import javacoffee.members.CustomizeController;
import javacoffee.members.Member;
import javacoffee.members.MemberDBM;
import javacoffee.gui.GUI;

public class VendingMachineController {
	private CustomizeController customController;
	private PromoCodeController promoController;
	private MemberDBM memberDataBase;
	private OperatorDBM operatorDataBase;
    private OrderManager orderManager;
	private PaymentController paymentController = new PaymentController();
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
        OrderManager orderManager = new OrderManager();
		int homeChoice;
        mainMenu:
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
						gui.runGUI("Login Failed. Invalid username");
					} // end of invalid username
					else if(!(memberDataBase.confirmPassword(ind, pswrd)))
					{
						gui.runGUI("Login Failed. Invalid password");
					} // end of invalid password
				
					else
					{
						// Print member screen
						
						gui.runGUI("Login Successful. Welcome, " + memberDataBase.get(usr).getUser());
                        orderManager.setMember(memberDataBase.get(usr));
						
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
									System.out.println();
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
					System.out.print("Enter Operator ID: ");
					String opID = scnr.next();
					System.out.print("Enter Password: ");
					String opassword = scnr.next();
					System.out.println();

					int ind = operatorDataBase.searchOperator(opID);
					if(ind == -1) {
						gui.runGUI("Login Failed. Invalid Operator ID");
					} else if(!(operatorDataBase.confirmPassword(ind, opassword))) {
						gui.runGUI("Login Failed. Invalid Password");
					} else {
						// Print operator screen
						gui.runGUI("Login Successful. Welcome, " + operatorDataBase.get(opID).getOperatorID());

						int opChoice;

						do {
							// Print operator options
							System.out.println("1. Set PromoCodes\n2. Return to home screen");
							System.out.print("Select the action you would like performed: ");
							opChoice = scnr.nextInt();
							System.out.println();

							switch(opChoice) {
								case 1:	// Run promo code controller
									promoController.prompt(scnr);
									break;
								case 2:	// Go to main menu
									break;
							}
						} while(opChoice != 2);
					}	// end of operator verification
					break;
				} // end of Log in as staff
				
				case 3: // Order drink
				{
					// check if user is a member
                    if(orderManager.getMember() != null) {
						// if member ask if member wants to: 1. order off menu 2. order from saved drinks
                        System.out.print("1. Order Off of Menu\n2. Order from saved drinks\n3. Exit\n");
                        switch(scnr.nextInt()) {
                            case 1:
				gui.orderDrinkGUI();
                                orderManager.menuPrompt(scnr);
				System.out.println("Drink price is: $5.00\nSelect payment type:");
								paymentController.prompt(scnr, 5.00f);
				System.out.println();
                                break;
                            case 2:
				gui.orderSavedDrinkGUI();
                                orderManager.savedDrinkPrompt(scnr);
								paymentController.prompt(scnr, 5.00f);
				System.out.println();
                                break;
                            case 3:
                                continue mainMenu;
                        }
                    // else display menu for user to order
                    } else {
			 gui.orderDrinkGUI();
                        orderManager.menuPrompt(scnr);
			    System.out.println("Drink price is: $5.00\nSelect payment type:");
						paymentController.prompt(scnr, 5.00f);
                    }
					
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
