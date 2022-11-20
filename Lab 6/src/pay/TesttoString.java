package pay;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

//import pay.SalariedProgrammer;

public class TesttoString {

	@Test
	public void test1() {
		SalariedProgrammer pro = new SalariedProgrammer("Chioma","Kushwaha","345-67-0001",12,2022,320);
		      pro.toString();
		      String expected = "salaried Programmer: Chioma Kushwaha\n"
		      		+ "social Seurity Number: 345-67-0001\n"
		      		+ "weekly salary: $320.00\n"
		      		+ "payment due: $320.00";
		      Assert.assertEquals(expected, pro.toString());	}
	
	@Test
	public void test2() {
		HourlyProgrammer pro = new HourlyProgrammer("Amara","Kushwaha","234-56-7770",12,2022,18.95,40);
		      pro.toString();
		      String expected = "hourly Programmer: Amara Kushwaha\n"
		      		+ "social Seurity Number: 234-56-7770\n"
		      		+ "hourly wage: $18.95; hours worked: 40.00\n"
		      		+ "payment due: $758.00";
		      Assert.assertEquals(expected, pro.toString());	}
	
	@Test
	public void test3() {
		CommissionProgrammer pro = new CommissionProgrammer("Peter","Kushwaha","123-45-6999",12,2022,16500,0.44);
		      pro.toString();
		      String expected = "commission Programmer: Peter Kushwaha\n"
		      		+ "social Seurity Number: 123-45-6999\n"
		      		+ "gross sales: $16,500.00; commission rate: 0.44\n"
		      		+ "payment due: $7,260.00";
		      Assert.assertEquals(expected, pro.toString());	}
	
	@Test
	public void test4() {
		BasePlusCommissionProgrammer pro = new BasePlusCommissionProgrammer("Esther","Kushwaha","102-34-5888",12,2022,1200,0.04,720);
		      pro.toString();
		      String expected = "base-plus commission Programmer: Esther Kushwaha\n"
		      		+ "social Seurity Number: 102-34-5888\n"
		      		+ "gross sales: $1,200.00; commission rate: 0.04; base salary: $720.00\n"
		      		+ "new base salary with 10% increase is: $792.00\n"
		      		+ "payment due: $840.00";
		      Assert.assertEquals(expected, pro.toString());	}
	
	@Test
	public void test5() {
		Invoice bill = new Invoice("22776","brakes",3,300);
		bill.toString();
		      String expected = "invoice: \n"
		      		+ "part number: 22776 (brakes) \n"
		      		+ "quantity: 3 \n"
		      		+ "price per item: $300.00 \n"
		      		+ "payment due:: $900.00";
		      Assert.assertEquals(expected, bill.toString());	}
	
	@Test
	public void test6() {
		Invoice bill = new Invoice("33442","gear",5,90.99);
		bill.toString();
		      String expected = "invoice: \n"
		      		+ "part number: 33442 (gear) \n"
		      		+ "quantity: 5 \n"
		      		+ "price per item: $90.99 \n"
		      		+ "payment due:: $454.95";
		      Assert.assertEquals(expected, bill.toString());	}

	
}
