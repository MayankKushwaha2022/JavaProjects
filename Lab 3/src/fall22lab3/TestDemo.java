/**
 * File name [KushwahaJavaDoc.java ]
 * 
 * @author Mayank Kushwaha, ID#041003071 Course CST8284 – OOP Assignment:
 *         [Lab-3] Date: [1 October 2022] Professor [Justin Martins] Purpose:
 *         [This java class is made to understand concepts of constructor overloading and chaining.
 * @version [3]
 */
package fall22lab3;

import studentlab.EventSchedule;

/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Mayank Kushwaha.
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */

	/**
	 * Main Method
	 * @param args Default Arguments
	 */

	public static void main(String[] args) {

        System.out.println("Just creating 4 EventSchedules" + "\n");
		    
        System.out.print("EventSchedule1" + "\n");
		EventSchedule Ev = new EventSchedule();
		System.out.println(Ev.createReport());
		//System.out.println();
		
		System.out.print("EventSchedule2" + "\n");
		EventSchedule Ev1 = new EventSchedule(2023);
		System.out.println(Ev1.createReport());
		//System.out.println();
		
		
		System.out.print("EventSchedule3" + "\n");
		EventSchedule Ev3 = new EventSchedule(2024,01);
		System.out.println(Ev3.createReport());
		//System.out.println();
		
		System.out.print("EventSchedule4" + "\n");
		EventSchedule Ev4 = new EventSchedule(2030,10,21);
		System.out.println(Ev4.createReport());
	}

}
