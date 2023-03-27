package ExtentReportsBasics;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports1 
{

	@Test
	public void testA()
	{
		System.out.println("stmt-1 from testA");
//		ExtentReports
//		ExtentTest  
		String ResFile= "C:\\brahma\\Practise\\SelniumPractiseNew\\NovSeleniumBatchWorkSpace\\MyMavenProjectFromCmd\\src\\test\\java\\ExtentReportsBasics\\ExtentReports1.html";
		ExtentReports exRep =  new ExtentReports(ResFile);
		
		ExtentTest  exTest = exRep.startTest("TC No :  1");
		
				//log pass msgs in extent report
				exTest.log(LogStatus.PASS, "Enter user name");
				exTest.log(LogStatus.PASS, "Enter PWd");
				
				// Log fail  msg
				exTest.log(LogStatus.FAIL, "Login  btn is not there");	
				
				// pass info, warning
				exTest.log(LogStatus.INFO, "info msg");
				
				exTest.log(LogStatus.WARNING, "warning msg");
		
		exRep.endTest(exTest);
		exRep.flush();// if we dont write  this line, results file will not be created
		
		
		
		
	}
	

}
