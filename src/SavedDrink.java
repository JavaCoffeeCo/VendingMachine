package javacoffee;
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
	
	

}
