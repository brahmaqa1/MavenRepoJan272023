package TestNGBasics;

import org.testng.annotations.Test;

public class TestAnnonation1 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("hi");
//	}
	
	//  don need main()
	
	// TestNG executes Test Methods based on annonattaions
	
	@Test  //   define annonation before method   or Test method or Test annontatin method or Test case
	public void testA() // normal java method
	{
		System.out.println("stmt-1 from test A()");
		System.out.println("stmt-2 from testA()");
	}
	
	@Test  //   define annonation before method   or Test method or Test annontatin method or Test case
	public void testA2() // normal java method
	{
		System.out.println("stmt-1 from test A2()");
		System.out.println("stmt-2 from testA2()");
	}
	

}
