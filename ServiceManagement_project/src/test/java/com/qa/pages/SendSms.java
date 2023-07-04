package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.ExcelUtility;
import com.qa.utilities.PageUtility;

public class SendSms {
	public WebDriver driver;
	PageUtility page=new PageUtility();
	
	public SendSms(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='client_id']")
	WebElement dropDown;
	@FindBy(xpath="(//textarea[@id='fastsms'])[3]")
	WebElement textArea;
	@FindBy(xpath="//button[@value='Submit']")
	WebElement sendButton;
	@FindBy(xpath="(//button[@class='close'])[10]")
	WebElement close;
	
	public void selectRecepient() {
		page.selectDropDownbyValue(dropDown, "59");
	}
	
	public void enterMessage(String text) throws IOException {
		page.setValue(textArea, text);
	}
	
	public void clickOnSendButton() {
		page.clickOnElement(sendButton);
		page.clickOnElement(close);
	}


}