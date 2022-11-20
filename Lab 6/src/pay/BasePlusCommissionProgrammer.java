/**
 * File name [BasePlusCommissionProgrammer.java ]
 * 
 * @author Mayank Kushwaha, ID#041003071 Course CST8284 – OOP Assignment:
 *         [Lab-6] Date: [20 November 2022] Professor [Justin Martins] 
 *         Purpose: [This is a basePlusCommissionProgrammer class that extends CommissionProgrammer class.
 * @version [5]
 * @see SalariedProgrammer class, HourlyProgrammer class, CommissionProgrammer class, Programmer class and PaymeInterfaceTest class.
 */
package pay;
import java.util.Locale;

// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!


//BasePlusCommissionProgrammer.java
//BasePlusCommissionProgrammer class extends CommissionProgrammer.
/**
 * This class extends CommissionProgrammer class.
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 
/**
 * baseSalary is a double private variable. 
 */
private double baseSalary; // base salary per week
/**
 * 
 * @param firstName. This is first name.
 * @param lastName. Last name
 * @param socialSecurityNumber. SSN.
 * @param month. salary Month.
 * @param year. salary year.
 * @param grossSales. Total gross sales for of business. 
 * @param commissionRate. Total commission rate for business. 
 * @param baseSalary. Average base salary of employees.
 */
//constructor
public BasePlusCommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year, 
double grossSales, double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, 
  month, year, grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}
/**
 * 
 * @param baseSalary. This is a setter.
 */
//set base salary
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 
/**
 * 
 * @return baseSalary. Returns base salary of employee.
 */
//return base salary
public double getBaseSalary() {
return baseSalary;
}

/**
 * 
 * @return basSalary. Returns updated base salary of employees.
 */
public double getNewBaseSalary() {
	return (0.1*baseSalary+baseSalary);
}
//calculate earnings; override method earnings in CommissionProgrammer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
/**
 * @return getBaseSalary.
 * This is a getter.
 */
@Override                                                            
public double getPaymentAmount() {                                             
return getBaseSalary() + super.getPaymentAmount();                        
} 

//return String representation of BasePlusCommissionProgrammer object
@Override     
public String toString() {
return String.format(Locale.US,"base-plus commission Programmer: %s %s\nsocial Seurity Number: %s\ngross sales: $%,.2f; commission rate: %.2f; base salary: $%.2f\nnew base salary with 10%% increase is: $%.2f\npayment due: $%,.2f",super.getFirstName(), super.getLastName(), super.getSocialSecurityNumber(), super.getGrossSales(), super.getCommissionRate(),getBaseSalary(),getNewBaseSalary(), ((super.getGrossSales()*super.getCommissionRate())+getNewBaseSalary())
 );         

//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
//END


}}



