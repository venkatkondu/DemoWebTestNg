package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utility;

public class LoginRegiPage extends BaseDemoWebPage {

	private By byEmailInput=By.id("Email");
	private By byEmail_Input_Error_HelpText=By.xpath("//span[@for='Email']");  // Please enter a valid email address.
	private By byPasswordInput=By.name("Password");
	private By byLoginBtn=By.xpath("//input[@value='Log in']");
	private By byFailedLogin_HelpText_1=By.xpath("//div[@class='message-error']//span");		// Login was unsuccessful. Please correct the errors and try again.
	private By byFailedLogin_HelpText_2=By.xpath("//div[@class='message-error']//li"); 		// No customer account found
	
	
	private By byForgotLink=By.linkText("Forgot password?");
	private By byForgotH1Text=By.xpath("//div[@class='page-title']");
	private By byForgotEmailToolTip=By.xpath(".tooltip");
	private By byForgotEmailAddress=By.className(".email");
	private By byForgotRecoverBtn=By.name("send-email");
	
	
	private By byRigisterBtn=By.xpath("//input[@type='button' and @value='Register']");
	
	
	
	public LoginRegiPage(WebDriver rDriver) {
		super(rDriver);
	}
	
	public void emailInput(String email_Address) {
		
		lDriver.findElement(byEmailInput).sendKeys(email_Address);
	}
	
	public String getEmail_Input_Error_Lable() {
	return 	lDriver.findElement(byEmail_Input_Error_HelpText).getText();
	}
	
	public void passwordInput(String password) {
		lDriver.findElement(byPasswordInput).sendKeys(password);
		
	}
	
	public HomePage clickOn_LogIn_Btn() {
		Utility.click(lDriver.findElement(byLoginBtn));
		return new HomePage(lDriver);
		
	}
	
	public String getLogin_Failed_Error_Label_1() {
		return lDriver.findElement(byFailedLogin_HelpText_1).getText();
	}

	public String getLogin_Failed_Error_Label_2() {
		return lDriver.findElement(byFailedLogin_HelpText_2).getText();
	}
	
	
	
	
	
}
