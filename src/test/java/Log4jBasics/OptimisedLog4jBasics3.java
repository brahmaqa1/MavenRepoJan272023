package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OptimisedLog4jBasics3
{
	
	@Test
	public void searchForProduct()
	{
	
//		Logger  log =  Logger.getLogger("Sita");// repeatbelt stmts
		
		// access log var from TestBAse -c lass
		TestBase  tb = new TestBase();
		// tb.log
		
		// log msgs
		tb.log.debug("searchForProduct -started");
		tb.log.debug("1.Open chrome browser");
		tb.log.debug("2.Enter user name");
		tb.log.debug("3.Enter pwd");
		tb.log.debug("4.click login button");
		tb.log.debug("5.Verify Home page is dispalyed");	
		tb.log.debug("Search for product Samsung Mobile");
		
		
		
		
		
	}

}
