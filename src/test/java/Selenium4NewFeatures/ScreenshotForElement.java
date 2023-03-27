package Selenium4NewFeatures;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotForElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;

		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		  driver =  new ChromeDriver();

		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		// take screen shot for first name textbox 
		File srcFile = driver.findElement(By.name("firstname")).getScreenshotAs(OutputType.FILE);
		String  file= "C:\\brahma\\Practise\\SelniumPractiseNew\\NovSeleniumBatchWorkSpace\\MyMavenProjectFromCmd\\src\\test\\java\\Selenium4NewFeatures\\eleScreen1.png";
		File desFile = new File(file);
		FileUtils.copyFile(srcFile, desFile);
		
		// HW take screenshot for Lastname text box, Bikes dropdown

	}

}
