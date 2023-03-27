package Selenium4NewFeatures;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NEwWindow {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = null;

		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		// . Represents current project folder name

		//		//open chrome browser
		  driver =  new ChromeDriver();
//
//		// open given url ib browser
//			driver.get("https://www.google.com/");
//			Thread.sleep(3000);
		// Opens a new window and switches to new window
//			driver.switchTo().newWindow(WindowType.WINDOW);///  ctrl - is on browser2 
//			driver.navigate().to("https://www.crmpro.com/");
//			
			//**************
			  //// Opens a new tab and switches to new tab
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
//			driver.switchTo().newWindow(WindowType.TAB);
			driver.switchTo().newWindow(WindowType.TAB);//   tab-2 
			
			Thread.sleep(3000);
			driver.navigate().to("https://www.crmpro.com/");
//			
	

	}

}
