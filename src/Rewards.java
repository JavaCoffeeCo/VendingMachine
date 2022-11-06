package rewardsSystem;
//Ezrela Amoako EBA190002
/*
 * The Rewards class holds the saved drink list and promo codes
 * For this demo, we will focus on the saved drinks list
 */
public class Rewards {
	private SavedDrinkList savedDrinks;
	
	// Default constructor
	public Rewards()
	{
		savedDrinks = new SavedDrinkList();
	}
	
	// Constructor
	public Rewards(SavedDrinkList s)
	{
		savedDrinks = s;
	}
	
	// Save drink to list
	public void saveDrink(SavedDrink s)
	{
		savedDrinks.add(s);
	}
	
	// Get saved drink
	public SavedDrink getDrink(int ind)
	{
		return savedDrinks.get(ind);	
	}
	
	// Display drinks
	public void displayDrinks()
	{
		savedDrinks.display();
	}
	

}
