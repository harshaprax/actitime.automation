package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;
/*
 * Name : Enter Time Page
 * Developed By : Shobha
 * Approved By : Rekha 
 * Last Modified Date : 8/26/2022
 * Description : Enter Page Elements and its Methods
 */

public class EnterPage extends DriverManager{

//************************************Page Elements**********************************************//	
	
	@FindBy(id="logoutLink") WebElement linkLogout;
	@FindBy(xpath=("//a[contains(text(),'John')]")) WebElement textUserLogged;
	//@FindBy(xpath=("//a[@class='UserProfileLink username']")) WebElement textUserLogged;
	@FindBy(xpath ="//a[@class='content tasks']") WebElement menuTask;

	
//************************************Page Inititaion**********************************************//			
	public EnterPage( ) {
		PageFactory.initElements(driver, this);
		
	}

//************************************Page Actions**********************************************//	
	public void clickTask() {
		menuTask.click();
	}
	
	public void clicklogout() {
		linkLogout.click();
	}
	
	public  String validateUserLoggedIn() {
		return textUserLogged.getText();
	}

}
