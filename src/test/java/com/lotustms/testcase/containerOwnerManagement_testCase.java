package com.lotustms.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.lotustms.base.BaseClass_lotusTms;
import com.lotustms.pageObjects.ChassisManagementPage;
import com.lotustms.pageObjects.LoginPage;
import com.lotustms.pageObjects.containerOwnerManagementPage;

public class containerOwnerManagement_testCase extends BaseClass_lotusTms {
	LoginPage login;
	containerOwnerManagementPage container;
	public static Logger logger = LogManager.getLogger(containerOwnerManagement_testCase.class.getName());

	@Test(priority=1,description="Validate container Owner Management Page - container Management")
	public void Tc_ContainerOwnerManagement_001() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate container Owner Management Page - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		Thread.sleep(2000);
		String expected = "Container Owner Management";
		assertEquals((container.verifyContainerManagementPageSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=2,description="Validate Create container page - container Management")
	public void Tc_ContainerOwnerManagement_002() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Create container page - - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.createNewButton();
		logger.info("Clicked on create button ");
		Thread.sleep(2000);
		String expected = "Add Container";
		assertEquals((container.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	

	@Test(priority=3,description="Verify Container Management>Create New>Create button must be disabled until mandatory field is given - Container Management")
	public void Tc_ContainerOwnerManagement_003() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container Management>Create New>Create button must be disabled until mandatory field is given - Container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");;
		container.createNewButton();
		logger.info("Clicked on create new  button");
		if((container.create1container())) {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
		else {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
	}
	
	@Test(priority=4,description="Validate Container owner>create new>container owner must be created if all mandatory fields are given - container Management")
	public void Tc_ContainerOwnerManagement_004() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Container owner>create new>container owner must be created if all mandatory fields are given - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String email = randomestring()+"@gmail.com";
		String word = randomeWord();
		String number = randomeNumber();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.createNewButton();
		logger.info("Clicked on create button");
		container.containerName(word);
		logger.info("Entered Text on containerName");
		container.locationName("s");
		container.option();
		logger.info("Entered Text on locationName");
		container.phoneNumber(number);
		logger.info("Entered Text on phoneNumber");
		container.email(email);
		logger.info("Entered Text on email");
		container.name("s");
		container.option();
		logger.info("Entered Text on name");
		container.preferredChassisRental();
		container.option();
		container.checkbox();
		logger.info("Clicked on pcr");
		container.createcontainer();
		logger.info("Clicked on createcontainer");
		Thread.sleep(1000);
		String expected = "Container Created Successfully\"";
		assertEquals((container.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=5,description="Verify Container owner>create new>add location>user must be able to add the new location - container Management")
	public void Tc_ContainerOwnerManagement_005() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>create new>add location>user must be able to add the new location - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String word = randomeWord();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.createNewButton();
		logger.info("Clicked on create button");
		container.add_location();
		logger.info("Clicked on add_location");
		container.locationType();
		container.option();
		logger.info("Clicked on create locationType dropdown ");
		container.locationName1(word);
		logger.info("Entered Text on locationName");
		container.bingApiAddress("s");
		container.option();
		logger.info("Entered Text on bingApiAddress");
		container.createLocation_locationManagement();
		logger.info("Clicked on createcontainer");
		Thread.sleep(4000);
		String expected = "mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-pristine ng-touched ng-valid";
		assertEquals((container.locationName2()), expected);
		logger.info("Test Case is Passsed");
	}
	
	
	@Test(priority=6,description="Verify Container owner>Create new>Check if we can add upto three mail id's in email field - container Management")
	public void Tc_ContainerOwnerManagement_006() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>Create new>Check if we can add upto three mail id's in email field - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String email = randomestring()+"@gmail.com";
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.createNewButton();
		logger.info("Clicked on create button");
		container.email(email);
		container.email_addButton();
		logger.info("Entered Text on email1");
		container.email1(email);
		container.email_addButton();
		logger.info("Entered Text on email2");
		container.email2(email);
		logger.info("Entered Text on email3");
		if((container.verifydeleteSize()) > 0) {
			assertTrue(true);
			logger.info("Test Case is Passsed");
			
		}
		else {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
	}
	
	
	@Test(priority=7,description="Verify Container owner>Create new>Check if add button in email works only after entering one proper email - container Management")
	public void Tc_ContainerOwnerManagement_007() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>Create new>Check if add button in email works only after entering one proper email - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String invalid_email = randomestring();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.createNewButton();
		logger.info("Clicked on create button");
		container.email(invalid_email);
		container.email_addButton();
		logger.info("Entered Text on email1");
		Thread.sleep(1000);
		String expected = "Enter a valid email";
		assertEquals((container.verifyemailErrorMsg()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=8,description="Verify Container owner>Create new>check if email can be deleted  - container Management")
	public void Tc_ContainerOwnerManagement_008() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>Create new>check if email can be deleted  - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String email = randomestring()+"@gmail.com";
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.createNewButton();
		logger.info("Clicked on create button");
		container.email(email);
		container.email_addButton();
		logger.info("Entered Text on email1");
		container.email1(email);
		logger.info("Entered Text on email1");
		container.deleteBUttonForEmail();
		logger.info("Clicked on deleteBUtton For Email");
		if((container.verifyemailSize()) == 0) {
			assertTrue(true);
			logger.info("Test Case is Passsed");
			
		}
		else {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
	}
	
	@Test(priority=9,description="Verify Container owner>Create new>Check if delete icon is not given for single email - container Management")
	public void Tc_ContainerOwnerManagement_009() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>Create new>Check if delete icon is not given for single email - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String email = randomestring()+"@gmail.com";
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.createNewButton();
		logger.info("Clicked on create button");
		container.email(email);
		logger.info("Entered Text on email1");
		if((container.verifydeleteSize()) == 0) {
			assertTrue(true);
			logger.info("Test Case is Passsed");
			
		}
		else {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
	}
	
	@Test(priority=10,description="Verify Container owner>Create new>check if add button in empty/pickup location is enabled only after one proper entry is given - container Management")
	public void Tc_ContainerOwnerManagement_010() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>Create new>check if add button in empty/pickup location is enabled only after one proper entry is given - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.createNewButton();
		logger.info("Clicked on create button");
		container.name("s");
		container.option();
		logger.info("Entered Text on empty/pickup location");
		container.addButtonForName();
		logger.info("Clicked on add button");
		if((container.verifynameSize()) > 0) {
			assertTrue(true);
			logger.info("Test Case is Passsed");
			
		}
		else {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
	}
	
	@Test(priority=11,description="Verify Container owner>Create new>Check if delete option works in empty/pickup location - container Management")
	public void Tc_ContainerOwnerManagement_011() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>Create new>Check if delete option works in empty/pickup location - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.createNewButton();
		logger.info("Clicked on create button");
		container.name("s");
		container.option();
		logger.info("Entered Text on empty/pickup location");
		container.addButtonForName();
		logger.info("Clicked on add button");
		container.name("s");
		container.option();
		logger.info("Entered Text on empty/pickup location");
		container.removeButtonForName();
		logger.info("Clicked on remove button");
		Thread.sleep(500);
		if((container.verifynameSize()) ==  0) {
			assertTrue(true);
			logger.info("Test Case is Passsed");
			
		}
		else {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
	}
	
	@Test(priority=12,description="Verify Container owner>Edit details>check If user is able to edit the details correctly - container Management")
	public void Tc_ContainerOwnerManagement_012() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>Edit details>check If user is able to edit the details correctly - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String num = randomeNumber();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.editButton();
		logger.info("Clicked on create button");
		container.phoneNumber(num);
		logger.info("Entered Text on phoneNumber");
		container.saveButton();
		logger.info("Clicked on save button");
		Thread.sleep(1000);
		String expected = "Container Updated Successfully";
		assertEquals((container.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	

	@Test(priority=13,description="Verify Container owner>Edit details>Check if mandatory fields are left blank in edit, save button is disabled - container Management")
	public void Tc_ContainerOwnerManagement_013() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>Edit details>Check if mandatory fields are left blank in edit, save button is disabled - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.editButton();
		logger.info("Clicked on create button");
		container.phoneNumber1();
		logger.info("Entered Text on phoneNumber");
		container.addButtonForName();
		logger.info("Clicked on add button");
		if((container.verifysaveButtonSize())) {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
		else {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
	}
	
	
	@Test(priority=14,description="Verify Container owner>Check if pCR popup shows on click - container Management")
	public void Tc_ContainerOwnerManagement_014() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>Check if pCR popup shows on click - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.more_horiz();
		logger.info("Clicked on more_horiz button");
		Thread.sleep(1000);
		String expected = "Preferred Chassis Rental Info";
		assertEquals((container.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	
	@Test(priority=15,description="Verify Container owner>Check if PCR details are updated in popup screen,after addtion of deletion of PCR - container Management")
	public void Tc_ContainerOwnerManagement_015() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>Check if PCR details are updated in popup screen,after addtion of deletion of PCR - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.more_horiz();
		logger.info("Clicked on more_horiz button");
		if((container.verifysizeOf_more_horiz())>0) {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		
		}
		else {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
	}
	
	@Test(priority=16,description="Verify Container owner>ID>On click of ID,container info details must be popped up- container Management")
	public void Tc_ContainerOwnerManagement_016() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>ID>On click of ID,container info details must be popped up - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.idNumber();
		logger.info("Clicked on idNumber button");
		Thread.sleep(1000);
		String expected = "Container Info";
		assertEquals((container.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=17,description="Verify Container owner>on click of delete>check If confirmation message pops up- container Management")
	public void Tc_ContainerOwnerManagement_017() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>on click of delete>check If confirmation message pops up - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.close();
		logger.info("Clicked on close button");
		Thread.sleep(1000);
		String expected = "Confirmation";
		assertEquals((container.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=18,description="Verify Container owner>on click of delete>check If confirmation message pops up- container Management")
	public void Tc_ContainerOwnerManagement_018() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Container owner>on click of delete>check If confirmation message pops up - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.close();
		logger.info("Clicked on close button");
		container.Delete();
		logger.info("Clicked on Delete button");
		Thread.sleep(500);
		String expected = "Container Deleted Successfully";
		assertEquals((container.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=19,description="Verify Order management & edit order>create order>container owner field>check if container owner is selected, the respective PCR is displayed in the chassis field - container Management")
	public void Tc_ContainerOwnerManagement_019() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Order management & edit order>create order>container owner field>check if container owner is selected, the respective PCR is displayed in the chassis field - container Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String num = randomeNumber();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		container = new containerOwnerManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		container.adminFeature();
		logger.info("Clicked on Admin Feature");
		container.containerManagementModule();
		logger.info("Clicked on container Management Module");
		container.edit();
		logger.info("Clicked on close button");
		container.phoneNumber(num);
		logger.info("Entered text on phone number");
		container.saveButton();
		logger.info("Clicked on save button");
		Thread.sleep(1000);
		String expected = "Container Updated Successfully";
		assertEquals((container.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
}
