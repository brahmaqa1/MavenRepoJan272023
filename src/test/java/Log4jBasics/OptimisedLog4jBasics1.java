package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OptimisedLog4jBasics1 extends TestBase 
{
	
	@Test
	public void LoginTC1()
	{
		
//		Logger  log =  Logger.getLogger("Ram");// repeatable stmt
		
		// log msgs
		log.debug("LoginTC1 -started");
		log.debug("1.Open chrome browser");
		log.debug("2.Enter user name");
		log.debug("3.Enter pwd");
		log.debug("4.click login button");
		log.debug("5.Verify Home page is dispalyed");	
		
		
		
	}

}
