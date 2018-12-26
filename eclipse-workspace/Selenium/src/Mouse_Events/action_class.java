package Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class action_class {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	
	
	driver.get("http://javabykiran.com/javabykiranfiles/");
	
	Actions builder=new Actions(driver);
	
	WebElement userName= driver.findElement(By.xpath(".//*[@id='login_form_user']"));
	
	Actions seriesOfActions= builder.moveToElement(userName).click()
			.keyDown(userName, Keys.SHIFT)
			.sendKeys(userName,"javabykiran")
			.doubleClick(userName)
			.contextClick();
	
			builder.build();
	
	
	seriesOfActions.perform();
	
	
	
}
}
