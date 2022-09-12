package com.lotustms.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lotustms.actiondriver.Action;

public class CustomerManagement {
	
	  WebDriver driver;
	   Action action= new Action();
	   
  public CustomerManagement(WebDriver ldriver) {
	   this.driver = ldriver;
	   PageFactory.initElements(driver, this);
  }
    @FindBy(xpath="//span[text()='Admin Features']/ancestor::a")
    WebElement adminFeature;
	@FindBy(xpath="//a[@href='#/admin-features/customer-management']")
	WebElement customerManagementModule;
	@FindBy(xpath="(//mat-card-title//span)[1]")
	WebElement customerPageSize;
	@FindBy(xpath="//span[text()=' Create New ']/parent::button")
	WebElement createNewButton;
	@FindBy(xpath="//h2")
	WebElement addCustomerSize;
	@FindBy(xpath="//input[@formcontrolname='businessName']")
	WebElement businessName;
	@FindBy(xpath="//input[@formcontrolname='businessPhone']")
	WebElement businessPhone;
	@FindBy(xpath="//input[@formcontrolname='businessExt']")
	WebElement businessExt;
	@FindBy(xpath="//input[@formcontrolname='fax']")
	WebElement fax;
	@FindBy(xpath="//input[@formcontrolname='point_of_contact']")
	WebElement point_of_contact;
	@FindBy(xpath="//input[@formcontrolname='poc_phone']")
	WebElement poc_phone;
	@FindBy(xpath="//input[@formcontrolname='poc_ext']")
	WebElement poc_ext;
	@FindBy(xpath="//input[@formcontrolname='email']")
	WebElement email;
	@FindBy(xpath="//span[text()=' Create']/parent::button")
	WebElement createCustomer;
	@FindBy(xpath="//span[text()='Cancel']/parent::button")
	WebElement cancelCustomer;
	@FindBy(xpath="//simple-snack-bar/span")
    WebElement successfulMessageForCreateCustomer;
	@FindBy(xpath="(//mat-error)[2]")
	WebElement errorMsgForBusinessName;
	@FindBy(xpath="//mat-select[@name='is_active']")
	WebElement status;
	@FindBy(xpath="//mat-option[1]")
	WebElement activeStatus;
	@FindBy(xpath="//mat-option[2]")
	WebElement inactiveStatus;
	@FindBy(xpath="//span[text()=' Save']/parent::button")
	WebElement saveButton;
	@FindBy(xpath="//mat-row[1]/mat-cell[1]")
	WebElement idNumber;
	@FindBy(xpath="//h2")
	WebElement customerInfoSize;
	@FindBy(xpath="//mat-row[1]/mat-cell[6]//span")
	WebElement activeAndInactiveSize;
	@FindBy(xpath="//mat-table/mat-row[1]/mat-cell[2]/span")
	WebElement businessNameClick;
	@FindBy(xpath="(//mat-card-title//span)[1]")
	WebElement customerDetailsPageSize;
	@FindBy(xpath="(//span[text()=' Create New ']/parent::button)[1]")
	WebElement createNewInCusomerSpecificRate;
	@FindBy(xpath="(//input)[8]")
	WebElement pickupInCustomerSpecificRate;
	@FindBy(xpath="(//input)[10]")
	WebElement deliveryInCustomerSpecificRate;
	@FindBy(xpath="//mat-error")
	WebElement errorMessage;
	@FindBy(xpath="//mat-select[@formcontrolname='order_type']")
	WebElement order_type;
	@FindBy(xpath="//input[@formcontrolname='rate']")
	WebElement rate;
	@FindBy(xpath="//mat-icon[text()=' cloud_upload ']")
	WebElement cloud_upload;
	@FindBy(xpath="(//input[@type='file'])[1]")
	WebElement fileUpload;
	@FindBy(xpath="(//mat-dialog-actions//button/span)[2]")
	WebElement saveButtonInCustomerSpecificRate;
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

			

