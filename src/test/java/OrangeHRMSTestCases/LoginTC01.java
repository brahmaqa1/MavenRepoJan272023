package OrangeHRMSTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.TestBase;

public class LoginTC01 // use inheritance
{

	@Test
	public void loginTC01() throws InterruptedException
	{
//	public static void main(String[] args) 
//	{
		
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
		
		
		//  access logiPAge class variables + Methods		
		LoginPage  lPage =  new LoginPage(driver);
//		lPage.enter_UserName("Admin");
//		lPage.enter_Pwd("admin123");		
//		lPage.clickLoginBtn();
		
		lPage.LoginOrangeHRMSAppl("Admin", "admin123");
		
		// Verify Home page is dispalyed or not
		HomePage  hPage =  new HomePage(driver);
		hPage.isProfileImageDisplayed();
		
		
		

	}

}
