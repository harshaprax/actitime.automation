package acti.utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import acti.driver.DriverManager;

public class Helper extends DriverManager{

	
	public static void fn_sleep( ) {
		
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		
		
	}
		
		public static  String captuescreen(WebDriver driver) {
 
	       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       String screenshotpath ="C:\\Users\\shobh\\git\\actitime.automation\\actireports\\screens\\act.png";
	       try {
				
	    	 
	    	   org.openqa.selenium.io.FileHandler.copy(src, new File(screenshotpath));
	    	  } catch (IOException e) {
				e.printStackTrace();
			}
			return screenshotpath;	
		}
				
			
			
		}
	
			
			
	

	
	
	

