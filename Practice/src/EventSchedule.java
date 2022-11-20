import java.util.Calendar;

public class EventSchedule {

	private int year;
	private int month;
	private int day;

	//static Calendar cal = Calendar.getInstance();
	
	public EventSchedule() {
		
		this(Calendar.getInstance().get(Calendar.YEAR),Calendar.getInstance().get(Calendar.MONTH)+1,Calendar.getInstance().get(Calendar.DATE));
		
		System.out.println("EventSchedule() was called");
	}

	
	public EventSchedule(int year) {
		//code rest of constructor here
		this(Calendar.getInstance().get(Calendar.YEAR),Calendar.getInstance().get(Calendar.MONTH)+1,Calendar.getInstance().get(Calendar.DATE));
		System.out.println("EventSchedule(int) was called");
	}

		
	public EventSchedule(int year, int month) {
		//code rest of constructor here
		this(Calendar.getInstance().get(Calendar.YEAR),Calendar.getInstance().get(Calendar.MONTH)+1,Calendar.getInstance().get(Calendar.DATE));
		System.out.println("EventSchedule(int, int) was called");
	}
	
	
	public EventSchedule(int year, int month, int day) {
		//complete code here
		this.year=year;
		this.month=month;
		this.day=day;
		System.out.println("EventSchedule(int, int, int) was called");
	}

	public int getyear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	

	public double getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d%n",year,month,day);
	}
	
}
