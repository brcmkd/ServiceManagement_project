package testnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest {
	WebDriver driver;
	@Test
	@Parameters({"url","username","password"})
	
	public void obsLoginTest(String url,String username,String password)
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(ops);
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		  driver.manage().window().maximize();
		  driver.get(url);	
		WebElement name=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		name.clear();
		name.sendKeys("username");
		pass.clear();
		pass.sendKeys("password");
	
	
	
	}

}
