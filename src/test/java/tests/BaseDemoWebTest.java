package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pages.BaseDemoWebPage;
import pages.IndexPage;
import pages.LoginRegiPage;

public class BaseDemoWebTest {
	
	protected BaseDemoWebPage baseWebPage=null;
	protected IndexPage indexPage=null;
	protected LoginRegiPage loginRegiPage=null;	
	
	@BeforeSuite
	public void beforeSuite() {
		
	}
	
	@AfterSuite
	public void afterSuite() {
		
	}

	@BeforeTest
	public void beforeTest() {
		
	}
	
	@AfterTest
	public void afterTest() {
		
	}
	
	
	@BeforeClass
	public void beforeClass() {
		
	}
	
	
	@AfterClass
	public void afterClass() {
		
	}
}
