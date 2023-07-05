package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.PageUtility;
import com.qa.utilities.WaitUtility;

public class Logout {
	public WebDriver driver;
	PageUtility page=new PageUtility();
	
	public Logout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//span[class='user-image']") WebElement joejacob;
	@FindBy(xpath="//a[text()='Sign out']") WebElement signout;
	@FindBy(xpath="//p[text()='Logged Out Successfully']") WebElement logoutmsg;
	
	public void logoutIcon()
	{ 
		WaitUtility.waitForElement(driver, joejacob);
   		page.clickOnElement(joejacob);
   		WaitUtility.waitForElement(driver, signout);
		page.clickOnElement(signout);
	
	}
	
	public String logoutSuccessMsg()
	{
		WaitUtility.waitForElement(driver, logoutmsg);
	return page.getElementText(logoutmsg);
	
	
	
	}}
	