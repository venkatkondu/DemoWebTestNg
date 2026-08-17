package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginRigiPage extends BaseDemoWebPage {

	private By byEmailInput=By.id("Email");
	private By byPasswordInput=By.name("Password");
	private By byLoginBtn=By.xpath("//input[@value='Log in']");
	
	private By byForgotLink=By.linkText("Forgot password?");
	private By byForgotH1Text=By.xpath("//div[@class='page-title']");
	private By byForgotEmailToolTip=By.xpath(".tooltip");
	private By byForgotEmailAddress=By.className(".email");
	private By byForgotRecoverBtn=By.name("send-email");
	
	
	private By byRigisterBtn=By.xpath("//input[@type='button' and @value='Register']");
	
	
	
	public LoginRigiPage(WebDriver rDriver) {
		super(rDriver);
	}

	
	
	
	
}
