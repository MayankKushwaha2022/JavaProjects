package Sales;
/**
 * File name [SalesChief.java ]
 * 
 * @author Mayank Kushwaha, ID#041003071 Course CST8284 – OOP Assignment:
 *         [Lab-5] Date: [15 November 2022] Professor [Justin Martins] 
 *         Purpose: [This is a class to print name, age, location and department of the sales agent.
 * @version [5]
 * @see SalesAgent class, SalesSupervisor Class, SalesAgentTest Class and SalesAgentTest2 Class.
 */
public class SalesChief extends SalesSupervisor {
	/**
	 * New variable Department is defined below.
	 */
	private String Department;
	/**
	 * @param n called from the base class SalesSupervisor by super keyword.
	 * @param a called from the base class SalesSupervisor by super keyword.
	 * @param location called from the base class SalesSupervisor by super keyword.
	 * @param Department is set as a new parameter in this class.
	 * 
	 */
	public SalesChief(String n, int a, String location, String Department) {
	super(n,a,location);
	this.Department=Department;
	}
	
	@Override
	public String toString() {
		return ("Sales Chief [super=" + super.toString() + ",Department=" + Department + "]]");
	}
}
