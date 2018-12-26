package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicUsingFirefox46 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("1");
		WebDriver wd = new FirefoxDriver();
		wd.get ("file:///C:/Users/Nishant/Desktop/Selenium%20Software/Offline%20Website%20_%20new/index.html");
		
		Thread.sleep(1000);
		
		System.out.println("2");
		WebElement weUser = wd.findElement(By.id("email"));
		weUser.clear();
		weUser.sendKeys("kiran@gmail.com");
		Thread.sleep(1000);

		
		System.out.println("3");
		WebElement weError1 = wd.findElement(By.id("email_error"));
		String labelError1 = weError1.getText();
		System.out.println(labelError1);
		Thread.sleep(1000);

		WebElement wePswd = wd.findElement(By.id("password"));
		wePswd.sendKeys("123456");
		Thread.sleep(1000);

		WebElement weError2 = wd.findElement(By.id("password_error"));
		String labelError2 = weError2.getText();
		System.out.println(labelError2);
		Thread.sleep(1000);

		WebElement weButton = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		weButton.click();
		Thread.sleep(1000);
		
		/*
		WebElement emailerror = wd.findElement(By.xpath(".//*[@id='email_error']"));
		System.out.println(emailerror.getText());
		Thread.sleep(1000);
	
		WebElement weUser11 = wd.findElement(By.id("email"));
		weUser11.clear();
		weUser11.sendKeys("kiran@gmail.com");
		Thread.sleep(1000);
		
		
		WebElement weButtonag = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		weButtonag.click();
		Thread.sleep(1000);
		 */

		WebElement weUser1 = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
		weUser1.click();
		Thread.sleep(1000);
		
		WebElement weAddUser = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		weAddUser.click();
		Thread.sleep(500);

		
		WebElement weUname = wd.findElement(By.xpath(".//*[@id='username']"));
		weUname.sendKeys("darshit");
		Thread.sleep(1000);
		
		WebElement weMob = wd.findElement(By.xpath(".//*[@id='mobile']"));
		weMob.sendKeys("111112");
		Thread.sleep(1000);
		
		WebElement weEmail = wd.findElement(By.xpath(".//*[@id='email']"));
		weEmail.sendKeys("darshit@gmail.com");
		Thread.sleep(1000);
		
		WebElement weGender = wd.findElement(By.xpath(".//*[@id='Female']"));
		weGender.click();
		Thread.sleep(1000);
		
		Select s=new Select(wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select")));
		s.selectByVisibleText("Punjab");
		Thread.sleep(1000);
		
		WebElement wePwd = wd.findElement(By.xpath(".//*[@id='password']"));
		wePwd.sendKeys("123789");
		Thread.sleep(1000);
		
		WebElement weSubmit = wd.findElement(By.xpath(".//*[@id='submit']"));
		weSubmit.click();
		Thread.sleep(1000);
		
		Alert al = wd.switchTo().alert();
		al.accept(); 
		Thread.sleep(1000);

		
		WebElement weuser = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
		weuser.click(); 
		Thread.sleep(1000);
		
		WebElement logout=wd.findElement(By.xpath("html/body/div[1]/header/nav/div/ul/li/a"));
		logout.click();

/********************  Logic for table printing *********************/
		WebElement table = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table"));
		for(int j =2; j<=5; j++) {
			for(int i=1;i<=5;i++){
				WebElement tblele = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+j+"]/td["+i+"]"));
				System.out.print(" " + tblele.getText());
			}
			System.out.println();
		}
/********************  Logic for table printing *********************/
	}
}
