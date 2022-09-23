package com.lotustms.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lotustms.actiondriver.Action;

public class MenuManagementPage {

	WebDriver driver;
	Action action = new Action();
	
	public MenuManagementPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//span[text()='Admin Features']/ancestor::a")
    WebElement adminFeature;
	@FindBy(xpath="//a[@href='#/admin-features/menu-configuration']")
	WebElement menuConfiguration;
	@FindBy(xpath="//mat-select[@placeholder='Configurable Dropdowns in the App']")
	WebElement ConfigurableDropdownsInTheApp;
	@FindBy(xpath="//input[@placeholder='Enter field']")
	WebElement addField;
	@FindBy(xpath="//span[text()='Reset']/parent::button")
	WebElement resetButton;
	@FindBy(xpath="//span[text()=' Add']/parent::button")
	WebElement addButton;
	@FindBy(xpath="//mat-option[1]")
	WebElement option1;
	@FindBy(xpath="//mat-option[21]")
	WebElement option2;
	@FindBy(xpath="//mat-option[3]")
	WebElement option3;
	@FindBy(xpath="//mat-option[4]")
	WebElement option4;
	@FindBy(xpath="//mat-option[5]")
	WebElement option5;
	@FindBy(xpath="//mat-option[6]")
	WebElement option6;
	@FindBy(xpath="//mat-option[7]")
	WebElement option7;
	@FindBy(xpath="//mat-option[8]")
	WebElement option8;
	@FindBy(xpath="//mat-option[9]")
	WebElement option9;
	@FindBy(xpath="//mat-option[10]")
	WebElement option10;
	@FindBy(xpath="//simple-snack-bar/span")
    WebElement successfulMessage;
	@FindBy(xpath="(//mat-card-title//span)[1]")
	WebElement menuManagementPageSize;
//	@FindBy(xpath="")
//	WebElement adminFeature1;
//	@FindBy(xpath="")
//	WebElement adminFeature1;
//	@FindBy(xpath="")
//	WebElement adminFeature1;
//	@FindBy(xpath="")
	
	public void adminFeature() throws InterruptedException {
		Thread.sleep(5000);
		action.JSClick(driver, adminFeature);
	}
	
	public void menuConfiguration() throws InterruptedException {
		Thread.sleep(3000);
		action.JSClick(driver, menuConfiguration);
	}
	
	public String verifyMenuManagementPageSize() {
		String verifylocationManagementPageSize = menuManagementPageSize.getText();
		return verifylocationManagementPageSize;
	}
	
	public void ConfigurableDropdownsInTheApp() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, ConfigurableDropdownsInTheApp);
	}
	
	public void option1() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, option1);
	}
	
	public void option2() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, option2);
	}
	
	public void option3() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, option3);
	}
	public void option4() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, option4);
	}
	
	public void option5() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, option5);
	}
	
	public void option6() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, option6);
	}
	public void option7() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, option7);
	}
	
	public void option8() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, option8);
	}
	
	public void option9() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, option9);
	}
	
	public void option10() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, option10);
	}
	
	public void resetButton() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, resetButton);
	}
	
	public void addButton() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, addButton);
	}
	
	public String verifysuccessfulMessage() {
		String verifysuccessfulMessage = successfulMessage.getText();
		return verifysuccessfulMessage;
	}
	
	public void addField(String name) throws InterruptedException {
		Thread.sleep(1000);
		action.type(addField, name);
	}
	
	
}
