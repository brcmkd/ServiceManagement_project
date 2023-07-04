package com.qa.testscripts;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.pages.*;
	import com.qa.testscripts.*;
	import com.qa.servicemanagementproject.Base;
	import com.qa.utilities.ExcelUtility;
import com.qa.utilities.PageUtility;

import org.testng.Assert;

	public class AddReperationTest extends Base{
		
		LoginPage loginpage;
		HomePage homepage;
		AddReperation addreperationdata;
@Test

public void verifyAddReperationDetails() throws IOException, AWTException, InterruptedException {
	 loginpage=new LoginPage(driver);
	 homepage=new HomePage(driver);
	 addreperationdata=new AddReperation(driver);
	 loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
     loginpage.enterPssword(ExcelUtility.getString(1, 1, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet"));
     loginpage.clickSubmit();
	 homepage.navigateToAddReperation();
	 addreperationdata.addImei(ExcelUtility.getString(1, 24,System.getProperty("user.dir") + "constants.Constant.TESTDATAFILE", "testSheet"));
	 addreperationdata.addClient(ExcelUtility.getString(1, 25,System.getProperty("user.dir") + "constants.Constant.TESTDATAFILE", "testSheet"));
	 addreperationdata.addTax(ExcelUtility.getString(1, 26,System.getProperty("user.dir") + "constants.Constant.TESTDATAFILE", "testSheet"));
	 addreperationdata.addCategory(ExcelUtility.getString(1, 27,System.getProperty("user.dir") + "constants.Constant.TESTDATAFILE", "testSheet"));
				
	 addreperationdata.uploadImg();
	 
}}
