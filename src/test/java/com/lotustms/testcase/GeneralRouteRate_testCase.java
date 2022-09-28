package com.lotustms.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.lotustms.base.BaseClass_lotusTms;
import com.lotustms.pageObjects.EquipmentManagementPage;
import com.lotustms.pageObjects.GeneralRouteRate_rateManagementPage;
import com.lotustms.pageObjects.LoginPage;

public class GeneralRouteRate_testCase extends BaseClass_lotusTms{
	LoginPage login;
	GeneralRouteRate_rateManagementPage routeRate;
	public static Logger logger = LogManager.getLogger(EquipmentManagement_testCase.class.getName());

	@Test(priority=1,description="Validate General Route Rate page - General Route Rate Management")
	public void Tc_EquipmentManagement_001() throws IOException, InterruptedException {
		log = reports.createTest("Validate General Route Rate page - General Route Rate Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		routeRate = new GeneralRouteRate_rateManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		routeRate.rateManagement();
		logger.info("Clicked on rate Management");
		routeRate.generalRouteRate_rateManagement();
		logger.info("Clicked on generalRouteRate");
		String expected = "General Route Rates";
		assertEquals((routeRate.verifypageSize_rateManagement()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=2,description="Verify Create New page - General Route Rate Management")
	public void Tc_EquipmentManagement_002() throws IOException, InterruptedException {
		log = reports.createTest("Verify Create New page - General Route Rate Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		routeRate = new GeneralRouteRate_rateManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		routeRate.rateManagement();
		logger.info("Clicked on rate Management");
		routeRate.generalRouteRate_rateManagement();
		logger.info("Clicked on generalRouteRate");
		routeRate.createNewButton_generalRouteRate_rateManagement();
		logger.info("Clicked on Create new button");
		String expected = "Add Route Rate";
		assertEquals((routeRate.verifycreateNewPageSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=3,description="Verify if bulk update button is disabled unless one or two checkbox is checked - General Route Rate Management")
	public void Tc_EquipmentManagement_003() throws IOException, InterruptedException {
		log = reports.createTest("Verify if bulk update button is disabled unless one or two checkbox is checked - General Route Rate Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		routeRate = new GeneralRouteRate_rateManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		routeRate.rateManagement();
		logger.info("Clicked on rate Management");
		routeRate.generalRouteRate_rateManagement();
		logger.info("Clicked on generalRouteRate");
		if((routeRate.bulkButton())) {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
		else {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
	}
	
	@Test(priority=4,description="Verify Add Route Rate>Verify if create button is disabled until mandatory fields are given - General Route Rate Management")
	public void Tc_EquipmentManagement_004() throws IOException, InterruptedException {
		log = reports.createTest("Verify Add Route Rate>Verify if create button is disabled until mandatory fields are given - General Route Rate Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		routeRate = new GeneralRouteRate_rateManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		routeRate.rateManagement();
		logger.info("Clicked on rate Management");
		routeRate.generalRouteRate_rateManagement();
		logger.info("Clicked on generalRouteRate");
		routeRate.createNewButton_generalRouteRate_rateManagement();
		logger.info("Clicked on Create new button");
		Thread.sleep(1500);
		if((routeRate.verifyCreateButton())) {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
		else {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
	}
	
	@Test(priority=5,description="Verify Add Route>Check if all mandatory fields are given, create button is enabled - General Route Rate Management")
	public void Tc_EquipmentManagement_005() throws IOException, InterruptedException {
		log = reports.createTest("Verify Add Route>Check if all mandatory fields are given, create button is enabled - General Route Rate Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String number = randomeFourNumber();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		routeRate = new GeneralRouteRate_rateManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		routeRate.rateManagement();
		logger.info("Clicked on rate Management");
		routeRate.generalRouteRate_rateManagement();
		logger.info("Clicked on generalRouteRate");
		routeRate.createNewButton_generalRouteRate_rateManagement();
		logger.info("Clicked on Create new button");
		routeRate.pickupName("s");
		routeRate.optionOrderType_rateManagement();
		logger.info("Entered text on pickup");
		routeRate.deliveryName("t");
		routeRate.optionOrderType_rateManagement();
		logger.info("Entered text on delivery");
		routeRate.orderType_rateManagement();
		routeRate.optionOrderType_rateManagement();
		logger.info("Clicked on orderType");
		routeRate.rate(number);
		logger.info("Clicked on rate");
		routeRate.createButton_rateManagement();
		logger.info("Clicked on create rate");
		if((routeRate.verifyCreateButton())) {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		
		}
		else {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
	}
	
	@Test(priority=6,description="Verify Add Route>Check if all mandatory fields are given, create button is enabled &  route is created successfully - General Route Rate Management")
	public void Tc_EquipmentManagement_00() throws IOException, InterruptedException {
		log = reports.createTest("Verify Add Route>Check if all mandatory fields are given, create button is enabled &  route is created successfully - General Route Rate Management");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String number = randomeFourNumber();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		routeRate = new GeneralRouteRate_rateManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		routeRate.rateManagement();
		logger.info("Clicked on rate Management");
		routeRate.generalRouteRate_rateManagement();
		logger.info("Clicked on generalRouteRate");
		routeRate.createNewButton_generalRouteRate_rateManagement();
		logger.info("Clicked on Create new button");
		routeRate.pickupName("s");
		routeRate.optionOrderType_rateManagement();
		logger.info("Entered text on pickup");
		routeRate.deliveryName("t");
		routeRate.optionOrderType_rateManagement();
		logger.info("Entered text on delivery");
		routeRate.orderType_rateManagement();
		routeRate.optionOrderType_rateManagement();
		logger.info("Clicked on orderType");
		routeRate.rate(number);
		logger.info("Clicked on rate");
		routeRate.createButton_rateManagement();
		logger.info("Clicked on create rate");
		Thread.sleep(1000);
		String expected = "General Route Rate created successfully";
		assertEquals((routeRate.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
}
