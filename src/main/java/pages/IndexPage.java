package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utility;

public class IndexPage extends BaseDemoWebPage {

	private By byRigisterLink=By.linkText("Register");
	private By byLoginLink=By.partialLinkText("Log");
	
	private By byShoppingCartLink=By.xpath("//a[@class='ico-cart']/span[1]");
	private By byShoppingCartNumber=By.xpath("//a[@class='ico-cart']/span[2]");
	
	private By byWishListLink=By.xpath("//a[@class='ico-wishlist']/span[1]");
	private By byWishListNumberLink=By.xpath("//a[@class='ico-wishlist']/span[2]");
	
	private By byLoginRigiInfo=By.className(".topic-html-content-header");
	private By byLoginInfo=By.xpath("//p");
	
	
	public IndexPage(WebDriver rDriver) {
		super(rDriver);
		
	}
	
	
	public LoginRegiPage clickOn_LogIn_Link() {
		Utility.click(lDriver.findElement(byLoginLink));
		return new LoginRegiPage(lDriver);
	}
	 
	public LoginRegiPage clickOn_Register_Link() {
		Utility.click(lDriver.findElement(byRigisterLink));
		return new LoginRegiPage(lDriver);
	}
	
	public void clickOn_Shopping_Cart_Link() {
		Utility.click(lDriver.findElement(byShoppingCartLink));
	}
	public void clickOn_WishList_Link() {
		Utility.click(lDriver.findElement(byWishListLink));
	}
	
	
}
