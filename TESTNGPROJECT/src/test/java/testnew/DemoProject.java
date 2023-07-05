package testnew;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoProject {
	//preconditions
	@BeforeSuite
	
	public void setup()
	{
		System.out.println("setup the system property");
	}
	
	@BeforeClass
	
	public void launchBrowser()
	{
		System.out.println("launch chrome browser");
	}
	@BeforeTest()
	
		public void login()
		{
			System.out.println("login into app");
		}
		@BeforeMethod()
		
		public void clickUrl()
		{
			System.out.println("clicked url");
		}
		
		@Test
		public void googleTitleTest()
		{
			System.out.println("google title test");
		}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout from app");
	}
	@AfterTest
	public void deleteCookiess()
	{
		System.out.println("delete cookies");	
	}
	@Test
	public void googleSearch()
	{
		System.out.println("google search test");
	}
	//postconditions
	@AfterMethod
	public void logOut()
	{
		System.out.println("logout from app");
	}
	@AfterClass
	
	public void closeBrowser()
	{
	System.out.println(" close browser");}
	@AfterTest
	public void deleteCookies()
	{
		System.out.println("delete cookies");
	}
	@AfterSuite
	public void generateReport()
	{
		System.out.println("generate reports");
	}
}
	
	

