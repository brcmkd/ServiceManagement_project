package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.ExcelUtility;
import com.qa.utilities.PageUtility;

public class SendEmail {

	public WebDriver driver;

	PageUtility page=new PageUtility();
		public SendEmail(WebDriver driver) {

			this.driver = driver;

			PageFactory.initElements(driver, this);

		}

		@FindBy(xpath="//select[@name='email_to[]']") WebElement dropdown ;
		@FindBy(xpath="//input[@id='subject']") WebElement subject ;
		@FindBy(xpath="//textarea[@id='sms_body']") WebElement sendemailmsg ;
		@FindBy(xpath="(//button[@type='submit'])[5]") WebElement sendbutton ;

		public void sendEmail() throws IOException {
			//String username=ExcelUtility.getString(1, 7, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
			page.selectDropDownbyText(dropdown, "archana");
			page.enterText(subject, "subject1");
			String textarea=ExcelUtility.getString(1, 37, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
			page.enterText(sendemailmsg, textarea);

			page.clickOnElement(sendbutton);




}
}