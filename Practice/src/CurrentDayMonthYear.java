import java.util.Calendar;
import java.time.LocalDate;

public class CurrentDayMonthYear {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Year = " + cal.get(Calendar.YEAR));
	    System.out.println("Month = " + (cal.get(Calendar.MONTH) + 1));
	    System.out.println("Date = " + cal.get(Calendar.DATE));
	    
	    System.out.println();
	    
	    System.out.println("YYYY-MM-DD Format: " + LocalDate.now());

	}

}
