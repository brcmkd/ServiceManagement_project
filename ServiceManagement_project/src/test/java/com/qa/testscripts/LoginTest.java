package com.qa.testscripts;

import java.io.IOException;





import org.testng.annotations.Test;



import com.qa.pages.LoginPage;

import com.qa.servicemanagementproject.Base;
import com.qa.utilities.ExcelUtility;
import org.testng.Assert;

public class LoginTest extends Base{

	LoginPage loginpage;

	

	@Test
	public void verifyUserIsAbleToLoginWithValidCredentials() throws IOException {
	     
		 loginpage=new LoginPage(driver);
		 loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
	     loginpage.enterPssword(ExcelUtility.getString(1, 1, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
		 loginpage.clickSubmit();
		 
		 String expectedMessage=ExcelUtility.getString(1, 2, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
		 String actualMessage=loginpage.getAlertMessage();
		 Assert.assertEquals(actualMessage, expectedMessage, "test Failed");
	 }

//	public void login() throws IOException {
//
//		loginpage=new LoginPage(driver);
//
//		loginpage.validLogin();
//
//		
//
//	}
//
//	public void checkLogout() throws IOException
//	{
//		loginpage=new LoginPage(driver);
//		loginpage.validLogin();
//		loginpage.logOut();
//	}



}