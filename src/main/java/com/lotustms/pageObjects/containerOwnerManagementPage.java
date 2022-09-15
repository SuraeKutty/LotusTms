package com.lotustms.pageObjects;

import java.awt.Checkbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lotustms.actiondriver.Action;

public class containerOwnerManagementPage {
	WebDriver driver;
	Action action = new Action();

	public containerOwnerManagementPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
  @FindBy(xpath="//span[text()='Admin Features']/ancestor::a")
  WebElement adminFeature;
	@FindBy(xpath="//a[@href='#/admin-features/container-owner-management']")
	WebElement containerManagementModule;
	@FindBy(xpath="(//mat-card-title//span)[1]")
	WebElement containerManagementPageSize;
	@FindBy(xpath="//span[text()=' Create New ']/parent::button")
	WebElement createNewButton;
	@FindBy(xpath="//h2")
	WebElement size;
	@FindBy(xpath="//input[@formcontrolname='containerName']")
	WebElement containerName;
	@FindBy(xpath="(//app-midcities-name-autocomplete)[1]//input")
	WebElement locationName;
	@FindBy(xpath="//mat-select[@formcontrolname='preferredChassisRental']")
	WebElement preferredChassisRental;
	@FindBy(xpath="//mat-option[1]")
	WebElement option;
	@FindBy(xpath="//input[@formcontrolname='phoneNumber']")
	WebElement phoneNumber;
	@FindBy(xpath="//span[text()='Create']/parent::button")
	WebElement createcontainer;
	@FindBy(xpath="(//span[text()='Create']/parent::button)[2]")
	WebElement createLocation;
	@FindBy(xpath="//span[text()='Cancel']/parent::button")
	WebElement cancelContainer;
	@FindBy(xpath="//simple-snack-bar/span")
    WebElement successfulMessage;
	@FindBy(xpath="//mat-error[1]")
	WebElement errorMessage;
	@FindBy(xpath="(//mat-table/mat-row[1]/mat-cell//button)[1]")
	WebElement idNumber;
	@FindBy(xpath="(//input[@formcontrolname='email'])[1]")
	WebElement email;
	@FindBy(xpath="(//input[@formcontrolname='email'])[2]")
	WebElement email1;
	@FindBy(xpath="(//input[@formcontrolname='email'])[3]")
	WebElement email2;
	@FindBy(xpath="(//app-midcities-name-autocomplete)[2]//input")
	WebElement name;
	@FindBy(xpath="//app-state-autocomplete//input")
	WebElement state;
	@FindBy(xpath="//mat-checkbox")
	WebElement checkbox;
	@FindBy(xpath="//mat-icon[text()='add_location']/ancestor::button")
	WebElement add_location;
	@FindBy(xpath="//mat-select[@formcontrolname='locationType']")
	WebElement locationType;
	@FindBy(xpath="//mat-option[1]")
	WebElement matOption;
	@FindBy(xpath="//input[@formcontrolname='locationName']")
	WebElement locationName1;
	@FindBy(xpath="//app-bing-autocomplete//input")
	WebElement bingApiAddress;
	@FindBy(xpath="//mat-icon[text()='add_box']")
	WebElement email_addButton;
	@FindBy(xpath="(//mat-icon[text()='delete'])[3]")
	WebElement deleteSize;
	@FindBy(xpath="(//mat-icon[text()='delete'])[1]")
	WebElement deleteBUttonForEmail;
	@FindBy(xpath="//mat-error[text()=' Enter a valid email ']")
	WebElement emailErrorMsg;
	@FindBy(xpath="(//mat-icon[text()='add'])[2]")
	WebElement addButtonForName;
	@FindBy(xpath="(//mat-icon[text()='remove'])[2]")
	WebElement removeButtonForName;
	@FindBy(xpath="(//app-midcities-name-autocomplete)[3]//input")
	WebElement name1;
	@FindBy(xpath="//span[text()='Save']/parent::button")
	WebElement saveButton;
	@FindBy(xpath="(//mat-icon[text()='edit'])[1]")
	WebElement editButton;
//	@FindBy(xpath="")
//	WebElement emptyLegDelivery;
//	@FindBy(xpath="")
//	WebElement emptyLegDelivery;
//	@FindBy(xpath="")
//	WebElement emptyLegDelivery;
//	@FindBy(xpath="")
//	WebElement emptyLegDelivery;
	
	public void adminFeature() throws InterruptedException {
		Thread.sleep(5000);
		action.JSClick(driver, adminFeature);
	}
	
	public void containerManagementModule() throws InterruptedException {
		Thread.sleep(3000);
		action.click(driver, containerManagementModule);
	}
	
	public String verifyContainerManagementPageSize() {
		String verifylocationManagementPageSize = containerManagementPageSize.getText();
		return verifylocationManagementPageSize;
	}
	