	//	WebElement loadedLegPickup;
//	@FindBy(xpath="//owl-date-time-calendar/div[1]/button[2]")
//	WebElement nextMonthCalender;
//	@FindBy(xpath="//table/tbody/tr[3]/td[3]")
//	WebElement dateSelectInCalender;
//	@FindBy(xpath="//span[text()='Set']/parent::button")
//	WebElement setButtonInCalender;
//	@FindBy(xpath="//input[@formcontrolname='loadedLegDelivery']")
//	WebElement loadedLegDelivery;
//	@FindBy(xpath="//input[@formcontrolname='emptyLegPickup']")
//	WebElement emptyLegPickup;
//	@FindBy(xpath="//input[@formcontrolname='emptyLegDelivery']")
//	WebElement emptyLegDelivery;
//	@FindBy(xpath="//textarea[@name='order_notes']")
	public void adminFeature() throws InterruptedException
	{
		Thread.sleep(5000);
		action.explicitWait(driver, adminFeature, 20);
		action.scrollByVisibilityOfElement(driver, adminFeature);
		action.JSClick(driver, adminFeature);
	}
	
	public void customerManagementModule() throws InterruptedException
	{
		Thread.sleep(3000);
		action.explicitWait(driver, customerManagementModule, 20);
		action.scrollByVisibilityOfElement(driver, customerManagementModule);
		action.click(driver, customerManagementModule);
	}
	
	public String verifycustomerPageSize()
	{
		String verifycustomerPageSize = customerPageSize.getText();
		return verifycustomerPageSize;
	}
	

	public void createNew() throws InterruptedException
	{
		Thread.sleep(2000);
		action.explicitWait(driver, createNewButton, 20);
		action.scrollByVisibilityOfElement(driver, createNewButton);
		action.click(driver, createNewButton);
	}
	public String verifyaddCustomerSize()
	{
		String verifyaddCustomerSize = addCustomerSize.getText();
		return verifyaddCustomerSize;
	}

