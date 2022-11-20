package Sales;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class TesttoStringMethod {

	@Test
	public void test() {
		   SalesAgent register = new SalesAgent("Mayank",25);
		      register.toString();
		      String expected = "Sales Agent [name=Mayank,age=25]";
		      Assert.assertEquals(expected, register.toString());	
		      }
}
