package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;
/*
 * Name :Task Page
 * Developed By : Santhosh
 * Approved By : Santhosh 
 * Last Modified Date : 8/26/2022
 * Description : Task Page Elements and its Methods
 */
public class TaskPage extends DriverManager{

	
//************************************Page Elements**********************************************//	
	@FindBy(xpath ="//div[text()='Add New']") WebElement buttonAddNew;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement itemNewCustomer;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement textboxcustomerName;
    @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement textareaCustomerDescription;
    @FindBy(xpath="//div[contains(text(),'Create Customer')]") WebElement buttonCreateCustomer ;
   
    @FindBy(xpath="//span[@class='innerHtml']") WebElement textSuccessMessage;
    
    @FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]") WebElement textboxStartTyping;
    @FindBy(xpath=" //div[@class='icon'][1]") WebElement searchCustomer;
    @FindBy(xpath="//div[@class='editButton'][1]") WebElement buttonEdit;
    @FindBy(xpath="//div[@class='actions'][1]") WebElement buttonAction;
    @FindBy(xpath="//div[@class='title'][1]  ") WebElement buttonDelete;
    @FindBy(xpath="//span[@class='submitTitle buttonTitle'][1] ") WebElement buttonDeletePermanently;
 
//************************************Page Inititaion**********************************************//		
    
    public TaskPage() {
    	PageFactory.initElements(driver, this);
    }
  
 //************************************Page Actions**********************************************//		  
    
    public void clickDeletePermanently()
	{
		buttonDeletePermanently.click();
		
	}
	
	public void clickDelete()
	{
		buttonDelete.click();
	}
	
	public void clickAction()
	{
		buttonAction.click();
	}
	
	public void clickEditButton()
	{
		buttonEdit.click();
	
	}
	
	public void clickSearchedCustomer()
	{
		searchCustomer.click();
	}
	
	public void enterCustomerType(String customername) 
	{
		textboxStartTyping.sendKeys(customername);
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
    public String getSuccessMessage() {
    	return textSuccessMessage.getText();
    }
}
