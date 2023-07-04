package com.qa.testscripts;

import java.io.IOException;

	import org.testng.annotations.Test;

	import com.qa.pages.HomePage;
	import com.qa.pages.LoginPage;
	import com.qa.pages.SendSms;
	import com.qa.pages.SendEmail;
	import com.qa.servicemanagementproject.Base;
	import com.qa.utilities.ExcelUtility;

	public class SendEmailTest extends Base{
	HomePage homepage;
	LoginPage loginpage;
	SendEmail sendemailpage;

	@Test
	public void sendEmailTest() throws IOException {
	loginpage=new LoginPage(driver);
	loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
	loginpage.enterPssword(ExcelUtility.getString(1, 1, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
	loginpage.clickSubmit();
	homepage=new HomePage(driver);
	sendemailpage=new SendEmail(driver);
	sendemailpage.sendEmail();

}
}