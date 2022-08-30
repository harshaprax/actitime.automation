package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;

public class TaskPage extends DriverManager{

	@FindBy(xpath ="//div[text()='Add New']") WebElement buttonAddNew;
	@FindBy(xpath="//div[@class='item CreateNewCustomer']") WebElement itemNewCustomer;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement textboxcustomerName;
    @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement textareaCustomerDescription;
    @FindBy(xpath=" //div[contains(text(),'Create Customer')]") WebElement buttonCreateCustomer ;
    @FindBy(xpath="//span[@class='innerHtml']") WebElement textSuccessMessage;
  
    public TaskPage() {
    	PageFactory.initElements(driver, this);
    }
  
    public void clickAddNew() {
    	buttonAddNew.click();
    }
    
    public void clickAddCustomer() {
    	itemNewCustomer.click();
    	
    }
    public void enterCustomerName(String customername) {
    	textboxcustomerName.sendKeys(customername);
    }
    
    public void enterCustomerDescription(String customerdescription) {
    	textareaCustomerDescription.sendKeys(customerdescription);
   }
    public void clickCreateCutsomer() {
    	buttonCreateCustomer.click();
    }
    public String getSuccessMessaage() {
    	return textSuccessMessage.getText();
    }
}
