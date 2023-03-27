package Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class HomePage 
{
	public static WebDriver driver; ///  null 
	int a; // 0
	float esal; // 0.0
//	String ename;//  null 
	
	// 1. Define ele with locators
	
	@FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
	public WebElement profileImg;
	
	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement adminMenu;
	
	
	@FindBy(xpath = "//span[text()='PIM']")
	public WebElement pimMenu;
	
	
	@FindBy(xpath = "//h5[text()='System Users']")
	public WebElement systemUsersTxtEle;
	
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement addBtn;
	
	
	
	@FindBy(xpath   = "//h6[text()='Add User']")
	public WebElement addUserTxtEle;
	
	@FindBy(xpath   = "(//div[@class='oxd-select-text-input'])[1]")
	public WebElement userRoleDropdownEle;
	
	
	@FindBy(xpath   = "//label[text()='User Role']/../following-sibling::div//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	public WebElement ArrowbtnInUserRoleDropdown;
	
	
	@FindBy(xpath   = "//div[@role='listbox']//*[text()='Admin']")
	public WebElement userRoleDropdownTxtEle;
	
	
	@FindBy(xpath= "//input[@placeholder='Type for hints...']")
	public WebElement  employeeNameTxtboxEle;
	
	
	@FindBy(xpath= "//*[text()='Orange  Test']")
	////*[text()='Orange Test']
//	              Orange  Test -- there 
	public WebElement  employeeNameValueEle;
	
	
	@FindBy(xpath= "//label[text()='Status']/../following-sibling::div//i")
	public WebElement  statusArrowBtn;
		
			
	@FindBy(xpath= "//div[@role='listbox']//*[text()='Enabled']")
	public WebElement  statusvalue;
			
			
	@FindBy(xpath= "//label[text()='Username']/../following-sibling::div/input")
	public WebElement  UsernameTxtbox;
	
//	public WebElement UsernameTxtbox;
	
						
	@FindBy(xpath= "//label[text()='Password']/../following-sibling::div/input")
	public WebElement  PasswordTxtbox;
			
			
	@FindBy(xpath= "//label[text()='Confirm Password']/../following-sibling::div/input")
	public WebElement  ConfirmPasswordTxtbox;
	
			
	@FindBy(xpath= "//button[@type='submit']")
	public WebElement  submitBtn;
	
	
	
	@FindBy(xpath= "//label[text()='Username']/../following-sibling::div/input")
	public WebElement  userNameTxtbox;
	
			
	@FindBy(xpath= "//button[text()=' Search ']")
	public WebElement  searchBtn;
	
	
	@FindBy(xpath= "//span[text()='No Records Found']")
	public WebElement  NoRecordsFoundTxtEle;
	
	
	@FindBy(xpath= "//p[text()='The selected record will be permanently deleted. Are you sure you want to continue?']")
	public WebElement  deleteConfirmationMsg;
	
	
	@FindBy(xpath= "//button[text()=' Yes, Delete ']")
	public WebElement  yesDeleteBtn;
	
	//*************************************
	
	//2 Define constr  and pass webdriver var
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver =driver;		
	}
	
	
	//3. Define seperate method for each step
	
	// check  profile image is displayed
	public boolean isProfileImageDisplayed()
	{
		
		if(profileImg.isDisplayed())
		{
			System.out.println("Login to Orange HRMS is succesfull");
			return true;
		}
		else
		{
			System.out.println("Unable Login to Orange HRMS application");
			return false;
		}	
	}
	
	// Navigate to diff menu options
	// Navigate to Admin menu
	public void navigateToAdminMenu()
	{
		System.out.println("click Admin menu from left side");
		adminMenu.click();
	}
	 
	public void navigateToPIMMenu()
	{
		System.out.println("click PIM menu from left side");
		pimMenu.click();
	}
	
	
	// Verify System user page is displayed or not
	
	public void VerifySystemUserPageDisplayed()
	{
		System.out.println("");
		if(systemUsersTxtEle.isDisplayed())
		{
			System.out.println("System user page is displayed  ");
		}
		else
		{
			System.out.println("System user page is not  displayed  ");	
		}
		
	}
	
	
	//Click add +   button
	public void clikAddBtn()
	{
		System.out.println("Click add +   button");
		addBtn.click();
	}
//	
	
	// Verify - Add User page is displayed
	
	public void verifyAddUserpageDisplayed()
	{
		if(addUserTxtEle.isDisplayed())
		{
			System.out.println(" Add User page is displayed");
		}
		else
		{
			System.out.println(" Add User page is not displayed");
		}
	}
	
	
	
	
	//Select some value (Admin) in User Role dropdown
	public void selectUserRole(String userRole) throws InterruptedException
	{		
//		Select sel = new Select(userRoleDropdownEle);// error
//		////Exception in thread "main" org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been "select" but was "div"
//		
//		sel.selectByVisibleText("Admin");
		// Note: if dropdown is not developed by html' select'  and options tags, We should not select class and its methods
		// Here dropdown was developed by tag 'div' -  dont use Select class
	
		Thread.sleep(4000);
		System.out.println("Click Arrow btn in user role dropdown");
		ArrowbtnInUserRoleDropdown.click();
		Thread.sleep(4000);
//		Select 'Admin ' vlaue in dropdown
			
//		userRoleDropdownTxtEle.click();	
		
		driver.findElement(By.xpath("//div[@role='listbox']//*[text()='"+userRole+"']")).click();
			
		
	}
	
	
	// type some employee name(Orange test) - in Employee Name txt box
	public void enterValueinEmployeeName(String empname) throws InterruptedException
	{
		employeeNameTxtboxEle.sendKeys(empname);
		Thread.sleep(3000);
		employeeNameValueEle.click();
		
	}
	
	// Select some status =Enabled
//	selectStatus("Enabled")
//	selectStatus("Disabled");
	public void selectStatus(String status) throws InterruptedException
	{
		statusArrowBtn.click();
		Thread.sleep(3000);
//		statusvalue.click();		
		
		driver.findElement(By.xpath("//div[@role='listbox']//*[text()='" +status+  "']")).click();
		
	}
	
	// Type some value in user name text box 
	// EnterValueInUserName("RamaRao");
	public void EnterValueInUserName(String username) throws InterruptedException
	{
		System.out.println("Enter value in user name= "+ username);
		UsernameTxtbox.sendKeys(username);
	}
	
	
	// Type some value in password  text box
//	EnterValueInPassword("Test@123321")
	public void EnterValueInPassword(String pwd) throws InterruptedException
	{
		PasswordTxtbox.sendKeys(pwd);
	}
	
	
	//// Type some value in Confirm password  text box
	//EnterValueInConfirmPassword("Test@123321")
	public void EnterValueInConfirmPassword(String confirmPwd) throws InterruptedException
	{
		ConfirmPasswordTxtbox.sendKeys(confirmPwd);
	}
	
	
	
	// clikc on Save button
	public void ClickSaveBtn() throws InterruptedException
	{
		System.out.println("click save button");
//		submitBtn.click();// not clicking 
//		Actions act  = new Actions(driver);// null pointer excpetion
		// driver contains ???  null 
//		act.click(submitBtn).perform();
		// dbl clikc
//		Actions act  = new Actions(driver);
//		act.doubleClick(submitBtn).perform();
		// submit
//		submitBtn.submit();// nok
		
		// JSE
		
		// press Keyboard - PRess enter from k/b
		// Press tab 2 times and Press Enter from keyboard
		Actions act  = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
			
	
		System.out.println("click save button");
		Thread.sleep(2000);
	}
	
	
	
	// Verify  new user name is exist in table or not
	public void searchForGivenUser(String userName) throws InterruptedException
	{
		Thread.sleep(7000);
		System.out.println("Enter userName="+ userName);
		userNameTxtbox.sendKeys(userName);	
		
		// click Seacrh button
		searchBtn.click();	
		String myxpath = "//div[@role='table']//div[text()='"+userName+ "']";
		
		boolean  userDisplayed= driver.findElement(By.xpath(myxpath)).isDisplayed();
		
		if(userDisplayed)
		{
			System.out.println("User name ="+ userName + " is displayed in table");
		}
		else
		{
			System.out.println("User name ="+ userName + " is not displayed in table");
		}
		
	}
	
	public void enterUserName(String userName)
	{
		System.out.println("Enter user name="+ userName);
		userNameTxtbox.sendKeys(userName);		
	}

	public void clickSearchBtn()
	{
		System.out.println("Click Search button");
		searchBtn.click();	
	}
	
	
	public boolean isNoRecordMsgDisplayed()
	{	
		
		boolean  NorecordsMsgsDisplayed = NoRecordsFoundTxtEle.isDisplayed();
		if(NorecordsMsgsDisplayed)
		{
			System.out.println("Pass.No Records Found msg is displayed");
		}
		else
		{
			System.out.println("Fail.No Records Found msg is not displayed");
			NorecordsMsgsDisplayed = false;
		}
		return NorecordsMsgsDisplayed;	
		
	}

	
	// Select  some  user checkbox 
	public void selectGiveUser(String userName)
	{
		System.out.println("Select the user ="+ userName);
//		String myxpath = "//div[text()='" +userName+ "']/../preceding-sibling::div//input";
		//div[text()='Alice.Duval']/../preceding-sibling::div//input/..
//		 org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element <input type="checkbox" value="6" data-v-5ba85061=""> is not clickable at point (344, 667). Other element would receive the click:
			 
		// go to Lable tag  from input tag
		String myxpath = "//div[text()='" +userName+ "']/../preceding-sibling::div//input/..";
		driver.findElement(By.xpath(myxpath)).click();		
	}
	
	
			// Click delete image icon
	
	public void deleteUser(String userName)
	{
		System.out.println("Delete the user= "+ userName);
		driver.findElement(By.xpath("//div[text()='" +userName+ "']/../following-sibling::div[4]//i[@class='oxd-icon bi-trash']")).click();
		
		
	}
	
			
			// Verify the msg -The selected record will be permanently deleted. Are you sure you want to continue?
	
	public void isDeleteConfirmationMsgDisplayed()
	{
		if(deleteConfirmationMsg.isDisplayed())
		{
			System.out.println("Pass.The selected record will be permanently deleted. Are you sure you want to continue? msg is displayed");
		}
		else
		{
			System.out.println("Fail.The selected record will be permanently deleted. Are you sure you want to continue? msg is not displayed");
		}
	}
	
	
			// Click Yes Delete button
	
	
	public void clickYEsDeleteBtn()	
	{
		yesDeleteBtn.click();
	}
			
			// Verify Record should not be available in table 
	
	public void searchForInvalidUser(String invalidUser) throws InterruptedException
	{
		// Seacrh with invalid user
//				String invalidUser= "Brahma";
				enterUserName(invalidUser);
				
				// click Seacrh button
				clickSearchBtn();
				Thread.sleep(5000);
				
				// Verify  'No Records Found'  msg is displayed
				isNoRecordMsgDisplayed();
	}
	
	
	public void createNewUser(String userRole,String empname, String status, String username,	String pwd, String confirmPWd) throws InterruptedException
	{
		//Click add +   button
//		oxd-button oxd-button--medium oxd-button--secondary
		clikAddBtn();
		
		// Verify - Add User page is displayed
		//h6[text()='Add User']
		verifyAddUserpageDisplayed();
		
		
		//Select some value (Admin) in 'User Role' dropdown
//		hPage.selectUserRole();
//		String userRole= "ESS";
		selectUserRole(userRole);
		
		// type some employee name(Orange test) - in 'Employee Name' txt box
//		String empname= "Orange  Test";
		enterValueinEmployeeName(empname);
		
		
		// Select some status =Enabled
//		hPage.selectStatus();
//		String status ="Enabled";
//		String status ="Disabled";
		
		selectStatus(status);
		
		// Type some value in user name text box 
//		hPage.EnterValueInUserName();
		
//		Random No using Java
//		Random r =  new Random();
//		
//		int rno= r.nextInt(100);// 0-99
////		         10 -  o-9
		
//		String username= "RamaRao"+rno;// RamaRao3   Ramrao6  Rama83
		EnterValueInUserName(username);
		
		// Type some value in password  text box
//		hPage.EnterValueInPassword();
//		String pwd= "Test@123321";
		EnterValueInPassword(pwd);
		
		//// Type some value in Confirm password  text box
//		hPage.EnterValueInConfirmPassword();
//		String confirmPWd= "Test@123321";
		EnterValueInConfirmPassword(confirmPWd);
	
		
		// clikc on Save button
		ClickSaveBtn();
		
		// Verify  new user name is exist in table or not
		
		searchForGivenUser(username);
		
		// HW Search For given user with username, User Role, Employee Name, Status , click search button- check user name is there in table

	}
	
}
