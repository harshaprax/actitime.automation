package acti.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import acti.driver.DriverManager;
import acti.pages.EnterPage;
import acti.pages.LoginPage;


public class BaseTest extends DriverManager{
	
	LoginPage lp;
	EnterPage ep;

	@BeforeMethod
	public void setUp( ) 
	{
		init_driver();
	    lp = new LoginPage();
		 ep = new EnterPage();

	}
	

	@AfterMethod
	public void tearDown() 
	{
		quit_browser();
	}
}
