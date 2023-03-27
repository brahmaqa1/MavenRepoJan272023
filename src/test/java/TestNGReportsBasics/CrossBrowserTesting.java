package TestNGReportsBasics;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting 
{
	WebDriver driver;
	
	// read browser parameter 
		@Parameters("browser")
		@Test
		public void login( String mybrowser) throws InterruptedException	
		{
			System.out.println("Read browser param = " + mybrowser + "Executes at Time=" + new Date() );

			if(mybrowser.equals("chrome"))
			{
				// Write a code   to open chrome borwser
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				System.out.println("Open " +mybrowser+ "Executes at Time=" + new Date()  );
				driver  = new ChromeDriver();
			}
			else if(mybrowser.equals("edge"))
			{
				//  Edge browser		
				System.out.println("Open " +mybrowser+ "Executes at Time=" + new Date() );
				System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
				driver  = new EdgeDriver();
			}
			
		//  Firefox browser // HW
			
			System.out.println("Open url  " + mybrowser + "Executes at Time=" + new Date()  );
			driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

			// get current url 
			String url =  driver.getCurrentUrl();
			System.out.println("url =" +url);
			System.out.println("get url  " + mybrowser + "Executes at Time=" + new Date() );
			Thread.sleep(2000);
			driver.findElement(By.name("firstname")).clear();
			Thread.sleep(3000);
			driver.findElement(By.name("firstname")).sendKeys("Raju");
			Thread.sleep(2000);
			driver.findElement(By.name("lastname")).sendKeys("yadhav");
			Thread.sleep(2000);
			System.out.println("ends at time =" + new Date() );



		}


}
