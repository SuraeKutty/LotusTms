package com.lotustms.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.lotustms.base.BaseClass_lotusTms;
import com.lotustms.pageObjects.CustomerManagement;
import com.lotustms.pageObjects.LoginPage;
import com.lotustms.pageObjects.UserManagement;

public class customerManagement_testCase extends BaseClass_lotusTms {
	LoginPage login;
	CustomerManagement customer;
	public static Logger logger = LogManager.getLogger(customerManagement_testCase.class.getName());

	@Test(priority=1,description="Validate CustomerManagement page - Customer Management")
	public void Tc_Customer_001() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate CustomerManagement page - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		Thread.sleep(2000);
		String expected = "Customer Management";
		assertEquals((customer.verifycustomerPageSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=2,description="Validate Create Customer page - Customer Management")
	public void Tc_Customer_002() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Create Customer page - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.createNew();
		logger.info("Clicked on create customer button ");
		Thread.sleep(2000);
		String expected = "Add Customer";
		assertEquals((customer.verifyaddCustomerSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=3,description="Verify Customer Management>Create New>Create button must be disabled until Business Name & Email option is given - Customer Management")
	public void Tc_Customer_003() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>Create New>Create button must be disabled until Business Name & Email option is given - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.createNew();
		logger.info("Clicked on create customer button");
		if((customer.createCustomer1_customerManagement())) {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
		else {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
	}
	
	
	@Test(priority=4,description="Verify Customer Management>Create New>If all mandatory fields are given, customer must be created successfully. - Customer Management")
	public void Tc_Customer_004() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>Create New>If all mandatory fields are given, customer must be created successfully. - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String text= randomestring()+"@gmail.com";
		String text1= randomestring();
		String text2= randomeNumber();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.createNew();
		logger.info("Clicked on create customer button");
		customer.businessName_customerManagement(text1);
		logger.info("Entered Text on businessName");
		customer.businessPhone_customerManagement(text2);
		logger.info("Entered Text on businessPhone");
		customer.businessExt_customerManagement(text2);
		logger.info("Entered Text on businessExt");
		customer.businessFax_customerManagement(text2);
		logger.info("Entered Text on businessFax");
		customer.point_of_contact_customerManagement(text1);
		logger.info("Entered Text on point of contact");
		customer.poc_phone_customerManagement(text2);
		logger.info("Entered Text on poc phone");
		customer.poc_ext_customerManagement(text2);
		logger.info("Entered Text on poc ext");
		customer.email_customerManagement(text);
		logger.info("Entered Text on businessName");
		customer.createCustomer_customerManagement();
		logger.info("Clicked on create customer");
//		Thread.sleep(1000);
		String expected = "Customer Created Successfully";
		assertEquals((customer.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	
	@Test(priority=5,description="Verify Customer Management>Check if space char is given, null value is accepted in Business Name - Customer Management")
	public void Tc_Customer_005() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>Check if space char is given, null value is accepted in Business Name. - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.createNew();
		logger.info("Clicked on create customer button");
		customer.businessName_customerManagement(" ");
		logger.info("Entered Text on businessName");
		customer.createCustomer_customerManagement();
		logger.info("Clicked on create customer");
		Thread.sleep(1000);
		String expected = "Business Name must not contain space at start and end";
		assertEquals((customer.verifyerrorMsgForBusinessName()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=6,description="Verify Customer Management>Create New>If user enter duplicate mail, check if proper error message is given. - Customer Management")
	public void Tc_Customer_006() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>Create New>If user enter duplicate mail, check if proper error message is given. - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String email = ExcelFile("customerManagement",1,7);
		String text1= randomestring();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.createNew();
		logger.info("Clicked on create customer button");
		customer.businessName_customerManagement(text1);
		logger.info("Entered Text on businessName");
		customer.email_customerManagement(email);
		logger.info("Entered Text on businessName");
		customer.createCustomer_customerManagement();
		logger.info("Clicked on create customer");
		Thread.sleep(2000);
		String expected = "Duplicate Email. Please Use Different Email";
		assertEquals((customer.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=7,description="Verify Customer Management>Create New>Verify on click of cancel button, Add Customer screen closes - Customer Management")
	public void Tc_Customer_007() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>Create New>Verify on click of cancel button, Add Customer screen closes. - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.createNew();
		logger.info("Clicked on create customer button");
		customer.cancel_customerManagement();
		logger.info("Clicked on cancel customer");
		Thread.sleep(2000);
		String expected = "Customer Management";
		assertEquals((customer.verifycustomerPageSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=8,description="Verify Customer Management>If inactivate option is clicked , active customer must be inactivated - Customer Management")
	public void Tc_Customer_008() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>If inactivate option is clicked , active customer must be inactivated - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.status();
		customer.activestatus();
		logger.info("Clicked on status dropdown");
		Thread.sleep(2000);
		customer.deleteButtonToInactivate();
		logger.info("Clicked on delete button");
		Thread.sleep(1000);
		String expected = "Customer Deactivated Successfully";
		assertEquals((customer.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=9,description="Verify Customer Management>If Activate option is clicked , active customer must be inactivated - Customer Management")
	public void Tc_Customer_009() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>If Activate option is clicked , active customer must be inactivated - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.status();
		customer.inactive_status();
		logger.info("Clicked on status dropdown");
		Thread.sleep(2000);
		customer.deleteButtonToActivate();
		logger.info("Clicked on delete button");
		Thread.sleep(2000);
		String expected = "Customer Activated Successfully";
		assertEquals((customer.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=10,description="Verify Customer Management>If user edits customer details, user must be updated successfully with a success message - Customer Management")
	public void Tc_Customer_010() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>If user edits customer details, user must be updated successfully with a success message - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.status();
		customer.activestatus();
		logger.info("Clicked on status dropdown");
		Thread.sleep(2000);
		customer.editButton();
		logger.info("Clicked on delete button");
		String text1= randomestring();
		customer.businessName_customerManagement(text1);
		logger.info("Entered Text on businessName");
		customer.saveButton();
		logger.info("Clicked on save button");
//		Thread.sleep(1000);
		String expected = "Customer Updated Successfully";
		assertEquals((customer.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=11,description="Verify Customer Management>Check on click of ID, customer info screen pops up - Customer Management")
	public void Tc_Customer_011() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>Check on click of ID, customer info screen pops up - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.status();
		customer.activestatus();
		logger.info("Clicked on status dropdown");
		Thread.sleep(1000);
		customer.idNumberClick();
		logger.info("Clicked on idNumber button");
		Thread.sleep(1000);
		String expected = "Customer Info";
		assertEquals((customer.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=12,description="Verify Customer Management>On click of Inactive icon, check confirmaion message pops up - Customer Management")
	public void Tc_Customer_012() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>On click of Inactive icon, check confirmaion message pops up - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.status();
		customer.activestatus();
		logger.info("Clicked on status dropdown");
		Thread.sleep(2000);
		customer.deleteButtonSize();
		logger.info("Clicked on delete button");
		Thread.sleep(1000);
		String expected = "Confirmation";
		assertEquals((customer.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=13,description="Verify Customer Management>On click of Status(Active) dropdown at the search, check if it is searched as per the selected input - Customer Management")
	public void Tc_Customer_013() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>On click of Status(Active) dropdown at the search, check if it is searched as per the selected input - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.status();
		customer.activestatus();
		logger.info("Clicked on status dropdown");
		Thread.sleep(1000);
		String expected = "Active";
		assertEquals((customer.verifyactiveAndInactiveSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=14,description="Verify Customer Management>On click of Status(InActive) dropdown at the search, check if it is searched as per the selected input - Customer Management")
	public void Tc_Customer_014() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>On click of Status(InActive) dropdown at the search, check if it is searched as per the selected input - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.status();
		customer.inactive_status();
		logger.info("Clicked on status dropdown");
		Thread.sleep(1000);
		String expected = "Inactive";
		assertEquals((customer.verifyactiveAndInactiveSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=15,description="Verify Customer Management>On click of Business name,customer details page should open - Customer Management")
	public void Tc_Customer_015() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>On click of Business name,customer details page should open - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.status();
		customer.activestatus();
		logger.info("Clicked on status dropdown");
		Thread.sleep(1000);
		customer.businessNameClick();
		logger.info("Clicked on businessName Click");
		Thread.sleep(1000);
		String expected = "Customer Specific Invoices";
		assertEquals((customer.verifycustomerDetailsPageSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	
	@Test(priority=16,description="Verify Customer Management>Customer details page>Customer specific rates>Create New>Route rate screen must be opened - Customer Management")
	public void Tc_Customer_016() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>Customer details page>Customer specific rates>Create New>Route rate screen must be opened - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.status();
		customer.activestatus();
		logger.info("Clicked on status dropdown");
		Thread.sleep(1000);
		customer.businessNameClick();
		logger.info("Clicked on businessName Click");
		customer.createNewInCusomerSpecificRate();
		logger.info("Clicked on createNew button");
		Thread.sleep(1000);
		String expected = "Add Customer Specific Route Rate";
		assertEquals((customer.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=17,description="Verify Customer Management>Add Customer rates>Create button must be disabled until mandatory field is given - Customer Management")
	public void Tc_Customer_017() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Management>Add Customer rates>Create button must be disabled until mandatory field is given - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.status();
		customer.activestatus();
		logger.info("Clicked on status dropdown");
		Thread.sleep(1000);
		customer.businessNameClick();
		logger.info("Clicked on businessName Click");
		customer.createNewInCusomerSpecificRate();
		logger.info("Clicked on createNew button");
		if ((customer.createCustomer1_customerManagement())) {
			assertTrue(false);
			logger.info("Test Case is Failed");
		} else {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
	}
	
	@Test(priority=18,description="Verify Customer Specific rates>must be reflected in order creation if customer type, pickup & drop location are same - Customer Management")
	public void Tc_Customer_018() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Specific rates>must be reflected in order creation if customer type, pickup & drop location are same - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.status();
		customer.activestatus();
		logger.info("Clicked on status dropdown");
		Thread.sleep(1000);
		customer.businessNameClick();
		logger.info("Clicked on businessName Click");
		customer.createNewInCusomerSpecificRate();
		logger.info("Clicked on createNew button");
		customer.pickupInCustomerSpecificRate("f");
		logger.info("Entered text on pickup");
		customer.deliveryInCustomerSpecificRate("f");
		logger.info("Entered text on delivery");
		customer.createCustomer_customerManagement();
		logger.info("Clicked on create button");
		Thread.sleep(1000);
		String expected = "Delivery Name Address must not be same as Pickup Address";
		assertEquals((customer.verifyErrorMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=19,description="Verify Customer Specific rates>must be reflected in order creation if customer type, pickup & drop location are same - Customer Management")
	public void Tc_Customer_019() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer Specific rates>must be reflected in order creation if customer type, pickup & drop location are same - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.status();
		customer.activestatus();
		logger.info("Clicked on status dropdown");
		Thread.sleep(2000);
		customer.businessNameClick();
		logger.info("Clicked on businessName Click");
		customer.createNewInCusomerSpecificRate();
		logger.info("Clicked on createNew button");
		customer.cancel_customerManagement();
		logger.info("Clicked on cancel button");
		Thread.sleep(3000);
		customer.createNewInCusomerSpecificRate();
		logger.info("Clicked on createNew button");
		customer.pickupInCustomerSpecificRate("f");
		logger.info("Entered text on pickup");
		customer.deliveryInCustomerSpecificRate("t");
		logger.info("Entered text on delivery");
		Thread.sleep(3000);
		customer.order_type();
		customer.activestatus();
		logger.info("Clicked on order_type dropdown");
		String number= randomeFourNumber();
		customer.rate(number);
		logger.info("Entered text on rate");
		customer.createCustomer_customerManagement();
		logger.info("Clicked on create button");
//		Thread.sleep(1000);
		String expected = "New Route Rate Created Successfully";
		assertEquals((customer.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=20,description="Verify Customer details>On click of upload , upload document fields must be popped up & user must be able to upload documents - Customer Management")
	public void Tc_Customer_020() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Customer details>On click of upload , upload document fields must be popped up & user must be able to upload documents - Customer Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		customer = new CustomerManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		customer.adminFeature();
		logger.info("Clicked on Admin Feature");
		customer.customerManagementModule();
		logger.info("Clicked on customerManagement Module");
		customer.status();
		customer.activestatus();
		logger.info("Clicked on status dropdown");
		Thread.sleep(2000);
		customer.businessNameClick();
		logger.info("Clicked on businessName Click");
		customer.cloud_upload();
		logger.info("Clicked on cloud_upload button");
		customer.fileUpload("D:\\VprofileProjectSetup");
		logger.info("Entered text on fileUpload");
		Thread.sleep(1000);
		String expected = "Save";
		assertEquals((customer.verifysaveButtonInCustomerSpecificRate()), expected);
		logger.info("Test Case is Passsed");
	}
	
}
