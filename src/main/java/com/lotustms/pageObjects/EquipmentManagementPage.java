package com.lotustms.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lotustms.actiondriver.Action;

public class EquipmentManagementPage {
	WebDriver driver;
	Action action = new Action();

	public EquipmentManagementPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
  @FindBy(xpath="//span[text()='Admin Features']/ancestor::a")
  WebElement adminFeature;
	@FindBy(xpath="//a[@href='#/admin-features/equipment-management']")
	WebElement equipmentManagementModule;
	@FindBy(xpath="(//mat-card-title//span)[1]")
	WebElement equipmentManagementPageSize;
	@FindBy(xpath="//span[text()=' Create New ']/parent::button")
	WebElement createNewButton;
	@FindBy(xpath="//h2")
	WebElement size;
	@FindBy(xpath="//simple-snack-bar/span")
    WebElement successfulMessage;
	@FindBy(xpath="//mat-error[1]")
	WebElement errorMessage;
	@FindBy(xpath="//mat-select[@formcontrolname='equipment_type_id']")
	WebElement equipment_type_id;
	@FindBy(xpath="//mat-option[1]")
	WebElement matOption;
	@FindBy(xpath="//mat-option[8]")
	WebElement matOption8;
	@FindBy(xpath="//input[@formcontrolname='equipment_name']")
	WebElement equipment_name;
	@FindBy(xpath="//input[@formcontrolname='make']")
	WebElement make;
	@FindBy(xpath="//input[@formcontrolname='model']")
	WebElement model;
	@FindBy(xpath="//mat-select[@formcontrolname='year']")
	WebElement year;
	@FindBy(xpath="//input[@formcontrolname='vin']")
	WebElement vin;
	@FindBy(xpath="//input[@formcontrolname='license']")
	WebElement license;
	@FindBy(xpath="//app-state-autocomplete//input")
	WebElement state;
	@FindBy(xpath="//input[@formcontrolname='license_expiry']")
	WebElement license_expiry;
	@FindBy(xpath="(//owl-date-time-calendar//button)[3]")
	WebElement clickNextMonth;
	@FindBy(xpath="//table//tr[3]//td[5]")
	WebElement clickDate;
	@FindBy(xpath="//mat-select[@formcontrolname='equipment_location_id']")
	WebElement equipment_location_id;
	@FindBy(xpath="//input[@formcontrolname='remarks']")
	WebElement remarks;
	@FindBy(xpath="//span[text()='Create']/parent::button")
	WebElement createEquipment;
	@FindBy(xpath="//span[text()='Cancel']/parent::button")
	WebElement cancelEquipment;

	@FindBy(xpath="(//mat-icon[text()='near_me'])[1]")
	WebElement near_me;
	@FindBy(xpath="//mat-select[@name='toLocation']")
	WebElement toLocation;
	@FindBy(xpath="//span[text()='Save']/parent::button")
	WebElement saveButton;
	@FindBy(xpath="(//mat-icon[text()='edit'])[1]")
	WebElement editButton;
	@FindBy(xpath="(//mat-icon[text()='close'])[1]")
	WebElement closeButton;
	@FindBy(xpath="//span[text()=' Delete ']/parent::button")
	WebElement deleteButton;
	@FindBy(xpath="//span[text()=' Cancel ']/parent::button")
	WebElement cancel_deleteButton;
	@FindBy(xpath="//mat-table//mat-row[1]/mat-cell[1]")
	WebElement idNumber;
	@FindBy(xpath="//mat-select[@formcontrolname='truck_no']")
	WebElement truck_no;
	@FindBy(xpath="(//owl-date-time-calendar//button)[1]")
	WebElement verifybuttonIsEnabled;
	@FindBy(xpath="//mat-table//mat-row[1]//mat-cell[12]")
	WebElement getTextFromLocation;
//	@FindBy(xpath="")
//	WebElement emptyLegDelivery;
//	@FindBy(xpath="")
//	WebElement emptyLegDelivery;
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
		action.click(driver, equipmentManagementModule);
	}
	
	public String verifyContainerManagementPageSize() {
		String verifylocationManagementPageSize = equipmentManagementPageSize.getText();
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
	
	
	public void equipment_type_id() throws InterruptedException {
		Thread.sleep(1000);
		action.click(driver, equipment_type_id);
	}
	
	public void option() throws InterruptedException {
		Thread.sleep(1500);
		action.click(driver, matOption);
	}
	
	public void option8() throws InterruptedException {
		Thread.sleep(1500);
		action.click(driver, matOption8);
	}
	
	public void name(String name) throws InterruptedException {
    	Thread.sleep(1000);
		WebElement equipment_name = driver.findElement(By.xpath("//input[@formcontrolname='equipment_name']"));
		equipment_name.clear();
		equipment_name.sendKeys(name);
	}
	
	public void make(String name) throws InterruptedException {
		Thread.sleep(1000);
		action.type(make, name);
	}
	
	public void model(String name) throws InterruptedException {
		Thread.sleep(1000);
		action.type(model, name);
	}
	
	public void year() throws InterruptedException {
		Thread.sleep(1500);
		action.click(driver, year);
	}
	
	public void vin(String name) throws InterruptedException {
		Thread.sleep(1000);
		action.type(vin, name);
	}
	
	public void license(String name) throws InterruptedException {
		Thread.sleep(1000);
		action.type(license, name);
	}
	
	public void state(String name) throws InterruptedException {
		Thread.sleep(1000);
		action.type(state, name);
	}
	
	public void license_expiry() throws InterruptedException {
		Thread.sleep(1500);
		action.click(driver, license_expiry);
	}
	
	public void clickNextMonth() throws InterruptedException {
		Thread.sleep(1500);
		action.click(driver, clickNextMonth);
	}
	
	public void clickDate() throws InterruptedException {
		Thread.sleep(1500);
		action.click(driver, clickDate);
	}
	
	public void equipment_location_id() throws InterruptedException {
		Thread.sleep(1500);
		action.click(driver, equipment_location_id);
	}
	
	public void remarks(String name) throws InterruptedException {
		Thread.sleep(1000);
		action.type(remarks, name);
	}
	
	public void createEquipment() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, createEquipment);
	}
	
	public boolean create1Equipment() throws InterruptedException {
		Thread.sleep(3000);
		return action.isEnabled(driver, createEquipment);
	}
	
	public boolean verifybuttonIsEnabled() throws InterruptedException {
		Thread.sleep(3000);
		return action.isEnabled(driver, verifybuttonIsEnabled);
	}
	
	public void cancelEquipment() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, cancelEquipment);
	}
	
	public void near_me() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, near_me);
	}
	
	public void toLocation_nearme() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, toLocation);
	}
	
	public void saveButton() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, saveButton);
	}
	
	public void editButton() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, editButton);
	}
	
	public void closeButton() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, closeButton);
	}
	
	public void deleteButton() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, deleteButton);
	}
	
	public void cancel_deleteButton() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, cancel_deleteButton);
	}
	
	public void idNumber() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, idNumber);
	}
	
	public int verifytruck_no() throws InterruptedException {
		Thread.sleep(1000);
		List size= driver.findElements(By.xpath("//mat-select[@formcontrolname='truck_no']"));
		int verifytruck_no = size.size();
		System.out.println(verifytruck_no);
		return verifytruck_no;
	}
	
	public String verify_getTextFromLocation() {
		String verify_getTextFromLocation = getTextFromLocation.getText();
		return verify_getTextFromLocation;
	}
	
}
