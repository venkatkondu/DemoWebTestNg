package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utility;

public class HomePage extends BaseDemoWebPage {
	
	
	private By byUserName=By.xpath("//div[@class='header']//a[@class='account']");
	private By byLogOut_Link=By.className("ico-logout");
	private By byShoppingCart_Link=By.xpath("//a[@class='ico-cart']//span[@class='cart-label']");
	private By byWishList_Link=By.xpath("//a[@class='ico-wishlist']//span[@class='cart-label']");
	
	
	public HomePage(WebDriver rDriver) {
		super(rDriver);
		
	}
	
	public IndexPage clickOn_Logout() {
		Utility.click(lDriver.findElement(byLogOut_Link));
		return new IndexPage(lDriver);
	}
	
	public void clickOn_UserName() {
		Utility.click(lDriver.findElement(byUserName));
	
	}
	
	public String getUserName() {
		
		return lDriver.findElement(byUserName).getText();
	}
	
	
	public void clickOn_ShoppingCart() {
		Utility.click(lDriver.findElement(byShoppingCart_Link));

	}
	
	public void clickOn_WishList() {
		Utility.click(lDriver.findElement(byWishList_Link));
		
	}
	

}
