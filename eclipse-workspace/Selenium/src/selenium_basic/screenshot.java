package selenium_basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot {
public static void main(String[] args) throws Exception {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("file://C:/Users/Nishant/Desktop/Selenium%20Software/Offline%20Website%20_%20new/index.html");
		
		Thread.sleep(5000);
		
		TakesScreenshot shot= (TakesScreenshot)driver;
		
		File f=shot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f,new File(".\\ScreenShot1\\Test.ppm"));
		
		driver.close();
		
}
}
					