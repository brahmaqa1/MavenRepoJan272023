package WenDriverMaagerBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowserBasics2 {
	
	public static void main(String args[])
	{
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
		
		

		// WebdriverManger :  open source jar file
		// can be used to download all driver executable files i.e chromedriver.exe. edgedriver.exe
		//   geckodriver.exe...etc
		
//		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();

		EdgeDriver  driver=  new EdgeDriver();
		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");
	
		
		// click  Electronics,  Computers  checkbox
		WebElement  ElectronicsCheckBoxele=  driver.findElement(By.id("eleId"));
		
		ElectronicsCheckBoxele.click();
		
		WebElement  ComputersChkboxEle=  driver.findElement(By.id("cid"));
		ComputersChkboxEle.click();
		
		// HW check these checkboxes  Electronics,  Computers  are selected
		
		//  HW unselect 'Computers' checkbox -- use clikc()
		
		
		// HW check 'Computers' checkbox is selected or not
		

	}

}
