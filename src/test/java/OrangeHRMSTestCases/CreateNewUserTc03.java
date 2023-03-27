package OrangeHRMSTestCases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReportsBasics.MyTestListner;
import Pages.HomePage;
import Pages.LoginPage;
import Utilities.TestBase;

public class CreateNewUserTc03 extends MyTestListner
{

	
	@Test
	public void createNewUserTc03() throws InterruptedException
	{
//	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WebDriver driver = null;	
//
//		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		// . Represents current project folder name
//
//		//		//open chrome browser
//		  driver =  new ChromeDriver();
//
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// call OpenBrowser() from TestBase Class
		TestBase tb = new TestBase();
		WebDriver driver= tb.openBrowser();
		
//		exRep
//		exTest.
		
		exTest.log(LogStatus.PASS, "1.Login to Orange HRMS");
		
//		
		//  access logiPAge class variables + Methods		
		LoginPage  lPage =  new LoginPage(driver);
//		lPage.enter_UserName("Admin");
//		lPage.enter_Pwd("admin123");		
//		lPage.clickLoginBtn();
		
//		ex
		
		lPage.LoginOrangeHRMSAppl("Admin", "admin123");
		
		// Verify Home page is dispalyed or not
				HomePage  hPage =  new HomePage(driver);
				
				
				hPage.isProfileImageDisplayed();
			
			//  check naviate menu option
				exTest.log(LogStatus.PASS, "navigateToAdminMenu ");
				hPage.navigateToAdminMenu();	

				
				// Verify System user page is displayed or not
				//h5[text()='System Users']
				exTest.log(LogStatus.PASS, "VerifySystemUserPageDisplayed ");
				hPage.VerifySystemUserPageDisplayed();
				
				//Click add +   button
//				oxd-button oxd-button--medium oxd-button--secondary
				exTest.log(LogStatus.PASS, "clikAddBtn ");
				hPage.clikAddBtn();
				
				// Verify - Add User page is displayed
				//h6[text()='Add User']
				hPage.verifyAddUserpageDisplayed();
				
				
				//Select some value (Admin) in 'User Role' dropdown
//				hPage.selectUserRole();
				String userRole= "ESS";
				hPage.selectUserRole(userRole);
				
				// type some employee name(Orange test) - in 'Employee Name' txt box
				String empname= "Orange  Test";
				hPage.enterValueinEmployeeName(empname);
				
				
				// Select some status =Enabled
//				hPage.selectStatus();
//				String status ="Enabled";
				String status ="Disabled";
				
				hPage.selectStatus(status);
				
				// Type some value in user name text box 
//				hPage.EnterValueInUserName();
				
//				Random No using Java
				Random r =  new Random();
				
				int rno= r.nextInt(100);// 0-99
//				         10 -  o-9
				
				String username= "RamaRao"+rno;// RamaRao3   Ramrao6  Rama83
				hPage.EnterValueInUserName(username);
				
				// Type some value in password  text box
//				hPage.EnterValueInPassword();
				String pwd= "Test@123321";
				hPage.EnterValueInPassword(pwd);
				
				//// Type some value in Confirm password  text box
//				hPage.EnterValueInConfirmPassword();
				String confirmPWd= "Test@123321";
				hPage.EnterValueInConfirmPassword(confirmPWd);
				
				// clikc on Save button
				hPage.ClickSaveBtn();
				
				// Verify  new user name is exist in table or not
				
				hPage.searchForGivenUser(username);
				
				// HW Search For given user with username, User Role, Employee Name, Status , click search button- check user name is there in table
				
				
				

	}

}
