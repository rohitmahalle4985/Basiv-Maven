package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_webTable {
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
				Thread.sleep(1000);
				
				WebElement userstag=driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a"));
				String usertagtxt=userstag.getText();
				userstag.click();
				
				/********************  Logic for table printing *********************/
				WebElement table = driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table"));
				for(int j =2; j<=5; j++) {
					for(int i=1;i<=5;i++){
						WebElement tblele = driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+j+"]/td["+i+"]"));
						System.out.print(" " + tblele.getText());
					}
					System.out.println();
				}
		
	}

}
