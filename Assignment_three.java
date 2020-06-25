/**
 * 
 * @author Luis Berdecia
 * Created on: 5/13/2020 at 2:20PM
 * 
 * The goal of this program is to find the max element in each of the arrays given using a generic method.
 *
 */


public class Assignment_three 
{

	public static void main(String [] args)
	{
		
		//Array of Integers
		
		Integer [] numbers = {1 , 2, 3};
		
		//Array of words or colors
		
		String [] colors = {"red", "green", "blue"};
		
		//Array of Cirle radius
		
		Double [] radius =  {3.0 , 2.9 , 5.9};
		
		
		//Output of the program
		
		System.out.println(max(numbers));
		System.out.println(max(colors));
		System.out.println("Circle radius: "+max(radius));
		
	}//main
	
	
	/**
	 * The following generic method will take any type of array and it 
	 * will find the max element in the array
	 *
	 *@return max
	 * 
	 */
	
	public static <E extends Comparable<E>> E max(E [] list)
	{
		
		E max =  list[0]; // sets the first element in the array as the current max
		
		try
		{
			for (int x = 0; x < list.length; x++)
			{
			
				if (list[x].compareTo(max) > 0)
				{
					
					max = list[x];
				
				}//if statement
			
			
			}//for loop
		
		}//try
		
		catch(IndexOutOfBoundsException e)
		{
			
			 System.out.println("\nException thrown : " + e); 
			
		}//catch
	
		
		return max;
		
	}//max method
	
	

}//Assignment_three
