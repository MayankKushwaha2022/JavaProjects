package Assignment1All;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
/**
 * 
 * @author mayank Kushwaha
 * This is a test class for MyHleathData,java
 * Assumption: Apart from BMI class every other class is functioning well.
 *
 */
public class MyHealthDataTest2 {
	/**
	 * Epsilon is the tolerance level when creating double values.
	 * The smallest difference between the two values at which point they are considered equal (i.e. close enough)
	 */
	private static final double EPSILON = 0.1;

/**
 * This is assertion method to test BMI class method.
 */
	@Test
	public void BMItest1() 
	{
		MyHealthData health1 = new MyHealthData(null, null, null, 0, 0, 0, 0);
		health1.setBMI(154, 70);
		//double weight = 70.0;
		//double height = 5.11;
		//health1.setBMI(60, 5);
		double expectedBMI = 22.094286;
		double actualBMI = health1.getBMI();
		Assert.assertEquals(expectedBMI,actualBMI,EPSILON);
}

	}
