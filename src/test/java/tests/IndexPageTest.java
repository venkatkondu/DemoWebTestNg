package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BaseDemoWebPage;
import pages.IndexPage;

public class IndexPageTest extends BaseDemoWebTest {
	
	@BeforeMethod
	public void beforeMethod() { //will pass browser name later
		// Open browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/"); // need to pass the URL of the application
		driver.manage().window().maximize();
		indexPage=new IndexPage(driver);
	}
	
	@AfterMethod
	public void afterMethod(){
	// Close browser
	BaseDemoWebPage.getWebDriver().close();
	}
	
	@Test(priority=0)
	public void urlTest() {
		
	String url=	BaseDemoWebPage.getWebDriver().getCurrentUrl();
	
	System.out.println("URL : " +url);
	
	}

}
