import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class DaysFromDates2 {
   public static void main(String[] args) {
	String dateBeforeString = "2022-09-09";
	String dateAfterString = "2024-06-30";
		
	//Parsing the date
	LocalDate dateBefore = LocalDate.parse(dateBeforeString);
	LocalDate dateAfter = LocalDate.parse(dateAfterString);
		
	System.out.println(dateBefore);
	System.out.println(dateAfter);
	
	//calculating number of days in between
	long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		
	//displaying the number of days
	System.out.println(noOfDaysBetween);
   }    
}