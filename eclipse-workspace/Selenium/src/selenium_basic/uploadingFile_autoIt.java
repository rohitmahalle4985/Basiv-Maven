package selenium_basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class uploadingFile_autoIt {
	@Test
	
	public void upload() throws Exception
	{
		
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("file:///C:/Users/Nishant/Desktop/upload.html");
	
	driver.findElement(By.xpath(".//*[@id='1']")).click();
	
	Thread.sleep(5000);
	
	Runtime.getRuntime().exec("C:\\Users\\Nishant\\Desktop\\AutoIt_Run_Files\\fileupload.exe");
	
	System.out.println("File uploaded successfully");
	
	
}		
}
