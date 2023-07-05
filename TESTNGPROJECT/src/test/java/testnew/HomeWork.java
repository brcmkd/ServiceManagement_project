package testnew;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(ops);
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.google.com");
		 
	}
@Test

public void googleTitleTest() 
{
	String title=driver.getTitle();
	System.out.println(title);
			
}
@Test
public void search() throws AWTException, InterruptedException
{
	WebElement text= driver.findElement(By.xpath("//*[@class='gLFyf']"));
	text.click();
	text.sendKeys("Selenium");
	  text.sendKeys(Keys.ENTER)	;
	  Thread.sleep(3000);
}
@Test
public void logo()
{
	WebElement textt=driver.findElement(By.xpath("//h3[text()='Selenium']//parent::a"));
	textt.click();
}

@AfterMethod
public void close()
{
	driver.quit();
}
}
