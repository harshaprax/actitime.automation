package acti.tests;


import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import acti.driver.DriverManager;
import acti.pages.EnterPage;
import acti.pages.LoginPage;
import acti.pages.TaskPage;
import acti.utils.ExcelLib;
import acti.utils.Helper;


public class BaseTest extends DriverManager{
	protected static ExtentReports report;
	protected static ExtentTest logger;
	LoginPage lp;
	EnterPage ep;
	TaskPage tp;
	
	@BeforeSuite
	public void setupReport() {
		ExtentHtmlReporter extent = new ExtentHtmlReporter("./actireports/index.html");
		report=new ExtentReports();
		report.attachReporter(extent);		
	}
	@BeforeMethod
	public void setUp( ) 
	{
		init_driver();
	    lp = new LoginPage();
		 ep = new EnterPage();
         tp = new TaskPage();
	}
	

	@AfterMethod
	public void tearDown(ITestResult result) {
			
			if(result.getStatus()==ITestResult.FAILURE)
			{
				try {
					logger.fail("test failed",
							MediaEntityBuilder.createScreenCaptureFromPath(Helper.captuescreen(driver)).build());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			report.flush();
			Helper.fn_sleep();
			quit_browser();
		}
	
	
	@DataProvider(name="actidata1")
	public Object[][] testData()
	{
		ExcelLib xl = new ExcelLib("./src/test/resources/acti/testdata/actidata1.xlsx");
		int rows = xl.getRowCount(0);
		Object data[][] = new Object[rows][2];
		
		for(int i=0; i<rows;i++)
		{
			data[i][0]=xl.getCellData(0, i, 0);
			data[i][1]=xl.getCellData(0, i, 1);
		}
		
		return data;
	}
}
