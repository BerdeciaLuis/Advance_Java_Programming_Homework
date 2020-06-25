import java.util.*;

/**
 * 
 * @author Luis Berdecia 
 * @Version 1 Created on 6/10/2020
 * 
 * The following class will prompt the user to enter an integer (m) and find the smallest integer
 * (n) such tht m*n is a perfect square.
 *
 */

public class Assignment_seven
{
	
	
	public static void main(String[] args)
	{
		
		int m;
		int n;
		int total;
		ArrayList<Integer> factors = new ArrayList<>();
		Scanner reader = new Scanner(System.in);
		
		try
		{	
		
			System.out.print("Please enter an integer(m): ");
			m = reader.nextInt();
			
			getFactors(m, factors);
			n = smallestSquare(factors);
			total = n*m;
	
			System.out.println("The smallest number for (m*n) to be a perfect square is: "+n);
			System.out.println("m * n is "+ total);
			
		}//try
		
		catch(Exception ex)
		{
			
			System.out.println("\n\noops...Something went wrong. Please Close the Program and Try again!");
			
		}//catch
		

	}//main
	
	/**
	 * The following method will get the Factors of the number that the user entered and will store it on an ArrayList
	 * 
	 * @param m = the integer that the user entered
	 * @param factors the ArrayList where all the fators will be stored
	 * 
	 */
	
	public static void getFactors(int m, ArrayList<Integer> factors) 
    {

        int count = 2;
        
        while (count <= m) 
        {
        	
            if (m % count == 0) 
            {
            	
                factors.add(count);
                m /= count;
                
            } //if
            
            else 
            {
            	
                count++;
                
            }//else
            
            
        }//while
        
    }//getFactors 

	
	
	/**
	 * This following method will duplicating the factors ArrayList and then it will remove all the duplicate factors. 
	 * Then it will use those factors that were not removed to find the smallest number.
	 * 
	 * @param factors - The ArrayList where all the factors are stored
	 * @return smallest number for m*n to be a perfect square
	 */
	
	  public static int smallestSquare(ArrayList<Integer> factors) 
	  {

	        int[][] instance = duplicate(factors);
	        int smallestSquare = 1;
	        
	        
	        for (int a : factors) 
	        {
	        	
	            find(instance, a);
	            
	        }//for

	        
	        // removes duplicates and gets oddFactors
	        ArrayList<Integer> oddFactors = removeDuplicates(instance);

	        
	        //will get the smallest square by multiplying oddFactors
	        for (int b : oddFactors) 
	        {
	        	
	            smallestSquare *= b;
	            
	        }
	        
	        
	        return smallestSquare;
	        
	        
	    }//smallestSquares
	  
	  /**
	   * This following method will remove all duplicate factors 
	   * 
	   * @param remove - duplicated array that will be used to remove the duplicate factors
	   * @return ArrayList of factors that were not duplicated or repeated.
	   */

	    public static ArrayList<Integer> removeDuplicates(int[][] remove)
	    {
	    	
	       
	    	ArrayList<Integer> temp = new ArrayList<>();

	        for (int c = 0; c < remove.length; c++)
	        {
	            if (remove[c][1] % 2 != 0) 
	            {
	            	
	                temp.add(remove[c][0]);
	                
	            }//if
	             
	        }//for

	        
	        ArrayList<Integer> duplicatesRemoved = new ArrayList<>();
	        
	        for (int x = 0; x < temp.size(); x++) 
	        {

	            if (!duplicatesRemoved.contains(temp.get(x)))
	            {
	            	
	                duplicatesRemoved.add(temp.get(x));
	                
	            }//if
	            
	            
	        }//for

	        return duplicatesRemoved;
	        
	        
	    }//removeDuplicates
	    
	    /**
	     * This following list will be in charge of finding the duplicates 
	     * 
	     * @param list -  array that will be searched for duplicates
	     * @param number - number that will be searched in the ArrayList
	     */
	    
	    public static void find(int[][] list, int number) 
	    {
	        for (int y = 0; y < list.length; y++) 
	        {
	            
	        	if (list[y][0] == number) 
	        	{
	        		
	                list[y][1]++;
	                
	            }//if
	        	
	        	
	        }//for
	        
	    }//find

	    
	    /**
	     * This method will copy or duplicate the ArrayList and stroe it in a 2D array
	     * 
	     * @param factors -  ArrayList holding the factors
	     * @return a duplicated 2D array of an ArrayList
	     */
	    
	    public static int[][] duplicate(ArrayList<Integer> factors) 
	    {

	        int[][] temp = new int[factors.size()][2];

	        for (int z = 0; z < temp.length; z++) 
	        {
	        	
	            temp[z][0] = factors.get(z);
	            
	        }//for
	        
	        
	        return temp;
	        
	    }//duplicate

	 

}//Assignment_seven
