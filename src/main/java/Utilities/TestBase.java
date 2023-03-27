package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	
	public WebDriver openBrowser() throws InterruptedException
	{

		WebDriver driver = null;

		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		// . Represents current project folder name

		//		//open chrome browser
		  driver =  new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		Thread.sleep(300);
		return driver;
	}
	
	// log  msgs
	//  exent reports
	//  generic methods for ele   Browser,textbox,

}
