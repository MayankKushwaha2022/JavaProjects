package pay;
/**
 * File name [Programmer.java ]
 * 
 * @author Mayank Kushwaha, ID#041003071 Course CST8284 – OOP Assignment:
 *         [Lab-6] Date: [20 November 2022] Professor [Justin Martins] 
 *         Purpose: [This is a base abstract class to print first name, last name and social security number of the programmer.
 * @version [5]
 * @see SalariedProgrammer class, HourlyProgrammer class, CommissionProgrammer class, BasePlusCommissionProgrammer class and PaymeInterfaceTest class.
 */

/**
 *    @author Mayank Kushwaha
 *    This class outputs name and social security number.
*/
// LAB 6: YOU ARE REQUIRED TO MODIFY THIS CODE!!!

//Programmer.java

//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

//SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!

abstract public class Programmer  implements Payme {
/**
 * This is programmers first name.
 */
private String firstName; 
/**
 * This is programmers last name.
 */
private String lastName;
/**
 * This is programmers social security number.
 */
private String socialSecurityNumber;
/**
 * This is month of salary.
 */
private int month;  
/**
 * This is year of salary.
 */
private int year;	

/**
 * This is a five argument constructor.
 * @param first. Programmers First Name.
 * @param last. Programmers Last Name.
 * @param ssn. Programmers social security number.
 * @param months. Programmers salary month.
 * @param years. Programmers salary year. 
 */
//three-argument constructor
public Programmer(String first, String last, String ssn, int months, int years) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
 month = months;
 year = years;
}

/** CHANGES ARE REQUIRED IN THIS SECTION. 
* THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.
* IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
* @return firstName.
*/
public String getFirstName() {
	return firstName;
}

/**
 * @return lastName.
 */
public String getLastName() {
	return lastName;
}

/**
 *@return socialSecurityNumber.
 */
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

/**
 * @return month.
 */
public int getMonth() {
	return month;
}

/**
 * 
 * @return year.
 */
public int getYear() {
	return year;
}
//return String representation of Programmer object
@Override
public String toString() {
return String.format("salaried Programmer: %s %s\nsocial Seurity Number: %s", 
  getFirstName(), getLastName(), getSocialSecurityNumber());
} 


//Note: We do NOT implement Payme method getPaymentAmount() here. 
// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....??
/**
 * {@inheritDoc}. 
 * @return nothing.
 * @since [1]
 */
/*
 * This is an abstract method.
 */
public abstract double getPaymentAmount(); 
/** No implementation here. DO YOU KNOW WHY? What should this method be?*/ //Because this is an abstract method.
} 


