package rewardsSystem;

import javax.swing.*;


public class GUI {
	private static JLabel welcLabel;
	private static JTextField userText;
	private static JLabel success;

	// Default Constructor
	public GUI(){}
	
	// runGUI will display a message updating a user on their login status
	public void runGUI(String s)
	{
		JPanel panel = new JPanel();
		
		// Configure frame
		JFrame frame = new JFrame();
		frame.setSize(450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		// Configure panel
		panel.setLayout(null);
		
		// Intro
		welcLabel = new JLabel("Login successful");
		welcLabel.setBounds(10, 10, 500, 50); // x y width height
		panel.add(welcLabel);
		
		success = new JLabel(s);
		success.setBounds(10, 50, 300, 50);
		panel.add(success);

		
		frame.setVisible(true);
		
	}



}
