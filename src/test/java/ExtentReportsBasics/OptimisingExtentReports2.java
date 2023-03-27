package ExtentReportsBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OptimisingExtentReports2 extends MyTestListner
{
//	ExtentReports exRep;
//	ExtentTest  exTest;
//	
	@BeforeTest  //  only once 
	public void setup()
	{
//		String ResFile= ".\\src\\test\\java\\ExtentReportsBasics\\ExtentReportsNew2.html";
////		ExtentReports exRep =  new ExtentReports(ResFile);	
//		 exRep =  new ExtentReports(ResFile);	
//		
	}

	@Test
	public void CreateOrderTC2()
	{
	
//		ExtentTest  exTest = exRep.startTest("TC No :  1");
//		  exTest = exRep.startTest("TestB");
		

			// to log pass, fail ,warning...etc in extent reports
			exTest.log(LogStatus.PASS, "Enter Product Name");
			exTest.log(LogStatus.PASS, "Enter Qty");
			exTest.log(LogStatus.PASS, "Add to Cart");
			
			// Send / log fail msgs
			exTest.log(LogStatus.FAIL, "Unable to add the products to cart");
			
			//  send info msg
			exTest.log(LogStatus.INFO, "Proceed with Payment");
//		
//		exRep.endTest(exTest);
//		exRep.flush();// if we dont write  this line, results file will not be created
				
		
	}
	
	@AfterTest
	public void endTest()
	{
//		exRep.endTest(exTest);
//		exRep.flush();// if we dont write  this line, results file will not be created
	}
	

}