	public void businessName_customerManagement(String busiName) throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement businessName=	driver.findElement(By.xpath("//input[@formcontrolname='businessName']"));
		businessName.clear();
		businessName.sendKeys(busiName);
	}
	
	public String verifyerrorMsgForBusinessName()
	{
		String verifyerrorMsgForBusinessName = errorMsgForBusinessName.getText();
		return verifyerrorMsgForBusinessName;
	}
	
	
	public void businessPhone_customerManagement(String busiPhone)
	{
		action.explicitWait(driver, businessPhone, 20);
		action.scrollByVisibilityOfElement(driver, businessPhone);
		action.type(businessPhone, busiPhone);
	}
	
	public void businessExt_customerManagement(String busiExt)
	{
		action.explicitWait(driver, businessExt, 20);
		action.scrollByVisibilityOfElement(driver, businessExt);
		action.type(businessExt, busiExt);
	}
	
	public void businessFax_customerManagement(String faxNum)
	{
		action.explicitWait(driver, fax, 10);
		action.scrollByVisibilityOfElement(driver, fax);
		action.type(fax, faxNum);
	}
	
	public void point_of_contact_customerManagement(String pointOfContact)
	{
		action.explicitWait(driver, point_of_contact, 10);
		action.scrollByVisibilityOfElement(driver, point_of_contact);
		action.type(point_of_contact, pointOfContact);
	}
	
	public void poc_phone_customerManagement(String pocPhone)
	{
		action.explicitWait(driver, poc_phone, 10);
		action.scrollByVisibilityOfElement(driver, poc_phone);
		action.type(poc_phone, pocPhone);
	}
	
	public void poc_ext_customerManagement(String pocExt)
	{
		action.explicitWait(driver, poc_ext, 10);
		action.scrollByVisibilityOfElement(driver, poc_ext);
		action.type(poc_ext, pocExt);
	}
	
	public void email_customerManagement(String emailContent)
	{
		action.explicitWait(driver, email, 10);
		action.scrollByVisibilityOfElement(driver, email);
		action.type(email, emailContent);
	}
	
	public void createCustomer_customerManagement() throws InterruptedException
	{
		Thread.sleep(2000);
		action.explicitWait(driver, createCustomer, 20);
		action.scrollByVisibilityOfElement(driver, createCustomer);
		action.click(driver, createCustomer);
	}
	
	public boolean createCustomer1_customerManagement() throws InterruptedException
	{
		action.explicitWait(driver, createCustomer, 10);
		action.scrollByVisibilityOfElement(driver, createCustomer);
		return action.isEnabled(driver, createCustomer);
	}
	
	public String verifysuccessfulMessage()
	{
		String verifysuccessfulMessage = successfulMessageForCreateCustomer.getText();
		return verifysuccessfulMessage;
	}
	
	public void cancel_customerManagement() throws InterruptedException
	{
		action.explicitWait(driver, cancelCustomer, 10);
		action.scrollByVisibilityOfElement(driver, cancelCustomer);
		action.click(driver, cancelCustomer);
	}
	
	public void gettingAllActiveUser() throws InterruptedException
	{
		Thread.sleep(2000);
		List<String> custValue = new ArrayList<String>();
		List customerRow = driver.findElements(By.xpath("//mat-table//mat-row"));
		int customerRowSize = customerRow.size();
		System.out.println("customerRowSize :"+customerRowSize);
		String text = driver.findElement(By.xpath("//mat-card/mat-card-content/mat-paginator/div/div/div[2]/div")).getText();
		String[] text1 = text.split("of");
		String nextButton = text1[1].trim();
		System.out.println("nextButton :"+nextButton);
		int a = 10;
		int b=Integer.parseInt(nextButton);
		int mextButtonSize = b/a;
		System.out.println("mextButtonSize :"+mextButtonSize);
		for(int j=1;j<=mextButtonSize;j++) {
			if(j>1) {
				Thread.sleep(500);
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement nextButtonClick =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/button[3]")));
			nextButtonClick.click();
			}
			for(int i=1;i<=customerRowSize;i++) {
				Thread.sleep(500);
				String customerCol = driver.findElement(By.xpath("//mat-table//mat-row["+i+"]//mat-cell[6]")).getText();
				System.out.println("customerCol :"+customerCol);
				System.out.println("abvg :"+customerCol.equalsIgnoreCase("Active"));
				if(customerCol.equalsIgnoreCase("Active")) {
					String customerValue = driver.findElement(By.xpath("//mat-table//mat-row["+i+"]//mat-cell[2]//span")).getText();
					custValue.add(customerValue);
					System.out.println("customer :"+custValue);
			}
		}
	}
	}
	
