package ExtentReportsBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OptimisedExtentReport1 extends MyTestListner
{
	//  We can access parebt class variable and Metods in child class
	// i.e  exRep; exTest  from MyTestListner-class
	
//	ExtentReports exRep;
//	ExtentTest  exTest;
	
	@BeforeTest  //  only once 
	public void setup()
	{
//		String ResFile= ".\\src\\test\\java\\ExtentReportsBasics\\ExtentReportsNew1.html";
//		ExtentReports exRep =  new ExtentReports(ResFile);	
//		 exRep =  new ExtentReports(ResFile);	
		
	}

	@Test
	public void loginTC1()
	{
	
//		ExtentTest  exTest = exRep.startTest("TC No :  1");
//		  exTest = exRep.startTest("test-A");
		
				//log pass msgs in extent report
				exTest.log(LogStatus.PASS, "Enter user name");
				exTest.log(LogStatus.PASS, "Enter PWd");
				
				// Log fail  msg
				exTest.log(LogStatus.FAIL, "Login  btn is not there");	
				
				// pass info, warning
				exTest.log(LogStatus.INFO, "info msg");
				
				exTest.log(LogStatus.WARNING, "warning msg");
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
