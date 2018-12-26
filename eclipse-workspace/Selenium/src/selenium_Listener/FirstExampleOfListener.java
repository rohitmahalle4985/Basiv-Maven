package selenium_Listener;

import org.apache.poi.hssf.usermodel.examples.NewSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class FirstExampleOfListener {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
	EventFiringWebDriver eventDriver=new EventFiringWebDriver(driver);
	
	
	trackChangesInApplication trackChange = new trackChangesInApplication();
	
	eventDriver.register(trackChange);
	
	
	eventDriver.get("file:///C:/Users/Nishant/Desktop/Selenium%20Software/Offline%20Website%20_%20new/index.html");
	
	
	eventDriver.manage().window().maximize();
	
	WebElement userEle = eventDriver.findElement(By.id("email"));
	
	userEle.sendKeys("kiran@gmail.com");
	
	WebElement passwordEle=eventDriver.findElement(By.id("password"));
	
	passwordEle.sendKeys("123456");
	
	
	WebElement signInButton= eventDriver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
	signInButton.click();
	
	
	
	
	}
}
