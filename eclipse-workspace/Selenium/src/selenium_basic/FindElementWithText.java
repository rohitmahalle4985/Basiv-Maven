package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementWithText {
	 	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Nishant/Desktop/Selenium%20Software/Offline%20Website%20_%20new/index.html");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		driver.close();
		
		driver.quit();
		
	}
	

}
