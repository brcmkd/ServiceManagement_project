package testnew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ExtentReport {
    private static final String PASS = null;
	ExtentReports extent = new ExtentReports();
    WebDriver driver;
	private Status Status;
    @BeforeSuite
    public void setup()
    {
        
        ExtentSparkReporter reporter = new ExtentSparkReporter("extent-report.html");
            reporter.config().setReportName("Extent Report");  
            
            extent.attachReporter(reporter);
//            String path=System.getProperty("webdriver.chrome.driver",path+)
            extent.setSystemInfo("company Name", "IGBEG pvt.ltd");     
            extent.setSystemInfo("Author", " Pooja");
            
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            
        }
     @Test
     public void testtt()
     {
         driver.get("https://qalegend.com/mobile_service/panel/welcome#");
         ExtentTest test=extent.createTest("Myfirsttest","sample desc");
         WebElement username=driver.findElement(By.xpath("//input[@name='identity']"));
        username.sendKeys("admin@admin.com");
         WebElement pw=driver.findElement(By.xpath("//input[@name='password']"));
        pw.sendKeys("password");
        WebElement button=driver.findElement(By.xpath("//input[@name='submit']"));
        
        button.click();
        String acttitle=driver.getTitle();
        String ExpectTitle="Home";
        if(acttitle.contentEquals(ExpectTitle))
        {
        	test.log(Status.PASS,"test is pass");
        }
        else
        {
        	String temp=ScreenshotUtilities.getScreenshot(driver);
        	test.fail("the test is failed",MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
        	 test.addScreenCaptureFromPath(temp);
}
        extent.flush();
        //         test.log(Status.INFO, "the test is pass");
//         
//         test.info("infooo");
//         driver.get("https://www.google.com/");
//         test.fail("the test is failed",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
//         test.addScreenCaptureFromPath("screenshot.png");
//         extent.flush();
  }
    }