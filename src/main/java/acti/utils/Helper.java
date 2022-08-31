package acti.utils;

import acti.driver.DriverManager;

public class Helper extends DriverManager{

	
	public void fn_sleep( ) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
