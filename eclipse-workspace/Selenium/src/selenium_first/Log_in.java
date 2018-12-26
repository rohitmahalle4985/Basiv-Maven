package selenium_first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Log_in {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(" webdriver.ie.driver","C:\\IE\\IEDriverServer.exe");
		System.out.println("1");
		WebDriver driver=new InternetExplorerDriver();
	System.out.println("2");
	driver.get("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select");

	//By uisng ID Locator
	WebElement we=driver.findElement(By.id("email"));
	we.sendKeys("kiran@gmail.com");
	
	Thread.sleep(1000);
	
	WebElement pass=driver.findElement(By.id("password"));
	pass.sendKeys("123456");
	
	Thread.sleep(1000);
	
	
	
}
}
