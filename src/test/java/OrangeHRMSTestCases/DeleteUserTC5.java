package OrangeHRMSTestCases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;

public class DeleteUserTC5 {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(5000);

		// Delete the given user - 
		// Select user checkbox , 
		String username= "Sania.Shaheen";// 
//		
		hPage.selectGiveUser(username);
		
		// Click delete image icon
		hPage.deleteUser(username);
		
		// Verify the msg -The selected record will be permanently deleted. Are you sure you want to continue?
		
		hPage.isDeleteConfirmationMsgDisplayed();
		
		// Click Yes Delete button
		hPage.clickYEsDeleteBtn();
		
		// Verify Record should not be available in table 
		
		hPage.searchForInvalidUser(username);	


	}

}
