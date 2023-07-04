package com.qa.pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.PageUtility;
import com.qa.utilities.WaitUtility;
public class LoginPage {

	public WebDriver driver;


PageUtility page=new PageUtility();
	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(name = "identity")
	
		WebElement userName;

		@FindBy(name = "password")
	
		WebElement passWord;
	
		@FindBy(name = "submit")
	
		WebElement submit;
	
		@FindBy(name = "remember")
	
		WebElement rememberMeBox;
	
		@FindBy(linkText = "Forgot your password?")
	
		WebElement forgotPasswordLink;
	
		@FindBy(linkText = "Back to home page")
	
		WebElement backToHomeLink;
	
		@FindBy(xpath="//div[@class='alert alert-success']")
	
		WebElement alertMessage;
		
		@FindBy(xpath="(//span[text()='Joe Jacobs'])[1]")WebElement name;
		@FindBy(xpath="(//a[text()='Sign out'])[1]")WebElement signout;
		@FindBy(xpath="//p[text()='Logged Out successfully']")WebElement logoutmsg;

public  void enterUserName(String user) {
	   
    page.enterText(userName, user);
}
public void enterPssword(String passwrd) {
   
	page.enterText(passWord, passwrd);
}
public void clickSubmit() {
   
	page.clickOnElement(submit);
}
public  String getAlertMessage() {
    return page.getElementText(alertMessage);
}
public void clickName() {
   
	page.clickOnElement(name);
}
public void clickSignout() {
   WaitUtility.waitForElementClickable(driver, name);	   
   page.clickOnElement(signout);
}
public  String getLogoutMsg() {
   	    return page.getElementText(logoutmsg);
}
public String getPageTitle() {
return page.getTitile(driver);
}

}




//public class LoginPage {
//
//	public WebDriver driver;
//
//
//
//	public LoginPage(WebDriver driver) {
//
//		this.driver = driver;
//
//		PageFactory.initElements(driver, this);
//
//	}
//
//
//
//	@FindBy(name = "identity")
//
//	WebElement userName;
//
//	@FindBy(name = "password")
//
//	WebElement passWord;
//
//	@FindBy(name = "submit")
//
//	WebElement submit;
//
//	@FindBy(name = "remember")
//
//	WebElement rememberMeBox;
//
//	@FindBy(linkText = "Forgot your password?")
//
//	WebElement forgotPasswordLink;
//
//	@FindBy(linkText = "Back to home page")
//
//	WebElement backToHomeLink;
//
//	@FindBy(xpath="//div[@class='alert alert-success']")
//
//	WebElement alertMessage;
//	
//	@FindBy(xpath="//span[text()='Joe Jacobs'])[1]")WebElement name;
//	@FindBy(xpath="//a[text()='Sign out'])[1]")WebElement signout;
//	@FindBy(xpath="//p[text()='Logged Out successfully']")WebElement logoutmsg;
//	
//
//	
//
//	public void validLogin() throws IOException {
//
//		String username=ExcelUtility.getString(1, 0, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
//
//		String password=ExcelUtility.getString(1, 1, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
//
//		String expectedMessage=ExcelUtility.getString(1, 2, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
//
//		PageUtility.setValue(userName,username);
//
//		PageUtility.setValue(passWord, password);
//
//		PageUtility.isElementDisplayed(submit);
//
//		PageUtility.clickOnElement(submit);
//
//		String actualMessage=PageUtility.getElementText(alertMessage);
//
//		Assert.assertEquals(actualMessage, expectedMessage, "Login Failed");
//
//	}
//
//public void logOut() throws IOException
//{
//	PageUtility.clickOnElement(name);
//	PageUtility.clickOnElement( signout);
//	PageUtility.isElementDisplayed(submit);
//	String expectedmsg=ExcelUtility.getString(1,3, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
//	String actualmsg=PageUtility.getElementText(logoutmsg);
//	Assert.assertEquals(actualmsg, expectedmsg, "Login Failed");
//	
//}
//
//}

