package Selenium4NewFeatures;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ScrollDownToEle {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = null;

		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		// . Represents current project folder name

		//		//open chrome browser
		  driver =  new ChromeDriver();
		  

			driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
			
			// scroll down to browse file btn
//			
			
			Actions  act = new Actions(driver);
			WebElement   browseFileBtn=  driver.findElement(By.id("fileid"));
			
			act.scrollToElement(browseFileBtn).perform();
			
	}

}
