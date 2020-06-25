import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @author Luis Berdecia
 * @version 1 created on 5/13/2020 at 6:00PM
 * 
 * Create a program to demonstrate the JTextField class
 * Construct four text fields, text field one with 10 columns, text field two with default text, 
 * text field three with default text and 21 columns, password field with default text.
 * Add all the above text fields to JFrame.
 * Create an inner class for event handling then instantiate an object from the inner class.
 * When user types in any text field or password field, then presses Enter, an event occurs.
 *
 */

public class Assignment_five 
{
	
	JFrame window = new JFrame("Testing JTextField and JPasswordField");
	
	JPanel panel  =  new JPanel();
	
	JTextField field1 = new JTextField(10);
	JTextField field2 = new JTextField("Enter Text Here");
	JTextField field3 = new JTextField("Uneditable text field",21);
	JPasswordField password =  new JPasswordField("hidden text");
	
	EventHandler eventHandler =  new EventHandler();
	
	//Launcher
	public static void main(String [] args)
	{
		new Assignment_five();
	
	}//main
	
	
	
	public Assignment_five()
	{
		
		createGui();
		
	}//Constructor
	
	
	//This method will create the GUI for the program
	public void createGui()
	{

		window.setResizable(false); //Prevents the JFrame from changing size
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Allows the user to fully close the program after clicking the x on the JFrame
		window.setLocationRelativeTo(null); //Set the Location of the JFrame in the center of the screen
		window.setSize(400, 100); //Changes the size of the JFrame (width, height)
		window.setVisible(true); //Allows the User to see the JFrame
		
		field3.setEditable(false); // Makes it so the JTextfield will not be edited
		
		//Adding the Textfields and PasswordField to the JPanel
		panel.add(field1);
		panel.add(field2);
		panel.add(field3);
		panel.add(password);
		
		//Adding the Panel to the JFrame
		window.add(panel);
		
		//Sets up the ActionListener for all the JTextField and JPasswordField
		try
		{
			field1.addActionListener(e -> JOptionPane.showMessageDialog(null, "TextField1: "+ field1.getText()));
			field2.addActionListener(e -> JOptionPane.showMessageDialog(null, "TextField2: "+ field2.getText()));
			field3.addActionListener(e -> JOptionPane.showMessageDialog(null, "TextField3: "+ field3.getText()));
			password.addActionListener(e -> JOptionPane.showMessageDialog(null, "PasswordField: "+ password.getText())); //getText() will show deprecated but it still works 
		}//try
		
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"oops...Something went wrong. Please Close the Program and Try again!");
		}//catch
	

	}//createGui
	
	
}//Assignment_five
