package selenium_basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookie_handling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div"));
		
		

		Set<Cookie> cookie=driver.manage().getCookies();
		
		for(Cookie cookie1:cookie)
		{
			System.out.println("name of cookie:"+cookie1.getName());
			System.out.println("value for cookie:"+cookie1.getValue());
			System.out.println("Domain for cookie:"+cookie1.getDomain());
			System.out.println("getExppiry for cookie:"+cookie1.getExpiry());
			System.out.println("is secure for cookie:"+cookie1.isSecure());//boolean type
			System.out.println("\n");
			
		}
		
		driver.manage().deleteAllCookies();
		
driver.findElement(By.xpath("/html/body/div[2]/div/div"));
		
		Set<Cookie> cookie2=driver.manage().getCookies();
		
		for(Cookie cookie3:cookie)
		{
			System.out.println("name of cookies:"+cookie3.getName());
		}
		
		System.out.println("End of testing");
	
		driver.close();
	}
	
	
}
