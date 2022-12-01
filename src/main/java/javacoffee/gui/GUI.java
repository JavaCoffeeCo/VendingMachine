package javacoffee.gui;
// EBA190002
/*
* GUI class displays a message concerning a users login status
*/
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class GUI implements ActionListener{
	private static JLabel success;
	private JFrame orderFrame;
	private JButton button1; // Select Hazelnut Latte from menu
	private JButton button2; // Select Peppermint Mocha from menu
	private JButton button3; // Select Vanilla Black Coffee from menu
	private JButton button4; // Select Saved Drink 1 from saved drink list
	private JButton button5; // Select Saved Drink 2 from saved drink list
	private JButton button6; // Order Drink Selected
	private JButton button7; // Back to menu
	private JButton button8; // Back to saved drinks
	private JButton button9; // Pay with cash
	private JButton button10; // Pay with card
	private JButton button11; // Pay with comet card
	

	// Default Constructor
	public GUI(){}
	
	// runGUI will display a message updating a user on their login status
	public void runGUI(String s)
	{
		JPanel panel = new JPanel();
		
		// Configure frame
		JFrame frame = new JFrame();
		frame.setSize(450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		frame.add(panel);
		
		// Configure panel
		panel.setLayout(null);
		
		// Print login message
		success = new JLabel(s);
		success.setBounds(10, 50, 300, 50);
		panel.add(success);

		
		frame.setVisible(true);
		
	}
	
	public void orderDrinkGUI()
	{
		// Create frame
		orderFrame = new JFrame(); // create order JFrame
		orderFrame.setTitle("Java Coffee"); // Add frame title
		orderFrame.setLayout(null);
		orderFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		orderFrame.setBounds(100, 200, 350, 300);
		
		// Create background
		Container c = orderFrame.getContentPane(); //Gets the content layer
        JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("Order.png")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(25, -10, size.width, size.height); //Sets the location of the image
 
        c.add(label); //Adds objects to the container
        
       
        
        // Add buttons
        
        Icon icon1 = new ImageIcon("Hazelnut.png");
        button1 = new JButton(icon1);
        button1.setBounds(50, 100,icon1.getIconWidth(),icon1.getIconHeight());
        orderFrame.add(button1);
        button1.addActionListener(this);
        
        Icon icon2 = new ImageIcon("Peppermint.png");
        button2 = new JButton(icon2);
        button2.setBounds(50,220,icon2.getIconWidth(),icon2.getIconHeight());
        orderFrame.add(button2);
        button2.addActionListener(this);
        
        Icon icon3 = new ImageIcon("Vanilla.png");
        button3 = new JButton(icon3);
        button3.setBounds(50,340,icon3.getIconWidth(),icon3.getIconHeight());
        orderFrame.add(button3);
        button3.addActionListener(this);
        
        
        orderFrame.setVisible(true); // Exhibit the frame
    }
	
	public void orderSavedDrinkGUI()
	{
				// Create frame
				orderFrame = new JFrame(); // create order JFrame
				orderFrame.setTitle("Java Coffee"); // Add frame title
				orderFrame.setLayout(null);
				orderFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				orderFrame.setBounds(100, 200, 350, 300);
				
				// Create background
				Container c = orderFrame.getContentPane(); //Gets the content layer
		        JLabel label = new JLabel(); //JLabel Creation
		        label.setIcon(new ImageIcon("OrderSaved.png")); //Sets the image to be displayed as an icon
		        Dimension size = label.getPreferredSize(); //Gets the size of the image
		        label.setBounds(25, -10, size.width, size.height); //Sets the location of the image
		 
		        c.add(label); //Adds objects to the container
		        
		       
		        
		        // Add buttons
		        
		        Icon icon1 = new ImageIcon("MondayOrder.png");
		        button4 = new JButton(icon1);
		        button4.setBounds(90, 120,icon1.getIconWidth(),icon1.getIconHeight());
		        orderFrame.add(button4);
		        button4.addActionListener(this);
		        
		        Icon icon2 = new ImageIcon("WednesdayOrder.png");
		        button5 = new JButton(icon2);
		        button5.setBounds(90,240,icon2.getIconWidth(),icon2.getIconHeight());
		        orderFrame.add(button5);
		        button5.addActionListener(this);
		        
		        orderFrame.setVisible(true); // Exhibit the frame
		
	}
	
	public void checkoutGUI()
	{
		orderFrame = new JFrame();
		
		// Create new page
		orderFrame.setTitle("Java Coffee"); // Add frame title
		orderFrame.setLayout(null);
		orderFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// Create background
		Container c = orderFrame.getContentPane(); //Gets the content layer
        JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("Checkout.png")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(25, -10, size.width, size.height); //Sets the location of the image
        
        orderFrame.setBounds(25, -10, size.width, size.height);
 
        c.add(label); //Adds objects to the container
        
        // Cash
        button9 = new JButton("Cash");
        button9.setBounds(95, 105, 185, 100);
        orderFrame.add(button9);
        button9.addActionListener(this);
        
        // Card
        button10 = new JButton("Credit");
        button10.setBounds(375, 105, 185, 100);
        orderFrame.add(button10);
        button10.addActionListener(this);
        
        // Commet Card
        button11 = new JButton("Commet Card");
        button11.setBounds(235, 235, 185, 100);
        orderFrame.add(button11);
        button11.addActionListener(this);
		
        orderFrame.setVisible(true);
	}
	
	public void close()
	{
		orderFrame.setVisible(false);
	}
	
	
	public void orderConfirmationGUI()
	{
		orderFrame = new JFrame();
	
		// Create new page
		orderFrame.setTitle("Java Coffee"); // Add frame title
		orderFrame.setLayout(null);
		orderFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// Create background
		Container c = orderFrame.getContentPane(); //Gets the content layer
	    JLabel label = new JLabel(); //JLabel Creation
	    label.setIcon(new ImageIcon("CheckoutSuccess.png")); //Sets the image to be displayed as an icon
	    Dimension size = label.getPreferredSize(); //Gets the size of the image
	    label.setBounds(25, -10, size.width, size.height); //Sets the location of the image
	    
	    orderFrame.setBounds(25, -10, size.width, size.height);
	
	    c.add(label); //Adds objects to the container
	    
	    orderFrame.setVisible(true);
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object obj = e.getSource();
		
		orderFrame.setVisible(false);
		orderFrame = new JFrame();
		// Selecting from menu
		if(obj == button1) // Selecting Hazelnut Latte
		{
			// Create new page
			orderFrame.setTitle("Java Coffee"); // Add frame title
			orderFrame.setLayout(null);
			orderFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			// Create background
			Container c = orderFrame.getContentPane(); //Gets the content layer
	        JLabel label = new JLabel(); //JLabel Creation
	        label.setIcon(new ImageIcon("SelectionMade.png")); //Sets the image to be displayed as an icon
	        Dimension size = label.getPreferredSize(); //Gets the size of the image
	        label.setBounds(25, -10, size.width, size.height); //Sets the location of the image
	        
	        orderFrame.setBounds(25, -10, size.width, size.height);
	 
	        c.add(label); //Adds objects to the container
	        
	        // order button 
	        button6 = new JButton("Order Hazelnut Latte");
	        button6.setBounds(200,500, 250, 50);
	        orderFrame.add(button6);
	        button6.addActionListener(this);
	        
	        // back to menu button
	        button7 = new JButton("Back");
	        button7.setBounds(485, 600, 125, 50);
	        orderFrame.add(button7);
	        button7.addActionListener(this);
	        
	        orderFrame.setVisible(true);
			
		}
		else if (obj == button2) // Selecting Peppermint Mocha
		{
			// Create new page
			orderFrame.setTitle("Java Coffee"); // Add frame title
			orderFrame.setLayout(null);
			orderFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			// Create background
			Container c = orderFrame.getContentPane(); //Gets the content layer
	        JLabel label = new JLabel(); //JLabel Creation
	        label.setIcon(new ImageIcon("SelectionMade.png")); //Sets the image to be displayed as an icon
	        Dimension size = label.getPreferredSize(); //Gets the size of the image
	        label.setBounds(25, -10, size.width, size.height); //Sets the location of the image
	        
	        orderFrame.setBounds(25, -10, size.width, size.height);
	 
	        c.add(label); //Adds objects to the container
	        
	        // order button  
	        button6 = new JButton("Order Peppermint Mocha");
	        button6.setBounds(200,500, 250, 50);
	        orderFrame.add(button6);
	        button6.addActionListener(this);
	        
	        // back to menu button
	        button7 = new JButton("Back");
	        button7.setBounds(485, 600, 125, 50);
	        orderFrame.add(button7);
	        button7.addActionListener(this);
	        
	        orderFrame.setVisible(true);
		}
		else if (obj == button3) // Selecting Vanilla Black Coffee
		{
			// Create new page
			orderFrame.setTitle("Java Coffee"); // Add frame title
			orderFrame.setLayout(null);
			orderFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			// Create background
			Container c = orderFrame.getContentPane(); //Gets the content layer
	        JLabel label = new JLabel(); //JLabel Creation
	        label.setIcon(new ImageIcon("SelectionMade.png")); //Sets the image to be displayed as an icon
	        Dimension size = label.getPreferredSize(); //Gets the size of the image
	        label.setBounds(25, -10, size.width, size.height); //Sets the location of the image
	        
	        orderFrame.setBounds(25, -10, size.width, size.height);
	 
	        c.add(label); //Adds objects to the container
	        
	        // order button  
	        button6 = new JButton("Order Vanilla Black Coffee");
	        button6.setBounds(200,500, 250, 50);
	        orderFrame.add(button6);
	        button6.addActionListener(this);
	        
	        // back to menu button
	        button7 = new JButton("Back");
	        button7.setBounds(485, 600, 125, 50);
	        orderFrame.add(button7);
	        button7.addActionListener(this);
	        
	        orderFrame.setVisible(true);
			
		}
		// Order Saved Drinks
		else if (obj == button4) // Saved Drink 1
		{
			// Create new page
			orderFrame.setTitle("Java Coffee"); // Add frame title
			orderFrame.setLayout(null);
			orderFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			// Create background
			Container c = orderFrame.getContentPane(); //Gets the content layer
	        JLabel label = new JLabel(); //JLabel Creation
	        label.setIcon(new ImageIcon("SelectionMade.png")); //Sets the image to be displayed as an icon
	        Dimension size = label.getPreferredSize(); //Gets the size of the image
	        label.setBounds(25, -10, size.width, size.height); //Sets the location of the image
	        
	        orderFrame.setBounds(25, -10, size.width, size.height);
	 
	        c.add(label); //Adds objects to the container
	        
	        // order button 
	        button6 = new JButton("Order Monday Order");
	        button6.setBounds(200,500, 250, 50);
	        orderFrame.add(button6);
	        button6.addActionListener(this);
	        
	        // back button
	        button8 = new JButton("Back");
	        button8.setBounds(485, 600, 125, 50);
	        orderFrame.add(button8);
	        button8.addActionListener(this);
	        
	        orderFrame.setVisible(true);
			
		}
		else if (obj == button5)	// saved 2
		{ 
			// Create new page
			orderFrame.setTitle("Java Coffee"); // Add frame title
			orderFrame.setLayout(null);
			orderFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			// Create background
			Container c = orderFrame.getContentPane(); //Gets the content layer
	        JLabel label = new JLabel(); //JLabel Creation
	        label.setIcon(new ImageIcon("SelectionMade.png")); //Sets the image to be displayed as an icon
	        Dimension size = label.getPreferredSize(); //Gets the size of the image
	        label.setBounds(25, -10, size.width, size.height); //Sets the location of the image
	        
	        orderFrame.setBounds(25, -10, size.width, size.height);
	 
	        c.add(label); //Adds objects to the container
	        
	        // order button 
	        button6 = new JButton("Order Wednesday Order");
	        button6.setBounds(200,500, 250, 50);
	        orderFrame.add(button6);
	        button6.addActionListener(this);
	        
	        // back button
	        button8 = new JButton("Back");
	        button8.setBounds(485, 600, 125, 50);
	        orderFrame.add(button8);
	        button8.addActionListener(this);
	        
	        orderFrame.setVisible(true);
			
		}
		else if (obj == button6)	// checkout
		{
			checkoutGUI();  	
		}
		else if (obj == button7)	// back to menu
		{
			orderDrinkGUI();
		}
		
		else if (obj == button8)	// back to saved drinks
		{
			orderSavedDrinkGUI();
		}
		else
		{
			orderConfirmationGUI();
		}
		
		

		
		
	}
		



}
