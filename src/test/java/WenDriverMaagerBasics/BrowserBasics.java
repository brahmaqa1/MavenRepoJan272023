package WenDriverMaagerBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserBasics {
	
	public static void main(String args[])
	{
	
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
//		download chromedriver.exe manually and write above stmt in code
		// if browser version changes -- we have to download same version of driver.exe
//		ex:  chrome Version 110.0.5481.178   --->  chromdriver.exe  110 
		
		// WebdriverManger :  open source jar file
		// can be used to download all driver executable files i.e chromedriver.exe. edgedriver.exe
		//   geckodriver.exe...etc
		// it always downloads latest driver.exe file 
		//Version 110.0.5481.178
		// can be use to manage all driver executable file automatically
		
//		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Downloads\\edgedriver_linux64.zip\\msedgedriver.exe");
		
		
		//2  create obj for ChromeDriver- Class 
		ChromeDriver driver =  new ChromeDriver();// open chrome browser with empty url 
	
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
