package ExtentReportsBasics;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports2 
{

	@Test
	public void testB()
	{
		
//		ExtentReports
//		ExtentTest  
		String ResFile= ".\\src\\test\\java\\ExtentReportsBasics\\ExtentReports2.html";
		ExtentReports  exRepo =  new ExtentReports(ResFile);
		ExtentTest exTest = exRepo.startTest("Test-B");
		
				// to log pass, fail ,warning...etc in extent reports
				exTest.log(LogStatus.PASS, "Enter Product Name");
				exTest.log(LogStatus.PASS, "Enter Qty");
				exTest.log(LogStatus.PASS, "Add to Cart");
				
				// Send / log fail msgs
				exTest.log(LogStatus.FAIL, "Unable to add the products to cart");
				
				//  send info msg
				exTest.log(LogStatus.INFO, "Proceed with Payment");
				
				//HW   log warning msg, Fatal msg in report and check reports
				
		
		// end we ahve to call endtest()  and flush
		exRepo.endTest(exTest);
		exRepo.flush();
		
	}
	

}
