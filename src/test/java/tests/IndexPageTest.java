package tests;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.BaseDemoWebPage;

public class IndexPageTest extends BaseDemoWebTest {
	
	
	
	@Test(priority=0)
	public synchronized void indexPage_URL() {
	SoftAssert sAssert=new SoftAssert();
	String actURL=BaseDemoWebPage.getWebDriver().getCurrentUrl();
	System.out.println("URL : " +actURL);
	sAssert.assertEquals(actURL, "https://demowebshop.tricentis.com/",  "Index Page : URL is not Matching : ");

	sAssert.assertAll();
	System.out.println(" --------------------------------------");

	}
	
	@Test(priority=1)
	public synchronized void indexPage_Title() {
		
		SoftAssert sAssert=new SoftAssert();
		String actTitle=BaseDemoWebPage.getWebDriver().getTitle();
		System.out.println("Title : " +actTitle);
		sAssert.assertEquals(actTitle,"Demo Web Shop", "Index Page : Title of the page is not Matching : ");
		sAssert.assertAll();
		System.out.println(" --------------------------------------");

	}

	/*
	@Test(priority=3)
	public void indexPage_MenuList(){
		SoftAssert sAssert=new SoftAssert();
		List<String> headerMenuList=indexPage.headerMenu();
		System.out.println(headerMenuList);
		sAssert.assertAll();
	}
	
	@Test(priority=4)
	public void indexPage_CategoryList() {
		SoftAssert sAssert=new SoftAssert();
		List<String> categoryList=indexPage.categoryList_Texts();
		System.out.println(categoryList); //  how can we assert list of web list texts
		sAssert.assertAll();
		
	}
	
	@Test(priority=5)
	public void indexPage_InformationList() {
		List<String> informationList=indexPage.footer_Information_List_Texts();
		System.out.println(informationList);
	}
	
	@Test(priority=6)
	public void indexPage_MyAccountList() {
		List<String> myAccount=indexPage.footer_MyAccount_List_Texts();
		System.out.println(myAccount);
	}
	
	@Test(priority=7)
	public void indexPage_CustomerServiceList() {
		List<String> customerService=indexPage.footer_Customer_List_Texts();
		System.out.println(customerService);
	}

	@Test(priority=8)
	public void indexPage_FollowUs_List() {
		List<String> followUs=indexPage.footer_FollowUs_List_Text();
		System.out.println(followUs);
	}
	
	*/
	

}
