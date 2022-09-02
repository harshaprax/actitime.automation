package acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import acti.pages.EnterPage;
import acti.pages.LoginPage;



public class LoginPageTests extends BaseTest {
	

	@Test(priority = 1,enabled=false)
	public void testLoginPageTitle() {
	 lp = new LoginPage(); 
		String actual = "actiTIME - Login";
		String expected = lp.validateLoginPageTitle();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
	}
	
	
	
	@Test(priority=2,enabled=false)
	public void testForgotPasswordLink() {
		
		boolean flag =lp.validateForgotPasswordLink();
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3,enabled=false)
	public void testActiLogoIsDisplayed() {
	boolean flag = lp.validateActiImg();
	System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 4,dataProvider = "actidata1")
	public void testLoginFunction(String username,String password) {
      
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickLogin();
		 ep = new EnterPage();
		String actual ="John Doe";
		String expected = ep.validateUserLoggedIn();		
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		 ep.clicklogout();
	}
	
	
}
