package com.lotustms.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lotustms.actiondriver.Action;

public class ChassisManagementPage {
	WebDriver driver;
	Action action = new Action();

	public ChassisManagementPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
  @FindBy(xpath="//span[text()='Admin Features']/ancestor::a")
  WebElement adminFeature;
	@FindBy(xpath="//a[@href='#/admin-features/chassis-management']")
	WebElement chassisManagementModule;
	@FindBy(xpath="(//mat-card-title//span)[1]")
	WebElement chassisManagementPageSize;
	@FindBy(xpath="//span[text()=' Create New ']/parent::button")
	WebElement createNewButton;
	@FindBy(xpath="//h2")
	WebElement size;
	@FindBy(xpath="//input[@formcontrolname='chassisName']")
	WebElement chassisName;
	@FindBy(xpath="(//app-midcities-name-autocomplete)[1]//input")
	WebElement locationName;
	@FindBy(xpath="//input[@formcontrolname='email']")
	WebElement email;
	@FindBy(xpath="//input[@formcontrolname='phoneNumber']")
	WebElement phoneNumber;
	@FindBy(xpath="//span[text()='Create']/parent::button")
	WebElement createChassis;
	@FindBy(xpath="//span[text()='Cancel']/parent::button")
	WebElement cancelChassis;
	@FindBy(xpath="//simple-snack-bar/span")
    WebElement successfulMessage;
	@FindBy(xpath="//mat-error[1]")
	WebElement errorMessage;
	@FindBy(xpath="//mat-option[1]")
	WebElement matOption;
	@FindBy(xpath="//app-state-autocomplete//input")
	WebElement state;
	@FindBy(xpath="//mat-table/mat-row[1]/mat-cell[1]")
	WebElement idNumber;
	@FindBy(xpath="(//p)[4]//span")
	WebElement idInformationSize;
	@FindBy(xpath="(//mat-icon[text()='edit'])[1]/ancestor::button")
	WebElement editButton;
	@FindBy(xpath="(//mat-icon[text()='close'])[1]/ancestor::button")
	WebElement deleteButton;
	@FindBy(xpath="//span[text()=' Delete ']/parent::button")
	WebElement yesDeleteButton;
	@FindBy(xpath="//span[text()='Save']/parent::button")
	WebElement saveButton;
	@FindBy(xpath="//mat-table/mat-row[1]/mat-cell[2]//span")
	WebElement chassisNameSize;

	
	public void adminFeature() throws InterruptedException {
		Thread.sleep(5000);
		action.JSClick(driver, adminFeature);
	}
	
	public void chassisnManagementModule() throws InterruptedException {
		Thread.sleep(3000);
		action.click(driver, chassisManagementModule);
	}
	
	public String verifyChassisManagementPageSize() {
		String verifylocationManagementPageSize = chassisManagementPageSize.getText();
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
	
	
	public void chassisName(String name) throws InterruptedException {
    	Thread.sleep(1000);
		WebElement chassisName = driver.findElement(By.xpath("//input[@formcontrolname='chassisName']"));
		chassisName.clear();
		chassisName.sendKeys(name);
	}
	
	public void locationName(String name) throws InterruptedException {
		Thread.sleep(1000);
		action.type(locationName, name);
	}
	
	public void email(String content) throws InterruptedException {
		Thread.sleep(1000);
		action.type(email, content);
	}
	
	public void phoneNumber(String num) throws InterruptedException {
		Thread.sleep(1000);
		action.type(phoneNumber, num);
	}
	
	public void state() throws InterruptedException {
		Thread.sleep(1000);
		WebElement state = driver.findElement(By.xpath("//app-state-autocomplete//input"));
		state.clear();
	}
	
	
	public void createChassis() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, createChassis);
	}
	
	public boolean create1Chassis() throws InterruptedException {
		Thread.sleep(1000);
		return action.isEnabled(driver, createChassis);
	}
	
	public void cancelChassis() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, cancelChassis);
	}
	
	public String verifyErrorMessage() {
		String verifyErrorMessage = errorMessage.getText();
		return verifyErrorMessage;
	}
	
	public void option() throws InterruptedException {
		Thread.sleep(2000);
		action.click(driver, matOption);
	}
	
	public String verifyTextFilledInStreet() throws InterruptedException {
    	Thread.sleep(1000);
		String street = driver.findElement(By.xpath("//mat-dialog-content/mat-form-field[3]/div/div[1]/div/span//label")).getAttribute("class");
		System.out.println("street :"+street);
		return street;
	}
	
	public void idNumber() throws InterruptedException {
		Thread.sleep(2000);
		action.click(driver, idNumber);
	}
	
	public String verifyIdInformationSize() {
		String verifyIdInformationSize = idInformationSize.getText();
		return verifyIdInformationSize;
	}

	public void editButton() throws InterruptedException {
		Thread.sleep(2000);
		action.click(driver, editButton);
	}
	public void deleteButton() throws InterruptedException {
		Thread.sleep(2000);
		action.click(driver, deleteButton);
	}
	
	public void yesDeleteButton() throws InterruptedException {
		Thread.sleep(2000);
		action.click(driver, yesDeleteButton);
	}
	
	public void saveButton() throws InterruptedException {
		Thread.sleep(2000);
		action.click(driver, saveButton);
	}
	
	public void chassis_nameSearch(String name) throws InterruptedException {
		Thread.sleep(1000);
		WebElement chassis_nameSearch = driver.findElement(By.xpath("//input[@name='chassis_name']"));
		chassis_nameSearch.sendKeys(name);
		chassis_nameSearch.sendKeys(Keys.ENTER);
	}
	
	public void emailSearch(String name) throws InterruptedException {
		Thread.sleep(1000);
		WebElement chassis_nameSearch = driver.findElement(By.xpath("//input[@name='email']"));
		chassis_nameSearch.sendKeys(name);
		chassis_nameSearch.sendKeys(Keys.ENTER);
	}
	
	public void phone_numberSearch(String num) throws InterruptedException {
		Thread.sleep(1000);
		WebElement chassis_nameSearch = driver.findElement(By.xpath("//input[@name='phone_number']"));
		chassis_nameSearch.sendKeys(num);
		chassis_nameSearch.sendKeys(Keys.ENTER);
	}
	
	public String verifychassisNameSize() {
		String verifychassisNameSize = chassisNameSize.getText();
		return verifychassisNameSize;
	}
}
