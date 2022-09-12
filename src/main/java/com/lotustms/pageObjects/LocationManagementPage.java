package com.lotustms.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lotustms.actiondriver.Action;

public class LocationManagementPage {
	 WebDriver driver;
	   Action action= new Action();
	  public LocationManagementPage(WebDriver ldriver) {
		   this.driver = ldriver;
		   PageFactory.initElements(driver, this);
	  }
    @FindBy(xpath="//span[text()='Admin Features']/ancestor::a")
    WebElement adminFeature;
	@FindBy(xpath="//a[@href='#/admin-features/location-management']")
	WebElement locationManagementModule;
	@FindBy(xpath="(//mat-card-title//span)[1]")
	WebElement locationManagementPageSize;
	@FindBy(xpath="//span[text()=' Create New ']/parent::button")
	WebElement createNewButton;
	@FindBy(xpath="//h2")
	WebElement size;
	@FindBy(xpath="//mat-select[@formcontrolname='locationType']")
	WebElement locationType;
	@FindBy(xpath="//mat-option[1]")
	WebElement matOption;
	@FindBy(xpath="//input[@formcontrolname='locationName']")
	WebElement locationName;
	@FindBy(xpath="//app-bing-autocomplete//input")
	WebElement bingApiAddress;
	@FindBy(xpath="//span[text()='Create']/parent::button")
	WebElement createLocation;
	@FindBy(xpath="//span[text()='Cancel']/parent::button")
	WebElement cancelLocation;
	@FindBy(xpath="//simple-snack-bar/span")
    WebElement successfulMessage;
	@FindBy(xpath="//mat-error[1]")
	WebElement errorMessage;
	@FindBy(xpath="//mat-table/mat-row[1]/mat-cell[1]//button")
	WebElement idNumberClick;
	@FindBy(xpath="(//mat-form-field)[1]//mat-select")
	WebElement search_locationType;
	@FindBy(xpath="//mat-option[3]")
	WebElement option_locationType_search;
	@FindBy(xpath="//mat-table/mat-row[1]/mat-cell[2]")
	WebElement locationTypeSize;
	@FindBy(xpath="(//mat-icon[text()='close'])[1]")
	WebElement resetButton;
	@FindBy(xpath="//mat-paginator//mat-select")
	WebElement itemPerPage;

	

	
	public void adminFeature() throws InterruptedException {
		Thread.sleep(5000);
		action.JSClick(driver, adminFeature);
	}
	
	public void locationManagementModule() throws InterruptedException {
		Thread.sleep(3000);
		action.click(driver, locationManagementModule);
	}
	
	public String verifylocationManagementPageSize() {
		String verifylocationManagementPageSize = locationManagementPageSize.getText();
		return verifylocationManagementPageSize;
	}
	
	public void createNewButton() throws InterruptedException {
		Thread.sleep(1500);
		action.click(driver, createNewButton);
	}
	
	public String verifyLocationSize() {
		String verifyaddLocationSize = size.getText();
		return verifyaddLocationSize;
	}
	
	
	public String verifysuccessfulMessage() {
		String verifysuccessfulMessage = successfulMessage.getText();
		return verifysuccessfulMessage;
	}
	
	public void locationType() throws InterruptedException {
		Thread.sleep(3000);
		action.click(driver, locationType);
	}
	
	public void option() throws InterruptedException {
		Thread.sleep(2000);
		action.click(driver, matOption);
	}
	
	public void locationName(String busiName) throws InterruptedException {
    	Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement businessName = driver.findElement(By.xpath("//input[@formcontrolname='locationName']"));
		businessName.clear();
		businessName.sendKeys(busiName);
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
	
	
	
	public void createLocation_locationManagement() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, createLocation);
	}
	
	public boolean createLocation1_locationManagement() throws InterruptedException {
		Thread.sleep(1000);
		return action.isEnabled(driver, createLocation);
	}
	
	public void cancelLocation_locationManagement() throws InterruptedException {
		Thread.sleep(500);
		action.click(driver, cancelLocation);
	}
	
	public String verifyErrorMessage() {
		String verifyErrorMessage = errorMessage.getText();
		return verifyErrorMessage;
	}
	
	public void idNumberClick() throws InterruptedException {
		Thread.sleep(1500);
		action.click(driver, idNumberClick);
	}
	
	public void search_locationType() throws InterruptedException {
		Thread.sleep(1000);
		action.click(driver, search_locationType);
	}
	
	public void option_locationType_search() throws InterruptedException {
		Thread.sleep(3000);
		action.click(driver, option_locationType_search);
	}
	
	public String verifylocationTypeSize() {
		String verifylocationTypeSize = locationTypeSize.getText();
		return verifylocationTypeSize;
	}
	
	public int pageSize() {
		String text = driver.findElement(By.xpath("//mat-card-content/mat-paginator/div/div/div[2]/div")).getText();
		String[] text1 = text.split("of");
		String nextButton = text1[1].trim();
		int nextButtonSize = Integer.parseInt(nextButton);
		System.out.println("nextButton :" + nextButtonSize);
		return nextButtonSize;
	}
	
	public int rowSize() throws InterruptedException {
		Thread.sleep(500);
		List row = driver.findElements(By.xpath("//mat-table/mat-row/mat-cell[1]"));
		int size = row.size();
		return size;
	}
	
	public void resetButton() throws InterruptedException {
		Thread.sleep(2000);
		action.click(driver, resetButton);
	}
	
	public void itemPerPage() throws InterruptedException {
		Thread.sleep(2000);
		action.click(driver, itemPerPage);
	}
}
