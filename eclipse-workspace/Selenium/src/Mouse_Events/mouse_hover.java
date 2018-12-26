package Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover {
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		Actions action =new Actions(driver);
		
	//	Action act=new Action(driver);
		
		action.moveToElement(driver.findElement(By.linkText("Departments"))).build().perform();
		Thread.sleep(5000);
		
		//action.moveToElement(driver.findElement(By.partialLinkText("Books & Audible"))).build().perform();
	}

}
