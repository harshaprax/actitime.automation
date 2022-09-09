package acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import acti.pages.EnterPage;

public class LoginTestScreen extends BaseTest{

	@Test(priority = 4,dataProvider = "actidata1")
	public void testLoginFunction(String username, String password)
	{
		logger=report.createTest("test login function");
		lp.enterUsername(username);
		logger.pass("entered username");
		lp.enterPassword(password);
		logger.info("entered password");
		lp.clickLogin();
		logger.info("clicked login button");
		ep = new EnterPage();
		String actual ="John";
		String expected = ep.validateUserLoggedIn();
		Assert.assertEquals(actual, expected);
		logger.pass("logged in successfully");
		ep.clicklogout();
		logger.info("clicked logout");
	}
}
