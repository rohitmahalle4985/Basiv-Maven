package Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.com/");
	
	Actions action =new Actions(driver);
	
	
WebElement	rightclick=driver.findElement(By.linkText("Departments"));
	action.contextClick(rightclick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	
}
}
//Keys is a class implements CharSequence