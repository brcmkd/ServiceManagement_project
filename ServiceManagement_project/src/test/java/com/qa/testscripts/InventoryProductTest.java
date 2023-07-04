package com.qa.testscripts;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.InventoryProductsPage;
import com.qa.pages.InventoryProductsPage;
import com.qa.pages.LoginPage;
import com.qa.servicemanagementproject.Base;
import com.qa.utilities.ExcelUtility;
import com.qa.utilities.PageUtility;

public class InventoryProductTest extends Base {
	LoginPage loginpage;
	InventoryProductsPage iPage;
	PageUtility page = new PageUtility();

	@Test
	public void deleteInventoryProductTest() throws IOException {
		loginpage = new LoginPage(driver);
		iPage = new InventoryProductsPage(driver);

		loginpage.enterUserName(ExcelUtility.getString(1, 0,
				System.getProperty("user.dir") + "constants.Constant.TESTDATAFILE", "testSheet"));
		loginpage.enterPssword(ExcelUtility.getString(1, 1,
				System.getProperty("user.dir") + "constants.Constant.TESTDATAFILE", "testSheet"));
		loginpage.clickSubmit();
		// new
		int expectedCountAfterDelete = iPage.getExpectedInventoryCount();

		iPage.clickonInventoryInfo();

		iPage.getdata(
				ExcelUtility.getString(4, 0, System.getProperty("user.dir") + "constants.Constant.TESTDATAFILE",
						"testSheet"),
				ExcelUtility.getNumeric(4, 1, System.getProperty("user.dir") + "constants.Constant.TESTDATAFILE",
						"testSheet"));

		iPage.clickOndelete();
		iPage.selectYes();
		String countAfterDeletion = iPage.getInventoryCount();

//		int count = iPage.getAfterDeleteionCount();
//		String actualCount = String.valueOf(count);
		Assert.assertEquals(countAfterDeletion, expectedCountAfterDelete, "Test Failed");

	}}