//	public void deleteButtonToInactivategettingAllActiveUser() throws InterruptedException
//	{
//		Thread.sleep(2000);
//		List<String> custValue = new ArrayList<String>();
//		List customerRow = driver.findElements(By.xpath("//mat-table//mat-row"));
//		int customerRowSize = customerRow.size();
//		System.out.println("customerRowSize :"+customerRowSize);
//		String text = driver.findElement(By.xpath("//mat-card/mat-card-content/mat-paginator/div/div/div[2]/div")).getText();
//		String[] text1 = text.split("of");
//		String nextButton = text1[1].trim();
//		System.out.println("nextButton :"+nextButton);
//		int a = 10;
//		int b=Integer.parseInt(nextButton);
//		int mextButtonSize = b/a;
//		System.out.println("mextButtonSize :"+mextButtonSize);
//		for(int j=1;j<=mextButtonSize;j++) {
//			if(j>1) {
//				Thread.sleep(500);
//			WebDriverWait wait = new WebDriverWait(driver, 20);
//			WebElement nextButtonClick =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/button[3]")));
//			nextButtonClick.click();
//			}
//			for(int i=1;i<=customerRowSize;i++) {
//				Thread.sleep(500);
//				String customerCol = driver.findElement(By.xpath("//mat-table//mat-row["+i+"]//mat-cell[6]")).getText();
//				System.out.println("customerCol :"+customerCol);
//				System.out.println("abvg :"+customerCol.equalsIgnoreCase("Active"));
//				if(customerCol.equalsIgnoreCase("Active")) {
//					Thread.sleep(1000);
//					WebDriverWait wait = new WebDriverWait(driver,20);
//					WebElement del=	driver.findElement(By.xpath("(//mat-icon[text()='close'])[1]"));
//					JavascriptExecutor executor = (JavascriptExecutor)driver;
//					executor.executeScript("arguments[0].click();", del);
//					Thread.sleep(1000);
//					WebElement Delete_Button = wait
//							.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()= ' Yes ']//parent::button")));
//					executor.executeScript("arguments[0].click();", Delete_Button);
//					break;
//				}
//		
//			 }
//			break;
//	  }
//  }
	
	public void deleteButtonToInactivate() throws InterruptedException {
		String status = driver.findElement(By.xpath("//mat-table/mat-row[1]/mat-cell[6]//span")).getText();
		if(status.equals("Active")) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			WebElement delForInactivate = driver.findElement(By.xpath("//mat-table/mat-row[1]/mat-cell[7]//button[2]"));
			delForInactivate.click();
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement Delete_Button = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()= ' Yes ']//parent::button")));
			executor.executeScript("arguments[0].click();", Delete_Button);
		}
	}
	
	public void deleteButtonSize() throws InterruptedException {
		String status = driver.findElement(By.xpath("//mat-table/mat-row[1]/mat-cell[6]//span")).getText();
		if(status.equals("Active")) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			WebElement delForInactivate = driver.findElement(By.xpath("//mat-table/mat-row[1]/mat-cell[7]//button[2]"));
			delForInactivate.click();
		}
	}
	
	public void deleteButtonToActivate() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		String status = driver.findElement(By.xpath("//mat-table/mat-row[1]/mat-cell[6]//span")).getText();
		if(status.equals("Inactive")) {
			WebElement delForActivate = driver.findElement(By.xpath("//mat-table/mat-row[1]/mat-cell[7]//a"));
			executor.executeScript("arguments[0].click();", delForActivate);
		}
	}
	
	public void editButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement edit=	driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", edit);
	}
	public void editButtongettingAllActiveUser() throws InterruptedException
	{
		Thread.sleep(2000);
		List<String> custValue = new ArrayList<String>();
		List customerRow = driver.findElements(By.xpath("//mat-table//mat-row"));
		int customerRowSize = customerRow.size();
		System.out.println("customerRowSize :"+customerRowSize);
		String text = driver.findElement(By.xpath("//mat-card/mat-card-content/mat-paginator/div/div/div[2]/div")).getText();
		String[] text1 = text.split("of");
		String nextButton = text1[1].trim();
		System.out.println("nextButton :"+nextButton);
		int a = 10;
		int b=Integer.parseInt(nextButton);
		int mextButtonSize = b/a;
		System.out.println("mextButtonSize :"+mextButtonSize);
		for(int j=1;j<=mextButtonSize;j++) {
			if(j>1) {
				Thread.sleep(500);
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement nextButtonClick =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/button[3]")));
			nextButtonClick.click();
			}
			for(int i=1;i<=customerRowSize;i++) {
				Thread.sleep(500);
				String customerCol = driver.findElement(By.xpath("//mat-table//mat-row["+i+"]//mat-cell[6]")).getText();
				System.out.println("customerCol :"+customerCol);
				System.out.println("abvg :"+customerCol.equalsIgnoreCase("Active"));
				if(customerCol.equalsIgnoreCase("Active")) {
					WebDriverWait wait = new WebDriverWait(driver,20);
					WebElement edit=	driver.findElement(By.xpath("(//mat-icon[text()='edit'])[1]"));
					edit.click();
				}
			}
		}
	}
	
	public void status() throws InterruptedException
	{
		Thread.sleep(1000);
		action.explicitWait(driver, status, 20);
		action.scrollByVisibilityOfElement(driver, status);
		action.click(driver, status);
	}
	
	public void activestatus() throws InterruptedException
	{
		Thread.sleep(2000);
		action.explicitWait(driver, activeStatus, 20);
		action.click(driver, activeStatus);
	}
	
	public void inactive_status() throws InterruptedException
	{
		Thread.sleep(2000);
		action.explicitWait(driver, inactiveStatus, 20);
		action.click(driver, inactiveStatus);
	}
	
	public void saveButton() throws InterruptedException
	{
		action.explicitWait(driver, saveButton, 10);
		action.scrollByVisibilityOfElement(driver, saveButton);
		action.click(driver, saveButton);
	}
	
	public void idNumberClick() throws InterruptedException
	{
		action.explicitWait(driver, idNumber, 10);
		action.scrollByVisibilityOfElement(driver, idNumber);
		action.click(driver, idNumber);
	}
	
	public String verifySize()
	{
		String verifycustomerInfoSize = customerInfoSize.getText();
		return verifycustomerInfoSize;
	}
	public String verifyactiveAndInactiveSize()
	{
		String verifyactiveAndInactiveSize = activeAndInactiveSize.getText();
		return verifyactiveAndInactiveSize;
	}
	
	public void businessNameClick() throws InterruptedException
	{
		action.explicitWait(driver, businessNameClick, 10);
		action.scrollByVisibilityOfElement(driver, businessNameClick);
		action.click(driver, businessNameClick);
	}
	
	public String verifycustomerDetailsPageSize()
	{
		String verifycustomerDetailsPageSize = customerDetailsPageSize.getText();
		return verifycustomerDetailsPageSize;
	}
	
	public void createNewInCusomerSpecificRate() throws InterruptedException
	{
		Thread.sleep(2000);
		action.explicitWait(driver, createNewInCusomerSpecificRate, 10);
		action.scrollByVisibilityOfElement(driver, createNewInCusomerSpecificRate);
		action.click(driver, createNewInCusomerSpecificRate);
	}
	
	public void pickupInCustomerSpecificRate(String pickup) throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement pickupInCustomerSpecificRate = driver.findElement(By.xpath("(//mat-form-field)[12]//input"));
		pickupInCustomerSpecificRate.sendKeys(pickup);
		Thread.sleep(2000);
		WebElement optionPickup = driver.findElement(By.xpath("//mat-option[1]"));
		optionPickup.click();
	}
	public void deliveryInCustomerSpecificRate(String delyvery) throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement delivery = driver.findElement(By.xpath("(//mat-form-field)[14]//input"));
		delivery.sendKeys(delyvery);
		Thread.sleep(2000);
		WebElement optionPickup = driver.findElement(By.xpath("//mat-option[1]"));
		optionPickup.click();
	}
	
	public String verifyErrorMessage()
	{
		String verifyErrorMessage = errorMessage.getText();
		return verifyErrorMessage;
	}
	

	
	public void order_type() throws InterruptedException
	{
		action.explicitWait(driver, order_type, 10);
		action.scrollByVisibilityOfElement(driver, order_type);
		action.click(driver, order_type);
	}
	
	public void rate(String amount)
	{
		action.explicitWait(driver, rate, 20);
		action.scrollByVisibilityOfElement(driver, rate);
		action.type(rate, amount);
	}
	
	public void cloud_upload() throws InterruptedException
	{
		action.explicitWait(driver, cloud_upload, 10);
		action.scrollByVisibilityOfElement(driver, cloud_upload);
		action.click(driver, cloud_upload);
	}
	
	
	public void fileUpload(String file)
	{
		action.explicitWait(driver, fileUpload, 20);
		action.scrollByVisibilityOfElement(driver, fileUpload);
		action.type(fileUpload, file);
	}
	
	
	public String verifysaveButtonInCustomerSpecificRate()
	{
		String verifysaveButtonInCustomerSpecificRate = saveButtonInCustomerSpecificRate.getText();
		return verifysaveButtonInCustomerSpecificRate;
	}
}
