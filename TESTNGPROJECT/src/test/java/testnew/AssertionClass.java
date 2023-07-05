package testnew;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.*;

//import org.testng.asserts.Assertion;

//import dev.failsafe.internal.util.Assert;

public class AssertionClass {
	
	WebDriver driver;
	@Test
	
	public void setup()
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(ops);
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.google.com/");
		  

	String acttitle=driver.getTitle();//google
	System.out.println(acttitle);
	String exp="google";
	assertEquals(acttitle, exp);
	System.out.println("test passed");
}
}