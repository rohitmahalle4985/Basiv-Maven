package Mouse_Events;

import javax.swing.ActionMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Nishant/Desktop/Selenium%20Software/Offline%20Website%20_%20new/index.html");
		
		Actions action=new Actions(driver);
		
		WebElement d=driver.findElement(By.id("email"));
		
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.id("email"))).doubleClick().perform();
		Thread.sleep(3000);
		
		driver.close();

	}
}
