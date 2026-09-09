package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import extentReports.MyListener;
import pages.BaseDemoWebPage;
import pages.HomePage;
import pages.IndexPage;
import pages.LoginRegiPage;

@Listeners(MyListener.class)
public class BaseDemoWebTest {
	
	protected BaseDemoWebPage baseWebPage=null;
	protected IndexPage indexPage=null;
	protected LoginRegiPage loginRegiPage=null;	
	protected HomePage homePage=null;
	@BeforeSuite
	public void beforeSuite() {
		
	}
	
	@AfterSuite
	public void afterSuite() {
	//	BaseDemoWebPage.getWebDriver().quit();
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
	
	
	@BeforeMethod
	public synchronized void beforeMethod() { //will pass browser name later
		// Open browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/"); // need to pass the URL of the application
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		indexPage=new IndexPage(driver);
	}
	
	@AfterMethod
	public synchronized void afterMethod(){
	// Close browser
		if(BaseDemoWebPage.getWebDriver()!=null) {
				BaseDemoWebPage.getWebDriver().quit(); // we can close all thee browser and windows what opened during the test case running
		}
	}
	
}
