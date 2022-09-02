package acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskPageTests extends BaseTest{
  
	@Test(priority=1)
	public void testCreateCustomer() {
		
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLogin();
		String expected = "John Doe";
		String actual = ep.validateUserLoggedIn();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		ep.clickTask();
		tp.clickAddNew();
		tp.clickAddCustomer();
		tp.enterCustomerName("Testcustomer1");
		tp.enterCustomerDescription("This Customer created for Testing Purpose");
		tp.clickCreateCutsomer();
		String message = tp.getSuccessMessage();
	    Assert.assertTrue(message.contains("has been created"));
        ep.clicklogout();
	}
	
	@Test(priority=2)
	public void testDeleteCustomer() {
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLogin();
		String expected = "John Doe";
		String actual = ep.validateUserLoggedIn();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		ep.clickTask();
		tp.enterCustomerType("Testcustomer1");
		tp.clickSearchedCustomer();
		tp.clickEditButton();
		tp.clickAction();
		tp.clickDelete();
		tp.clickDeletePermanently();
		String message =tp.getSuccessMessage();
	    Assert.assertTrue(message.contains("has been deleted"));
		ep.clicklogout();
	}
	
}
