package com.lotustms.testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.lotustms.base.BaseClass_lotusTms;
import com.lotustms.pageObjects.LocationManagementPage;
import com.lotustms.pageObjects.LoginPage;
import com.lotustms.pageObjects.MenuManagementPage;

public class MenuConfiguration_testCase  extends BaseClass_lotusTms {
	LoginPage login;
	MenuManagementPage menu;
	public static Logger logger = LogManager.getLogger(locationManagement_testCase.class.getName());

	@Test(priority=1,description="Validate Menu Configuration Page - Menu Configuration")
	public void Tc_Location_001() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Menu Configuration Page - Menu Configuration");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		menu = new MenuManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		menu.adminFeature();
		logger.info("Clicked on Admin Feature");
		menu.menuConfiguration();
		logger.info("Clicked on menuConfiguration Module");
		Thread.sleep(2000);
		String expected = "Configuration";
		assertEquals((menu.verifyMenuManagementPageSize()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=2,description="Validate Menu config>Check if location type can be added & deleted successfully - Menu Configuration")
	public void Tc_Location_002() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Menu config>Check if location type can be added & deleted successfully - Menu Configuration");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String text = randomeWord();
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		menu = new MenuManagementPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(1500);
		menu.adminFeature();
		logger.info("Clicked on Admin Feature");
		menu.menuConfiguration();
		logger.info("Clicked on menuConfiguration Module");
		menu.ConfigurableDropdownsInTheApp();
		logger.info("Clicked on ConfigurableDropdownsInTheApp dropdown");
		menu.option1();
		logger.info("Clicked on option1");
		menu.addField(text);
		logger.info("Entered text on add field");
		menu.addButton();
		logger.info("Clicked on addButton");
		Thread.sleep(2000);
//		String expected = "Configuration";
//		assertEquals((menu.verifysuccessfulMessage()), expected);
//		logger.info("Test Case is Passsed");
	}
	
}
