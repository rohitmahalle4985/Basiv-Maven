package Log4j;

import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Log4j {
	
	
	WebDriver driver=new FirefoxDriver();
	
	
	
	@Test
	
	
	
	public void testTitle()
	{
		System.out.println("Entering in to test jbk method"+ new Date());
		driver.get("\"html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select\"");
		String title=driver.getTitle();
		Assert.assertTrue(title.equals("Best Selenium Training in Pune"));
		System.out.println("Exititng from TestJbkTitle method>>"+new Date());
		
	}

}
