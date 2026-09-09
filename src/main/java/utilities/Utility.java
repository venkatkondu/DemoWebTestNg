package utilities;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages.BaseDemoWebPage;

public class Utility {
	
	
	
	public static void sleep(int seconds) {
		try {	Thread.sleep(Duration.ofSeconds(seconds));		} catch (InterruptedException e) {	e.printStackTrace();		}
	}
	
	public static void click(WebElement element) {
		new Actions(BaseDemoWebPage.getWebDriver()).moveToElement(element).click().build().perform();
	}
	
	public static void sendKeys(WebElement element, String text) {
		new Actions(BaseDemoWebPage.getWebDriver()).sendKeys(element, text).build().perform();
	}
	
	public static List<String> getList_Of_Texts(By byLocator) {
		List<String> list=new ArrayList<String>();
		List<WebElement> webList=BaseDemoWebPage.getWebDriver().findElements(byLocator);
		for(WebElement element:webList) {
			new Actions(BaseDemoWebPage.getWebDriver()).moveToElement(element).build().perform();
			Utility.sleep(1);
			list.add(element.getText());
		}
		return list;
	}
	
	public static void clickOn_Link_Text(String text, By byLocator) {
		List<WebElement> webList=BaseDemoWebPage.getWebDriver().findElements(byLocator);
		for(WebElement element:webList) {
			new Actions(BaseDemoWebPage.getWebDriver()).moveToElement(element).build().perform();
			Utility.sleep(1);
			String eleText=element.getText();
			if(eleText.equalsIgnoreCase(text)) {
				click(element);
				break;
			}
		}
	}
	
	public static void takeScreenshotFile(String screenshotName) {
		TakesScreenshot takesScreenshot=(TakesScreenshot)BaseDemoWebPage.getWebDriver();
		File source=takesScreenshot.getScreenshotAs(OutputType.BASE64.FILE);
		
		File destFile=new File("./Screenshot"+screenshotName); // This one need to look into it later
//		FileHandler
	//	FileUtils.copy(source,destFile);  //copy(source,destFile);
		
	}
	
	
	// To Attach Screenshot to the Extent HTML reports directly
	public static String takeScreenshotBase64(String scrName) {
		
		TakesScreenshot takesScreenshot=(TakesScreenshot)BaseDemoWebPage.getWebDriver();
		String screenshot=takesScreenshot.getScreenshotAs(OutputType.BASE64);
		return screenshot;
	}

}
