package com.hcl;

import org.junit.Test;

public class IOS // this Class will not get executes as Class name does end with Test
//public class IOSTest  //   gets executed
//public class IOStest //   does not get executed as class name does not end with "Test" 
//   always Give Test,   but not 'test'
//public class IOSTEST ////   does not get executed as class name does not end with "Test
{
	@Test
	public void testC()
	{
		System.out.println("hi IOS Test");
	}

}
