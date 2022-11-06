package rewardsSystem;

import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.*;

public class GUI {
	private static JLabel welcLabel;
	//private static JLabel userLabel;
	private static JTextField userText;
	//private static JPasswordField passwordText;
	//private static JButton button;
	private static JLabel success;
	//private static JLabel passwordLabel;
	//private String status;

	public GUI()
	{
		
	}
	
	
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
				
		/*// Username
		userLabel = new JLabel("Username");
		userLabel.setBounds(10, 30, 80, 25); // x y width height
		panel.add(userLabel);
		
		// User field
		userText = new JTextField(20);
		userText.setBounds(100, 30, 165, 25);
		panel.add(userText);
		*/
		
		/*// Password
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 60, 80, 25);
		panel.add(passwordLabel);
		
		// Password field
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 60, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Enter");
		button.setBounds(10, 90, 80, 25);
		panel.add(button);
		button.addActionListener(new GUI());
		*/
		
		success = new JLabel(s);
		success.setBounds(10, 50, 300, 50);
		panel.add(success);

		
		frame.setVisible(true);
		
	}



}
