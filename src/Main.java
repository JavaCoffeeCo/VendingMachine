package rewardsSystem;
import java.io.*;
//import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//Scanner scnr = new Scanner(System.in);
		File infile = new File("data1.txt");
		
		
		if(infile.canRead())
		{
			MemberDBM m = new MemberDBM(infile);
			m.display();
		}	
		else
			System.out.println("File not found");
		
		
		//Scanner scnr = new Scanner(System.in);
		//String [] a = new String [] {"sugar"};
		//SavedDrink s1 = new SavedDrink("Drink1", "Black", "uh", a);
		//MemberDBM mDB = new MemberDBM();
		
		/*Member m = new Member();
		m.getRewards().saveDrink(s1);
		System.out.println(m.getRewards().getDrink(1).getName());
		*/
	
		
		/*String [] a = new String [] {"sugar"};
		SavedDrink s1 = new SavedDrink("Drink1", "Black", "uh", a);
		SavedDrink s2 = new SavedDrink("Drink2", "latte", "pizazz", a);
		SavedDrink s3 = new SavedDrink("Drink3", "Black", "swag", a);
		SavedDrinkList l = new SavedDrinkList();
		
		System.out.println("Add drink");
		l.add(s1);
		//l.display();
		
		System.out.println("Add drink");
		l.add(s2);
		//l.display();
		
		System.out.println("Add drink");
		l.add(s3);
		//l.display();
		*/
		
		/*System.out.println("\nSelect drink to remove (enter number on list)");
		l.display();
		int num = scnr.nextInt();
		l.remove(num);
		
		System.out.println("\nSelect drink to order (enter number on list)");
		l.display();
		num = scnr.nextInt();
		scnr.nextLine();
		
		if(l.get(num) != null)
		System.out.println("Your order: " + l.get(num).getName());
		*/
		
		/*
		Rewards r = new Rewards(l);
		
		Member m = new Member("CandyBro", "Super66");
		m.setRewards(r);
		
		MemberDBM mDBM = new MemberDBM();
		mDBM.add(m);
		*/
		/*CustomizeController c = new CustomizeController(m);
		
		c.prompt(scnr);
		
		m.getRewards().displayDrinks();
		
		scnr.close();
		*/
		
		/*
		VendingMachineController v = new VendingMachineController();
		v.setMemberDatabase(mDBM);
		v.prompt(scnr);
		
		*/
		
		
		

	}

}
