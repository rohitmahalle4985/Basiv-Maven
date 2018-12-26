package Mouse_Events;

import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Scrolliing_a_page {

//public void srollpage() throws InterruptedException

public static void main(String[] args) throws InterruptedException {
{

	System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
	WebDriver driver=new  ChromeDriver();
	driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
	driver.manage().window().maximize();


	
	//((JavascriptExecutor)driver).executeScript("scroll(300,400)");
	
	//or
	
	
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("scrollBy(0,400)");
	
	
	
//for do the scroll up	
	//JavascriptExecutor js1=(JavascriptExecutor)driver;
	js.executeScript("ScrollBy(0,-400)");

}
}
}
