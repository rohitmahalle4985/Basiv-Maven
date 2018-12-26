
package selenium_basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class loginWith_IE {
	
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "C:\\InternetExplorer Driver\\IEDriverServer.exe");
	
	WebDriver driver=new InternetExplorerDriver();
	
	driver.get("https://www.google.com");
	
	//driver.close();
}

}
