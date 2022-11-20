/**
 * File name [CommissionProgrammer.java ]
 * 
 * @author Mayank Kushwaha, ID#041003071 Course CST8284 – OOP Assignment:
 *         [Lab-6] Date: [20 November 2022] Professor [Justin Martins] 
 *         Purpose: [This is a CommissionProgrammer class that extends Programmer class.
 * @version [5]
 * @see SalariedProgrammer class, HourlyProgrammer class, BasePlusCommissionProgrammer class, Programmer class and PaymeInterfaceTest class.
 */
package pay;
import java.util.Locale;

// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//CommissionProgrammer.java

//CommissionProgrammer class extends Programmer.
/**
 * 
 * @author Mayank Kushwaha
 * This class extends Programmer class.
 *
 */
public class CommissionProgrammer extends Programmer { 
/**
 * This is gross weekly sales.
 */
private double grossSales; // gross weekly sales
/**
 * This is commission percentage.
 */
private double commissionRate; // commission percentage
/**
 * 
 * @param firstName. First name.
 * @param lastName. Last Name.
 * @param socialSecurityNumber. SSN.
 * @param month. Salary month.
 * @param year. Salary Year.
 * @param grossSales. Total Gross sales. 
 * @param commissionRate. Rate of commission.
 */
//constructor
public CommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year, 
double grossSales, double commissionRate) {
super(firstName, lastName, socialSecurityNumber, month, year);

if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
this.commissionRate = commissionRate;
} 
/**
 * 
 * @param grossSales. Setter.
 */
//set gross sales amount on the creation of apps
public void setGrossSales(double grossSales) {
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
} 
/**
 * 
 * @return grossSales.
 */
//return gross sales amount 
public double getGrossSales() {
return grossSales;
} 
/**
 * 
 * @param commissionRate.
 */
//set commission rate
public void setCommissionRate(double commissionRate) {
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

this.commissionRate = commissionRate;
} 
/**
 * 
 * @return commissionRate.
 */
//return commission rate
public double getCommissionRate() {
return commissionRate;
} 

//calculate earnings; override abstract method earnings in Programmer.

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
/**
 * @return getCommissionRate() * getGrossSales(). Returns Product.
 */
@Override                                                           
public double getPaymentAmount() {                                            
return getCommissionRate() * getGrossSales();                    
}                                             

//return String representation of CommissionProgrammer object

@Override      
public String toString() {
return String.format(Locale.US,"commission Programmer: %s %s\nsocial Seurity Number: %s\ngross sales: $%,.2f; commission rate: %.2f\npayment due: $%,.2f", getFirstName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate(), getPaymentAmount() 
 );
} 


                                             
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
//END

}

