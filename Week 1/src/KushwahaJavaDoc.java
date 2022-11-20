/**
* • File name: [KushwahaJavaDoc.java ]
* • @author: [Mayank Kushwaha, ID#041003071]
* • Course: CST8284 – OOP
* • Assignment: [Lab-1]
* • Date: [12 September 2022]
* • Professor: [Justin Martins]
* • Purpose: [This java class is made to print name, student number, two reasons for taking the course..
* • and computing the number of weeks left till the end of the program is the student number ends with..
* • an odd digit or else the program gives the months left till the end of the year if it is even.]
* • Class list: None.
*/
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Description: 
 * @author Mayank Kushwaha 
 * @version [1]
 */
public class KushwahaJavaDoc {
/**
 * Main method
 * @see java.util.Scanner
 * @see java.time.LocalDate
 * @see java.time.temporal.ChronoUnit
 * @since [Openjdk version: 11.0.15]
 * @param args Default Arguments
 */
	public static void main(String[] args) {
		
		String name;
	    int number;
	    String reason;
	    
	    // Below is the instantiated object of the Scanner class.  
	    Scanner keyboard = new Scanner(System.in);
	   	
	    /* Below are the three important dates: first if the current date, 
	     * second date is the graduated date third date is the end of the year date of 2022. 
	     */
		LocalDate datenow = LocalDate.now();
		LocalDate graduationDate = LocalDate.of(2024,6,30);
		LocalDate end0f2022 = LocalDate.of(2022,12,31);
				
		System.out.println("Provide your name here: ");
		name = keyboard.next();
		System.out.println("Your Name is: " + name);
		
		System.out.println("Provide your student number here: ");
		number = keyboard.nextInt();
		System.out.println("Your Student number is: " + number);
		
		keyboard.nextLine();
		
		System.out.println("Please provide two reasons for taking this course: ");
		reason = keyboard.nextLine();
		System.out.println("Your reasons for taking these courses are: " + reason);
		
		if (number % 2 == 0) {
							//calculating number of months in between
							long noOfMonthsLeft = ChronoUnit.MONTHS.between(datenow,end0f2022);
								
							//displaying the number of months left + 1
							System.out.println("Remaining months left till the end of year: " + (noOfMonthsLeft+1));	
								}
				else {
						//calculating number of Weeks in between
						long noOfWeeksBetween = ChronoUnit.WEEKS.between(datenow,graduationDate);
							
						//displaying the number of weeks left - 1
						System.out.println("Remaining weeks till the end of program: " + (noOfWeeksBetween-1));	
					  }		
		keyboard.close();		
	}
}
