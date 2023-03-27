package DebuggingBasics;

public class DebuggingTest {

	public static void main(String[] args) {
		
		String pwd="mypwd";
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println("Testing from main="+ c);
		
		// call add () from test class
		 test  t = new test();
		 
		 t.add();
		 
		 t.sub();
		 t.mul();
		 
		 System.out.println("Testing from debug expression windows");
	}

}
