package Highlighter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actual_class {
	public static void main(String[] args) {
		
	
	WebDriver driver=new FirefoxDriver();
	
	
	driver.get("file:///C:/Users/Nishant/Desktop/Selenium%20Software/Offline%20Website%20_%20new/index.html");
	
	
	WebElement uname=driver.findElement(By.id("email"));
	Helper.highLightElement(driver,uname);
	
	uname.sendKeys("kiran@gmail.com");
	
	WebElement pass=driver.findElement(By.id("password"));
	Helper.highLightElement(driver,pass);
	pass.sendKeys("123456");
	
	System.out.println("1................");
	WebElement signbutton=driver.findElement(By.linkText("Sign In"));
	System.out.println("...................");
	Helper.highLightElement(driver,signbutton);
	signbutton.click();
	
	
	driver.close();
	}
}