	public void createNewButton() throws InterruptedException {
		Thread.sleep(1500);
		action.click(driver, createNewButton);
	}
	
	
	public String verifySize() {
		String verifySize = size.getText();
		return verifySize;
	}
	
	
	public String verifysuccessfulMessage() {
		String verifysuccessfulMessage = successfulMessage.getText();
		return verifysuccessfulMessage;
	}
	
	
	public void phoneNumber(String num) throws InterruptedException {
    	Thread.sleep(1000);
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@formcontrolname='phoneNumber']"));
//		phoneNumber.click();
		phoneNumber.clear();
		phoneNumber.sendKeys(num);
	}
	
	public void phoneNumber1() throws InterruptedException {
    	Thread.sleep(1000);
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@formcontrolname='phoneNumber']"));
		phoneNumber.clear();
	}
	
	public void state1() throws InterruptedException {
    	Thread.sleep(1000);
		WebElement state = driver.findElement(By.xpath("//app-state-autocomplete//input"));
		state.clear();
	}
	
	public void containerName(String name) throws InterruptedException {
		Thread.sleep(1000);
		action.type(containerName, name);
	}
	
	public void locationName(String name) throws InterruptedException {
		Thread.sleep(2000);
		action.type(locationName, name);
	}
	
	public void checkbox() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, checkbox);
	}
	
	public void preferredChassisRental() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, preferredChassisRental);
	}
	
	
	public void email(String name) throws InterruptedException {
		Thread.sleep(1000);
		action.type(email, name);
	}
	
	public void email1(String name) throws InterruptedException {
		Thread.sleep(1000);
		action.type(email1, name);
	}
	
	public void email2(String name) throws InterruptedException {
		Thread.sleep(1000);
		action.type(email2, name);
	}
	
	public void email_addButton() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, email_addButton);
	}
	
	public void deleteBUttonForEmail() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, deleteBUttonForEmail);
	}
	
	public String verifyemailErrorMsg() {
		String verifyemailErrorMsg = emailErrorMsg.getText();
		return verifyemailErrorMsg;
	}
	
	public void name(String value) throws InterruptedException {
		Thread.sleep(1000);
		action.type(name, value);
	}
	
	public void name1(String value) throws InterruptedException {
		Thread.sleep(1000);
		action.type(name1, value);
	}
	
	public void addButtonForName() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, addButtonForName);
	}
	
	public void removeButtonForName() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, removeButtonForName);
	}
	
	public void option() throws InterruptedException {
		Thread.sleep(2000);
		action.click(driver, option);
	}
	
	public int verifynameSize() throws InterruptedException {
		Thread.sleep(1000);
		List size= driver.findElements(By.xpath("(//app-midcities-name-autocomplete)[3]//input"));
		int verifynameSize = size.size();
		System.out.println(verifynameSize);
		return verifynameSize;
	}
	
	public void state() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, state);
	}
	
	public void createcontainer() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, createcontainer);
	}
	
	public void createLocation_locationManagement() throws InterruptedException {
		Thread.sleep(3000);
		action.click(driver, createLocation);
	}
	
	public boolean create1container() throws InterruptedException {
		Thread.sleep(1000);
		return action.isEnabled(driver, createcontainer);
	}
	
	public void cancelContainer() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, cancelContainer);
	}
	
	
	public String verifyErrorMessage() {
		String verifyErrorMessage = errorMessage.getText();
		return verifyErrorMessage;
	}
	
	public void idNumber() throws InterruptedException {
		Thread.sleep(2000);
		action.click(driver, idNumber);
	}
	
	public void add_location() throws InterruptedException {
		Thread.sleep(2000);
		action.click(driver, add_location);
	}
	
	public void locationType() throws InterruptedException {
		Thread.sleep(2000);
		action.click(driver, locationType);
	}
	
	public void option1() throws InterruptedException {
		Thread.sleep(3000);
		action.click(driver, matOption);
	}
	
	public void locationName1(String busiName) throws InterruptedException {
    	Thread.sleep(1000);
		WebElement location = driver.findElement(By.xpath("//input[@formcontrolname='locationName']"));
		location.clear();
		location.sendKeys(busiName);
	}
	
	public String locationName2() throws InterruptedException {
    	Thread.sleep(8000);
		String location = driver.findElement(By.xpath("(//app-midcities-name-autocomplete)[1]//input")).getAttribute("class");
		System.out.println("location :"+location);
		return location;
	}
	
	public String verifyTextFilledInStreet() throws InterruptedException {
    	Thread.sleep(1000);
		String street = driver.findElement(By.xpath("//mat-dialog-content/mat-form-field[3]/div/div[1]/div/span//label")).getAttribute("class");
		System.out.println("street :"+street);
		return street;
	}
	
	public void bingApiAddress(String bing) {
		action.explicitWait(driver, bingApiAddress, 20);
		action.type(bingApiAddress, bing);
	}
	
	public int verifydeleteSize() throws InterruptedException {
		Thread.sleep(1000);
		List size= driver.findElements(By.xpath("(//mat-icon[text()='delete'])[1]"));
		int deleteSize = size.size();
		System.out.println(deleteSize);
		return deleteSize;
	}
	
	public int verifyAddButtonSize() throws InterruptedException {
		Thread.sleep(1000);
		List size= driver.findElements(By.xpath("//mat-icon[text()='add_box']"));
		int addButtonSize = size.size();
		System.out.println(addButtonSize);
		return addButtonSize;
	}
	
	public int verifyemailSize() throws InterruptedException {
		Thread.sleep(1000);
		List size= driver.findElements(By.xpath("(//input[@formcontrolname='email'])[2]"));
		int verifyemailSize = size.size();
		System.out.println(verifyemailSize);
		return verifyemailSize;
	}
	
	public void editButton() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, editButton);
	}
	
	public void saveButton() throws InterruptedException {
		Thread.sleep(1000);
		action.click(driver, saveButton);
	}
	
	public boolean verifysaveButtonSize() throws InterruptedException {
		Thread.sleep(1000);
		WebElement verifysaveButtonSize= driver.findElement(By.xpath("//span[text()='Save']/parent::button"));
		System.out.println(verifysaveButtonSize.isEnabled());
		return verifysaveButtonSize.isEnabled();
	}
	
	
}
