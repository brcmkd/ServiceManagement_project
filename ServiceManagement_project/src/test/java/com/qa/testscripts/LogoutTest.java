package com.qa.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.LoginPage;
import com.qa.pages.Logout;
import com.qa.servicemanagementproject.Base;
import com.qa.utilities.ExcelUtility;

public class LogoutTest extends Base {
	
	LoginPage loginpage;
	Logout log;

	@Test
	
public void logoutTestPage() throws IOException
{
	loginpage = new LoginPage(driver);
	loginpage.enterUserName(ExcelUtility.getString(1, 0,
			System.getProperty("user.dir") + "constants.Constant.TESTDATAFILE", "testSheet"));
	loginpage.enterPssword(ExcelUtility.getString(1, 1,
			System.getProperty("user.dir") + "constants.Constant.TESTDATAFILE", "testSheet"));
	loginpage.clickSubmit();
	
	log.logoutIcon();
	log.logoutSuccessMsg();
}

	@Test
	public void verifyLogoutTest() throws IOException {
		String actualMessage = log.logoutSuccessMsg();
		String expectedMessage = ExcelUtility.getString(1, 3,
				System.getProperty("user.dir") + "constants.Constant.TESTDATAFILE", "testSheet");
		Assert.assertEquals(actualMessage, expectedMessage, "Logout Failed");

}}
