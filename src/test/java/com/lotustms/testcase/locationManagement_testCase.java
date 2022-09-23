package com.lotustms.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.lotustms.base.BaseClass_lotusTms;
import com.lotustms.pageObjects.CustomerManagement;
import com.lotustms.pageObjects.LocationManagementPage;
import com.lotustms.pageObjects.LoginPage;

public class locationManagement_testCase extends BaseClass_lotusTms {
	LoginPage login;
	LocationManagementPage location;
	public static Logger logger = LogManager.getLogger(locationManagement_testCase.class.getName());

	@Test(priority=1,description="Validate Location Management Page - Location Management")
	public void Tc_Location_001() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Location Management Page - Location Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		location = new LocationManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		location.adminFeature();
		logger.info("Clicked on Admin Feature");
		location.locationManagementModule();
		logger.info("Clicked on locationManagement Module");
		Thread.sleep(2000);
		String expected = "Location Management";
		assertEquals((location.verifylocationManagementPageSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=2,description="Validate Create Location page - Location Management")
	public void Tc_Location_002() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Create Location page - - Location Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		location = new LocationManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		location.adminFeature();
		logger.info("Clicked on Admin Feature");
		location.locationManagementModule();
		logger.info("Clicked on customerManagement Module");
		location.createNewButton();
		logger.info("Clicked on create customer button ");
		Thread.sleep(2000);
		String expected = "Add Location";
		assertEquals((location.verifyLocationSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=3,description="Verify Location Management>Create New>Create button must be disabled until mandatory field is given - Location Management")
	public void Tc_Location_003() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Location Management>Create New>Create button must be disabled until mandatory field is given - Location Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		location = new LocationManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		location.adminFeature();
		logger.info("Clicked on Admin Feature");
		location.locationManagementModule();
		logger.info("Clicked on customerManagement Module");
		location.createNewButton();
		logger.info("Clicked on create new  button");
		if((location.createLocation1_locationManagement())) {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
		else {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
	}
	
	@Test(priority=4,description="Verify Location Management>Create New>Check if mandatory fields are entered,location can be created successfully - Location Management")
	public void Tc_Location_004() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Location Management>Create New>Check if mandatory fields are entered,location can be created successfully- Location Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String word = randomeWord();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		location = new LocationManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		location.adminFeature();
		logger.info("Clicked on Admin Feature");
		location.locationManagementModule();
		logger.info("Clicked on customerManagement Module");
		location.createNewButton();
		logger.info("Clicked on create customer button ");
		location.locationType();
		location.option();
		logger.info("Clicked on create locationType dropdown ");
		location.locationName(word);
		logger.info("Entered Text on locationName");
		location.bingApiAddress("s");
		location.option();
		logger.info("Entered Text on bingApiAddress");
		location.createLocation_locationManagement();
		Thread.sleep(1000);
		String expected = "Location Created Successfully";
		assertEquals((location.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=5,description="Verify Location Management>Create New>Check if null value accepted in Location Name if space char is given - Location Management")
	public void Tc_Location_005() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Location Management>Create New>Check if null value accepted in Location Name if space char is given- Location Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		location = new LocationManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		location.adminFeature();
		logger.info("Clicked on Admin Feature");
		location.locationManagementModule();
		logger.info("Clicked on customerManagement Module");
		location.createNewButton();
		logger.info("Clicked on create customer button ");
		location.locationType();
		location.option();
		logger.info("Clicked on create locationType dropdown ");
		location.locationName(" ");
		logger.info("Entered Text on locationName");
//		location.verifyTextFilledInStreet();
		location.createLocation_locationManagement();
		Thread.sleep(1000);
		String expected = "Location Name is Required";
		assertEquals((location.verifyErrorMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=6,description="Verify Location Management>Create New>If address is selected in bing api, check if street,state,city,zipcode are autopopulated accordingly - Location Management")
	public void Tc_Location_006() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Location Management>Create New>If address is selected in bing api, check if street,state,city,zipcode are autopopulated accordingly- Location Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		location = new LocationManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		location.adminFeature();
		logger.info("Clicked on Admin Feature");
		location.locationManagementModule();
		logger.info("Clicked on customerManagement Module");
		location.createNewButton();
		logger.info("Clicked on create customer button ");
		location.locationType();
		location.option();
		logger.info("Clicked on create locationType dropdown ");
		location.bingApiAddress("s");
		location.option();
		logger.info("Entered Text on bingApiAddress");
		Thread.sleep(2000);
		String expected = "ng-star-inserted";
		if((location.verifyTextFilledInStreet()).contains(expected)) {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
		
		else {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
	}
	
	@Test(priority=7,description="Verify Location Management>Create New>On click of cancel button, pop up screen should be closed - Location Management")
	public void Tc_Location_007() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Location Management>Create New>On click of cancel button, pop up screen should be closed - Location Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		location = new LocationManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		location.adminFeature();
		logger.info("Clicked on Admin Feature");
		location.locationManagementModule();
		logger.info("Clicked on locationManagement Module");
		location.createNewButton();
		logger.info("Clicked on create customer button");
		location.cancelLocation_locationManagement();
		logger.info("Clicked on cancel customer button");
		Thread.sleep(1000);
		String expected = "Location Management";
		assertEquals((location.verifylocationManagementPageSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=8,description="Verify Location Management>ID>On click of ID,location info is popped up - Location Management")
	public void Tc_Location_008() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Location Management>ID>On click of ID,location info is popped up - Location Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		location = new LocationManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		location.adminFeature();
		logger.info("Clicked on Admin Feature");
		location.locationManagementModule();
		logger.info("Clicked on locationManagement Module");
		location.idNumberClick();
		logger.info("Clicked on idNumber Click");
 		Thread.sleep(500);
		String expected = "Location Info";
		assertEquals((location.verifyLocationSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=9,description="Verify Location Management>Location type>Check if location type input is selected & searched, results are showing as per the input - Location Management")
	public void Tc_Location_009() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Location Management>Location type>Check if location type input is selected & searched, results are showing as per the input - Location Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		location = new LocationManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		location.adminFeature();
		logger.info("Clicked on Admin Feature");
		location.locationManagementModule();
		logger.info("Clicked on locationManagement Module");
		location.search_locationType();
		logger.info("Clicked on search_locationType");
		location.option_locationType_search();
		logger.info("Clicked on option_locationType_search ");
 		Thread.sleep(1000);
		String expected = "Chassis Depots";
		assertEquals((location.verifylocationTypeSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=10,description="Verify Location Management>Reset>On click of reset after search, check if all the locations are displayed  - Location Management")
	public void Tc_Location_010() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Location Management>Reset>On click of reset after search, check if all the locations are displayed - Location Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		location = new LocationManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		location.adminFeature();
		logger.info("Clicked on Admin Feature");
		location.locationManagementModule();
		logger.info("Clicked on locationManagement Module");
		location.search_locationType();
		logger.info("Clicked on search_locationType");
		location.option_locationType_search();
		logger.info("Clicked on option_locationType_search");
		Thread.sleep(2000);
		int searchTotal= location.pageSize();
		Thread.sleep(2000);
		location.resetButton();
		logger.info("Clicked on resetButton");
		Thread.sleep(2000);
		int total= location.pageSize();
 		Thread.sleep(500);
		assertNotEquals(total, searchTotal);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=11,description="Verify Location Management>Items per page>Check if entries are displayed as per the selection - Location Management")
	public void Tc_Location_011() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Location Management>Items per page>Check if entries are displayed as per the selection - Location Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		location = new LocationManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		location.adminFeature();
		logger.info("Clicked on Admin Feature");
		location.locationManagementModule();
		logger.info("Clicked on locationManagement Module");
		location.itemPerPage();
		logger.info("Clicked on resetButton");
		Thread.sleep(1000);
		location.option_locationType_search();
		logger.info("Clicked on option_locationType_search");
		Thread.sleep(2000);
		int totalValue = location.rowSize();
		int expectValue = 30;
		Thread.sleep(500);
		assertEquals(totalValue, expectValue);
		logger.info("Test Case is Passsed");
	}
}
