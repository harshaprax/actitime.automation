package acti.driver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class DriverManager {

   public static WebDriver driver;
	Properties prop;

	public DriverManager() {

		try {
			File file = new File("./src/test/resources/acti/config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
			System.out.println("unable to laod properties file..please check" + e.getMessage());
		}

	}


    public void init_driver()  {
		String browser = prop.getProperty("browser");

		if (browser.trim().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/acti/browser/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.trim().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/acti/browser/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.trim().equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./src/test/resources/acti/browser/msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.err.println("please check the properties file for supported browser types");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://demo.actitime.com/login.do");
		get_url();
	
	
	}

	public void get_url() {
		String url = prop.getProperty("url");
		driver.get(url);

	}
   
	public static void quit_browser()
	{
	driver.close();
	}
}

