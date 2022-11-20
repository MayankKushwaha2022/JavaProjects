package Sales;
/**
 * File name [SalesAgentTest2.java ]
 * 
 * @author Mayank Kushwaha, ID#041003071 Course CST8284 – OOP Assignment:
 *         [Lab-5] Date: [15 November 2022] Professor [Justin Martins] 
 *         Purpose: [This is a main class that passes arguments to SalesAgent, SalesSupervisor and SalesChief Constructors.
 *         then calls the toString method present in all of these classes to return the parameters present in these classes.
 * @version [5]
 * @see SalesAgent class, SalesSupervisor Class, SalesChief Class.
 * This program is the second test for the SalesAgent class including the subclasses.
 */

public class SalesAgentTest2
{  
	/**
	 * 
	 * @param args. This is the main class to test all three base classes: SalesAgent, SalesSupervisor and SalesChief.
	 */
   public static void main(String[] args)
   {

	   SalesAgent SA1 = new SalesAgent("Peter",56);
	   SalesAgent SA2 = new SalesAgent("John",48);

	   System.out.println(SA1.toString());
	   System.out.println(SA2.toString());
	   
	   //Sales Supervisor [super=Sales Agent [name=Ifeoma,age=53],location=Toronto]
	   	   
	   SalesSupervisor SS = new SalesSupervisor("Ifeoma",53,"Toronto");
	   System.out.println(SS.toString());   
	
	   //Sales Chief [super=Sales Supervisor [super=Sales Agent [name=Ndidi Oma,age=35],location=Ottawa]]
	   
	   SalesChief SC = new SalesChief("Mayank",33,"Ottawa","Financial Technology");
	   System.out.println(SC.toString());
   }
}  