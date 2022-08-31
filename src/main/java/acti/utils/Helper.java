package acti.utils;

public class Helper {

	
	public void fn_sleep( ) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
