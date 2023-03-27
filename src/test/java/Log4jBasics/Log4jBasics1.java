package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Log4jBasics1 
{
	
	@Test
	public void LoginTC1()
	{
		System.out.println("1.Open chrome browser");
		System.out.println("2.Enter user name");
		System.out.println("3.Enter pwd");
		System.out.println("4.click login button");
		System.out.println("5.Verify Home page is dispalyed");
		
		// Testng :send msgs in testNG reports 
		//  2. index.html 2. emailable-report.html
//		Reporter.log("");
		Reporter.log("1.Open chrome browser");
		Reporter.log("2.Enter user name");
		Reporter.log("3.Enter pwd");
		Reporter.log("4.click login button");
		Reporter.log("5.Verify Home page is dispalyed");
		
		// Log msgs in Extent reports
//		  ExtentReports, ExtentTest
		Logger  log =  Logger.getLogger("Ram");
		
		// log msgs
		log.debug("LoginTC1 -started");
		log.debug("1.Open chrome browser");
		log.debug("2.Enter user name");
		log.debug("3.Enter pwd");
		log.debug("4.click login button");
		log.debug("5.Verify Home page is dispalyed");	
		
		
		
	}

}
