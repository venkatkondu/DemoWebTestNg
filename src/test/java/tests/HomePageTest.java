package tests;

import java.util.List;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.BaseDemoWebPage;

public class HomePageTest extends BaseDemoWebTest {

	/*
	
	@Test(priority=1)
	public void shoppingCart() {
	SoftAssert sAssert=new SoftAssert();
		
	sAssert.assertAll();
	}
	
	@Test(priority=2)
	public void wishList() {
	SoftAssert sAssert=new SoftAssert();
		
	sAssert.assertAll();
	}
	
	@Test(priority=3)
	public void headerList() {
	SoftAssert sAssert=new SoftAssert();
		
	sAssert.assertAll();	
	}
	
	
	@Test(priority=4)
	public void categoryList() {
	SoftAssert sAssert=new SoftAssert();
		
	sAssert.assertAll();	
	}
	
**/
	
	@Test(priority=3)
	public void homePage_MenuList(){
		SoftAssert sAssert=new SoftAssert();

		loginRegiPage=indexPage.clickOn_LogIn_Link();
		
		loginRegiPage.emailInput("venkat.kondu@domain.test");
		loginRegiPage.passwordInput("Tosca1234!");
		homePage=loginRegiPage.clickOn_LogIn_Btn(); // it should create the HomePage object
		
		String actUserName=homePage.getUserName();
		sAssert.assertEquals(actUserName,"venkat.kondu@domain.test", "Home Page : User Nameis not Matching : ");
		
		List<String> headerMenuList=homePage.headerMenu();
		System.out.println(headerMenuList);
		homePage.clickOn_Logout(); // it is going to index page
		
		String actURL=BaseDemoWebPage.getWebDriver().getCurrentUrl();
		String actTitle=BaseDemoWebPage.getWebDriver().getTitle();
		System.out.println("Title : " +actTitle);
		System.out.println("URL : " +actURL);
		sAssert.assertEquals(actURL, "https://demowebshop.tricentis.com/",  "Index Page : URL is not Matching : ");
		sAssert.assertEquals(actTitle,"Demo Web Shop", "Index Page : Title of the page is not Matching : ");
		
		
		// I need to assert any failed login thing here
		sAssert.assertAll();
	
	
	}
	
