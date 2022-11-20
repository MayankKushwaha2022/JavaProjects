package Sales;
/**
 * File name [SalesAgentTest.java ]
 * 
 * @author Mayank Kushwaha, ID#041003071 Course CST8284 – OOP Assignment:
 *         [Lab-5] Date: [15 November 2022] Professor [Justin Martins] 
 *         Purpose: [This is a main class that passes arguments to SalesAgent and SalesSupervisor Constructor.
 *         then calls the toString method present in both of these classes.
 * @version [5]
 * @see SalesAgent class, SalesSupervisor Class, SalesAgent Class.
 * This program is the first test for the SalesAgent class including the subclass. 
 * Check the lab slides to ensure you include every item required.
 */

public class SalesAgentTest 
{  
	/**
	 * 
	 * @param args. This is the man class to test SalesAgent as well as SalesSupervisor classes.
	 */
   public static void main(String[] args)
   {
	   	   
	   SalesAgent SA = new SalesAgent("Andrew",42);
	   System.out.println(SA.toString());
	   
	   SalesSupervisor SS = new SalesSupervisor("James",26,"Perth");
	   System.out.println(SS.toString());

   }
}  