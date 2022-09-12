package com.lotustms.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lotustms.actiondriver.Action;

public class UserManagement {
	  WebDriver driver;
	   Action action= new Action();
	   
   public UserManagement(WebDriver ldriver) {
	   this.driver = ldriver;
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath="//span[text()='Admin Features']/ancestor::a")
   WebElement adminFeature;
   @FindBy(xpath="//a[@href=\"#/admin-features/user-management\"]")
   WebElement userManagement;
   @FindBy(xpath="(//mat-card-title//span)[1]")
   WebElement verifyUserManagementPage;
   @FindBy(how=How.XPATH, using ="//span[text()=' Create New ']/parent::button")
   WebElement createNewUserButton;
   @FindBy(how=How.XPATH, using ="//input[@placeholder='First Name']")
   WebElement firstName;
   @FindBy(how=How.XPATH, using ="//input[@placeholder='Last Name']")
   WebElement lastName;
   @FindBy(xpath="//input[@placeholder='Email']")
   WebElement email;
   @FindBy(xpath="//mat-select[@placeholder='Role']")
   WebElement Role;
   @FindBy(xpath="//mat-option[1]")
   WebElement adminRole;
   @FindBy(xpath="//mat-option[21]")
   WebElement dispatchRole;
   @FindBy(xpath="//mat-option[3]")
   WebElement driverRole;
   @FindBy(xpath="//mat-option[4]")
   WebElement driverPayRole;
   @FindBy(xpath="//mat-option[5]")
   WebElement invoiceRole;
   @FindBy(xpath="//mat-option[6]")
   WebElement orderEntryRole;
   @FindBy(how=How.XPATH, using ="//span[text()=' Send Activation Email ']/parent::button")
   WebElement sendActivationButton;
   @FindBy(how=How.XPATH, using ="(//mat-error)[1]")
   WebElement errorMessage;
   @FindBy(how=How.XPATH, using ="//mat-select[@placeholder='Driver Type']")
   WebElement driverType;
   @FindBy(xpath="(//mat-icon[text()='launch'])[1]")
   WebElement quickViewButton;
   @FindBy(xpath="//mat-dialog-content/div[1]/div[3]/p/strong")
   WebElement verifyQuickViewButton;
   @FindBy(xpath="//span[text()='Cancel']/parent::button")
   WebElement cancelButton;
   @FindBy(xpath="(//mat-icon[text()='security'])[1]")
   WebElement securityButton;
   @FindBy(xpath="//mat-dialog-content/div/div[2]/div[2]")
   WebElement verifySecurityButton;
   @FindBy(xpath="(//mat-icon[text()='refresh'])[1]")
   WebElement resendButton;
   @FindBy(xpath="//span[text()=' Yes ']/parent::button")
   WebElement yesResendButton;
   @FindBy(xpath="//simple-snack-bar/span")
   WebElement verifySuccessfullMessageForResendButton;
   @FindBy(how=How.XPATH, using ="(//mat-icon[text()='edit'])[1]")
   WebElement editButton;
   @FindBy(how=How.XPATH, using ="//span[text()=' Save ']/parent::button")
   WebElement saveButton;
   @FindBy(how=How.XPATH, using ="(//mat-icon[text()='close'])[1]")
   WebElement closeButton;
   @FindBy(how=How.XPATH, using ="//span[text()=' Delete ']/parent::button")
   WebElement deleteCloseButton;
   @FindBy(xpath="(//mat-option)[1]")
   WebElement option;
   @FindBy(xpath="(//mat-form-field)[1]//input")
   WebElement search;
   @FindBy(xpath="(//mat-table/mat-row/mat-cell)[1]")
   WebElement verifySearch;
   @FindBy(xpath="//simple-snack-bar/span")
   WebElement verifySuccuessfullMessageForCreatingUser;
   
	public void adminFeature() throws InterruptedException
	{
		Thread.sleep(5000);
		action.explicitWait(driver, adminFeature, 20);
		action.scrollByVisibilityOfElement(driver, adminFeature);
		action.JSClick(driver, adminFeature);
	}
	
	public void userManagement() throws InterruptedException
	{
		Thread.sleep(5000);
		action.explicitWait(driver, userManagement, 20);
		action.scrollByVisibilityOfElement(driver, userManagement);
		action.click(driver, userManagement);
	}
	
	public String verifyUserManagementPage()
	{
		String verifyErrorMsg = verifyUserManagementPage.getText();
		return verifyErrorMsg;
	}
	
	public String verifySuccuessfullMessageForCreatingUser()
	{
		String verifyErrorMsg = verifySuccuessfullMessageForCreatingUser.getText();
		return verifyErrorMsg;
	}
	
	public void createNewUserButton()
	{
		action.explicitWait(driver, createNewUserButton, 20);
		action.scrollByVisibilityOfElement(driver, createNewUserButton);
		action.click(driver, createNewUserButton);
	}
	
	public int verifysizeCreateNew()
	{
		List size= driver.findElements(By.xpath("//input[@placeholder='First Name']"));
		int sizeCreateNew = size.size();
		return sizeCreateNew;
	}
	
