package fall22lab4;
/**
 * File name [YourPurchasesTest2.java ]
 * 
 * @author Mayank Kushwaha, ID#041003071 Course CST8284 – OOP Assignment:
 *         [Lab-4] Date: [16 October 2022] Professor [Justin Martins] 
 *         Purpose: [This is a Suite class testing that tests both the
 *         compiled classes.
 *         The testing is done through JUNit. 
 * @version [4]
 * @see Testing methods.
 * @return testing results.
 * @param as passed by the tester.
 */
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 * This is a test class.
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
	YourPurchasesTest.class,
	YourPurchasesTest2.class,	
})

public class AllTests {
	/**
	 * This is final constant.
	 */
	   private static final double EPSILON = 1E-12;
/**
 * This is a test method.
 */
	   @Test public void twoPurchases()
	   {
	      YourPurchases register = new YourPurchases();
	      register.recordPurchase(0.75);
	      register.recordPurchase(1.50);
	      register.receivePayment(2, 0, 5, 0, 0);
	      double expected = 0.25;
	      Assert.assertEquals(expected, register.giveChange(), EPSILON);
	    }
	   
	   /**
	    * This is a test method.
	    */	
	   
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
		
		/**
		 * This is a test method.
		 */
		
		@Test
		public void testRecordPurchase() {
			YourPurchases bPurchase = new YourPurchases();
			bPurchase.recordPurchase(1.5);
			double purchase = 1.5;
		    Assert.assertEquals(purchase,bPurchase.getPurchase(),EPSILON);
			assertTrue(true);
		}
		
		/**
		 * This is a test method.
		 */
		
		@Test
		public void testReceivePayment() {
			YourPurchases cPurchase = new YourPurchases();
			cPurchase.receivePayment(4,0,0,0,0);
			double payment = 4.0;
		    Assert.assertEquals(payment,cPurchase.getPayment(),EPSILON);
			assertTrue(true);
		}
		
		/**
		 * This is a test method.
		 */
		
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
