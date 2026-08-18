package utilities;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages.BaseDemoWebPage;

public class Utility {
	
	
	/*
	public static void sleep() {
		try {Thread.sleep(Duration.ofSeconds());	} catch (InterruptedException e) {e.printStackTrace();	}
	}
	*/
	public static void click(WebElement element) {
		new Actions(BaseDemoWebPage.getWebDriver()).moveToElement(element).click().build().perform();
		
	}
	
	public static void sendKeys(WebElement element, String text) {
		new Actions(BaseDemoWebPage.getWebDriver()).sendKeys(element, text).build().perform();
	}

}
