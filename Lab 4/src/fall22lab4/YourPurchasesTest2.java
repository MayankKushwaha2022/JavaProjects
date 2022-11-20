/**
 * File name [YourPurchasesTest2.java ]
 * 
 * @author Mayank Kushwaha, ID#041003071 Course CST8284 – OOP Assignment:
 *         [Lab-4] Date: [16 October 2022] Professor [Justin Martins] 
 *         Purpose: [This java class is made to test three separate methods such as
 *         recordPurchase method, secondly the receivePayment method and lastly the
 *         CalculateChange method of YourPurchases Java class.
 *         The testing is done through JUNit. 
 * @version [4]
 */
package fall22lab4;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest2 {


	private static final double EPSILON = 1E-12;
	
	//THIS TEST WOULD FAIL. 
	// TODO: WRITE ONE OR MORE TESTS TO SYSTEMATICALLY FIND THE SOURCE OF THE TEST FAILURE 
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);		
	}
	
	 // YOUR TASKS ARE STATED HERE: 
	   // RUN THE TEST CASE IN YourPurchasesTest2.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE TEST CASES (NOT ALREADY STATED IN THIS CODE)
	   // TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
	   
	   // ADD NEW TEST CASES HERE!!!
	@Test
	public void testRecordPurchase() {
		YourPurchases bPurchase = new YourPurchases();
		bPurchase.recordPurchase(1.5);
		double purchase = 1.5;
	    Assert.assertEquals(purchase,bPurchase.getPurchase(),EPSILON);
		assertTrue(true);
}
	
	@Test
	public void testReceivePayment() {
		YourPurchases cPurchase = new YourPurchases();
		cPurchase.receivePayment(4,0,0,0,0);
		double payment = 4.0;
	    Assert.assertEquals(payment,cPurchase.getPayment(),EPSILON);
		assertTrue(true);
}
	
	@Test
	public void testCalculateChangeNew() {
		YourPurchases dPurchase = new YourPurchases();
		dPurchase.recordPurchase(10);
		dPurchase.receivePayment(10, 0, 0, 0, 0);
		double change = 0;
	    Assert.assertEquals(change,dPurchase.CalculateChange(),EPSILON);
		assertTrue(true);
}
}
