package TestNGReportsBasics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterBasics 
{
	@Test
	public void testA()
	{
		System.out.println("Reporter stmt-1");
		Reporter.log("Enter user name");
		Reporter.log("Enter pwd");
		Reporter.log("Click login btn");	
		
//		Assert.assertEquals("ram", "sita");
		// not equal -- stt - fail --Fail tes method i.e testA(). throws Assertion error  
		
	}
	
	@Test
	public void CreateOrder()
	{

		Reporter.log("Enter product name");
		Reporter.log("Enter qty");
		Reporter.log("Enter address");	
		Reporter.log("Payment throuh credit cars");
		
	}


	
}
