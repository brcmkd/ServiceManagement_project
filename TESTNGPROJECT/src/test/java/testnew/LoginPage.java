package testnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
	this.driver=driver;
}
	@FindBy(xpath="//input[@name='identity']")WebElement username;
	@FindBy(xpath="//input[@name='password']")WebElement password;
	@FindBy(xpath="//input[@name='submit']")WebElement button;
	
	public void login(String uname,String pw)
	{
		username.sendKeys(uname);
		password.sendKeys(pw);
		button.click();
	}
}