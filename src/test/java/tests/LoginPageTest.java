package tests;

import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.BaseDemoWebPage;
import utilities.Utility;

public class LoginPageTest extends BaseDemoWebTest {
	// Data Provider concept 
	
	@DataProvider(name="Failed Credentials")
	public Object[][] getFailedCredentials(){
		
		return new Object[][] {
			{"Test@One","Password_1"},
			{"Test@Two","Password_2"},
			{"Test@Three","Password_3"},
			{"Test@Four","Password_4"},
		};
	}
	
	@Test(priority=1, dataProvider="Failed Credentials")
	public synchronized void failed_LogIn_Test(String userName, String password) {
		System.out.println("User Login Failed Test ");

		SoftAssert sAssert=new SoftAssert();
		loginRegiPage=indexPage.clickOn_LogIn_Link();
		
		loginRegiPage.emailInput(userName);
		loginRegiPage.passwordInput(password);
		loginRegiPage.clickOn_LogIn_Btn();
		
		Utility.sleep(3);		
		
		String error_Label_1=loginRegiPage.getLogin_Failed_Error_Label_1();
		String error_Label_2=loginRegiPage.getLogin_Failed_Error_Label_2();
		
		System.out.println("Failed Login Error_Label_One : " + error_Label_1);
		System.out.println("Failed Login Error_Label_One : " + error_Label_2);
		
		sAssert.assertEquals(error_Label_1, "Login was unsuccessful. Please correct the errors and try again.",  "Login Failed Error Label_1 : ");
		sAssert.assertEquals(error_Label_2, "No customer account found",  "Login Failed Error Label_2 : ");

		// need to get the Title of the page
		
		String actURL=BaseDemoWebPage.getWebDriver().getCurrentUrl();
		String actTitle=BaseDemoWebPage.getWebDriver().getTitle();
		System.out.println("Title : " +actTitle);
		System.out.println("URL : " +actURL);
	
		sAssert.assertEquals(actURL, "https://demowebshop.tricentis.com/login",  "Login Page : URL is not Matching : ");
		sAssert.assertEquals(actTitle,"Demo Web Shop. Login", "Login Page : Title of the page is not Matching : ");
	
		// I need to assert any failed login thing here
		sAssert.assertAll();
		System.out.println(" -----------------  User Login Failed Test ----------------------------------");

	}
	
	@Test(priority=2)
	public synchronized void success_Login_Test() {
		SoftAssert sAssert=new SoftAssert();
		System.out.println("User Login Success Test ");

		loginRegiPage=indexPage.clickOn_LogIn_Link();
		
		loginRegiPage.emailInput("venkat.kondu@domain.test");
		loginRegiPage.passwordInput("Tosca1234!");
		homePage=loginRegiPage.clickOn_LogIn_Btn(); // it should create the HomePage object
		
		String actUserName=homePage.getUserName();
		sAssert.assertEquals(actUserName,"venkat.kondu@domain.test", "Home Page : User Nameis not Matching : ");
		homePage.clickOn_Logout(); // it is going to index page
		
		String actURL=BaseDemoWebPage.getWebDriver().getCurrentUrl();
		String actTitle=BaseDemoWebPage.getWebDriver().getTitle();
		System.out.println("Title : " +actTitle);
		System.out.println("URL : " +actURL);
		sAssert.assertEquals(actURL, "https://demowebshop.tricentis.com/",  "Index Page : URL is not Matching : ");
		sAssert.assertEquals(actTitle,"Demo Web Shop", "Index Page : Title of the page is not Matching : ");
	
		// I need to assert any failed login thing here
		sAssert.assertAll();
		
		System.out.println(" ----------------- User Login Success Test ----------------------------------");

		// I need to see the Home page over here
	}
	
	/*

	@Test(priority=3)
	public void loginPage_MenuList(){
		SoftAssert sAssert=new SoftAssert();
		loginRegiPage=indexPage.clickOn_LogIn_Link();

		List<String> headerMenuList=loginRegiPage.headerMenu();
		System.out.println(headerMenuList);
		sAssert.assertAll();
	}
	
	@Test(priority=4)
	public void loginPage_CategoryList() {
		SoftAssert sAssert=new SoftAssert();
		loginRegiPage=indexPage.clickOn_LogIn_Link();

		List<String> categoryList=loginRegiPage.categoryList_Texts();
		System.out.println(categoryList); //  how can we assert list of web list texts
		sAssert.assertAll();
	}
	
	@Test(priority=5)
	public void loginPage_InformationList() {
		loginRegiPage=indexPage.clickOn_LogIn_Link();

		List<String> informationList=loginRegiPage.footer_Information_List_Texts();
		System.out.println(informationList);
	}
	
	@Test(priority=6)
	public void loginPage_MyAccountList() {
		loginRegiPage=indexPage.clickOn_LogIn_Link();

		List<String> myAccount=loginRegiPage.footer_MyAccount_List_Texts();
		System.out.println(myAccount);
	}
	
	@Test(priority=7)
	public void loginPage_CustomerServiceList() {
		loginRegiPage=indexPage.clickOn_LogIn_Link();

		List<String> customerService=loginRegiPage.footer_Customer_List_Texts();
		System.out.println(customerService);
	}

	@Test(priority=8)
	public void loginPage_FollowUs_List() {
		loginRegiPage=indexPage.clickOn_LogIn_Link();

		List<String> followUs=loginRegiPage.footer_FollowUs_List_Text();
		System.out.println(followUs);
	}
	
	*/
	
	
}
