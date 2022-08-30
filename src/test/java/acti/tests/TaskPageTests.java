package acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskPageTests extends BaseTest{
  
	@Test
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
		tp.enterCustomerName("Test5Customer");
		tp.enterCustomerDescription("This Customer created for Testing Purpose");
		tp.clickCreateCutsomer();
		//String message = tp.getSuccessMessage();
	//	Assert.assertFalse(message.contains("has been Created"));
		//Assert.assertTrue(message.contains("has been Created"));
        ep.clicklogout();
	}
	
}
