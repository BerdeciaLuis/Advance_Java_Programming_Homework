import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @author Luis Berdecia
 * @version 1 created on 5/13/2020 at 6:00PM
 * 
 * The following program will show the user the different thing you can do with
 * JTextField and JPasswordField Class.
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
	
	
	
	public void createGui()
	{

		window.setResizable(false); //Prevents the JFrame from changing size
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Allows the user to fully close the program after clicking the x on the JFrame
		window.setLocationRelativeTo(null); //Set the Location of the JFrame in the center of the screen
		window.setSize(400, 100); //Changes the size of the JFrame (width, height)
		window.setVisible(true); //Allows the User to see the JFrame
		
		field3.setEditable(false); // Makes it so the JTextfield will not be edited
		
		//Adding the Textfields to the JPanel
		panel.add(field1);
		panel.add(field2);
		panel.add(field3);
		panel.add(password);
		
		//Adding the Panel to the JFrame
		window.add(panel);
		
		//Sets up the ActionListener and ActionCommand for all the JTextField and JPasswordField
		field1.setActionCommand("field1");
		field1.addActionListener(e -> JOptionPane.showMessageDialog(null, "TextField1: "+ field1.getText()));
		
		field2.setActionCommand("field2");
		field2.addActionListener(eventHandler);
		
		field3.setActionCommand("field3");
		field3.addActionListener(eventHandler);
		
		password.setActionCommand("password");
		password.addActionListener(eventHandler);
		
	}//createGui
	
	
	/**
	 * 
	 * @author Luis Berdecia
	 * 
	 * The following class will be handling all the events of the JTextField and JPasswordField
	 * 
	 * Using a switch statement it will assing each JTextField and JPassword field a command that will allow each one of them to perform a unique action
	 * using JOptionPane.
	 *
	 */
	public class EventHandler implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			 
			String field = e.getActionCommand();
			String message;
			
			try 
			{
				
			
				switch(field)
				{
			
					//case "field1":   message = field1.getText(); JOptionPane.showMessageDialog(null, "TextField1: "+ message);break; 
					case "field2":   message = field2.getText(); JOptionPane.showMessageDialog(null, "TextField2: "+ message);break; 
					case "field3":   message = field3.getText(); JOptionPane.showMessageDialog(null, "TextField3: "+ message);break; 
					case "password": message = password.getText(); JOptionPane.showMessageDialog(null, "PasswordField: "+ message);break; 
			
				}//switch
				
			}//try
			
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null,"oops...Something went wrong. Please Close the Program and Try again!");
			}
			
			
		}//actionPerformed
		
		
		
	}//EventHandler


	
}//Assignment_five
