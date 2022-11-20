/**
 * File name [PaymeInterfaceTest.java ]
 * 
 * @author Mayank Kushwaha, ID#041003071 Course CST8284 – OOP Assignment:
 *         [Lab-6] Date: [20 November 2022] Professor [Justin Martins] 
 *         Purpose: [This is the main class.
 * @version [5]
 * @see HourlyProgrammer class, SalariedProgrammer class, BasePlusCommissionProgrammer class, CommissionProgrammer class, Programmer class and invoice class.
 */
package pay;
import java.util.ArrayList;
// LAB 6: PaymeInterfaceTest.java

//This is the test for your interface Payme.

public class PaymeInterfaceTest  {

public static void main(String[] args) {
	
 //TO DO: IN THIS PORTION OF THE CODE, SEVERAL CHANGES SHOULD BE MADE:
// CREATE SIX-ELEMENTS Payme array HERE 
	
	//ArrayList<Programmer> AllProgrammers = new ArrayList<Programmer>();
		
	Programmer SP = new SalariedProgrammer("Chioma","Kushwaha","345-67-0001",12,2022,320);
	Programmer HP = new HourlyProgrammer("Amara","Kushwaha","234-56-7770",12,2022,18.95,40);
	Programmer CP = new CommissionProgrammer("Peter","Kushwaha","123-45-6999",12,2022,16500,0.44);
	Programmer BCP = new BasePlusCommissionProgrammer("Esther","Kushwaha","102-34-5888",12,2022,1200,0.04,720);
	
	Invoice Inv1 = new Invoice("22776","brakes",3,300);
	Invoice Inv2 = new Invoice("33442","gear",5,90.99);
	
	
	ArrayList<Payme> PayNow = new ArrayList<Payme>();
	
	PayNow.add(Inv1);
	PayNow.add(Inv2);
	PayNow.add(SP);
	PayNow.add(HP);
	PayNow.add(CP);
	PayNow.add(BCP);
	
	
	
	
// TO DO: POPULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
//CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
// LAST NAME, SOCIAL INSURANCE NUMBER, ETC.

 // START CODE

// END CODE


 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 
 for (Payme currentPayme : PayNow) {
    // output currentPayme and its appropriate payment amount
    System.out.printf("%s \n\n", currentPayme.toString()); 
       
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to 
       // BasePlusCommissioProgrammer reference
       BasePlusCommissionProgrammer programmer = 
          (BasePlusCommissionProgrammer) currentPayme;

		
		/*
		 * double oldBaseSalary = programmer.getBaseSalary();
		 * programmer.setBaseSalary(1.10 * oldBaseSalary); System.out.printf(
		 * "new base salary with 10%% increase is: $%,.2f\n",
		 * programmer.getBaseSalary());
		 */
		 
    } 

// TO DO: INSERT YOUR PRINT STATEMENT HERE: ENSURE THAT YOUR 
// OUTPUT FOLLOWS THE OUTPUT SAMPLE PROVIDED

// START CODE 

// END CODE

 }
}
}


