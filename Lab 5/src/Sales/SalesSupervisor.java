package Sales;
/**
 * File name [SalesSupervisor.java ]
 * 
 * @author Mayank Kushwaha, ID#041003071 Course CST8284 – OOP Assignment:
 *         [Lab-5] Date: [15 November 2022] Professor [Justin Martins] 
 *         Purpose: [This is a class to print name, age and location of sales supervisor.
 * @version [5]
 * @see SalesAgent class SalesChief Class, SalesAgentTest Class and SalesAgentTest2 Class.
 */
public class SalesSupervisor extends SalesAgent{
/**
 * New variable location parameter defined.
 */
	private String location;
	/**
	 * @param n called from the base class SalesAgent by super keyword.
	 * @param a called from the base class SalesAgent by super keyword.
	 * @param location is set as a new parameter in this constructor.
	 */
	  public SalesSupervisor(String n, int a, String location) {
		   super(n,a);
		   this.location=location;
	   }
		/*
		 * public String getN() { return getName(); }
		 * 
		 * public int getA() { return getAge(); }
		 */
	   
	  //Sales Supervisor [super=Sales Agent [name=James,age=26],location=Perth]
	  @Override
	  public String toString()
	   {  
	      //System.out.println("Sales Supervisor [super=Sales Agent [name=" + getN() + ",age=" + getA() + "]" + ",location=" + location);
	      //System.out.println("Sales Supervisor [super=Sales Agent [name=" + n + ",age=" + a + "]" + ",location=" + location);
	      //System.out.println("Sales Supervisor [super=Sales Agent [name=" + super.getName() + ",age=" + super.getAge() + "]" + ",location=" + location);
	      return ("Sales Supervisor [super=" + super.toString() + ",location=" + location + "]");
	      
	   }
	  
}
