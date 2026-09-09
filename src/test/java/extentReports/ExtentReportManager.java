package extentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	private static ExtentReports extentReport;
	
	public static void setUpExtentReport(String fileName) {
		ExtentSparkReporter exReporter=new ExtentSparkReporter("./ExtentReports/Report.html");
	
		extentReport=new ExtentReports();
		
	}
	
	public static void createTest(String testName) {
		extentReport.createTest(testName);
	}
	
	
}
