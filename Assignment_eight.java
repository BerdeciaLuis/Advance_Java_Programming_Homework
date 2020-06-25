import java.util.Random;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 
 * @author Luis Berdecia
 * @Version 1 created on 6/18/2020
 *  
 * The following program will display a 10 – by – 10 square matrix
 * Each element in the matrix will be zero or one, randomly generated. 
 * It will display each number centered in a text field. 
 * Using TextField’s setText method to set value 0 or 1 as a string.
 *
 */

public class Assignment_eight extends Application
{
	
		
	
	public void start(Stage stage)
	{
		
		GridPane grid = new GridPane(); //creates the grid to layout in rows and columns
		Random rand = new Random(); // random number generator
		
		try
		{
		
			for(int x = 0; x < 10; x++)
			{
				for(int y = 0; y < 10; y++)
				{
				
					TextField field = new TextField();
					field.setPrefColumnCount(1);
					field.setText(String.valueOf(rand.nextInt(2)));
					grid.add(field, x, y);
					GridPane.setHalignment(field, HPos.CENTER);
					GridPane.setValignment(field, VPos.CENTER);
				
				}//for loop
			
			}//for loop
			
			
		}catch(Exception e)
		{
			
			e.printStackTrace();
			
		}//catch
		
		
			//Creating a Scene
		
			Scene scene =  new Scene(grid);
			stage.setTitle("Assignment #8 - Matrix By Luis Berdecia");
			stage.setScene(scene);
			stage.show();
		
		
	}//start
	
	
	public static void main(String [] args)
	{
		
		launch(args);
		
	}//main
	

}//Assignment_eight
