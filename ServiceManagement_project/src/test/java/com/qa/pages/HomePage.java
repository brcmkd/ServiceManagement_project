package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.qa.utilities.ExcelUtility;
import com.qa.utilities.PageUtility;
import com.qa.utilities.WaitUtility;


public class HomePage {

	public WebDriver driver;
	PageUtility page=new PageUtility();

	public HomePage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(xpath="//div[@class='alert alert-success']")WebElement loginMessage;
    @FindBy(xpath="//i[@class='fa fa-plus-circle']") WebElement icon;
	@FindBy(xpath="//span[@class='fa fa-user-plus icon']") WebElement addclient;
	@FindBy(xpath="//h4[text()='Add Client']") WebElement addmsg;
	@FindBy(xpath="//span[@class='fa fa-list-alt icon']") WebElement addReperation;
	@FindBy(xpath="//h4[text()='Add Reparation']") WebElement addReperationmsg;
	@FindBy(xpath="//label[@for='imei']") WebElement imeilabel;
	@FindBy(xpath="//span[@class='fa fa-comment icon']")WebElement sendSms;
	@FindBy(id="exampleModalLabel")WebElement sendSMSMsg;
	@FindBy(xpath="//span[@class='fa fa-paper-plane icon']")WebElement sendEmail;
	@FindBy(xpath="(//h5[@class='modal-title'])[2]")WebElement sendEmailMsg;
	@FindBy(xpath="//i[@class='fa fa-exclamation-triangle']")WebElement QAlertsIcon;
	@FindBy(xpath="//span[@class='label label-danger pull-right']")WebElement QAlertsIconNum;
	@FindBy(xpath="//h1[text()='Quantity Alerts']")WebElement QMsg;
	
	
	
	
	
	public void navigateToAddClientPage()
	{
		
		page.clickOnElement(icon);
		
		page.clickOnElement(addclient);
	}
	
	public  String getAlertMessage() {
	    return page.getElementText(addmsg);
	}
	public void navigateToAddReperation()
	{ 
		page.clickOnElement(icon);
		
		page.clickOnElement(addReperation);
	}
	public  String addReperationMessage() {
	    return page.getElementText(addReperationmsg);
	}
	public void navigateToSendSms()
	{
		page.clickOnElement(icon);
		
		page.clickOnElement(sendSms);
	}
	public  String sendSmsMessage() {
	    return page.getElementText(sendSMSMsg);
	}
	public void navigateToSendEmail()
	{
		page.clickOnElement(icon);
		page.clickOnElement(sendEmail);
	}
	public  String sendEmailMessage() {
	    return page.getElementText(sendEmailMsg);
	}
//public void verifyNavigatetoClientPage() throws IOException
//{
//page.clickOnElement(icon);	
//page.clickOnElement(addclient);
//WaitUtility.waitForPresenceOfAllElementsLocatedBy(driver, By.xpath("//i[@class='fa fa-plus-circle']"));
//String expectedmsg=ExcelUtility.getString(1, 4, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
//String actualmsg=page.getElementText(addmsg);
//Assert.assertEquals(actualmsg, expectedmsg, "Test Failed");
//
//
//}
//	
//
//public void verifyNavigatetoAddReperation() throws IOException {
//	PageUtility.clickOnElement(icon);
//	//WaitsUtility.waitForPresenceofElementLocated(driver, By.xpath("//span[@class='fa fa-list-alt icon']"));
//	PageUtility.clickOnElement(addReperation);
//	String expectedMessage=ExcelUtility.getString(1, 5, System.getProperty("user.dir")+constants.Constance.TESTDATAFILE, "testSheet");
//	String actualMessage=page.getElementText(addReperationmsg);
//	Assert.assertEquals(actualMessage, expectedMessage, "Test Failed");
//}
//public void verifyNavigatetoSendSms() throws IOException {
//	PageUtility.clickOnElement(icon);
//	PageUtility.clickOnElement(sendSms);
//	String expectedMessage=ExcelUtility.getString(1, 6, System.getProperty("user.dir")+constants.Constance.TESTDATAFILE, "testSheet");
//	String actualMessage=page.getElementText(sendSMSMsg);
//	Assert.assertEquals(actualMessage, expectedMessage, "Test Failed");
//
//
//}
//public void verifyNavigatetoSendEmail() throws IOException {
//	PageUtility.clickOnElement(icon);
//	PageUtility.clickOnElement(sendEmail);
//	String expectedMessage=ExcelUtility.getString(1, 7, System.getProperty("user.dir")+constants.Constance.TESTDATAFILE, "testSheet");
//	String actualMessage=page.getElementText(sendEmailMsg);
//	System.out.println(actualMessage);
//	Assert.assertEquals(actualMessage, expectedMessage, "Test Failed");
//}
//public void verifyNavigatetoQuantityAlert() throws IOException {
//	PageUtility.clickOnElement(QAlertsIcon);
//	PageUtility.clickOnElement(QAlertsIconNum);
//	String expectedMessage=ExcelUtility.getString(1, 8, System.getProperty("user.dir")+constants.Constance.TESTDATAFILE, "testSheet");
//	String actualMessage=page.getElementText(QMsg);
//	Assert.assertEquals(actualMessage, expectedMessage, "Test Failed");
}