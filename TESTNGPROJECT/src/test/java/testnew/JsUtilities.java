package testnew;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JsUtilities {

	
	public static  void login(WebDriver driver)throws IOException,InterruptedException {
//		ChromeOptions ops = new ChromeOptions();
//		ops.addArguments("--remote-allow-origins=*");
//		 WebDriver driver1=new ChromeDriver(ops);
//		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
//		  driver.manage().window().maximize();
		  
		  driver.get("https://qalegend.com/billing/public/login");
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		  driver.findElement(By.xpath("//input[@name='remember']")).click();
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  driver.findElement(By.xpath("//button[text()='End tour']")).click();
		  
		  driver.findElement(By.xpath("//span[text()='User Management']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("(//*[@class='title'])[2]")).click();
		  driver.findElement(By.xpath("//*[text()=' Add']")).click();
	}
}
