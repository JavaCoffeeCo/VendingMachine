package javacoffee.members;

import javacoffee.order.Drink;

//Ezrela Amoako EBA190002
/* Saved Drink Class
 * Saved drinks will be constructed here. 
 * Each saved drink is a regular drink with a
 * user-created name
*/
public class SavedDrink extends Drink{
	private String name;
	
	// Default constructor
	public SavedDrink() {}
	
	// Constructor
	public SavedDrink(String n, String t, String f, String [] a)
	{
		super(t, f, a);
		name = n;	
	}
	
	// Set drink name
	public void setName(String n)
	{
		name = n;
	} 

	// get drink name
	public String getName()
	{
		return name;
	}
	
	// Print drink details
	public void printDrink()
	{
		System.out.println(name + ":");
		System.out.println("Type: " + type);
		System.out.println("Flavor: " + flavor);
		System.out.print("Add Ons: ");
		
		for(int i = 0; i < addOns.length; i++)
		{
			if(i + 1 == addOns.length)
				System.out.println(addOns[i]);
			else
				System.out.print(addOns[i] + ", ");
		}
		
	}
	
	// compare drinks. Return true if drinks are equal
	public boolean equals(SavedDrink s)
	{
		boolean b = false;
		
		if(s.getName().equals(this.getName())) // check names
		{
			if(s.getType().equals(this.getType())) // check types
			{
				if((s.getFlavor()).equals(this.getFlavor())) // check flavors
				{
					if(s.getAddOns().length == this.getAddOns().length) // check length of addOn arrays
					{
						for(int i = 0; i < s.getAddOns().length; i++) // check add ons
						{
							if(!((s.getAddOns()[i]).equals(this.getAddOns()[i])))
							{
								b = true;
							}
						}
						
						if(b)
						{
							System.out.println("add ons don't match");
							b = false; // add ons don't match, b is false
						}
							
						else
							b = true; // if add ons match, set b to true
					}
					/*else
						System.out.println("add ons length");*/
				}
				/*else
					System.out.println("flavor");*/
			}
			/*else
				System.out.println("type");*/
		}
		/*else
		System.out.println("Name");*/
		
		return b;
		
	}
	
	

}
