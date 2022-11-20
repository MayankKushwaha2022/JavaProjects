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
 * @see  
 * @author Mayank Kushwaha
 */
public class Events {

	private int year;
	private int month;
	private int day;
	
	public Events() {
		//TO DO: write the proper constructor call and pass  parameters here
		this(2022,9,30);
		System.out.println("EventSchedule() was called");
	}
	
	/**
	 * TO DO: YOUR TASK 1: IMPLEMENT THIS PORTION OF THE CODE.
	 * This constructor sets the year as passed - 2021, month to current month - 9,
	 * and day to current day - 30.
	 * @param year The year of this EventSchedule.
	 */
	
	/** START CODE HERE */
	
	
	public Events(int year) {
		//code rest of constructor here
		this(2022,9,30);
		this.year = year;
		
		setYear(2021);
		setMonth(9);
		setDay(30);
		
		System.out.println("EventSchedule(int) was called");
	}
	
	/** CODE ENDS HERE */
	
	/**
	 * TO DO: YOUR TASK 2: IMPLEMENT THIS PORTION OF THE CODE.
	 * 
	 * This constructor sets the year as passed - 2021, month as passed - 8,
	 * and day to current day - 30.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 */
	
	/** CODE STARTS HERE */
	
	public Events(int year, int month) {
		//code rest of constructor here
		this(2022,9,30);
		
		setYear(2021);
		setMonth(8);
		setDay(30);
				
		System.out.println("EventSchedule(int, int) was called");
	}
	/** CODE ENDS HERE */
	

	/**
	 * TO DO: YOUR TASK 3: IMPLEMENT THIS PORTION OF THE CODE.
	 * 
	 * This constructor sets the year as passed - 2021, month as passed - 8, and
	 * day as passed - 29.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 * @param day of this EventSchedule.
	 */
	
	/** CODE STARTS HERE */
	
	public Events(int year, int month, int day) {
		//complete code here
		
		setYear(2021);
		setMonth(8);
		setDay(29);
		
		System.out.println("EventSchedule(int, int, int) was called");
	}
	
	/** CODE ENDS HERE */
	
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
	
	/** START CODE HERE */
	
	public void setMonth(int month) {
		this.month = month;
	}
	/** CODE ENDS HERE */
	
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
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
				
		System.out.println("Just creating 4 EventSchedules" + "\n");
		
		System.out.print("EventSchedule1" + "\n");
		Events Ev = new Events();
		int Y1 = cal.get(Calendar.YEAR);
		Ev.setYear(Y1);
		int M1 = cal.get(Calendar.MONTH) + 1;
		Ev.setMonth(M1);
		int D1 = cal.get(Calendar.DATE);
		Ev.setDay(D1);
		System.out.println(Ev.createReport());
		System.out.println();
		
		System.out.print("EventSchedule2" + "\n");
		new Events(2022);
		int Y2 = cal.get(Calendar.YEAR)+1;
		Ev.setYear(Y2);
		int M2 = cal.get(Calendar.MONTH) + 1;
		Ev.setMonth(M2);
		int D2 = cal.get(Calendar.DATE);
		Ev.setDay(D2);
		System.out.println(Ev.createReport());
		System.out.println();
		
		System.out.print("EventSchedule3" + "\n");
		new Events(2022,9);
		int Y3 = cal.get(Calendar.YEAR)+1;
		Ev.setYear(Y3);
		int M3 = cal.get(Calendar.MONTH) + 4;
		Ev.setMonth(M3);
		int D3 = cal.get(Calendar.DATE);
		Ev.setDay(D3);
		System.out.println(Ev.createReport());
		System.out.println();
		
		System.out.print("EventSchedule4" + "\n");
		new Events(2022,9,30);
		int Y4 = cal.get(Calendar.YEAR)+1;
		Ev.setYear(Y4);
		int M4 = cal.get(Calendar.MONTH) + 4;
		Ev.setMonth(M4);
		int D4 = cal.get(Calendar.DATE)-5;
		Ev.setDay(D4);
		System.out.println(Ev.createReport());

		
	}
}