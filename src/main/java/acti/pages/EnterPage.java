package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;

public class EnterPage extends DriverManager{
	
	@FindBy(id="logoutLink") WebElement linkLogout;
	@FindBy(xpath=("//a[contains(text(),'John')]")) WebElement textUserLogged;
	//@FindBy(xpath=("//a[@class='UserProfileLink username']")) WebElement textUserLogged;
	
	public EnterPage( ) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clicklogout() {
		linkLogout.click();
	}
	
	public  String validateUserLoggedIn() {
		return textUserLogged.getText();
	}

}
