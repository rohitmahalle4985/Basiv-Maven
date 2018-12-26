package selenium_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
public static void main(String[] args) throws Exception {
	

	WebDriver driver=new FirefoxDriver();
	
	
	driver.get("file:///C:/Users/Nishant/Desktop/Selenium%20Software/Offline%20Website%20_%20new/index.html");
	//driver.manage().window().fullscreen();
	WebElement validuname=driver.findElement(By.id("email"));
	validuname.clear();
	validuname.sendKeys("kiran@gmail.com");
	Thread.sleep(1000);
	
	//valid password
	WebElement validpass=driver.findElement(By.id("password"));
	validpass.clear();
	validpass.sendKeys("123456");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();

	WebElement userstag=driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a"));
	String usertagtxt=userstag.getText();
	System.out.println("usertagtext="+usertagtxt+"\n");
	userstag.click();
	

	WebElement addusertag=driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
	String addusertagtxt=addusertag.getText();
	System.out.println("Addusertagtext="+addusertagtxt+"\n");
	
	addusertag.click();

	
//To get current selected options	
	WebElement dropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
	
	Select s1=new Select(dropdown);
	
	List<WebElement> Allselected=s1.getAllSelectedOptions();
		
		for(WebElement list1:Allselected)
		{
			String dplist=list1.getText();
			System.out.println("All Dropdown present are:"+dplist);
		}
		
	
//To get perticular option	by following 3 ways
		WebElement dropdown1=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s=new Select(dropdown1);
		//s.selectByVisibleText("Maharashtra");
		//s.selectByIndex(3);
		s.selectByValue("Delhi");
		
		
		
		
	
		
		
//To get all option from list		
		WebElement dropdown2=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s3=new Select(dropdown2);
		List<WebElement> allOption=s.getOptions();
		for(WebElement allOption1:allOption)
		{
			System.out.println(allOption1.getText());
		}
	
	
	
	Thread.sleep(1000);
	
}
}
