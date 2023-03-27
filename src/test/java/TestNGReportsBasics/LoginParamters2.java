package TestNGReportsBasics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginParamters2 
{
	
	@Parameters({"applicationname"})
	//            OrangeHRMS
	@Test
	public void testA(String applicationname)
	{
		System.out.println("applicationname= " +applicationname);// OrangeHRMS
	
	}
	
	

	
}
