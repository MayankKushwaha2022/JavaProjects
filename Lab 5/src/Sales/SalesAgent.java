package Sales;
/**
 * File name [SalesAgent.java ]
 * 
 * @author Mayank Kushwaha, ID#041003071 Course CST8284 – OOP Assignment:
 *         [Lab-5] Date: [15 November 2022] Professor [Justin Martins] 
 *         Purpose: [This is a base abstract class to print name and age of sales agent.
 * @version [5]
 * @see SalesSupervisor class, SalesChief Class, SalesAgentTest Class and SalesAgentTest2 Class.
 */

/**
 *    @author mayank Kushwaha
 *    This class shows a Sales Agent with a name and age.
*/
public class SalesAgent
{  
	/**
	 * This is the name of the Sales Agent.
	 */
	private String name;
	/**
	 * This is the age of the Sales Agent. 
	 */
	private int age;
/*
 *  This is a SalesAgent Constructor
 */
   /**
    * In this portion of your code, construct a SalesAgent object.
    * @param n the name of the Sales Agent
    * @param a the age of the Sales Agent
   */
   // START CODE
   public SalesAgent(String n, int a) {
	   this.name=n;
	   this.age=a;
   }
   
	/*
	 * public String getName() { return name;} 
	 * public int getAge() { return age; }
	 */
   // END CODE

   /**
    * This portion of your code returns the string representation of the object.
    * @return a string representation of the object
   */
   /*
    * This is a toString() that returns name and age when called.
    */
   public String toString()
   {  
      return "Sales Agent [name=" + name + ",age=" + age + "]";
   }
}