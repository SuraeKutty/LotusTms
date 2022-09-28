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
		menu.Create();
		logger.info("Clicked on Create Button");
		Thread.sleep(500);
		String expected = "Added Successfully !";
		assertEquals((menu.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=3,description="Validate Menu Config>Container type>check if container field is added successfully - Menu Configuration")
	public void Tc_Location_003() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Menu Config>Container type>check if container field is added successfully - Menu Configuration");
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
		menu.option2();
		logger.info("Clicked on option1");
		menu.addField(text);
		logger.info("Entered text on add field");
		menu.addButton();
		logger.info("Clicked on addButton");
		menu.Create();
		logger.info("Clicked on Create Button");
		Thread.sleep(500);
		String expected = "Added Successfully !";
		assertEquals((menu.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=4,description="Validate Menu config>Check if Driver type can be added & deleted successfully - Menu Configuration")
	public void Tc_Location_004() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Menu config>Check if Driver type can be added & deleted successfully - Menu Configuration");
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
		menu.option5();
		logger.info("Clicked on option5");
		menu.addField(text);
		logger.info("Entered text on add field");
		menu.addButton();
		logger.info("Clicked on addButton");
		menu.Create();
		logger.info("Clicked on Create Button");
		Thread.sleep(500);
		String expected = "Added Successfully !";
		assertEquals((menu.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=5,description="Validate Menu config>Check if equipment type can be added & deleted successfully - Menu Configuration")
	public void Tc_Location_005() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Menu config>Check if equipment type can be added & deleted successfully - Menu Configuration");
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
		menu.option6();
		logger.info("Clicked on option1");
		menu.addField(text);
		logger.info("Entered text on add field");
		menu.addButton();
		logger.info("Clicked on addButton");
		menu.Create();
		logger.info("Clicked on Create Button");
		Thread.sleep(500);
		String expected = "Added Successfully !";
		assertEquals((menu.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=6,description="Validate Menu config>Check if equipment location can be added & deleted successfully - Menu Configuration")
	public void Tc_Location_006() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Menu config>Check if equipment location can be added & deleted successfully - Menu Configuration");
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
		menu.option7();
		logger.info("Clicked on option1");
		menu.addField(text);
		logger.info("Entered text on add field");
		menu.addButton();
		logger.info("Clicked on addButton");
		menu.Create();
		logger.info("Clicked on Create Button");
		Thread.sleep(500);
		String expected = "Added Successfully !";
		assertEquals((menu.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=7,description="Validate Menu config>Check if Tags can be added & deleted successfully - Menu Configuration")
	public void Tc_Location_007() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Menu config>Check if Tags can be added & deleted successfully - Menu Configuration");
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
		menu.option8();
		logger.info("Clicked on option1");
		menu.addField(text);
		logger.info("Entered text on add field");
		menu.addButton();
		logger.info("Clicked on addButton");
		menu.Create();
		logger.info("Clicked on Create Button");
		Thread.sleep(500);
		String expected = "Added Successfully !";
		assertEquals((menu.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=8,description="Validate Menu config>Check if Attendance Category can be added & deleted successfully - Menu Configuration")
	public void Tc_Location_008() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Menu config>Check if Attendance Category can be added & deleted successfully - Menu Configuration");
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
		menu.option10();
		logger.info("Clicked on option1");
		menu.addField(text);
		logger.info("Entered text on add field");
		menu.addButton();
		logger.info("Clicked on addButton");
		menu.Create(); 
		logger.info("Clicked on Create Button");
		Thread.sleep(500);
		String expected = "Added Successfully !";
		assertEquals((menu.verifysuccessfulMessage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	
}
