package OrangeHRMSTestCases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class SearchWithInvalidUserTC4 {

	
	@Test
	public void searchWithInvalidUserTC4() throws InterruptedException
	{
//	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = null;	

		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		driver =  new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//  access logiPAge class variables + Methods		
		LoginPage  lPage =  new LoginPage(driver);
		lPage.enter_UserName("Admin");
		lPage.enter_Pwd("admin123");		
		lPage.clickLoginBtn();


		// Verify Home page is dispalyed or not
		HomePage  hPage =  new HomePage(driver);
		hPage.isProfileImageDisplayed();

		//  check naviate menu option

		hPage.navigateToAdminMenu();	


		// Verify System user page is displayed or not
		//h5[text()='System Users']
		hPage.VerifySystemUserPageDisplayed();


		// Seacrh with invalid user
		String invalidUser= "Brahma";
		hPage.enterUserName(invalidUser);
		
		// click Seacrh button
		hPage.clickSearchBtn();
		Thread.sleep(5000);
		
		// Verify  'No Records Found'  msg is displayed
		hPage.isNoRecordMsgDisplayed();
		
		


	}

}
