package com.qa.testscripts;

	import java.io.IOException;


	import org.testng.annotations.Test;

	import com.qa.pages.HomePage;
	import com.qa.pages.LoginPage;
import com.qa.pages.SendSms;
import com.qa.pages.SendSms;
	import com.qa.servicemanagementproject.Base;
	import com.qa.utilities.ExcelUtility;

	public class SmsTest extends Base{
		HomePage homepage;
		LoginPage loginpage;
		SendSms sendsmspage;
		
		@Test
		public void sendSMSTest() throws IOException {
			loginpage=new LoginPage(driver);
			loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
			loginpage.enterPssword(ExcelUtility.getString(1, 1, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
			loginpage.clickSubmit();
			homepage=new HomePage(driver);
			homepage.navigateToSendSms();
			sendsmspage=new SendSms(driver);
			sendsmspage.enterMessage(ExcelUtility.getString(1, 8, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
			sendsmspage.selectRecepient();
			sendsmspage.clickOnSendButton();
	}

	}

