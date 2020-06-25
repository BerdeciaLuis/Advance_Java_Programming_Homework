import java.io.*;

/**
 * 
 * @author Luis Berdecia
 * @version 1 created on 5/23/2020 at 11:00PM
 * 
 * This following class is used to test and Launch the BitOutputStream Class
 *
 */

public class Assignment_four
{

    public static void main(String[] args) 
    {
    	
    	//Variables
    	
        File file = new File("Assignment04.dat");
        String bits = "010000100100001001101";
        

        try (BitOutputStream output = new BitOutputStream(file)) 
        {

           output.writeBit(bits);

        }//try
        
        catch (IOException ex)
        {
            ex.printStackTrace();
            
        }//catch
        
    }//main
    
    
}//Assignment_four class
