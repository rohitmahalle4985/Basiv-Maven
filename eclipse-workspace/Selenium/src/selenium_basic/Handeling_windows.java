package selenium_basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handeling_windows {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		String parentWindow=driver.getWindowHandle();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		Iterator<String> itr =allWindows.iterator();
		while(itr.hasNext())
		{
			String childWindow=itr.next();
			if(!parentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println("Child window title is :"+driver.getTitle());
			}
			driver.close();
		}
		driver.switchTo().window(parentWindow);
	}
}
