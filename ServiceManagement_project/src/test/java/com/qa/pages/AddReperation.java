package com.qa.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.utilities.FakerUtility;
import com.qa.utilities.PageUtility;
import com.qa.utilities.WaitUtility;

public class AddReperation {

	public WebDriver driver;
	PageUtility page=new PageUtility();

	public AddReperation(WebDriver driver) {

		this.driver=driver;

	}
	@FindBy(xpath="//input[@id='imei']") WebElement imei;
	
	@FindBy(xpath=" (//input[@class='select2-search__field'])[2]") WebElement clientsearchfield;
	@FindBy(xpath="(//span[@class='select2-selection__arrow'])[1]")  WebElement clientdropdown;
	@FindBy(xpath="//input[@id='category']") WebElement category;
	@FindBy(xpath="//input[@class='select2-search__field'][1]") WebElement taxrate;
	@FindBy(xpath="(//span[@class='select2-selection__placeholder'])[2]") WebElement assignedtotextbox;
	@FindBy(xpath="(//span[@class='select2-selection__arrow'])[2]") WebElement assignedtodropdown;
	@FindBy(xpath="//input[@id='reparation_manufacturer']") WebElement manufacturer;
	@FindBy(xpath="//input[@id='reparation_model']") WebElement model;
	@FindBy(xpath="//input[@id='add_item']") WebElement additem;
	@FindBy(xpath="//input[@id='defect']") WebElement defect;
	@FindBy(xpath="(//span[@class='select2-selection__placeholder'])[3]") WebElement errorcodesearchbox;
	@FindBy(xpath="(//span[@class='select2-selection__arrow'])[3]")WebElement errorcodedropdown;
	@FindBy(xpath="//input[@id='service_charges']") WebElement servicecharge ;
	@FindBy(xpath="//input[@id='expected_close_date']") WebElement expectedclosedate;
	@FindBy(xpath="//input[@id='date_of_purchase']") WebElement purchasedate ;
	@FindBy(xpath="(//span[text()='Please Select'])[4]") WebElement haswarrenty ;
	
	@FindBy(xpath="(//span[@class='select2-selection__arrow'])[4]") WebElement haswarrentydropdown;
	@FindBy(xpath="(//span[@class='select2-selection__placeholder'])[5]") WebElement warrentyserchbox;
	@FindBy(xpath="(//span[@class='select2-selection__arrow'])[5]") WebElement warrentydropdown;
	@FindBy(xpath="//input[@id='warranty_card_number']")WebElement warrantycardnumber;
	@FindBy(xpath="//input[@id='repair_type']")WebElement repairtype;
	@FindBy(xpath="//input[@id='client_date']")WebElement clientreceivedate;
	
	@FindBy(xpath="//textarea[@id='accessories']")WebElement  accessories;
	@FindBy(xpath="//textarea[@id='comment']")WebElement  comment;
	@FindBy(xpath="//textarea[@id='diagnostics']")WebElement  diagonistic;
	@FindBy(xpath="//button[@class='pull-left btn btn-default")WebElement gobackbutton;
	@FindBy(xpath="//span[@id='select2-status_edit-container']") WebElement inprogressdropdown;
	@FindBy(xpath="//button[@l_btn'id='upload_moda]")WebElement uploadbutton;
	@FindBy(xpath="(//div[@class='btn btn-primary btn-file'])[1]") WebElement browsebutton;
	@FindBy(xpath="//span[text()='Upload']") WebElement uploadFinal;
	@FindBy(xpath="(//div[@class='progress'])[3]")WebElement uploaddone;
	@FindBy(xpath="(//button[@class='close'])[4]")WebElement closeUpload;
	@FindBy(xpath="//input[@id='repair_sms']")WebElement automaticTextCheckBox;
	
	@FindBy(xpath="//input[@id='repair_email']")WebElement sendmailCheckBox;
	@FindBy(xpath="//button[@id='sign_repair']")WebElement signRepairButton;
	
	@FindBy(xpath="//button[@class='prerepair_show btn btn-primary']")WebElement preRepairCheckListButton;
	
	@FindBy(xpath="//button[@id='repair_submit']")WebElement addReparation;
	
	
	public void addImei(String value)
	{
		page.enterText(imei, value);
	}
	
	public void addClient(String value)
	{
	page.enterText(clientsearchfield, value);
	//page.clickOnElement(clientdropdown);
	}
	public void addTax(String value)
	{
		
		page.enterText(taxrate, value);
	}
	public void addCategory(String value)
	{
		page.enterText(category, value);
	}
	public void assignetTo(String value)
	{
		page.enterText(assignedtotextbox, value);
		
	}
	public void manuf(String value)
	{
	page.enterText(manufacturer, value);}
	public void model(String value)
	{
	page.enterText(model, value);
	}
	public void addItem(String value)
	{
	page.enterText(additem, value);
	}
	
	public void addPurDate(String value)
	{
		page.clickOnElement(purchasedate);
	}
	public void addExDate(String value)
	{
		
		page.clickOnElement(expectedclosedate);
	}
	public void acesories(String value)
	{
		page.enterText(accessories, value);
	}
	public void comment(String value)
	{
		page.enterText(comment, value);
	}
	public void diag(String value)
	{
		page.enterText(diagonistic, value);
	}
	public void uploadImg() throws AWTException, InterruptedException {
		WaitUtility.waitForElement(driver, uploadbutton);
		page.clickOnElement(uploadbutton);
		WaitUtility.waitForelementClickable(driver, browsebutton);
		page.fileUpload(driver, browsebutton, "C:\\\\Users\\\\MIS BRC MKD\\\\report.pdf");
		//WaitUtility.waitForElement(driver, uploadFinal);
		page.clickOnElement(uploadFinal);
		String message=page.getElementText(uploaddone);
		System.out.println(message);
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
