package extentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyListener implements ITestListener{

	public ExtentSparkReporter exSparkReporter;
	public ExtentReports exReport;
	public ExtentTest exTest;
	
	
	@Override
	public void onStart(ITestContext iContext) {
		exSparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/MyExtentReports/myExtentReport.html");
		exSparkReporter.config().setTheme(Theme.DARK);
		exSparkReporter.config().setDocumentTitle("Automation Report");
		exSparkReporter.config().setReportName("Regression");
		
		
		exReport=new ExtentReports();
		exReport.attachReporter(exSparkReporter);
		exReport.setSystemInfo("Computer Name", "Localhost");
		exReport.setSystemInfo("Environment", "QA");
		exReport.setSystemInfo("Tester", "venkat.kondu@test.com");
		exReport.setSystemInfo("Browser Name", "Chrome");
	}
	
	
	@Override
	public void onFinish(ITestContext iContext) {
		exReport.flush();
	//	exReport.
	}
	
	@Override
	public void onTestStart(ITestResult iResult) {
		String className=iResult.getTestClass().getRealClass().getName();
		String testName=className+"_:_"+iResult.getName();
		exTest=exReport.createTest(testName);
	}
	
	
	@Override
	public void onTestSuccess(ITestResult iResult) {
		exTest.log(Status.PASS,iResult.getName()+" : Test_Case Is Passed");
	}

	
	@Override
	public void onTestSkipped(ITestResult iResult) {
		exTest.log(Status.SKIP, iResult.getName()+" : Test_Case Is Skipped");
		
	}
	
	@Override
	public void onTestFailure(ITestResult iResult) {
		exTest.log(Status.FAIL, iResult.getName()+" : Test_Case Is Failed");
		exTest.log(Status.FAIL, "Test Case Failed Cause is  :--: "+ iResult.getThrowable());
		
	}
	

	
	
}
