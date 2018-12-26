package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBroserTesting {

	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void crossTesting(String browserName) throws Exception
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
		
		}
		
		driver.get("file:///C:/Users/Nishant/Desktop/Selenium%20Software/Offline%20Website%20_%20new/index.html");
		System.out.println("FireFox PageTitleMethod:"+driver.getTitle());
		driver.close();
	}
	
	
}
	
