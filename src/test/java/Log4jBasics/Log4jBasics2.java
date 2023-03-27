package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Log4jBasics2 
{
	
	@Test
	public void CreateOrder()
	{
		// Log msgs in Extent reports
//		  ExtentReports, ExtentTest
		Logger  log =  Logger.getLogger("Sita");
		
		// log msgs
		log.debug("CreateOrder -started");
		log.debug("1.Open chrome browser");
		log.debug("2.Enter user name");
		log.debug("3.Enter pwd");
		log.debug("4.click login button");
		log.debug("5.Verify Home page is dispalyed");	
		
		log.debug("6.Search for Product");
		log.debug("7.Add qty  ");
		log.debug("8. Add to cart and Proceed with payment ");
		log.info("info msg ");
		log.error("Logging error msgs ");
		
		
		
	}

}
