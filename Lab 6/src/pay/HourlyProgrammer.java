/**
 * File name [HourlyProgrammer.java ]
 * 
 * @author Mayank Kushwaha, ID#041003071 Course CST8284 ? OOP Assignment:
 *         [Lab-6] Date: [20 November 2022] Professor [Justin Martins] 
 *         Purpose: [This is a HourlyProgrammer class that extends Programmer class.
 * @version [5]
 * @see SalariedProgrammer class, BasePlusCommissionProgrammer class, CommissionProgrammer class, Programmer class and PaymeInterfaceTest class.
 */
package pay;

// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

// HourlyProgrammer.java
// HourlyProgrammer class extends Programmer.

public class HourlyProgrammer extends Programmer {
private double wage; // wage per hour
private double hours; // hours worked for week

//constructor
public HourlyProgrammer(String firstName, String lastName,
String socialSecurityNumber, int month, int year, 
double wage, double hours) {
super(firstName, lastName, socialSecurityNumber, month, year);

if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.hours = hours;
} 

//set wage
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

//return wage
public double getWage() {
return wage;
} 

//set hours worked
public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 

//return hours worked
public double getHours() {
return hours;
} 

//calculate earnings; override abstract method earnings in Programmer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

@Override                                                           
public double getPaymentAmount() {                                            
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                                                             
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}                                          

//return String representation of HourlyProgrammer object              
@Override  
public String toString() {
return String.format("hourly Programmer: %s %s\nsocial Seurity Number: %s\nhourly wage: $%.2f; hours worked: %.2f\npayment due: $%.2f",   getFirstName(), getLastName(), getSocialSecurityNumber(), getWage(), getHours(), getPaymentAmount() 
 );
}  

//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
//END

                     
}