	public void firstName_userManagement(String first)
	{
		action.explicitWait(driver, firstName, 20);
		action.scrollByVisibilityOfElement(driver, firstName);
		action.type(firstName, first);
	}
	
	public void lastName_userManagement(String last)
	{
		action.explicitWait(driver, lastName, 20);
		action.scrollByVisibilityOfElement(driver, lastName);
		action.type(lastName, last);
	}
	
	public void email_userManagement(String emailAdd)
	{
		action.explicitWait(driver, email, 20);
		action.scrollByVisibilityOfElement(driver, email);
		action.type(email, emailAdd);
	}
	
	public void role_userManagement()
	{
		action.explicitWait(driver, Role, 20);
		action.scrollByVisibilityOfElement(driver, Role);
		action.click(driver, Role);
	}
	
	public void adminRole_userManagement()
	{
		action.explicitWait(driver, adminRole, 10);
		action.scrollByVisibilityOfElement(driver, adminRole);
		action.click(driver, adminRole);
	}
	
	public void dispatchRoleuserManagement()
	{
		action.explicitWait(driver, dispatchRole, 10);
		action.scrollByVisibilityOfElement(driver, dispatchRole);
		action.click(driver, dispatchRole);
	}
	
	public void driverRole_userManagement()
	{
		action.explicitWait(driver, driverRole, 10);
		action.scrollByVisibilityOfElement(driver, driverRole);
		action.click(driver, driverRole);
	}
	
	public void driverPayRole_userManagement()
	{
		action.explicitWait(driver, driverPayRole, 10);
		action.scrollByVisibilityOfElement(driver, driverPayRole);
		action.click(driver, driverPayRole);
	}
	
	public void invoiceRole_userManagement()
	{
		action.explicitWait(driver, invoiceRole, 10);
		action.scrollByVisibilityOfElement(driver, invoiceRole);
		action.click(driver, invoiceRole);
	}
	
	public void orderEntryRole_userManagement()
	{
		action.explicitWait(driver, orderEntryRole, 20);
		action.scrollByVisibilityOfElement(driver, orderEntryRole);
		action.click(driver, orderEntryRole);
	}
	
	public void driverType_userManagement()
	{
		action.explicitWait(driver, driverType, 20);
		action.scrollByVisibilityOfElement(driver, driverType);
		action.click(driver, driverType);
	}
	
	public void option_driverType_userManagement()
	{
		action.explicitWait(driver, option, 20);
		action.scrollByVisibilityOfElement(driver, option);
		action.click(driver, option);
	}
	
	public void sendActivationButton_userManagement()
	{
		action.explicitWait(driver, sendActivationButton, 20);
		action.scrollByVisibilityOfElement(driver, sendActivationButton);
		action.click(driver, sendActivationButton);
	}
	
	public String errorMessage_userManagement()
	{
		String verifyErrorMsg = errorMessage.getText();
		return verifyErrorMsg;
	}
	
	public void quickViewButton_userManagement()
	{
		action.explicitWait(driver, quickViewButton, 20);
		action.scrollByVisibilityOfElement(driver, quickViewButton);
		action.click(driver, quickViewButton);
	}
	
	public String verifyQuickViewButton_userManagement()
	{
		String verifyErrorMsg = verifyQuickViewButton.getText();
		return verifyErrorMsg;
	}

	public void cancelButton_userManagement()
	{
		action.explicitWait(driver, cancelButton, 20);
		action.scrollByVisibilityOfElement(driver, cancelButton);
		action.click(driver, cancelButton);
	}
	
	public void securityButton_userManagement()
	{
		action.explicitWait(driver, securityButton, 20);
		action.scrollByVisibilityOfElement(driver, securityButton);
		action.click(driver, securityButton);
	}
	
	public String verifySecurityButton_userManagement()
	{
		String verifyErrorMsg = verifySecurityButton.getText();
		return verifyErrorMsg;
	}
	
	public void resendButton_userManagement()
	{
		action.explicitWait(driver, resendButton, 20);
		action.scrollByVisibilityOfElement(driver, resendButton);
		action.click(driver, resendButton);
	}
	
	public void yesResendButton_userManagement()
	{
		action.explicitWait(driver, yesResendButton, 20);
		action.scrollByVisibilityOfElement(driver, yesResendButton);
		action.click(driver, yesResendButton);
	}
	
	public int verifySizeOfSuccessfullMessage()
	{
		List size= driver.findElements(By.xpath("//simple-snack-bar/span"));
		int SuccessfullMessage = size.size();
		return SuccessfullMessage;
	}
	
	public void search_userManagement(String searchByName) throws InterruptedException
	{
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement authenticationPage =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//mat-form-field)[1]//input")));
		authenticationPage.sendKeys(searchByName);
		Thread.sleep(3000);
		authenticationPage.sendKeys(Keys.ENTER);
	}
	
	public String verifySearch_userManagement()
	{
		String verifyErrorMsg = verifySearch.getText();
		return verifyErrorMsg;
	}
}
