package TestNGReportsBasics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginParamters 
{
	
	@Parameters({"user","pwd","browser","applicationname"})
	//             ram      mercury
	@Test
	public void testA(String user, String pwd, String mybrowser, String applicationname)
	{
		System.out.println("user= " +user);// Ram
		System.out.println("pwd= " +pwd);	// mercury 
		System.out.println("mybrowser= " +mybrowser);// chrome
		System.out.println("applicationname= " +applicationname);// chrome
	}
	
	

	
}
