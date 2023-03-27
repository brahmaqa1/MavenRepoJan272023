package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;

	// 1. define elements with locators(name, id, class, xpath, cssSelector, 
//	linktext, partial linktext
//	 tagname..)
	
	
//	@FindBy(locName= "loc val")
	@FindBy(name="username")
	public WebElement username_Txtbox;//  null
	//  int a; //  0
	// float esal;//  0.0
	// char ch;  space
	// string s; //  null
	// A a1ref; //  null
	// Webdriver driver;//  null 
	
	// pwd
	@FindBy(name="password")
	public WebElement  pwd_Txtbox;
	
	//login button
//	@FindBy(type= )
//	@FindBy(className = "oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")
//						 oxd-button oxd-button--medium oxd-button--main orangehrm-login-button
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement login_Btn;
	
	//2. Define one constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//ok
//		PageFactory.initElements(driver, LoginPage.class); // ????   not working 
////	driver.findElement(null).sendKeys("Admin");
//		driver.findElement(null).sendKeys("Admin123");
//		driver.findElement(null).click();
	}
	
	//3 . For each step ,  We will define separate method
	// Enter user name in user name text bo x
	public void enter_UserName(String value)
	{
		//	driver.findElement(null).sendKeys("Admin");
		
//		username_Txtbox.sendKeys("Admin");
		username_Txtbox.sendKeys(value);
	}
	
	// Enter pwd
	public void enter_Pwd(String pwd)
	{
		pwd_Txtbox.sendKeys(pwd);
	}
	
	
	//click login
	public void clickLoginBtn()
	{
		login_Btn.click();
	}
	
	
	public void LoginOrangeHRMSAppl(String user, String pwd)
	{
		enter_UserName(user);
		enter_Pwd(pwd);		
		clickLoginBtn();		
	}
	
	
	
}
