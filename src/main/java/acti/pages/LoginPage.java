package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;

/*
 * Name : LoginPage
 * Developed By : Ajith
 * Approved By : Rekha 
 * Last Modified Date : 8/26/2022
 * Description : Login Page Elements and its Methods
 */

public class LoginPage extends DriverManager {

//************************************Page Elements**********************************************//		
	@FindBy(id ="username") WebElement textboxUsername;
	@FindBy(name ="pwd") WebElement textboxPassword;
	@FindBy(xpath ="//div[normalize-space()='Login']") WebElement buttonLogin;
	@FindBy(xpath="//a[@id='toPasswordRecoveryPageLink']") WebElement linkForgotPassword;
	@FindBy(xpath ="//div[@class='atLogoImg']") WebElement imgActiLogo;
	
	
//************************************Page Inititaion**********************************************//		
		
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

//************************************Page Actions**********************************************//		
		
	public void enterUsername(String username) {
		textboxUsername.sendKeys(username);;
	}

	public void enterPassword(String password) {
		textboxPassword.sendKeys(password);
	}

	public void clickLogin() {
		buttonLogin.click();
	}

	public boolean validateForgotPasswordLink() {
		return linkForgotPassword.isDisplayed();
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateActiImg() {
		return imgActiLogo.isDisplayed();
	}

}
