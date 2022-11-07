package javacoffee.order;

import java.util.*;
import javacoffee.members.Member;
import javacoffee.members.SavedDrink;

//Ezrela Amoako EBA190002
/*
 * Customize controller asks members for their customized drink ingredients, creates 
 * a saved drink, and adds it to the members saved drink class 
 */
public class CustomizeController {
	private Member membership; 
	
	
	// Deafault constructor
	public CustomizeController() 
	{
		membership = new Member();
		
	}
	
	// Constructor
	public CustomizeController(Member m)
	{
		membership = m;
	}
	
	// Set member account
	public void setMember(Member m)
	{
		membership = m;
	}
	
	// get member account
	public Member getMember()
	{
		return membership;
	}
	
	// Create a saved drink
	public SavedDrink customize(String name, String type, String flavor, String [] addOns)
	{
		// create drink
		SavedDrink s = new SavedDrink(name, type, flavor, addOns);
		return s;
	}
	
	// Save custom drink
	public void saveCustom(SavedDrink s)
	{
		membership.getRewards().saveDrink(s);
	}
	
	// Prompt function records users custom drink and saves the drink to their drink list
	public void prompt(Scanner scnr)
	{
		String name, type, flavor;
		String [] addOns;
		int choice, size;
		
		// User must enter all components of drink
		System.out.print("Enter custom drink name: ");
		name = scnr.nextLine();
		
		System.out.print("Enter custom drink type: ");
		type = scnr.nextLine();
		
		System.out.print("Enter custom drink flavor: ");
		flavor = scnr.nextLine();
		
		// User must select 0 to 3 add ons
		System.out.print("Enter how many add ons you would like (from 0 up to 3): ");
		size = scnr.nextInt();
		
		// Invalid number of add ons will result in a new prompt
		while (size > 3 || size < 0)
		{
			System.out.print("You can get 0 to 3 add ons. Please enter a valid number: ");
			size = scnr.nextInt();
		}
		
		// Set add ons array
		if(size == 0)	// if zero add ons requested
		{
			addOns = new String [] {"None"};
		} 
		
		else	// if at least one add on requested
		{
		
			addOns = new String [size];
			
			// Add add ons
			for(int i = 0; i < size; i++)
			{
				System.out.println("Select add on (enter corresponding number): \n1. Sugar\n2. Cream\n3. Syrup");
				choice = scnr.nextInt();
				
				switch (choice)
				{
					case 1:	// Sugar
					{
						addOns[i] = "Sugar";
						break;
					}
					case 2:
					{
						addOns[i] = "Cream";
						break;
					}
					case 3:
					{
						addOns[i] = "Syrup";
						break;
					}
				
				} // end of switch
			} // end of for loop
			
		} // end of else
		
		// Create saved drink
		SavedDrink s = customize(name, type, flavor, addOns);
		// Print drink details
		s.printDrink();
		
		// Ask user if they would like to confirm saving drink
		System.out.print("Would you like to save your drink? Type y for yes and any other key for no: ");
		
		scnr.nextLine();
		String save = scnr.nextLine();
		
		if(save.compareTo("y") == 0)	// save drink if user typed a y
		{
			saveCustom(s);
		}
		else
			return;						// exit from saved drink page if user did not type y
		
		System.out.println();
		
		
	} // end of function
	
	
	
	
	
}
