package com.lotustms.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.lotustms.base.BaseClass_lotusTms;
import com.lotustms.pageObjects.EquipmentManagementPage;
import com.lotustms.pageObjects.LoginPage;
import com.lotustms.pageObjects.UserManagement;

public class EquipmentManagement_testCase extends BaseClass_lotusTms {
	LoginPage login;
	EquipmentManagementPage equip;
	public static Logger logger = LogManager.getLogger(EquipmentManagement_testCase.class.getName());

	@Test(priority=1,description="Validate EquipmentManagement page - Equipment Management")
	public void Tc_EquipmentManagement_001() throws IOException, InterruptedException {
		log = reports.createTest("Validate userManagement page");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		equip = new EquipmentManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		equip.adminFeature();
		logger.info("Clicked on Admin Feature");
		equip.containerManagementModule();
		logger.info("Clicked on Equipment module");
		String expected = "Equipment Management";
		assertEquals((equip.verifyContainerManagementPageSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=2,description="Validate Create container page - Equipment Management")
	public void Tc_EquipmentManagement_002() throws IOException, InterruptedException {
		log = reports.createTest("Validate Create container page - Equipment Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		equip = new EquipmentManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		equip.adminFeature();
		logger.info("Clicked on Admin Feature");
		equip.containerManagementModule();
		logger.info("Clicked on Equipment module");
		equip.createNewButton();
		logger.info("Clicked on createNew Button");
		String expected = "Add Equipment";
		assertEquals((equip.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=3,description="Verify Create new>Create button must be disabled until mandatory fields are given - Equipment Management")
	public void Tc_EquipmentManagement_003() throws IOException, InterruptedException {
		log = reports.createTest("Verify Create new>Create button must be disabled until mandatory fields are given - Equipment Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		equip = new EquipmentManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		equip.adminFeature();
		logger.info("Clicked on Admin Feature");
		equip.containerManagementModule();
		logger.info("Clicked on Equipment module");
		equip.createNewButton();
		logger.info("Clicked on createNew Button");
		if((equip.create1Equipment())) {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
		else {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
	}
	
	@Test(priority=4,description="Validate Create new>Equipment type>check if equipment list is displayed from menu config>equip type - Equipment Management")
	public void Tc_EquipmentManagement_004() throws Exception {
		log = reports.createTest("Validate Create new>Equipment type>check if equipment list is displayed from menu config>equip type - Equipment Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String word = randomeWord();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		equip = new EquipmentManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		equip.adminFeature();
		logger.info("Clicked on Admin Feature");
		equip.containerManagementModule();
		logger.info("Clicked on Equipment module");
		equip.createNewButton();
		logger.info("Clicked on createNew Button");
		equip.equipment_type_id();
		equip.option();
		logger.info("Clicked on equipment_type_id");
		equip.name(word);
		logger.info("Entered text on name");
		equip.make(word);
		logger.info("Entered text on make");
		equip.model(word);
		logger.info("Entered text on model");
		equip.year();
		equip.option();
		logger.info("Clicked on year dropdown");
		equip.vin(word);
		logger.info("Entered text on vin");
		equip.license(word);
		logger.info("Entered text on license");
		equip.state("s");
		equip.option();
		logger.info("Entered text on state");
		equip.license_expiry();
		equip.clickNextMonth();
		equip.clickDate();
		logger.info("Clicked on license_expiry");
		equip.equipment_location_id();
		equip.option();
		logger.info("Clicked on equipment_location_id");
		equip.remarks(word);
		logger.info("Entered text on state");
		equip.createEquipment();
		logger.info("Clicked on createEquipment button");
		Thread.sleep(500);
		String expected = "Equipment Created Successfully";
		assertEquals((equip.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=5,description="Validate Create new>Equipment type>if equipment type is truck, check if an additional field Truck # is displayed - Equipment Management")
	public void Tc_EquipmentManagement_005() throws Exception {
		log = reports.createTest("Validate Create new>Equipment type>if equipment type is truck, check if an additional field Truck # is displayed - Equipment Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String word = randomeWord();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		equip = new EquipmentManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		equip.adminFeature();
		logger.info("Clicked on Admin Feature");
		equip.containerManagementModule();
		logger.info("Clicked on Equipment module");
		equip.createNewButton();
		logger.info("Clicked on createNew Button");
		equip.equipment_type_id();
		equip.option8();
		logger.info("Clicked on equipment_type_id");
		logger.info("Entered text on model");
		if((equip.verifytruck_no()) > 0) {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
		else {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
	}
	
	@Test(priority=6,description="Validate Create new>check if past dates are blocked in license expiry field - Equipment Management")
	public void Tc_EquipmentManagement_006() throws IOException, InterruptedException {
		log = reports.createTest("Validate Create new>check if past dates are blocked in license expiry field - Equipment Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		equip = new EquipmentManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		equip.adminFeature();
		logger.info("Clicked on Admin Feature");
		equip.containerManagementModule();
		logger.info("Clicked on Equipment module");
		equip.createNewButton();
		logger.info("Clicked on createNew Button");
		equip.license_expiry();
		logger.info("Clicked on license_expiry");
		if((equip.verifybuttonIsEnabled())) {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
		else {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
	}
	
	@Test(priority=7,description="Validate Update location>On click of update location, check if update location pops up - Equipment Management")
	public void Tc_EquipmentManagement_007() throws IOException, InterruptedException {
		log = reports.createTest("Validate Update location>On click of update location, check if update location pops up - Equipment Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		equip = new EquipmentManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		equip.adminFeature();
		logger.info("Clicked on Admin Feature");
		equip.containerManagementModule();
		logger.info("Clicked on Equipment module");
		equip.near_me();
		logger.info("Clicked on near_me Button");
		equip.toLocation_nearme();
		equip.option();
		logger.info("Clicked on toLocation_nearme Button");
		String expected = "Update Location";
		assertEquals((equip.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=8,description="Validate Update location>Check if a location is updated, changes are reflected in the location column - Equipment Management")
	public void Tc_EquipmentManagement_008() throws IOException, InterruptedException {
		log = reports.createTest("Validate Update location>Check if a location is updated, changes are reflected in the location column - Equipment Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		equip = new EquipmentManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		equip.adminFeature();
		logger.info("Clicked on Admin Feature");
		equip.containerManagementModule();
		logger.info("Clicked on Equipment module");
		equip.near_me();
		logger.info("Clicked on near_me Button");
		equip.toLocation_nearme();
		equip.option();
		logger.info("Clicked on toLocation_nearme Button");
		Thread.sleep(1000);
		String expected = "St Joe MO";
		assertEquals((equip.verify_getTextFromLocation()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=9,description="Validate ID>On click of ID, check if Equipment info screen is popped up - Equipment Management")
	public void Tc_EquipmentManagement_009() throws IOException, InterruptedException {
		log = reports.createTest("Validate ID>On click of ID, check if Equipment info screen is popped up - Equipment Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		equip = new EquipmentManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		equip.adminFeature();
		logger.info("Clicked on Admin Feature");
		equip.containerManagementModule();
		logger.info("Clicked on Equipment module");
		equip.idNumber();
		logger.info("Clicked on near_me Button");
		Thread.sleep(1000);
		String expected = "Equipment Info";
		assertEquals((equip.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=10,description="Validate Edit>Check if on click of edit, edited successfully  message is popped up - Equipment Management")
	public void Tc_EquipmentManagement_010() throws IOException, InterruptedException {
		log = reports.createTest("Validate Edit>Check if on click of edit, edited successfully  message is popped up - Equipment Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String word = randomeWord();

		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		equip = new EquipmentManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		equip.adminFeature();
		logger.info("Clicked on Admin Feature");
		equip.containerManagementModule();
		logger.info("Clicked on Equipment module");
		equip.editButton();
		logger.info("Clicked on edit Button");
		equip.name(word);
		logger.info("Entered text on name");
		equip.saveButton();
		logger.info("Clicked on save Button");
		Thread.sleep(1000);
		String expected = "Equipment Updated Successfully";
		assertEquals((equip.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=11,description="Validate Delete>Check if after confirmation, equipment is able to delete successfully - Equipment Management")
	public void Tc_EquipmentManagement_011() throws IOException, InterruptedException {
		log = reports.createTest("Validate Delete>Check if after confirmation, equipment is able to delete successfully - Equipment Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		equip = new EquipmentManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		equip.adminFeature();
		logger.info("Clicked on Admin Feature");
		equip.containerManagementModule();
		logger.info("Clicked on Equipment module");
		equip.closeButton();
		logger.info("Clicked on edit Button");
		equip.deleteButton();
		logger.info("Clicked on save Button");
		Thread.sleep(1000);
		String expected = "Equipment Deleted Successfully";
		assertEquals((equip.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=12,description="Validate Delete>Check if on click of delete, confirmation message is popped up - Equipment Management")
	public void Tc_EquipmentManagement_012() throws IOException, InterruptedException {
		log = reports.createTest("Validate Delete>Check if on click of delete, confirmation message is popped up - Equipment Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		equip = new EquipmentManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		equip.adminFeature();
		logger.info("Clicked on Admin Feature");
		equip.containerManagementModule();
		logger.info("Clicked on Equipment module");
		equip.closeButton();
		logger.info("Clicked on edit Button");
		Thread.sleep(1000);
		String expected = "Confirmation";
		assertEquals((equip.verifySize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	
}
