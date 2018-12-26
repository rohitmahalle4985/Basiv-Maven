package selenium_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class check_All_Links {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Nishant/Desktop/Selenium%20Software/Offline%20Website%20_%20new/index.html");
		
		//valid username	
		WebElement validuname=driver.findElement(By.id("email"));
		validuname.clear();
		validuname.sendKeys("kiran@gmail.com");
		Thread.sleep(1000);
		
		//valid password
		WebElement validpass=driver.findElement(By.id("password"));
		validpass.clear();
		validpass.sendKeys("123456");
		Thread.sleep(1000);
		
		
		//signin button
		driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		int i=0;
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
			//System.out.println(i++);
			//if(link.getText().equals(allLinks))
		}
		


		driver.close();
		
	}

}
