import java.util.Locale;

public class StringFormat {

	public static void main(String[] args) {

		String fname = "Mayank";
		String lname = "Kushwaha";
		String ssn = "334-00-5439";
		double salary = 720;
		double newSalary = 0.1*salary+salary;
		double wage = 18.95;
		double hours = 40;
		double grossSales = 1200; 
		double commissionRate = 0.04;
		
		String partNumber = "22776";
		String partDescription = "brakes";
		int quantity = 3;
		double pricePerItem = 300;
		double paymentAmount = quantity * pricePerItem; 
		
		
		
		//String F = String.format("salaried Programmer: %s %s\nsocial Seurity Number: %s\nweekly salary: $%.2f\npayment due: $%.2f", fname, lname, ssn, salary, salary);
		//String F = String.format("hourly Programmer: %s %s\nsocial Seurity Number: %s\nhourly wage: $%.2f; hours worked: %.2f\npayment due: $%.2f", fname, lname, ssn, wage, hours, wage*hours);
		//String F = String.format(Locale.US,"commission Programmer: %s %s\nsocial Seurity Number: %s\ngross sales: $%,.2f; commission rate: %.2f\npayment due: $%,.2f", fname, lname, ssn, grossSales, commissionRate, grossSales*commissionRate);
		//String F = String.format(Locale.US,"base-plus commission Programmer: %s %s\nsocial Seurity Number: %s\ngross sales: $%,.2f; commission rate: %.2f; base salary: $%.2f\nnew base salary with 10%% increase is: $%.2f\npayment due: $%,.2f", fname, lname, ssn, grossSales, commissionRate,salary,newSalary, ((grossSales*commissionRate)+newSalary));
		String F = String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f \n%s: $%,.2f", 
			    "invoice", "part number", partNumber, partDescription, 
			    "quantity", quantity, "price per item", pricePerItem, "payment due:", paymentAmount); //
			
		System.out.println(F);
	}

}

/*
 * base-plus commission programmer: Esther Patel
 * social security number: 102-34-5888
 * gross sales: $1,200.00; commission rate: 0.04; base salary: $720.00 
 * new base salary with 10% increase is: $792.00
 * payment due: $840.00
 */

/*
 * commission programmer: Peter Goodman
 * social security number: 123-45-6999
 * gross sales: $16,500.00; commission rate: 0.44 
 * payment due: $7,260.00
 */


/*
 * hourly Programmer: Amara Chukwu 
 * social security number: 234-56-7770 
 * hourly wage: $18.95; hours worked: 40.00 
 * payment due: $758.00
 */