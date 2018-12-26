package DynamicXpath;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;

public class LoginTestCases {
	public static WebDriver driver;
		
	@BeforeSuite(groups="Smoke")
	public static WebDriver setup_Browser() throws Exception
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Nishant/Desktop/Selenium/Offline%20Website%20_%20new/index.html");
	return driver;
	}
	
	@Test(priority=1, groups="Regression",description="To check project URl is correct:")
	public static void Verify_Url()
	{//Actual URL
		String my_url=driver.getCurrentUrl();
		System.out.println("Page title is :-"+my_url);
	
	//Expected URL
		String expected_url="file:///C:/Users/Nishant/Desktop/Selenium/Offline%20Website%20_%20new/index.html";
		AssertJUnit.assertEquals(my_url,expected_url);
		System.out.println("Test case one with thread case id:-"+Thread.currentThread().getId());
		System.out.println("*******************************************");
	}
	
	@Test(priority=2, groups="Regression",description="Verify application title")
	public static void verifyApplicationTitle()
	{
		//Actual Title
		String my_title=driver.getTitle();
		System.out.println("The Original Title is:-"+my_title);
		
		
		//Expected Title
		String expected_title="AdminLTE 2 | Log in";
		AssertJUnit.assertEquals(my_title,expected_title);
		System.out.println("Test case Two with thread case id:-"+Thread.currentThread().getId()); 
		System.out.println("*******************************************");

	}
	
	@Test(priority=3, groups="Regression",description="")
	public void verifytitle()
	{
		String stitle=driver.findElement(By.xpath("//a[@href='index2.html']")).getText();
		String exp="AdminLTE";
		AssertJUnit.assertEquals(stitle,exp);
		System.out.println("application Title verify:"+stitle);
		System.out.println("******************************************");
	}
	
	//Login Session
	@Test(priority=4, groups="Regression")
	public void logginsession()
	{
		String login_title=driver.findElement(By.xpath("//p[contains(text(),'Sign in to start your session')]")).getText();
		String explogtitle="Sign in to start your session";
		
		AssertJUnit.assertEquals(login_title, explogtitle);
		System.out.println("Log session title is :-"+login_title);
		System.out.println("******************************************");
		
	}
	@Test(priority=5, groups="Regression")
	public void checkplaceholder_uname()
	{
		String unameplaceholder=driver.findElement(By.xpath("//input[@placeholder='Email']")).getAttribute("placeholder");
		String expplaceholder_uname="Email";
		AssertJUnit.assertEquals(unameplaceholder,expplaceholder_uname);
		System.out.println("Username placeholder verified:-"+unameplaceholder);
		System.out.println("*******************************************");
	}
	
	@Test(priority=6, groups="Regression")
	public void checkplaceholder_pass()
	{
		String passplaceholder=driver.findElement(By.xpath("//input[@placeholder='Password']")).getAttribute("placeholder");
		String expplaceholder_pass="Password";
		AssertJUnit.assertEquals(passplaceholder,expplaceholder_pass);
		System.out.println("Username placeholder verified:-"+passplaceholder);
		System.out.println("*******************************************");
	}
	
	@Test(priority=7, groups="Regression")
	public void check_button_color()
	{
		WebElement signbtn =driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-flat']"));
		System.out.println("before mouse over button color is:-" +signbtn.getCssValue("background color:-"));
		
		Actions act=new Actions(driver);
		act.moveToElement(signbtn).build().perform();
		System.out.println("after mouse over button color is:-"+signbtn.getCssValue("color:-"));
		System.out.println("*******************************************");
		act.build();
	}
	
	@Test(priority=8, groups="Regression")
	public void check_links()
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		System.out.println(".............");
				for(WebElement e:links)
				{
					System.out.println(e.getText());
				}
				System.out.println("**************************************");
	}

	@Test(priority=9, groups="Regression")
	public void blank_username_password()
	{
		WebElement uname = driver.findElement(By.xpath("//input[@type='text']"));
		uname.sendKeys("");
		
		String strexp="sa";
		Assert.assertNotEquals(uname,strexp);
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		String passact="sa";
		Assert.assertNotEquals(pass,passact);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-flat']")).click();

		String uname_error=driver.findElement(By.xpath("//div[@id='email_error']")).getText();
		System.out.println(uname_error);
		
		String pass_error=driver.findElement(By.xpath("//div[@id='password_error']")).getText();
		System.out.println(pass_error);
		System.out.println("***************************************************");
	}
	@Test(priority=10, groups="Regression")
	public void invalid_username_password() throws InterruptedException
	{
		WebElement invaliduname = driver.findElement(By.xpath("//input[@type='text']"));
		invaliduname.sendKeys("kiran@gmail.com12");
		String strxp="kiran@gmail.com";
		Assert.assertNotEquals(invaliduname,strxp);
		Thread.sleep(1000);
		
		WebElement invalidpass = driver.findElement(By.xpath("//input[@type='password']"));
		invalidpass.sendKeys("12345");
		String passexp="123456";
		Assert.assertNotEquals(invalidpass,passexp);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-flat']")).click();
		System.out.println("please enter the valid user name and passwors");
		
		System.out.println("***************************************************");
		
	}
	
	@Test(priority=11, groups="Regression")
	public void valid_username_password() throws InterruptedException
	{
		
		WebElement validuname=driver.findElement(By.xpath("//input [@id='email']"));
		validuname.clear();
		validuname.sendKeys("kiran@gmail.com");
		Thread.sleep(2000);
		
		 WebElement validpass=driver.findElement(By.xpath("//input [@id='password']"));
		 validpass.clear();
		 validpass.sendKeys("123456");
		Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//button [@class='btn btn-primary btn-block btn-flat']")).click();
		
		System.out.println("online");
		System.out.println("*************************************************");
	}
	
	@Test(priority=12, groups="smoke")
	public void verify_Appliation_Url_DeshBoard()
	{
		//Actual URL
		
		String actual_url=driver.getCurrentUrl();
		
		
		//Expected URL
		String exp_url="file:///C:/Users/Nishant/Desktop/Selenium/Offline%20Website%20_%20new/pages/examples/dashboard.html";
		
		Assert.assertEquals(actual_url, exp_url);
		
		System.out.println("successfully checked url");
		System.out.println("****************************************************");

	}
	@Test(priority=13, groups="smoke")
	public void verify_ApplicationTitle_DashBoard()
	{
	String actual_title=driver.getTitle();
	
	String exp_title="AdminLTE 2 | Dashboard";
	
	Assert.assertEquals(actual_title, exp_title);
	System.out.println("************************************************************8888");
	}
	
	@Test(priority=14, groups="smoke")
	public void heading_DashBoard()
	{
		String actual_heading=driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
		String exp_heading="Dashboard Control panel";
		
		Assert.assertEquals(actual_heading, exp_heading);
		System.out.println("*****************************************************");
	}

	@Test(priority=15, groups="unit")
	public void user_Click() throws InterruptedException
	{
		WebElement uclick=driver.findElement(By.xpath("//a[@href='users.html']"));
		uclick.click();
		Thread.sleep(2000);

		WebElement userdelete=driver.findElement(By.xpath("//span[@class='label label-danger']"));
		userdelete.click();
		//for alert box
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());//to get text of alert box
		Thread.sleep(2000);
		driver.switchTo().alert().accept();//to click on ok

		
	}
	
	@Test(priority=16, groups="unit")
	public void getTableData()
	{
	//	WebElement Table=driver.findElement(By.xpath("//[]"))
		
	}
}