	@Test(priority=4)
	public void homePage_CategoryList() {
		SoftAssert sAssert=new SoftAssert();

		loginRegiPage=indexPage.clickOn_LogIn_Link();
		
		loginRegiPage.emailInput("venkat.kondu@domain.test");
		loginRegiPage.passwordInput("Tosca1234!");
		homePage=loginRegiPage.clickOn_LogIn_Btn(); // it should create the HomePage object
		
		String actUserName=homePage.getUserName();
		sAssert.assertEquals(actUserName,"venkat.kondu@domain.test", "Home Page : User Nameis not Matching : ");

		List<String> categoryList=homePage.categoryList_Texts();
		System.out.println(categoryList); //  how can we assert list of web list texts
		
		homePage.clickOn_Logout(); // it is going to index page
		
		String actURL=BaseDemoWebPage.getWebDriver().getCurrentUrl();
		String actTitle=BaseDemoWebPage.getWebDriver().getTitle();
		System.out.println("Title : " +actTitle);
		System.out.println("URL : " +actURL);
		sAssert.assertEquals(actURL, "https://demowebshop.tricentis.com/",  "Index Page : URL is not Matching : ");
		sAssert.assertEquals(actTitle,"Demo Web Shop", "Index Page : Title of the page is not Matching : ");
		
		
		// I need to assert any failed login thing here
		sAssert.assertAll();
	
	}
	
/*	
	@Test(priority=5)
	public void homePage_InformationList() {
		
		SoftAssert sAssert=new SoftAssert();

		loginRegiPage=indexPage.clickOn_LogIn_Link();
		
		loginRegiPage.emailInput("venkat.kondu@domain.test");
		loginRegiPage.passwordInput("Tosca1234!");
		homePage=loginRegiPage.clickOn_LogIn_Btn(); // it should create the HomePage object
		
		String actUserName=homePage.getUserName();
		sAssert.assertEquals(actUserName,"venkat.kondu@domain.test", "Home Page : User Nameis not Matching : ");


		List<String> informationList=homePage.footer_Information_List_Texts();
		System.out.println(informationList);
		
		homePage.clickOn_Logout(); // it is going to index page
		
		String actURL=BaseDemoWebPage.getWebDriver().getCurrentUrl();
		String actTitle=BaseDemoWebPage.getWebDriver().getTitle();
		System.out.println("Title : " +actTitle);
		System.out.println("URL : " +actURL);
		sAssert.assertEquals(actURL, "https://demowebshop.tricentis.com/",  "Index Page : URL is not Matching : ");
		sAssert.assertEquals(actTitle,"Demo Web Shop", "Index Page : Title of the page is not Matching : ");
		
		
		// I need to assert any failed login thing here
		sAssert.assertAll();
	
		
	}
	
	@Test(priority=6)
	public void homePage_MyAccountList() {
		SoftAssert sAssert=new SoftAssert();

		loginRegiPage=indexPage.clickOn_LogIn_Link();
		
		loginRegiPage.emailInput("venkat.kondu@domain.test");
		loginRegiPage.passwordInput("Tosca1234!");
		homePage=loginRegiPage.clickOn_LogIn_Btn(); // it should create the HomePage object
		
		String actUserName=homePage.getUserName();
		sAssert.assertEquals(actUserName,"venkat.kondu@domain.test", "Home Page : User Nameis not Matching : ");

		List<String> myAccount=homePage.footer_MyAccount_List_Texts();
		System.out.println(myAccount);
		
		homePage.clickOn_Logout(); // it is going to index page
		
		String actURL=BaseDemoWebPage.getWebDriver().getCurrentUrl();
		String actTitle=BaseDemoWebPage.getWebDriver().getTitle();
		System.out.println("Title : " +actTitle);
		System.out.println("URL : " +actURL);
		sAssert.assertEquals(actURL, "https://demowebshop.tricentis.com/",  "Index Page : URL is not Matching : ");
		sAssert.assertEquals(actTitle,"Demo Web Shop", "Index Page : Title of the page is not Matching : ");
		
		
		// I need to assert any failed login thing here
		sAssert.assertAll();
	
		
	}
	
	@Test(priority=7)
	public void homePage_CustomerServiceList() {
		SoftAssert sAssert=new SoftAssert();

		loginRegiPage=indexPage.clickOn_LogIn_Link();
		
		loginRegiPage.emailInput("venkat.kondu@domain.test");
		loginRegiPage.passwordInput("Tosca1234!");
		homePage=loginRegiPage.clickOn_LogIn_Btn(); // it should create the HomePage object
		
		String actUserName=homePage.getUserName();
		sAssert.assertEquals(actUserName,"venkat.kondu@domain.test", "Home Page : User Nameis not Matching : ");
		
		List<String> customerService=homePage.footer_Customer_List_Texts();
		System.out.println(customerService);
		
		homePage.clickOn_Logout(); // it is going to index page
		
		String actURL=BaseDemoWebPage.getWebDriver().getCurrentUrl();
		String actTitle=BaseDemoWebPage.getWebDriver().getTitle();
		System.out.println("Title : " +actTitle);
		System.out.println("URL : " +actURL);
		sAssert.assertEquals(actURL, "https://demowebshop.tricentis.com/",  "Index Page : URL is not Matching : ");
		sAssert.assertEquals(actTitle,"Demo Web Shop", "Index Page : Title of the page is not Matching : ");
		
		
		// I need to assert any failed login thing here
		sAssert.assertAll();
	
	}

	@Test(priority=8)
	public void homePage_FollowUs_List() {
		SoftAssert sAssert=new SoftAssert();

		loginRegiPage=indexPage.clickOn_LogIn_Link();
		
		loginRegiPage.emailInput("venkat.kondu@domain.test");
		loginRegiPage.passwordInput("Tosca1234!");
		homePage=loginRegiPage.clickOn_LogIn_Btn(); // it should create the HomePage object
		
		String actUserName=homePage.getUserName();
		sAssert.assertEquals(actUserName,"venkat.kondu@domain.test", "Home Page : User Nameis not Matching : ");


		List<String> followUs=homePage.footer_FollowUs_List_Text();
		System.out.println(followUs);
		
		homePage.clickOn_Logout(); // it is going to index page
		
		String actURL=BaseDemoWebPage.getWebDriver().getCurrentUrl();
		String actTitle=BaseDemoWebPage.getWebDriver().getTitle();
		System.out.println("Title : " +actTitle);
		System.out.println("URL : " +actURL);
		sAssert.assertEquals(actURL, "https://demowebshop.tricentis.com/",  "Index Page : URL is not Matching : ");
		sAssert.assertEquals(actTitle,"Demo Web Shop", "Index Page : Title of the page is not Matching : ");
		
		
		// I need to assert any failed login thing here
		sAssert.assertAll();
		

	}
*/
}
