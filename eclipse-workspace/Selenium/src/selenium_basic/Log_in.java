package selenium_basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Log_in {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	
	//To get the current page Source that is HTML sode  
		
		//String pgsrc=driver.getPageSource();
		//System.out.println("APge source is:"+pgsrc);
	
	driver.get("file:///C:/Users/Nishant/Desktop/Selenium%20Software/Offline%20Website%20_%20new/index.html");
	
	
	//To get current url of page
	String pgurl=driver.getCurrentUrl();
	System.out.println("1="+pgurl+"\n");
	
	//TO get current page title
	String pgtitle=driver.getTitle();
	System.out.println("2="+pgtitle+"\n");
	
	//TO get Heading of Page 
	//String pgheading=driver.findElement(By.xpath("html/body/div[1]/div[1]/a")).getText();

	WebElement we=driver.findElement(By.xpath("html/body/div[1]/div[1]/a"));
	String pgheading=we.getText();
	System.out.println("3="+pgheading+"\n");
	
	//To get sign in dialogue box text
	WebElement dialogue_box_lable=driver.findElement(By.className("login-box-msg"));
	String signintext=dialogue_box_lable.getText();
	System.out.println("4="+signintext+"\n");
	
	

	//To maximize windows
	driver.manage().window().maximize();
	
	//To get a placeholder of text box
	String email_placeholder=driver.findElement(By.id("email")).getAttribute("placeholder");
	System.out.println("Email_placeholder="+email_placeholder+"\n");
	
	String pass_placeholder=driver.findElement(By.id("password")).getAttribute("placeholder");
	System.out.println("pass_placeholder="+pass_placeholder+"\n");
	
	
	driver.findElement(By.id("email")).sendKeys("rohit@gmail.com");
	Thread.sleep(1000);
	
	driver.findElement(By.id("password")).sendKeys("1234");
	Thread.sleep(1000);
	
	//To check a button text
	WebElement buttonText=driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button"));
	String button=buttonText.getText();
	System.out.println("butttonText="+button+"\n");
	
	//To get sign in dialogue box lasttext
		WebElement dialogue_box_lastlable=driver.findElement(By.className("text-center"));
		String signinlasttext=dialogue_box_lastlable.getText();
		System.out.println("dialoguebox_last_text="+signinlasttext+"\n");
	
	
	
	WebElement click=driver.findElement(By.xpath(".//button[text()='Sign In']"));
	click.click();
	Thread.sleep(1000);
	
	//email error
			String email_error=driver.findElement(By.id("email_error")).getText();
			System.out.println(email_error);
	
	//password error
		String pass_error=driver.findElement(By.id("password_error")).getText();
		System.out.println(pass_error);
	
		
	//valid username	
	WebElement validuname=driver.findElement(By.id("email"));
	validuname.clear();
	validuname.sendKeys("kiran@gmail.com");
	Thread.sleep(1000);
	
	//valid password
	WebElement validpass=driver.findElement(By.id("password"));
	validpass.clear();
	validpass.sendKeys("123456");
	Thread.sleep(1000);
	
	
	//signin button
	driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();
	
	System.out.println("now u enterd a valid email_id and password \n");

	//After login get a current page title
	String currentPage=driver.getTitle();
	System.out.println("Current Login PAge is:-"+currentPage);
	
	//page2 heading corner left
	WebElement page2heading=driver.findElement(By.className("logo-lg"));
	String page2head =page2heading.getText();
	System.out.println("pahe2heading="+page2head+"\n");
	
	//dashboard heading
	WebElement dashtext=driver.findElement(By.xpath("html/body/div[1]/div[1]/section[1]/h1"));
	String dashboardText=dashtext.getText();
	System.out.println("dashboardText="+dashboardText+"\n");

	
	//loguout buttontext
	WebElement logout=driver.findElement(By.xpath("html/body/div[1]/header/nav/div/ul/li/a"));
	String logout1=logout.getText();
	System.out.println("logoutText="+logout1+"\n");
	Thread.sleep(1000);

//driver.navigate().back();


/*WebElement reentervalidpass=driver.findElement(By.id("password"));
reentervalidpass.clear();
reentervalidpass.sendKeys("123456");
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();
*/
	
	WebElement copyrightfooter=driver.findElement(By.xpath("html/body/div[1]/footer"));
	String copyright=copyrightfooter.getText();
	System.out.println("copyrightfooter="+copyright+"\n");
	
	
	WebElement jbklink=driver.findElement(By.linkText("JBK"));
	jbklink.click();
	Thread.sleep(1000);
	System.out.println("....................................");
	
	
	WebElement insideJBK=driver.findElement(By.xpath(".//*[text()='Welcome to JBK.com']"));
	String insideJBKhyperlink=insideJBK.getText();
	System.out.println("insideJBKhyperlink="+insideJBKhyperlink+"\n");
	Thread.sleep(1000);
	
	WebElement insideJBK2=driver.findElement(By.xpath("html/body/center/font"));
	String insideJBKhyperlink2=insideJBK2.getText();
	System.out.println("insideJBKhyperlink2="+insideJBKhyperlink2+"\n");
	
	Thread.sleep(1000);
	
	driver.navigate().back();
	
	Thread.sleep(1000);
	
	WebElement userstag=driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a"));
	String usertagtxt=userstag.getText();
	System.out.println("usertagtext="+usertagtxt+"\n");
	userstag.click();
	//Thread.sleep(1000);
	
	WebElement addusertag=driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
	String addusertagtxt=addusertag.getText();
	System.out.println("Addusertagtext="+addusertagtxt+"\n");
	
	addusertag.click();
	
	WebElement addusername=driver.findElement(By.id("username"));
	addusername.sendKeys("Rohit");
	Thread.sleep(1000);
	
	WebElement mob_no=driver.findElement(By.id("mobile"));
	mob_no.sendKeys("8390518008");
	Thread.sleep(1000);
	
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("rohitmahalle@live.com");
	Thread.sleep(1000);
	
	WebElement gender_male=driver.findElement(By.xpath(".//*[@id='Male']"));
	gender_male.click();
	Thread.sleep(1000);
	
	WebElement dropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
	Select s=new Select(dropdown);
	s.selectByVisibleText("Maharashtra");
	Thread.sleep(1000);
	
	WebElement pass=driver.findElement(By.xpath(".//*[@id='password']"));
	pass.sendKeys("rohit4567");
	Thread.sleep(1000);
	
	WebElement submit=driver.findElement(By.xpath(".//*[@id='submit']"));
	submit.click();
	
	
	Alert alert=driver.switchTo().alert();
	
	String alertText=driver.switchTo().alert().getText();
	System.out.println(alertText);
	
	Thread.sleep(5000);
	alert.accept();
	
Thread.sleep(1000);
	
	driver.navigate().back();
	
Thread.sleep(1000);
	
	driver.navigate().back();
	
	/********************  Logic for table printing *********************/
	WebElement table = driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table"));
	for(int j =2; j<=5; j++) {
		for(int i=1;i<=5;i++){
			WebElement tblele = driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+j+"]/td["+i+"]"));
			System.out.print(" " + tblele.getText());
		}
		System.out.println();
	}

	

	/*WebElement logoutclick=driver.findElement(By.xpath("html/body/div[1]/header/nav/div/ul/li/a"));
	logoutclick.click();

WebElement logoutmsg=driver.findElement(By.xpath("html/body/div[1]/div[2]/p[2]"));
String logoutmsgtext=logoutmsg.getText();
System.out.println("logoutmsgText="+logoutmsgtext+"\n");


driver.close();
*/		
	
	
	

	}

}
