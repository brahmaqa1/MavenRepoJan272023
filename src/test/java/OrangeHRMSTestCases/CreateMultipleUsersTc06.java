package OrangeHRMSTestCases;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.ExcelUtilities;
import Utilities.TestBase;

public class CreateMultipleUsersTc06 {

	
	@Test
	public void createMultipleUsersTc06() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
//	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
		
		// call OpenBrowser() from TestBase Class
		TestBase tb = new TestBase();
		WebDriver driver= tb.openBrowser();
		
//		
		//  access logiPAge class variables + Methods		
		LoginPage  lPage =  new LoginPage(driver);
		
		lPage.LoginOrangeHRMSAppl("Admin", "admin123");
		
		// Verify Home page is dispalyed or not
				HomePage  hPage =  new HomePage(driver);
				hPage.isProfileImageDisplayed();
			
			//  check naviate menu option
				
				hPage.navigateToAdminMenu();	

				
				// Verify System user page is displayed or not
				//h5[text()='System Users']
				hPage.VerifySystemUserPageDisplayed();
				
				// Read all data from column name =UserRole  and store in arraylist
				ExcelUtilities xlUtil=  new ExcelUtilities();
				String xlFile= "C:\\brahma\\videos\\Interview All notes\\techVision Notes\\imp\\Techvision Latest Notes\\TestData.xlsx";
				String sheetName="CreateUsers";
			
				List<String> UserRoleListData=  xlUtil.readColumnData(xlFile, sheetName, "UserRole");				
				// Read data from EmployeeName	Status	Username	Password	ConfirmPassword
				List<String> EmployeeNameListData = xlUtil.readColumnData(xlFile, sheetName, "EmployeeName");
				List<String> StatusListData = xlUtil.readColumnData(xlFile, sheetName, "Status");
				
				List<String> UsernameListData = xlUtil.readColumnData(xlFile, sheetName, "Username");
				
				List<String> PasswordListData = xlUtil.readColumnData(xlFile, sheetName, "Password");
				List<String> ConfirmPasswordListData = xlUtil.readColumnData(xlFile, sheetName, "ConfirmPassword");
				
				
				for(int i=0;i<=UserRoleListData.size()-1;i++)
				{
					
					String userRole= UserRoleListData.get(i);
					System.out.println("Create user="+ UsernameListData.get(i));
					hPage.createNewUser(userRole, EmployeeNameListData.get(i), StatusListData.get(i), UsernameListData.get(i), PasswordListData.get(i), ConfirmPasswordListData.get(i));
									
					
				}
				
				

	}

}
