package com.obsqura.dataProviderUtility;

import java.io.IOException;


import org.testng.annotations.Test;

import com.qa.pages.LoginPage;
import com.qa.utilities.ExcelUtility;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class DataProviderUtility {
	public WebDriver driver;
	
	LoginPage loginpage;
	@Test(dataProvider = "getdataFromDataProvider", dataProviderClass = DataProviderUtility.class)
	public void VerifyLoginCredentials(String uName, String pw) throws IOException {
	
	loginpage = new LoginPage(driver);
	loginpage.enterUserName(uName);
	loginpage.enterPssword(pw);
	loginpage.clickSubmit();

	String expectedMessage = ExcelUtility.getString(1, 2,System.getProperty("user.dir") + "constants.Constant.TESTDATAFILE", "testSheet");
	String actualMessage = loginpage.getAlertMessage();
	Assert.assertEquals(expectedMessage, actualMessage, "Test Failed");
	}



	

	}

