package Assignment1All;
import java.util.Scanner;
//import java.time.LocalDate;
import java.util.Calendar;
/**
 * 
 * @author mayank Kushwaha
 *
 */

public class MyHealthDataTest {
/**
 * 
 * @param args. This is the main class.
 */
	public static void main(String[] args) {
		MyHealthData health = new MyHealthData(null, null, null, 0, 0, 0, 0);
		//health.displayMyHealthData();
		
		
		Scanner scanner = new Scanner(System.in);
		
		//Print these values out: "Mayank","Kushwaha","Male",1989,2022,5.11,70
		
		System.out.println("Please enter your first name: ");
		String firstname = scanner.nextLine();
		health.setFirstName(firstname);
		
		System.out.println("Please enter your last name: ");
		String lastname = scanner.nextLine();
		health.setLastName(lastname);
		
		System.out.println("Please enter your Gender (Male or Female): ");
		String gender = scanner.nextLine();
		health.setGender(gender);
		
		
		System.out.print("Enter your birth year in YYYY format: ");
		int birthYear = scanner.nextInt();
		/*
		System.out.print("Enter your birth month in MM format: ");
		int birthMon = scanner.nextInt();
		System.out.print("Enter your birth day in DD format: ");
		int birthDay = scanner.nextInt();
		LocalDate dob = LocalDate.of(birthYear, birthMon, birthDay);
		health.setDOB(birthYear, birthMon, birthDay);
		*/
		health.setCurrentYear(Calendar.getInstance().get(Calendar.YEAR));
		health.setBirthYear(birthYear);
		//System.out.println("DOB of user is " + dob);
		
		System.out.println("Enter your Height in decimal format (in inches):");
		double height = scanner.nextDouble();
		health.setHeight(height);
		
		System.out.println("Enter your weight in lbs: ");
		double weight = scanner.nextDouble();
		health.setWeight(weight);
		
		health.displayMyHealthData();
		
	}

}
