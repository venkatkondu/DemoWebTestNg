package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseDemoWebPage {
	
	private static  WebDriver lDriver=null;
	
	public BaseDemoWebPage(WebDriver rDriver) {
		this.lDriver=rDriver;
	}
	
	// base locattors for all pages
	private By byLogo=By.xpath("//img[@alt='Tricentis Demo Web Shop']");
	private By bySearchStore=By.className(".search-box-text");
	private By bySearchBtn=By.xpath("//input[@type='submit']");
	
	private By bySubscriptInput=By.name("NewsletterEmail");
	private By bySubscribeBtn=By.className(".newsletter-subscribe-button");
	
	private By byPollRadioBtns=By.xpath("//label[contains(.,'Excellent')]//preceding-sibling::input");
	private By byPollRadioBtnsLabel=By.xpath("//label[contains(.,'Excellent')]");
	
	
	private By byFailedLinks=By.xpath("//a"); /// need to check failed links
	private By byHeaderMenuList=By.xpath("//div[@class='header-menu']//ul[@class='top-menu']/li/a");
	private By bySidePanalCategoriesList=By.xpath("//div[@class='block block-category-navigation']//div[@class='listbox']/ul[@class='list']/li/a");
	private By bySidePanalManufactureList=By.xpath("//div[@class='block block-manufacturer-navigation']//div[@class='listbox']/ul[@class='list']/li/a");
	
	
	private By byFooterInformationLinks=By.xpath("//div[@class='column information']//a");
	private By byFooterCustomerServiceLinks=By.xpath("//div[@class='column customer-service']//a");
	private By byFooterMyAccountLinks=By.xpath("//div[@class='column my-account']//a");
	private By byFooterFollowUsLinks=By.xpath("//div[@class='column follow-us']//a");
	
	
	private By byFooterInfoOne=By.className(".footer-poweredby");
	private By byFooterInfoTwo=By.className(".footer-disclaimer");
	
	public static WebDriver getWebDriver() {
		return lDriver;
	}
	
	
}
