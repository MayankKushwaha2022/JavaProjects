import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
public class DaysFromDates {
   public static void main(String[] args) {
	   
        //9-September-2022, change this to your desired Start Date
	   LocalDate dateBefore = LocalDate.of(2022, Month.SEPTEMBER, 9);
	   System.out.println(dateBefore);
	   
        //30-June-2024, change this to your desired End Date
	   LocalDate dateAfter = LocalDate.of(2024, Month.JUNE, 30);
	   System.out.println(dateAfter);
	   
	long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
	
	System.out.println(noOfDaysBetween);
   }    
}