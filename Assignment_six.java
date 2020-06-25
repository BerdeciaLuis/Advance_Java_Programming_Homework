import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 * @author Luis Berdecia
 * @version 1 Created on 5/31/2020 1:00PM
 * 
 *  The following program demonstrates selecting items in a list. 
 *  The program will use a combo box to specify a selection mode, that when you select items, they will be displayed in a label below the list.
 *
 */
public class Assignment_six 
{
	
	//Variables
	
	JFrame window = new JFrame("Assignment #6 by Luis Berdecia");
	
	JPanel BoxPanel = new JPanel();
	JPanel itemSelectedPanel = new JPanel();
	
	JLabel label1 = new JLabel("Choose Selection Mode: ");
	JLabel label2 = new JLabel("Selected items are ");
	
	
	String []  Countries = new String[] {"China", "Japan", "Korea", "India","Malaysia", "Vietnam"};
	String []  Selection = new String[] {"SINGLE", "MULTIPLE"};
	
	JComboBox<String> box =  new JComboBox<>(Selection);
	JList<String> list = new JList<>(Countries);
	
	
	//Handler Classes
	private ItemHandler handler = new ItemHandler();
	private ListListener listener = new ListListener();
	

	public static void main(String[] args) 
	{
		
		
		new Assignment_six(); //Launches the Class
		

	}//main
	
	
	
	public Assignment_six()
	{
		
		createGUI();
		
		
	}//constructor
	
	
	
	/**
	 * The following method will do the following:
	 * 
	 * 1. It will set up the JFrame
	 * 2. It will add an ItemListener to the JComboBox
	 * 3. It will add the JComboBox and JList to different panels
	 * 4. It will add the JPanels to the JFrame
	 */
	
	public void createGUI()
	{
		
		window.setResizable(false); //Prevents the JFrame from changing size
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Allows the user to fully close the program after clicking the x on the JFrame
		window.setLocationRelativeTo(null); //Set the Location of the JFrame in the center of the screen
		window.setSize(500, 300); //Changes the size of the JFrame (width, height)
		window.setVisible(true); //Allows the User to see the JFrame
		
		
		box.addItemListener(handler); //Adds an ItemListener for the JComboBox
		
		BoxPanel.add(label1);
		BoxPanel.add(box);
		BoxPanel.setBounds(0, 0, 500, 40); //sets location for JPanel (x, y, width, height)
		
		list.setBounds(0, 40, 250, 200);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		list.addListSelectionListener(listener);
		
		
		itemSelectedPanel.setBounds(0, 240, 500, 50);
		itemSelectedPanel.add(label2);
		
		
		window.add(BoxPanel);
		window.add(list);
		window.add(itemSelectedPanel);
		
		
	}//createGUI
	
	

	/**
	 * 
	 * @author Luis Berdecia
	 * 
	 * The following class will be handling all the events of the JComboBox
	 * 
	 * Using an if and else if statement it will set the selection mode for the JList depending on what the user selects
	 * on the JComboBox/
	 */
	
	private class ItemHandler implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent event) 
		{
			
			try
			{
			
				if(event.getSource() == box)
				{
					if(box.getSelectedItem().equals("SINGLE"))
					{
						list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					}
				
					else if(box.getSelectedItem().equals("MULTIPLE"))
					{
						list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
					}
				
				}//if 
			
			}//try
		
			catch(Exception ex)
			{
				
				JOptionPane.showMessageDialog(null,"oops...Something went wrong. Please Close the Program and Try again!");
				
			}//catch
			
			
		}//itemStateChanged
		
		
	}//ItemHandler
	
	
	/**
	 * 
	 * @author Luis Berdecia
	 * 
	 * The following class will be handling all the events of the JList
	 * 
	 * The following handler class will just display the item list name that the user selected
	 * 
	 */
	private class ListListener implements ListSelectionListener
	{

		@Override
		public void valueChanged(ListSelectionEvent event)
		{
			
			label2.setText("Selected items are "+list.getSelectedValuesList());
			
			
		}//valueChanged
		
		
		
	}//ListListener
	


}//Assignment_six
