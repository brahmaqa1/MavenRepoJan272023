package TestNGBasics;

import org.testng.annotations.Test;

public class TestAnnonation2 {

//	@Test // Test Method
//	public void testA() // normal java method
//	{
//		System.out.println("stmt-1 from test A()");
//		System.out.println("stmt-2 from testA()");
//	}
	
	
	// note:  if annontation is not there, TestNG does not execute the method
	//  if annonation is there, TestNG executes the methods
	@Test
	public void testB()  //  no annonation --  not run this method
	{
		System.out.println("stmt-1 from test B()");
		System.out.println("stmt-2 from testB()");
	}
	
	

}
