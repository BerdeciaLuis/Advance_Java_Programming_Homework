import java.util.*;


/**
 * 
 * Created by: Luis Berdecia 
 * Date Created: 5/5/2020
 * 
 * The following program finds the commission you will generate depending on the sales that you make.
 * 
 */

public class Assignment_One 
{
	
	public static void main(String [] args)
	{
		
		//Variables
		Scanner reader = new Scanner(System.in);
		double salesAmount = 0;
		
		//Program		
		
			try
			{
				while(salesAmount != -1)
				{
				
					System.out.print("\nPlease enter the sales amount you made (Enter -1 to end program): $");
					salesAmount = reader.nextDouble();
				
					PrintCommission(salesAmount);
					
					if (salesAmount == -1)
					{
						System.out.print("\n\n\nThank you for using this program :)");
						
					}//if
				
				}//while 
				
				
			}//try
			
			catch(Exception e)
			{
				
				System.out.println("\n\noops...Something went wrong. Please Close the Program and Try again!");
				
			}//catch
			
	}//main
	
	

	/**
	 * 
	 * The following method will compute the commision following this scheme
	 * 
	 *  Sales Amount                               Commission Rate
     *  -------------------------------------------------------------
     *
	 *	$0.01-$5,000                               08 percent
     *
     *	$5,000.01 - $10,000                        10 percent
     *
	 *	$10,000.01 - and above                     12 percent
	 * 
	 * 
	 * @param salesAmount
	 * @return Commission;
	 */
	public static double computeCommission(double salesAmount)
	{
		
		double commission = 0;
		
		
		if(salesAmount > 10000)
		{
			
			commission += (salesAmount - 10000) * 0.12;
			
		}//if sales > 10,000
		

		if(salesAmount >= 5000)
		{
			
			commission += 5000 * 0.1;
			
		}//if sales > 5000 
		

		if(salesAmount > 0)
		{
			
			commission += 5000 * 0.08;
			
		}//if sales > 0
		
		
		return commission;
		
		
	}//computeCommission
	
	
	/**
	 * The following method will print out the sales amount and commission earned
	 * 
	 * @param salesAmount
	 */
	
	public static void PrintCommission(double salesAmount)
	{
		
		System.out.print("\nSales Amount			Commission Rate\n"
			       + "-------------------------------------------------\n");
		
		System.out.println(salesAmount+"				"+computeCommission(salesAmount));
		
		
	}//PrintCommission
	
	

}//Assignment_One
