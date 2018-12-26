package selenium_basic;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Delete_cookies {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("file:///C:/Users/Nishant/Desktop/Selenium%20Software/Offline%20Website%20_%20new/index.html");
	
	Set<Cookie> s=driver.manage().getCookies();
	for (Cookie s1:s)
	{
		System.out.println(s1);
	}
	
	System.out.println(s);
	
	Cookie cookie=new Cookie("uname","kiran") ;
	driver.manage().addCookie(cookie);
	
	
	driver.manage().deleteAllCookies();
	
	
	}

}
