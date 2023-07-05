package testnew;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterHw {
	WebDriver driver;
	@Test
	@Parameters({"sname","frstname","lastname","mail","username","password","confirmpw","per"})
	
	public void obsLoginTest(String sname ,String frstname,String lastname, String mail,String username,String password,String confirmpw,String per  ) throws IOException, InterruptedException
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(ops);
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		  driver.manage().window().maximize();
		  JsUtilities.login(driver);
		  
		  WebElement surname=driver.findElement(By.xpath("//input[@name='surname']"));
		  WebElement fname=driver.findElement(By.xpath("//input[@name='first_name']"));
		  WebElement lname=driver.findElement(By.xpath("//input[@name='last_name']"));
		  WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		  WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		  WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		  WebElement cpass=driver.findElement(By.xpath("//input[@name='confirm_password']"));
		  WebElement percent=driver.findElement(By.xpath("//input[@name='cmmsn_percent']"));
		  WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']"));
		  surname.sendKeys(sname);
		  fname.sendKeys(frstname);
		  lname.sendKeys(lastname);
		  email.sendKeys(mail);
		  uname.sendKeys(username);
		  pass.sendKeys(password);
		  cpass.sendKeys(confirmpw);
		  percent.sendKeys(per);
		  
	}
		  
		  
}
