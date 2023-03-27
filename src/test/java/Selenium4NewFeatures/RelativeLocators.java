package Selenium4NewFeatures;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = null;

		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		// . Represents current project folder name

		//		//open chrome browser
		  driver =  new ChromeDriver();
		  

			driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
			
			// Relative locators can be used locate the element based on location of element 
//			i.e left to the ele, right to the ele, above ele
			// below ele, near ele.
			
			// identify first name textbox with last name textbox
//			driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.name("lastname"))).clear();
//			driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.name("lastname"))).sendKeys("Raju");
			
//			driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.name("lastname"))).clear();
//			driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.name("lastname"))).sendKeys("Raju");
			
			
			//identify last anme text box   with reference of first name 
//			driver.findElement(RelativeLocator.with(By.xpath("//input[@name='lastname']")).toRightOf(By.name("firstname"))).sendKeys("yadhav");
			
//			driver.findElement(RelativeLocator.with(By.xpath("//input[@name='lastname']")).toRightOf(By.name("firstname"))).sendKeys("yadhav");
			
			
			
			// HW Testfield
			driver.findElement(RelativeLocator.with(By.id("testid232101")).toLeftOf(By.id("idpwd"))).sendKeys("test ");
			
			
			
			// HW Password with reference of Testfield
			
			
			//  below
			// click I ahve a bike checkbox using 'Male'  radio btn
//			driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("maleid"))).click();
			
			driver.findElement(RelativeLocator.with(By.xpath("//input[@id='bikeid'][@value='Bike']")).below(By.id("maleid"))).click();
			
			
			// above
			// HW Clikc 'male radio' btn using I have a bike' chkbox 
			
			// HW Click 'Fe male radio' btn using I have a bike' chkbox 		
		
			
			// near  50 
//			If the relative positioning is not obvious, or it varies based on window size,
//			you can use the near method to identify an element that is at most 50px away from the provided locator
			
			driver.findElement(RelativeLocator.with(By.xpath("//input[@type='password']")).near(By.name("lastname"))).sendKeys("near ele pwd");		
			driver.findElement(RelativeLocator.with(By.xpath("//input[@id='testid232101']")).near(By.name("lastname"))).sendKeys("near ele 2");
//			
//			driver.findElement(RelativeLocator.with(By.tagName("input")).near(By.name("lastname"))).sendKeys("near ele -2");// password 
				
//			driver.findElement(RelativeLocator.with(By.tagName("input")).near(By.name("firstname"))).sendKeys("near ele -2"); // test field
			

	

	}

}
