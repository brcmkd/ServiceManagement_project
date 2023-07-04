package obs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgGoogleTest {
	
	WebDriver driver;
	

	ChromeOptions ops = new ChromeOptions();

	           
	@BeforeMethod
	public void setup()
	{
		 
		 ops.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize(ops);
		driver.navigate().to("https://www.google.com/");
		
	}
	@Test
	public void googleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test
	public void texttt() throws InterruptedException
	{
		WebElement textarea= driver.findElement(By.xpath("//textarea[@title='Search']"));

	      textarea.click();

	      textarea.sendKeys("Selenium");

	      textarea.sendKeys(Keys.ENTER);
	      Thread.sleep(3000);
	 WebElement text= driver.findElement(By.xpath("//h3[text()='Selenium']//parent::a"));
    text.click();
    
	
	
	}
	
	@Test
	public void logoTest()
	{
		WebElement logo=driver.findElement(By.xpath("//img[@class='jfN4p']"));
		if(logo.isDisplayed())
		{
			System.out.println("logo displayed");
		}
		else
		{
			System.out.println("logo not displayed");
		}
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}

