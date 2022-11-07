package javacoffee.members;

//Ezrela Amoako EBA190002
/*
 * SavedDrinkList holds all of a member's saved drinks
 * Members can add, remove, and display drinks from the list
 * For this demo, we will focus on adding and displaying.
 */
import java.util.*;

public class SavedDrinkList {
 private LinkedList<SavedDrink> drinksList;
 
 // Default constructor
 public SavedDrinkList()
 {
	 drinksList = new LinkedList<SavedDrink>();	 
 }
 
 // Constructor
 public SavedDrinkList(LinkedList<SavedDrink> l)
 {
	 drinksList = l;
 }
 
 // Add drink to list
 public void add(SavedDrink s)
 {
	 drinksList.add(s);
	 //confirm();
	
 }
 
 // Remove drink from list
 public SavedDrink remove(int ind)
 {
	 if (ind > 0 && ind <= drinksList.size())
	 {
		 System.out.println("removing " + drinksList.get(ind - 1).getName());
		 return drinksList.remove(ind - 1);
	 }
	 else
	 {
		 System.out.println("Drink not found");
		 return null;
	 }
	 
 }
 
 // get saved drink
 public SavedDrink get(int ind)
 {
	 if (ind > 0 && ind <= drinksList.size())
	 {
		 return drinksList.get(ind - 1);
	 }
	 else
	 {
		 System.out.println("Drink not found");
		 return null;
	 }
	 
 }
 
 // Display all saved drinks
 public void display()
 {
	for (int i = 0; i < drinksList.size(); i++)
	{
		System.out.print( (i + 1) + " - ");
		drinksList.get(i).printDrink();
		//System.out.println();
	}
 }
 
 // Confirmation message
 public void confirm()
 {
	 System.out.println("Your drink, " + drinksList.getLast().getName() + " has been saved!");
 } 

}
