package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;
import acti.utils.Helper;
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
  
    @FindBy(xpath="(//span[@class='highlightToken'])") WebElement searchedCustomer; 
    @FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement buttonEdit;
	@FindBy(xpath="//div[@class='editCustomerPanelHeader']//div[@class='action'][normalize-space()='ACTIONS']")
	WebElement buttonAction;
	@FindBy(xpath="//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space()='Delete']")
	WebElement buttonDelete;
	@FindBy(xpath="//span[normalize-space()='Delete permanently']") WebElement buttonDeletePermananently;
	
  
 
//************************************Page Inititaion**********************************************//		
    
    public TaskPage() {
    	PageFactory.initElements(driver, this);
    }
  
 //************************************Page Actions**********************************************//		  
    
    public void clickDeletePermanently()
	{
     buttonDeletePermananently.click();
     Helper.fn_sleep();

	}
	
	public void clickDelete()
	{
		buttonDelete.click();
	}
	
	
	public void clickAction() {
		buttonAction.click();
	}
	
	
	public void clickEditButton()
	{
	buttonEdit.click();
	Helper.fn_sleep();
	
	}
	
	public void clickSearchedCustomer()
	{
		searchedCustomer.click();
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
    	Helper.fn_sleep();
  
    }
    public String getSuccessMessage() {
    	return textSuccessMessage.getText();
    }
}
