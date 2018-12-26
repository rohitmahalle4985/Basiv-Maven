package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox_FB {
	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();

driver.get("https://www.facebook.com/");

WebElement chkFBPersist=driver.findElement(By.className("_66ul"));

for(int i=0;i<=1;i++)
{
	chkFBPersist.click();
	System.out.println(chkFBPersist.isSelected());
}

driver.close();
}
}