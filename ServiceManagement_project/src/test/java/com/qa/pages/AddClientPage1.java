package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.utilities.FakerUtility;
import com.qa.utilities.PageUtility;
import com.qa.utilities.WaitUtility;

public class AddClientPage1 {

	public WebDriver driver;
	PageUtility page=new PageUtility();
	FakerUtility faker=new FakerUtility();

	public AddClientPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='name1']")
	WebElement cname;
	@FindBy(xpath = "//input[@id='company1']")
	WebElement compname;
	@FindBy(xpath = "//input[@id='autocomplete']")
	WebElement location;
	@FindBy(xpath = "//input[@id='route']")
	WebElement addresS;
	@FindBy(xpath = "//input[@id='locality']")
	WebElement city;
	@FindBy(xpath = "//input[@id='postal_code']")
	WebElement pinCode;
	@FindBy(xpath = "//input[@id='telephone']")
	WebElement telephone;
	@FindBy(xpath = "//input[@id='email1']")
	WebElement email;
	@FindBy(xpath = "//input[@id='vat1']")
	WebElement vatno;
	@FindBy(xpath = "//input[@id='cf1']")
	WebElement ssnno;
	@FindBy(xpath = "//input[@id='image']")
	WebElement file;
	@FindBy(xpath = "//textarea[@id='comment1']")
	WebElement comment;
	@FindBy(xpath="//input[@placeholder='Select file...']")
	WebElement uploadFile;
	@FindBy(xpath="//button[@id='submit']")
	WebElement addClientButton;
	@FindBy(xpath="//button[@class='btn btn-default']")
	WebElement goBackButton;
	@FindBy(xpath="//button[@id='modify_client']")
	WebElement modifyButton;
	@FindBy(xpath="//button[@id='delete_client']")
	WebElement deleteButton;
	@FindBy(xpath="//button[@id='submit']")
	WebElement saveChangesButton;
	@FindBy(xpath="//div[@id='dynamic-table_filter']//label//input")
	WebElement searchClient;
	
	@FindBy(xpath="//li[text()='This value is required.']")
	WebElement alertMsgWithoutClient;
	

	public void addClientName() {
		
		String name=FakerUtility.clientName();
		
		page.setValue(cname, name);
		System.out.println(name);
		
	}
	
	public void addCompanyName() {
		String compName=FakerUtility.companyname();
		page.setValue(compname, compName);
	
	}
	
	public void addGeolocation() {
		String geoLocat=FakerUtility.location();
		page.setValue(location, geoLocat);
		
	}
	
	public void addAddress() {
		String address=FakerUtility.address();
		page.setValue(addresS,address);
		
	}
	
	public void addCity() {
		String cityy=FakerUtility.city();
		page.setValue(city,cityy);
		
	}
	
	public void addPincode() {
		String code=FakerUtility.postalCode();
		page.setValue(pinCode,code);
	
	}
	
	public void addPhoneNo() {
		String phone=FakerUtility.telephone();
		page.setValue(telephone,phone);

	}
	
	public void addEmail() {
		String mail=FakerUtility.email();
		page.setValue(email,mail);

	}
	
//	public String addVatNo() {
//		return FakerUtility.ssN();
//	}
	
	public void addSSNo() {
		String ssno=FakerUtility.ssN();
		page.setValue(ssnno,ssno);
 
	}
	
	public void addComment(String commnt) {
		
		page.setValue(comment, commnt);
	}
	
	public void uploadFile() {
		page.setValue(uploadFile, "\\src\\main\\java\\Resources\\IdCardX10.pdf");
	}
	
	public void addClient() {
		page.clickOnElement(addClientButton);
	}
	
	
//	public void verifyIfClientAdded() {
//		page.clickOnElement(searchClient);
//		page.setValue(searchClient, email);
//		boolean isClientAdded=driver.findElements(By.xpath("//table//tbody//tr//td[contains(text().'"+name+"')]")).size()>0;
//		Assert.assertTrue(isClientAdded, "client addittion failed");
//	}
	
	public String getAlertMsg() {
		return page.getElementText(alertMsgWithoutClient);
	}
}
//	public class AddClient1 {
//
//		public WebDriver driver;
//
//		PageUtility page=new PageUtility();
//
//		public AddClient1(WebDriver driver) {
//
//			this.driver = driver;
//
//			PageFactory.initElements(driver, this);
//
//		}
//		
//		
//		@FindBy(xpath="//input[@id='name1']")WebElement clientname;
//		
//		@FindBy(xpath="//input[@id='company1']")WebElement companyname;
//		@FindBy(xpath="//input[@id='autocomplete']")WebElement location;
//		@FindBy(xpath="//input[@id='route']")WebElement route;
//		@FindBy(xpath="//input[@id='locality']")WebElement locality;
//		@FindBy(xpath="//input[@id='postal_code']")WebElement postalcode;
//		@FindBy(xpath="//input[@id='telephone']")WebElement telephone;
//		@FindBy(xpath="//input[@id='email1']")WebElement email;
//		@FindBy(xpath="//input[@id='vat1']")WebElement vat;
//		@FindBy(xpath="//input[@id='cf1']")WebElement cf1;
//		@FindBy(xpath="//textarea[@id='comment1']")WebElement comment;
//
//	public void addClientName(String client)
//	{
//		String cliname=FakerUtility.clientName();
//	page.enterText(clientname, client);
//	}
//	public void addCompany(String company)
//	{
//		String comname=FakerUtility.companyname();
//		page.enterText(companyname, company);
//	}
//	
//	public void addLocation(String geolocate)
//	
//	{
//		String geolo=FakerUtility.location();
//	page.enterText(location,geolocate);
//	
//	}
//
//	public void addAddress(String address)
//	
//	{
//		String add=FakerUtility.address();
//	page.enterText(route,address);
//	
//	}
//	public void addLocality(String localitty)
//	{
//		
//	page.enterText(locality, localitty);	
//	}
//	
//	public void AddPostal(String postal)
//	{
//		String postalc=FakerUtility.postalCode();
//		page.enterText(postalcode, postal);
//	}
//	public void AddTelephone(String telephonenum)
//	{
//		String tele=FakerUtility.telephone();
//		page.enterText(telephone, telephonenum);
//	}
//	
//	public void AddEmail(String emaill)
//	{
//		String emai=FakerUtility.email();
//		page.enterText(email, emaill);
//	}
//	public void AddVat(String vatt)
//	{
//		
//		page.enterText(vat, vatt);
//	}
//	
//	public void AddSsn(String ssn)
//	{
//		String ssnn=FakerUtility.ssN();
//		page.enterText(cf1, ssn);
//	}
//	public void AddComment(String commentt)
//	{
//		page.enterText(comment, commentt);
//	}
//	}