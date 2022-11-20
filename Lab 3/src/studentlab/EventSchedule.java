package studentlab;
/**
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: Mayank Kushwaha. 
 */
import java.util.Calendar;

/**
 * This class is named EventSchedule Class. It shows constructor chaining using keyword "this".
 * In this code, the simpler constructors all call the more complex one, thereby
 * chaining the calls 'UPWARDS' (from the default constructor to the one 
 * with the most arguments. Ensure that you implement it in this order). 
 
 * EventSchedule() calls EventSchedule(int, int, int), program flow returns to
 * EventSchedule() and exits the constructor.
 * 
 * EventSchedule(int) calls EventSchedule(int, int, int), program flow returns
 * to EventSchedule(int) and exits the constructor.
 * 
 * EventSchedule(int, int) calls EventSchedule(int, int, int), program flow
 * returns to EventSchedule(int, int) and exits the constructor.
 * 
 * EventSchedule(int, int, int) just assigns the values.
 * 
 * NOTE: The constructors in this code have System.out.println(a-message) in them,
 *       for demonstration purposes only. DO NOT PUT input / output
 *       into constructors in real production code!!!
 * 
 *   
 * @author Mayank Kushwaha
 */
public class EventSchedule {

	/**
	 * year component of the date of EventSchedule.
	 */
	private int year;
	
	/**
	 * month component of the date of EventSchedule.
	 */
	private int month;
	
	/**
	 * day component of the date of EventSchedule.
	 */
	private int day;
	
	/**
	 * The default constructor sets year, month, day to the current date.
	 */
	
	public EventSchedule() {
		
		this(Calendar.getInstance().get(Calendar.YEAR),Calendar.getInstance().get(Calendar.MONTH)+1,Calendar.getInstance().get(Calendar.DATE));
		
		System.out.println("EventSchedule() was called");
	}
	
	/**
	 * TO DO: YOUR TASK 1: IMPLEMENT THIS PORTION OF THE CODE.
	 * This constructor sets the year as passed, month to current month,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 */
	
	public EventSchedule(int year) {
		//code rest of constructor here
		this(year,Calendar.getInstance().get(Calendar.MONTH)+1,Calendar.getInstance().get(Calendar.DATE));
		System.out.println("EventSchedule(int) was called");
	}
		
	/**
	 * 
	 * 
	 * This constructor sets the year as passed, month as passed,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 */
		
	public EventSchedule(int year, int month) {
		//code rest of constructor here
		this(year,month,Calendar.getInstance().get(Calendar.DATE));
		System.out.println("EventSchedule(int, int) was called");
	}
	
	/**
	 * This constructor sets the year as passed, month as passed, and
	 * day as passed.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 * @param day of this EventSchedule.
	 */
	
	public EventSchedule(int year, int month, int day) {
		//complete code here
		this.year=year;
		this.month=month;
		this.day=day;
		System.out.println("EventSchedule(int, int, int) was called");
	}

	/**
	 * Returns the year for this EventSchedule.
	 * @return the year for this EventSchedule.
	 */
	public int getyear() {
		return year;
	}
	/**
	 * Sets the year for this EventSchedule.
	 * @param year The year for this EventSchedule.
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the month. 
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * TO DO: YOUR TASK 4: IMPLEMENT THIS PORTION OF THE CODE.
	 * 
	 * Sets the month state for this EventSchedule.
	 * @param month this is the month to set for EventSchedule.
	 */
	
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	/**
	 * day of this Orange in EventSchedule.
	 * @return day of this EventSchedule.
	 */
	public double getDay() {
		return day;
	}
	/**
	 * Sets the day of this EventSchedule.
	 * @param day The day of this EventSchedule .
	 */
	public void setDay(int day) {
		this.day = day;
	}
	
	/**
	 * @return A String representation of this EventSchedule, each field is separated 
	 * by a comma in the order of year, month, day
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d%n",year,month,day);
	}
	
}
