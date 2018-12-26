package selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_with_Chrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
	}

}
