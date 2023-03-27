package ExtentReportsBasics;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

// ItestListner - Interface
public class MyTestListner implements ITestListener
{

	public static ExtentReports exRep;
	public static ExtentTest  exTest;
//	String ResFile= ".\\src\\test\\java\\ExtentReportsBasics\\OptimisedExtentReports1.html";
	
	
	@Override
	public void onStart(ITestContext context) {
		//		ITestListener.super.onStart(context);
		
		Date d = new Date();
		System.out.println("d="+d);//Wed Mar 08 09:42:54 IST 2023
		// Remove spaces and :  -->  Replace space  by--> emptval
		//                           Replace  : --> empty val
		String sDate = d.toString();
		sDate =sDate.replace(" ", "_");//WedMar0809:42:54IST2023
		sDate =sDate.replace(":", "_");//WedMar08094254IST2023
		System.out.println("sDate="+sDate);
		String ResFile= ".\\src\\test\\java\\ExtentReportsBasics\\OptimisedExtentReports" + sDate +".html";
		System.out.println("ExtentReports file="+ ResFile);
		exRep =  new ExtentReports(ResFile);
		// Reports will be created only once time
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
		//  gets executed for each @Test Method
//		 exTest = exRep.startTest("test-A");
		// get Test Method name 
		String TestMethodName= result.getMethod().getMethodName();
		System.out.println("TestMethodName="+TestMethodName);
		exTest = exRep.startTest(TestMethodName);
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailure(result);
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
		exRep.endTest(exTest);
		exRep.flush();
	}
	
	
}
