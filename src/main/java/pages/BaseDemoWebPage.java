package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utility;

public class BaseDemoWebPage {
	
	protected static  WebDriver lDriver=null;
	
	public BaseDemoWebPage(WebDriver rDriver) {
		this.lDriver=rDriver;
	}
	
	// base locattors for all pages
	protected By byLogo=By.xpath("//img[@alt='Tricentis Demo Web Shop']");
	protected By bySearchStore=By.className(".search-box-text");
	protected By bySearchBtn=By.xpath("//input[@type='submit']");
	
	protected By bySubscriptInput=By.name("NewsletterEmail");
	protected By bySubscribeBtn=By.className(".newsletter-subscribe-button");
	
	protected By byPollRadioBtns=By.xpath("//label[contains(.,'Excellent')]//preceding-sibling::input");
	protected By byPollRadioBtnsLabel=By.xpath("//label[contains(.,'Excellent')]");
	
	
	protected By byFailedLinks=By.xpath("//a"); /// need to check failed links
	protected By byHeaderMenuList=By.xpath("//div[@class='header-menu']//ul[@class='top-menu']/li/a");
	protected By bySidePanalCategoriesList=By.xpath("//div[@class='block block-category-navigation']//div[@class='listbox']/ul[@class='list']/li/a");
	protected By bySidePanalManufactureList=By.xpath("//div[@class='block block-manufacturer-navigation']//div[@class='listbox']/ul[@class='list']/li/a");
	
	
	protected By byFooterInformationLinks=By.xpath("//div[@class='column information']//a");
	protected By byFooterCustomerServiceLinks=By.xpath("//div[@class='column customer-service']//a");
	protected By byFooterMyAccountLinks=By.xpath("//div[@class='column my-account']//a");
	protected By byFooterFollowUsLinks=By.xpath("//div[@class='column follow-us']//a");
	
	
	protected By byFooterInfoOne=By.className(".footer-poweredby");
	protected By byFooterInfoTwo=By.className(".footer-disclaimer");
	
	public static WebDriver getWebDriver() {
		return lDriver;
	}
	
	
	public List<String> headerMenu(){
		
		return Utility.getList_Of_Texts(byHeaderMenuList);
	}
	
	public List<String> categoryList_Texts(){
		return Utility.getList_Of_Texts(bySidePanalCategoriesList);
	}

	public List<String> manufactures_List_Texts(){
		return Utility.getList_Of_Texts(bySidePanalManufactureList);
	}

	
	public List<String> footer_Information_List_Texts(){
		return Utility.getList_Of_Texts(byFooterInformationLinks);
	}
	
	public List<String> footer_Customer_List_Texts(){
		return Utility.getList_Of_Texts(byFooterCustomerServiceLinks);
	}
	public List<String> footer_MyAccount_List_Texts(){
		return Utility.getList_Of_Texts(byFooterMyAccountLinks);
	}
	
	public List<String> footer_FollowUs_List_Text(){
		return Utility.getList_Of_Texts(byFooterFollowUsLinks);
	}

	
}
