package com.lotustms.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.lotustms.base.BaseClass_lotusTms;
import com.lotustms.pageObjects.ChassisManagementPage;
import com.lotustms.pageObjects.LocationManagementPage;
import com.lotustms.pageObjects.LoginPage;

public class chassisName_testCase extends BaseClass_lotusTms {
	LoginPage login;
	ChassisManagementPage chassis;
	public static Logger logger = LogManager.getLogger(chassisName_testCase.class.getName());

	@Test(priority=1,description="Validate Chassis Management Page - Chassis Management")
	public void Tc_Chassis_001() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Chassis Management Page - Chassis Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		chassis = new ChassisManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		chassis.adminFeature();
		logger.info("Clicked on Admin Feature");
		chassis.chassisnManagementModule();
		logger.info("Clicked on chassis Management Module");
		Thread.sleep(2000);
		String expected = "Chassis Management";
		assertEquals((chassis.verifyChassisManagementPageSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=2,description="Validate Create Chassis page - Chassis Management")
	public void Tc_Chassis_002() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Create Chassis page - - Chassis Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		chassis = new ChassisManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		chassis.adminFeature();
		logger.info("Clicked on Admin Feature");
		chassis.chassisnManagementModule();
		logger.info("Clicked on chassis Management Module");
		chassis.createNewButton();
		logger.info("Clicked on create  button ");
		Thread.sleep(2000);
		String expected = "Add Chassis";
		assertEquals((chassis.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=3,description="Verify Chassis Management>Create New>Create button must be disabled until mandatory field is given - Chassis Management")
	public void Tc_Chassis_003() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Chassis Management>Create New>Create button must be disabled until mandatory field is given - Chassis Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		chassis = new ChassisManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		chassis.adminFeature();
		logger.info("Clicked on Admin Feature");
		chassis.chassisnManagementModule();
		logger.info("Clicked on chassis Management Module");;
		chassis.createNewButton();
		logger.info("Clicked on create new  button");
		if((chassis.create1Chassis())) {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
		else {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
	}
	
	@Test(priority=4,description="Verify Chassis Management>Create New>If address is selected in bing api, check if street,state,city,zipcode are autopopulated accordingly - Chassis Management")
	public void Tc_Chassis_004() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Chassis Management>Create New>If address is selected in bing api, check if street,state,city,zipcode are autopopulated accordingly- Chassis Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		chassis = new ChassisManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		chassis.adminFeature();
		logger.info("Clicked on Admin Feature");
		chassis.chassisnManagementModule();
		logger.info("Clicked on customer Management Module");
		chassis.createNewButton();
		logger.info("Clicked on create customer button ");
		chassis.locationName("s");
		chassis.option();
		logger.info("Entered Text on location");
		Thread.sleep(2000);
		String expected = "ng-star-inserted";
		if((chassis.verifyTextFilledInStreet()).contains(expected)) {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
		
		else {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
	}
	
	@Test(priority=5,description="Verify Chassis Management>If all the mandatory fields are given, chassis must be created successfully - Chassis Management")
	public void Tc_Chassis_005() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Chassis Management>If all the mandatory fields are given, chassis must be created successfully - Chassis Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String name = randomeWord();
		String email = randomestring()+"@gmail.com";
		String num = randomeNumber();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		chassis = new ChassisManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		chassis.adminFeature();
		logger.info("Clicked on Admin Feature");
		chassis.chassisnManagementModule();
		logger.info("Clicked on customer Management Module");
		chassis.createNewButton();
		logger.info("Clicked on create customer button");
		chassis.chassisName(name);
		logger.info("Entered Text on chassisName");
		chassis.locationName("s");
		chassis.option();
		logger.info("Entered Text on location");
		chassis.email(email);
		logger.info("Entered Text on email");
		chassis.phoneNumber(num);
		logger.info("Entered Text on phoneNumber");
		chassis.createChassis();
		logger.info("Clicked on create button");
		Thread.sleep(1000);
		String expected = "Chassis Created Successfully";
		assertEquals((chassis.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=6,description="Verify Chassis Management>create new>check if state (mandatory field) is removed, create button is disabled - Chassis Management")
	public void Tc_Chassis_006() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Chassis Management>create new>check if state (mandatory field) is removed, create button is disabled - Chassis Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String name = randomeWord();
		String email = randomestring()+"@gmail.com";
		String num = randomeNumber();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		chassis = new ChassisManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		chassis.adminFeature();
		logger.info("Clicked on Admin Feature");
		chassis.chassisnManagementModule();
		logger.info("Clicked on customer Management Module");
		chassis.createNewButton();
		logger.info("Clicked on create customer button");
		chassis.chassisName(name);
		logger.info("Entered Text on chassisName");
		chassis.locationName("s");
		chassis.option();
		logger.info("Entered Text on location");
		chassis.email(email);
		logger.info("Entered Text on email");
		chassis.phoneNumber(num);
		logger.info("Entered Text on phoneNumber");
		chassis.state();
		chassis.createChassis();
		logger.info("Clicked on create button");
		Thread.sleep(1000);
		if((chassis.create1Chassis())) {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
		else {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
	}
	
	@Test(priority=7,description="Verify Chassis Management>On click of ID, chassis company info must be visible - Chassis Management")
	public void Tc_Chassis_007() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Chassis Management>On click of ID, chassis company info must be visible - Chassis Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		chassis = new ChassisManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		chassis.adminFeature();
		logger.info("Clicked on Admin Feature");
		chassis.chassisnManagementModule();
		logger.info("Clicked on chassis Management Module");
		chassis.idNumber();
		logger.info("Clicked on id number");
		Thread.sleep(1000);
		String expected = "Chassis Company Info";
		assertEquals((chassis.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=8,description="Verify Chassis Management>Edit>On editing the details, it must be updated successfully - Chassis Management")
	public void Tc_Chassis_008() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Chassis Management>Edit>On editing the details, it must be updated successfully - Chassis Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String name = randomeWord();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		chassis = new ChassisManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		chassis.adminFeature();
		logger.info("Clicked on Admin Feature");
		chassis.chassisnManagementModule();
		logger.info("Clicked on chassis Management Module");
		chassis.editButton();
		logger.info("Clicked on edit Button");
		chassis.chassisName(name);
		logger.info("Entered Text on chassisName");
		chassis.saveButton();
		logger.info("Clicked on save Button");
		Thread.sleep(1000);
		String expected = "Chassis Information Updated successfully";
		assertEquals((chassis.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=9,description="Verify Chassis Management>Edit>On click of edit>edit details screen must be popped up - Chassis Management")
	public void Tc_Chassis_009() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Chassis Management>Edit>On click of edit>edit details screen must be popped up - Chassis Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String name = randomeWord();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		chassis = new ChassisManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		chassis.adminFeature();
		logger.info("Clicked on Admin Feature");
		chassis.chassisnManagementModule();
		logger.info("Clicked on chassis Management Module");
		chassis.editButton();
		logger.info("Clicked on edit Button");
		Thread.sleep(1000);
		String expected = "Edit Chassis";
		assertEquals((chassis.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=10,description="Verify Chassis Management>delete>on acceptance of confirmation message, entry must be deleted successfully - Chassis Management")
	public void Tc_Chassis_010() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Chassis Management>delete>on acceptance of confirmation message, entry must be deleted successfully - Chassis Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String name = randomeWord();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		chassis = new ChassisManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		chassis.adminFeature();
		logger.info("Clicked on Admin Feature");
		chassis.chassisnManagementModule();
		logger.info("Clicked on chassis Management Module");
		chassis.deleteButton();
		logger.info("Clicked on delete Button");
		chassis.yesDeleteButton();
		logger.info("Clicked on yes delete Button");
		Thread.sleep(1000);
		String expected = "Chassis Deleted Successfully";
		assertEquals((chassis.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=11,description="Verify Chassis Management>Edit>On click of edit>edit details screen must be popped up - Chassis Management")
	public void Tc_Chassis_011() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Chassis Management>Edit>On click of edit>edit details screen must be popped up - Chassis Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String name = randomeWord();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		chassis = new ChassisManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		chassis.adminFeature();
		logger.info("Clicked on Admin Feature");
		chassis.chassisnManagementModule();
		logger.info("Clicked on chassis Management Module");
		chassis.deleteButton();
		logger.info("Clicked on delete Button");
		Thread.sleep(1000);
		String expected = "Confirmation";
		assertEquals((chassis.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=12,description="Verify Chassis Management>If all the mandatory fields are given, chassis must be created successfully - Chassis Management")
	public void Tc_Chassis_012() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Chassis Management>If all the mandatory fields are given, chassis must be created successfully - Chassis Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String name = randomeWord();
		String email = randomestring()+"@gmail.com";
		String num = randomeNumber();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		chassis = new ChassisManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		chassis.adminFeature();
		logger.info("Clicked on Admin Feature");
		chassis.chassisnManagementModule();
		logger.info("Clicked on customer Management Module");
		chassis.createNewButton();
		logger.info("Clicked on create customer button");
		chassis.chassisName(name);
		logger.info("Entered Text on chassisName");
		chassis.locationName("s");
		chassis.option();
		logger.info("Entered Text on location");
		chassis.email(email);
		logger.info("Entered Text on email");
		chassis.phoneNumber(num);
		logger.info("Entered Text on phoneNumber");
		chassis.createChassis();
		logger.info("Clicked on create button");
		Thread.sleep(2000);
		driver.navigate().refresh();
		chassis.chassis_nameSearch(name);
		Thread.sleep(1000);
		String expected = name;
		assertEquals((chassis.verifychassisNameSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	
} 
