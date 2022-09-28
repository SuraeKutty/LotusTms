package com.lotustms.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lotustms.actiondriver.Action;

public class GeneralRouteRate_rateManagementPage {
WebDriver driver;
Action action = new Action();

public GeneralRouteRate_rateManagementPage(WebDriver ldriver) {
	this.driver = ldriver;
	PageFactory.initElements(driver, this);
}


@FindBy(xpath = "//span[text()='Rate Management']/ancestor::a")
WebElement rateManagement;
@FindBy(xpath = "//a[@href='#/rate-management/general-route-rate']")
WebElement generalRouteRate;
@FindBy(xpath = "(//mat-card-title//span)[1]")
WebElement pageSize_rateManagement;
@FindBy(xpath = "//span[text()=' Create New ']/parent::button")
WebElement createNewButton_rateManagement;
@FindBy(xpath = "(//h2)[1]")
WebElement createNewPageSize;
@FindBy(xpath = "(//mat-form-field)[10]//input")
WebElement pickupName;
@FindBy(xpath = "(//mat-form-field)[12]//input")
WebElement deliveryName;
@FindBy(xpath = "//mat-select[@formcontrolname='order_type']")
WebElement order_type_rateManagement;
@FindBy(xpath = "//mat-option[1]")
WebElement option_rateManagement;
@FindBy(xpath = "//input[@formcontrolname='rate']")
WebElement rate_rateManagement;
@FindBy(xpath = "//span[text()='Cancel']/parent::button")
WebElement cancelButton_rateManagement;
@FindBy(xpath = "//span[text()=' Create']/parent::button")
WebElement createButton_rateManagement;
@FindBy(xpath = "//mat-table/mat-row[1]/mat-cell[1]//mat-checkbox")
WebElement checkBox_rateManagement;
@FindBy(xpath = "//mat-table/mat-row[1]/mat-cell[9]//button[1]")
WebElement edit_rateManagement;
@FindBy(xpath = "//mat-table/mat-row[1]/mat-cell[9]//button[2]")
WebElement delete_rateManagement;
@FindBy(xpath = "//span[text()=' Delete ']/parent::button")
WebElement yes_delete_rateManagement;
@FindBy(xpath = "//span[text()=' Bulk Update ']/parent::button")
WebElement bulkUpdateButton;
@FindBy(xpath="//simple-snack-bar/span")
WebElement successfulMessage;
@FindBy(xpath="//mat-error[1]")
WebElement errorMessage;
//@FindBy(xpath = "")
//WebElement rateManagement;
//@FindBy(xpath = "")
//WebElement rateManagement;
//@FindBy(xpath = "")
//WebElement rateManagement;

public void rateManagement() throws InterruptedException {
	Thread.sleep(2000);
	action.explicitWait(driver, rateManagement, 20);
	action.JSClick(driver, rateManagement);
}

public void generalRouteRate_rateManagement() throws InterruptedException {
	Thread.sleep(1000);
	action.explicitWait(driver, rateManagement, 20);
	action.click(driver, generalRouteRate);
}

public String verifypageSize_rateManagement() {
	String verifylocationManagementPageSize = pageSize_rateManagement.getText();
	return verifylocationManagementPageSize;
}

public void createNewButton_generalRouteRate_rateManagement() throws InterruptedException {
//	Thread.sleep(3000);
	action.explicitWait(driver, createNewButton_rateManagement, 20);
	action.click(driver, createNewButton_rateManagement);
}

public String verifycreateNewPageSize() {
	String verifylocationManagementPageSize = createNewPageSize.getText();
	return verifylocationManagementPageSize;
}

public void pickupName(String name) throws InterruptedException {
	Thread.sleep(1000);
	WebElement pickupName = driver.findElement(By.xpath("(//mat-form-field)[10]//input"));
	pickupName.clear();
	pickupName.sendKeys(name);
}

public void deliveryName(String name) throws InterruptedException {
//	Thread.sleep(1000);
	action.explicitWait(driver, deliveryName, 10);
	action.type(deliveryName, name);
}

public void orderType_rateManagement() throws InterruptedException {
	Thread.sleep(3000);
	action.explicitWait(driver, order_type_rateManagement, 10);
	action.click(driver, order_type_rateManagement);
}

public void optionOrderType_rateManagement() throws InterruptedException {
	Thread.sleep(2000);
	action.explicitWait(driver, option_rateManagement, 10);
	action.click(driver, option_rateManagement);
}

public void rate(String name) throws InterruptedException {
	Thread.sleep(3000);
	action.explicitWait(driver, rate_rateManagement, 10);
	action.type(rate_rateManagement, name);
}

public void cancelButton_rateManagement() throws InterruptedException {
//	Thread.sleep(3000);
	action.explicitWait(driver, cancelButton_rateManagement, 10);
	action.click(driver, cancelButton_rateManagement);
}

public void createButton_rateManagement() throws InterruptedException {
//	Thread.sleep(3000);
	action.explicitWait(driver, createButton_rateManagement, 10);
	action.click(driver, createButton_rateManagement);
}

public void editButton() throws InterruptedException {
//	Thread.sleep(3000);
	action.explicitWait(driver, edit_rateManagement, 10);
	action.click(driver, edit_rateManagement);
}

public void delete_rateManagement() throws InterruptedException {
//	Thread.sleep(3000);
	action.explicitWait(driver, delete_rateManagement, 10);
	action.click(driver, delete_rateManagement);
}

public void yes_delete_rateManagement() throws InterruptedException {
//	Thread.sleep(3000);
	action.explicitWait(driver, yes_delete_rateManagement, 10);
	action.click(driver, yes_delete_rateManagement);
}

public void checkBox_rateManagement() throws InterruptedException {
//	Thread.sleep(3000);
	action.explicitWait(driver, checkBox_rateManagement, 10);
	action.click(driver, checkBox_rateManagement);
}

public boolean bulkButton() throws InterruptedException {
	Thread.sleep(1000);
	WebElement bulkButton = driver.findElement(By.xpath("//span[text()=' Bulk Update ']/parent::button"));
	return bulkButton.isEnabled();
}

public boolean verifyCreateButton() throws InterruptedException {
	Thread.sleep(1000);
	WebElement createButton = driver.findElement(By.xpath("//span[text()=' Create']/parent::button"));
	return createButton.isEnabled();
}


public String verifysuccessfulMessage() {
	String verifysuccessfulMessage = successfulMessage.getText();
	return verifysuccessfulMessage;
}

}
