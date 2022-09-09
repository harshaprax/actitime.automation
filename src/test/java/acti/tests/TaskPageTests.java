package acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskPageTests extends BaseTest{
  
	@Test(priority=1)
	public void testCreateCustomer() {
		logger=report.createTest("Test new Customer Test");
	    lp.enterUsername("admin");
	    logger.info("entered username");
		lp.enterPassword("manager");
		logger.info("entered password");
		lp.clickLogin();
		logger.info("clicked login button");
		String expected = "John Doe";
		String actual = ep.validateUserLoggedIn();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		logger.pass("login is succesful");
		ep.clickTask();
		logger.info("clicked task menu");
		tp.clickAddNew();
		logger.info("clicked add new button");
		tp.clickAddCustomer();
		logger.info("clicked item new customer");
		tp.enterCustomerName("Testcustomer1");
		logger.info("entered customer name");
		tp.enterCustomerDescription("This Customer created for Testing Purpose");
		logger.info("entered customer description");
		tp.clickCreateCutsomer();
		logger.info("create customer button");
		String message = tp.getSuccessMessage();
	    Assert.assertTrue(message.contains("has been created"));
        logger.pass("customer created succesfully");
	    ep.clicklogout();
        logger.info("clicked logout link");
	}
	
	@Test(priority=2)
	public void testDeleteCustomer() {
		
		logger=report.createTest("Test Delete customer Test");
		lp.enterUsername("admin");
		  logger.info("entered username");
		lp.enterPassword("manager");
		logger.info("entered password");
		lp.clickLogin();
		logger.info("clicked login button");
		String expected = "John Doe";
		String actual = ep.validateUserLoggedIn();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		logger.pass("login is succesful");
		ep.clickTask();
		logger.info("clicked task menu");
		tp.enterCustomerType("Testcustomer1");
		logger.info("entered the customer name created");
		tp.clickSearchedCustomer();
		logger.info("clicked on searcehd customer item");
		tp.clickEditButton();
		logger.info("clicked on edit Button");
		tp.clickAction();
		logger.info("clicked on action Button");
		tp.clickDelete();
		logger.info("clicked on delete Button");
		tp.clickDeletePermanently();
		logger.info("clicked on delete permanently Button");
		String message =tp.getSuccessMessage();
	    Assert.assertTrue(message.contains("has been deleted"));
	    logger.pass("customer deleted succesfully");
		ep.clicklogout();
		logger.info("clicked logout link");
	}
	
}
