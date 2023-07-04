package com.qa.testscripts;
import java.io.IOException;
import org.testng.annotations.Test;

import com.qa.pages.*;
	import com.qa.testscripts.*;
	import com.qa.servicemanagementproject.Base;
	import com.qa.utilities.ExcelUtility;
import com.qa.utilities.PageUtility;

import org.testng.Assert;

	public class AddClientTest extends Base{
		
		PageUtility page=new PageUtility();
		LoginPage loginpage;
		HomePage homepage;
		AddClientPage1 addclientpage;
		@Test
		public void addClientTest() throws IOException {
			loginpage=new LoginPage(driver);
			loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
			loginpage.enterPssword(ExcelUtility.getString(1, 1, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
			loginpage.clickSubmit();
			homepage=new HomePage(driver);
			homepage.navigateToAddClientPage();
			addclientpage=new AddClientPage1(driver);
			addclientpage.addCity();
			addclientpage.addAddress();
			addclientpage.addClientName();
			addclientpage.addCompanyName();
			addclientpage.addEmail();
			addclientpage.addGeolocation();
			addclientpage.addPhoneNo();
			addclientpage.addPincode();
			addclientpage.addSSNo();
			addclientpage.uploadFile();
			addclientpage.addComment(ExcelUtility.getString(1, 29, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
			addclientpage.addClient();
		
		}
		
		
		
//		LoginPage loginpage;
//		HomePage homepage;
//		AddClient1 addclientdata;
//@Test
//public void verifyAddClientDetails() throws IOException {
//	
//	 loginpage=new LoginPage(driver);
//	 loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
//     loginpage.enterPssword(ExcelUtility.getString(1, 1, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
//     loginpage.clickSubmit();
//	 homepage.navigateToAddClientPage();
//	 
//	 addclientdata=new AddClient1(driver);
//	addclientdata.addClientName(ExcelUtility.getString(1, 10, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
//	addclientdata.addCompany(ExcelUtility.getString(1, 11, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
//	addclientdata.addLocation(ExcelUtility.getString(1, 12, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
//	addclientdata.addAddress(ExcelUtility.getString(1, 13, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
//	addclientdata.addLocality(ExcelUtility.getString(1, 14, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
//	addclientdata.AddPostal(ExcelUtility.getString(1, 15, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
//	addclientdata.AddTelephone(ExcelUtility.getString(1, 16, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
//	addclientdata.AddEmail(ExcelUtility.getString(1, 17, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
//	addclientdata.AddVat(ExcelUtility.getString(1, 18, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
//	addclientdata.AddSsn(ExcelUtility.getString(1, 19, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
//	addclientdata.AddComment(ExcelUtility.getString(1, 20, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
//	
//	
//	
//}
	}

