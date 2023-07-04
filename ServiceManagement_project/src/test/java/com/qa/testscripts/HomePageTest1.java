package com.qa.testscripts;

	import java.io.IOException;



	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.Test;

	import com.qa.servicemanagementproject.Base;
	import com.qa.pages.*;
	import com.qa.utilities.ExcelUtility;

	import org.testng.Assert;
	public class HomePageTest1 extends Base
	{
		
	HomePage homepage;
	LoginPage loginpage;
	@Test(groups="Regression")
	public void verifyNavigateToAddClient() throws IOException
	{
		loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
	     loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
	    loginpage.enterPssword(ExcelUtility.getString(1, 1, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
		 loginpage.clickSubmit();
		homepage.navigateToAddClientPage();
		 
		String expectedMessage=ExcelUtility.getString(1, 4, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
		 String actualMessage=homepage.getAlertMessage();
		 Assert.assertEquals(actualMessage,expectedMessage,"Test Failed");
	}

	@Test(groups="Regression")
	public void verifyNavigateToAddReperation() throws IOException
	{    loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
	    loginpage.enterPssword(ExcelUtility.getString(1, 1, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
		 loginpage.clickSubmit();
		 homepage.navigateToAddReperation();
		 String expectedMessage=ExcelUtility.getString(1, 5, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
		 String actualMessage=homepage. addReperationMessage();
		 Assert.assertEquals(actualMessage,expectedMessage,"Test Failed");
		 
	}
   @Test(groups="Sanity")

	public void verifyToNavigateToSendSms() throws IOException
	{   loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
	    loginpage.enterPssword(ExcelUtility.getString(1, 1, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
		 loginpage.clickSubmit();
		
		 homepage.navigateToSendSms();
		 String expectedMessage=ExcelUtility.getString(1, 6, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
		 String actualMessage=homepage.sendSmsMessage();
		 Assert.assertEquals(actualMessage,expectedMessage,"Test Failed");
		 
	}
    @Test(groups="Sanity")
	public void verifyToNavigateToSendEmail() throws IOException
	{    loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
	    loginpage.enterPssword(ExcelUtility.getString(1, 1, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
		 loginpage.clickSubmit();
		
		 homepage.navigateToSendEmail();
		 String expectedMessage=ExcelUtility.getString(1, 7, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
		 String actualMessage=homepage.sendEmailMessage();
		 Assert.assertEquals(actualMessage,expectedMessage,"Test Failed");
	}
	}



