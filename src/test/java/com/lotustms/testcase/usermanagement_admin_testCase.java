 package com.lotustms.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.lotustms.base.BaseClass_lotusTms;
import com.lotustms.pageObjects.LoginPage;
import com.lotustms.pageObjects.UserManagement;

public class usermanagement_admin_testCase extends BaseClass_lotusTms {
	LoginPage login;
	UserManagement user;
	public static Logger logger = LogManager.getLogger(Login_test_case.class.getName());

	@Test(priority=1,description="Validate userManagement page")
	public void Tc_Login_001() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate userManagement page");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		user = new UserManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		user.adminFeature();
		logger.info("Clicked on Admin Feature");
		user.userManagement();
		logger.info("Clicked on usermanagement module");
		String expected = "User Management";
		assertEquals((user.verifyUserManagementPage()), expected);
		logger.info("Test Case is Passsed");
	}
	

	@Test(priority=2,description="Validate Create new user page")
	public void Tc_Login_002() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Create new user page");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		user = new UserManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		user.adminFeature();
		logger.info("Clicked on Admin Feature");
		user.userManagement();
		logger.info("Clicked on usermanagement module");
		user.createNewUserButton();
		logger.info("Clicked on create new button");
		if((user.verifysizeCreateNew())>0) {
			assertTrue(true);
			logger.info("Test Case is Passsed");
		}
		else {
			assertTrue(false);
			logger.info("Test Case is Failed");
		}
		
	}
	
	@Test(priority=3,description="Validate search field")
	public void Tc_Login_003() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate search field");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String firstName = ExcelFile("usermanagement",1,0);
		String lastName = ExcelFile("usermanagement",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		user = new UserManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		user.adminFeature();
		logger.info("Clicked on Admin Feature");
		user.userManagement();
		logger.info("Clicked on usermanagement module");
		user.search_userManagement(firstName);
		logger.info("Entered value on search field");
		String expected = "Automation";
		assertEquals((user.verifyUserManagementPage()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=4,description="Verify Create New-Verify(Admin Role) Success message is given once user is created")
	public void Tc_Login_004() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Create New-Verify(Admin Role) Success message is given once user is created");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String firstName = ExcelFile("usermanagement",1,0);
		String lastName = ExcelFile("usermanagement",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		user = new UserManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		user.adminFeature();
		logger.info("Clicked on Admin Feature");
		user.userManagement();
		logger.info("Clicked on usermanagement module");
		user.createNewUserButton();
		logger.info("Clicked on create new button");
		user.firstName_userManagement(firstName);
		logger.info("Entered text on first name");
		user.lastName_userManagement(lastName);
		logger.info("Entered text on lastName");
		String email = randomestring()+"@gmail.com";
		user.email_userManagement(email);
		logger.info("Entered text on email");
		user.role_userManagement();
		logger.info("Clicked on role");
		user.adminRole_userManagement();
		logger.info("Clicked on admin role");
		user.sendActivationButton_userManagement();
		logger.info("Clicked on send activation button");
		String expected = "User Created Successfully";
		assertEquals((user.verifySuccuessfullMessageForCreatingUser()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=5,description="Verify Create New-Verify(Dispatch Role) Success message is given once user is created")
	public void Tc_Login_005() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Create New-Verify(Dispatch Role) Success message is given once user is created");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String firstName = ExcelFile("usermanagement",1,0);
		String lastName = ExcelFile("usermanagement",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		user = new UserManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		user.adminFeature();
		logger.info("Clicked on Admin Feature");
		user.userManagement();
		logger.info("Clicked on usermanagement module");
		user.createNewUserButton();
		logger.info("Clicked on create new button");
		user.firstName_userManagement(firstName);
		logger.info("Entered text on first name");
		user.lastName_userManagement(lastName);
		logger.info("Entered text on lastName");
		String email = randomestring()+"@gmail.com";
		user.email_userManagement(email);
		logger.info("Entered text on email");
		user.role_userManagement();
		logger.info("Clicked on role");
		user.dispatchRoleuserManagement();
		logger.info("Clicked on dispatch role");
		user.sendActivationButton_userManagement();
		logger.info("Clicked on send activation button");
		String expected = "User Created Successfully";
		assertEquals((user.verifySuccuessfullMessageForCreatingUser()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=6,description="Verify Create New-Verify(Driver Role) Success message is given once user is created")
	public void Tc_Login_006() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Create New-Verify(Driver Role) Success message is given once user is created");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String firstName = ExcelFile("usermanagement",1,0);
		String lastName = ExcelFile("usermanagement",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		user = new UserManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		user.adminFeature();
		logger.info("Clicked on Admin Feature");
		user.userManagement();
		logger.info("Clicked on usermanagement module");
		user.createNewUserButton();
		logger.info("Clicked on create new button");
		user.firstName_userManagement(firstName);
		logger.info("Entered text on first name");
		user.lastName_userManagement(lastName);
		logger.info("Entered text on lastName");
		String email = randomestring()+"@gmail.com";
		user.email_userManagement(email);
		logger.info("Entered text on email");
		user.role_userManagement();
		logger.info("Clicked on role");
		user.driverRole_userManagement();
		logger.info("Clicked on driver role");
		user.driverType_userManagement();
		logger.info("Clicked on driver type role");
		user.option_driverType_userManagement();
		logger.info("Clicked on driver type option role");
		user.sendActivationButton_userManagement();
		logger.info("Clicked on send activation button");
		String expected = "User Created Successfully";
		assertEquals((user.verifySuccuessfullMessageForCreatingUser()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=7,description="Verify Create New-Verify(driver pay Role) Success message is given once user is created")
	public void Tc_Login_007() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Create New-Verify(driver pay Role) Success message is given once user is created");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String firstName = ExcelFile("usermanagement",1,0);
		String lastName = ExcelFile("usermanagement",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		user = new UserManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		user.adminFeature();
		logger.info("Clicked on Admin Feature");
		user.userManagement();
		logger.info("Clicked on usermanagement module");
		user.createNewUserButton();
		logger.info("Clicked on create new button");
		user.firstName_userManagement(firstName);
		logger.info("Entered text on first name");
		user.lastName_userManagement(lastName);
		logger.info("Entered text on lastName");
		String email = randomestring()+"@gmail.com";
		user.email_userManagement(email);
		logger.info("Entered text on email");
		user.role_userManagement();
		logger.info("Clicked on role");
		user.driverPayRole_userManagement();
		logger.info("Clicked on driver pay role");
		user.sendActivationButton_userManagement();
		logger.info("Clicked on send activation button");
		String expected = "User Created Successfully";
		assertEquals((user.verifySuccuessfullMessageForCreatingUser()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=8,description="Verify Create New-Verify(driver pay Role) Success message is given once user is created")
	public void Tc_Login_008() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Create New-Verify(driver pay Role) Success message is given once user is created");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String firstName = ExcelFile("usermanagement",1,0);
		String lastName = ExcelFile("usermanagement",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		user = new UserManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		user.adminFeature();
		logger.info("Clicked on Admin Feature");
		user.userManagement();
		logger.info("Clicked on usermanagement module");
		user.createNewUserButton();
		logger.info("Clicked on create new button");
		user.firstName_userManagement(firstName);
		logger.info("Entered text on first name");
		user.lastName_userManagement(lastName);
		logger.info("Entered text on lastName");
		String email = randomestring()+"@gmail.com";
		user.email_userManagement(email);
		logger.info("Entered text on email");
		user.role_userManagement();
		logger.info("Clicked on role");
		user.invoiceRole_userManagement();
		logger.info("Clicked on invoice role");
		user.sendActivationButton_userManagement();
		logger.info("Clicked on send activation button");
		String expected = "User Created Successfully";
		assertEquals((user.verifySuccuessfullMessageForCreatingUser()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=9,description="Verify Create New-Verify(Invoice Role) Success message is given once user is created")
	public void Tc_Login_009() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Create New-Verify(Invoice Role) Success message is given once user is created");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String firstName = ExcelFile("usermanagement",1,0);
		String lastName = ExcelFile("usermanagement",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		user = new UserManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		user.adminFeature();
		logger.info("Clicked on Admin Feature");
		user.userManagement();
		logger.info("Clicked on usermanagement module");
		user.createNewUserButton();
		logger.info("Clicked on create new button");
		user.firstName_userManagement(firstName);
		logger.info("Entered text on first name");
		user.lastName_userManagement(lastName);
		logger.info("Entered text on lastName");
		String email = randomestring()+"@gmail.com";
		user.email_userManagement(email);
		logger.info("Entered text on email");
		user.role_userManagement();
		logger.info("Clicked on role");
		user.invoiceRole_userManagement();
		logger.info("Clicked on invoice role");
		user.sendActivationButton_userManagement();
		logger.info("Clicked on send activation button");
		String expected = "User Created Successfully";
		assertEquals((user.verifySuccuessfullMessageForCreatingUser()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=10,description="Verify Create New-Verify(Order Entry Role) Success message is given once user is created")
	public void Tc_Login_010() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Create New-Verify(Order Entry Role) Success message is given once user is created");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String firstName = ExcelFile("usermanagement",1,0);
		String lastName = ExcelFile("usermanagement",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		user = new UserManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		user.adminFeature();
		logger.info("Clicked on Admin Feature");
		user.userManagement();
		logger.info("Clicked on usermanagement module");
		user.createNewUserButton();
		logger.info("Clicked on create new button");
		user.firstName_userManagement(firstName);
		logger.info("Entered text on first name");
		user.lastName_userManagement(lastName);
		logger.info("Entered text on lastName");
		String email = randomestring()+"@gmail.com";
		user.email_userManagement(email);
		logger.info("Entered text on email");
		user.role_userManagement();
		logger.info("Clicked on role");
		user.orderEntryRole_userManagement();
		logger.info("Clicked on order entry role");
		user.sendActivationButton_userManagement();
		logger.info("Clicked on send activation button");
		String expected = "User Created Successfully";
		assertEquals((user.verifySuccuessfullMessageForCreatingUser()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=11,description="Validate Error message for first name")
	public void Tc_Login_011() throws IOException, InterruptedException
	{
		log = reports.createTest("Verify Create New-Verify(Order Entry Role) Success message is given once user is created");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String firstName = ExcelFile("usermanagement",1,0);
		String lastName = ExcelFile("usermanagement",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		user = new UserManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		user.adminFeature();
		logger.info("Clicked on Admin Feature");
		user.userManagement();
		logger.info("Clicked on usermanagement module");
		user.createNewUserButton();
		logger.info("Clicked on create new button");
		user.firstName_userManagement("");
		logger.info("Entered text on first name");
		user.lastName_userManagement(lastName);
		logger.info("Entered text on lastName");
		String email = randomestring()+"@gmail.com";
		user.email_userManagement(email);
		logger.info("Entered text on email");
		user.role_userManagement();
		logger.info("Clicked on role");
		user.orderEntryRole_userManagement();
		logger.info("Clicked on order entry role");
		user.sendActivationButton_userManagement();
		logger.info("Clicked on send activation button");
		String expected = "First name is required";
		assertEquals((user.errorMessage_userManagement()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=12,description="Validate Error message for last name")
	public void Tc_Login_012() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Error message for last name");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String firstName = ExcelFile("usermanagement",1,0);
		String lastName = ExcelFile("usermanagement",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		user = new UserManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		user.adminFeature();
		logger.info("Clicked on Admin Feature");
		user.userManagement();
		logger.info("Clicked on usermanagement module");
		user.createNewUserButton();
		logger.info("Clicked on create new button");
		user.firstName_userManagement(firstName);
		logger.info("Entered text on first name");
		user.lastName_userManagement(lastName);
		logger.info("Entered text on lastName");
		String email = randomestring()+"@gmail.com";
		user.email_userManagement(email);
		logger.info("Entered text on email");
		user.role_userManagement();
		logger.info("Clicked on role");
		user.orderEntryRole_userManagement();
		logger.info("Clicked on order entry role");
		user.sendActivationButton_userManagement();
		logger.info("Clicked on send activation button");
		String expected = "Last name is required";
		assertEquals((user.errorMessage_userManagement()), expected);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=13,description="Validate Error message for email")
	public void Tc_Login_013() throws IOException, InterruptedException
	{
		log = reports.createTest("Validate Error message for email");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		String firstName = ExcelFile("usermanagement",1,0);
		String lastName = ExcelFile("usermanagement",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		user = new UserManagement(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(3000);
		user.adminFeature();
		logger.info("Clicked on Admin Feature");
		user.userManagement();
		logger.info("Clicked on usermanagement module");
		user.createNewUserButton();
		logger.info("Clicked on create new button");
		user.firstName_userManagement(firstName);
		logger.info("Entered text on first name");
		user.lastName_userManagement(lastName);
		logger.info("Entered text on lastName");
		String email = randomestring()+"@gmail.com";
		user.email_userManagement(email);
		logger.info("Entered text on email");
		user.role_userManagement();
		logger.info("Clicked on role");
		user.orderEntryRole_userManagement();
		logger.info("Clicked on order entry role");
		user.sendActivationButton_userManagement();
		logger.info("Clicked on send activation button");
		String expected ="Email is required";
		assertEquals((user.errorMessage_userManagement()), expected);
		logger.info("Test Case is Passsed");
	}
}
