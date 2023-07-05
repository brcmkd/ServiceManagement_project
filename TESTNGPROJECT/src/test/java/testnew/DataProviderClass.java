package testnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

	WebDriver driver;
	@Test(dataProvider="logintestdata")
	
	public void obsLoginTest(String username,String password)
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(ops);
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		  driver.manage().window().maximize();
		  driver.get("https://qalegend.com/billing/public/login");	
		WebElement name=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		name.clear();
		name.sendKeys("username");
		pass.clear();
		pass.sendKeys("password");
}
    @DataProvider(name="logintestdata")

public Object[][] logintestdata()
{
	Object[][] data=new Object[3][2];
	data[0][0]="admin";
	data[0][1]="admin123";
	
	data[1][0]="admin45";
	data[1][1]="admin32";
	
	data[2][0]="4354";
	data[2][1]="pwd";
	
	return data;
}}