package testnew;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

	 static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String url)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
	driver.manage().window().maximize();
	driver.get(url);
	return driver;
	}
}
