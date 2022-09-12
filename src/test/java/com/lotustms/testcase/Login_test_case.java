package com.lotustms.testcase;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.lotustms.base.BaseClass_lotusTms;
import com.lotustms.pageObjects.LoginPage;





public class Login_test_case extends BaseClass_lotusTms {
	
	LoginPage login;
	public static Logger logger = LogManager.getLogger(Login_test_case.class.getName());

	@Test(priority=1,description="validUsername & validpassword",groups = "Regression")
	public void Tc_Login_001() throws IOException, InterruptedException
	{
		log = reports.createTest("loginTest with validUsername & validpassword");
		String validUname = ExcelFile("Login",1,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(5000);
		String expectedUrl = "https://prodev.lotustms.com/#/dashboard";
		assertEquals(driver.getCurrentUrl(), expectedUrl);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=2,description="InvalidUsername and valid password")
	public void Tc_Login_002() throws IOException, InterruptedException
	{
		log = reports.createTest("loginTest with InvalidUsername and valid password");
		logger.info("user is going to click on SignIn");
		String validpwd = ExcelFile("Login",1,1);
		login = new LoginPage(driver);
		login.Username(" ");
		login.Password(validpwd);
		login.Submit();
		Thread.sleep(5000);
		String expectedErrorMessageEmail = "Invalid email address";
		assertEquals((login.VerifiedErrorMessageForEmailfield()), expectedErrorMessageEmail);		System.out.println("abc :"+(login.VerifiedErrorMessageForEmailfield()).equals(expectedErrorMessageEmail));
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=5,description="valid username and Invalidpassword")
	public void Tc_Login_005() throws IOException, InterruptedException
	{
		log = reports.createTest("loginTest with valid username and  Invalidpassword");
		logger.info("user is going to click on SignIn");
		String validUname = ExcelFile("Login",1,0);
		login = new LoginPage(driver);
		login.Username(validUname);
		login.Password("");
		login.Submit();
		Thread.sleep(5000);
		String expectedErrorMessagePass = "Password is required";
		assertEquals((login.VerifiedErrorMessageForPasswordfield()), expectedErrorMessagePass);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=3,description="validate forgetPassword")
	public void Tc_Login_003() throws IOException, InterruptedException
	{
		log = reports.createTest("validate forgetPassword");
		String validEmail = ExcelFile("Login",1,2);
		logger.info("user is going to click on forget Password");
		login = new LoginPage(driver);
		login.forgetPassword();
		login.email_forgetPassword(validEmail);
		login.submit_email_forgetPassword();
		Thread.sleep(5000);
		String expectedUrl = "https://prodev.lotustms.com/#/authentication/forgot-password";
		assertEquals(driver.getCurrentUrl(), expectedUrl);
		logger.info("Test Case is Passsed");
	}
	
//	@Test(priority=4,description="validate error message in forgetPassword")
//	public void Tc_Login_004() throws IOException, InterruptedException
//	{
//		log = reports.createTest("validate error message in  forgetPassword");
//		String validEmail = ExcelFile("Login",1,2);
//		logger.info("user is going to click on forget Password");
//		login = new LoginPage(driver);
//		login.forgetPassword();
//		login.email_forgetPassword(" ");
//		login.submit_email_forgetPassword();
////		login.submit_email_forgetPassword();
//		Thread.sleep(5000);
//		String expectedErrorMessage = "Invalid email address";
//		assertEquals((login.verifyErrorMessage_forgetPass()), expectedErrorMessage);
//		logger.info("Test Case is Passsed");
//	}
//	
	
	@Test(priority=6,description="validate forgetPassword screen")
	public void Tc_Login_006() throws IOException, InterruptedException
	{
		log = reports.createTest("validate forgetPassword screen");
		logger.info("user is going to click on forget Password");
		login = new LoginPage(driver);
		login.forgetPassword();
		Thread.sleep(5000);
		String expectedUrl = "https://prodev.lotustms.com/#/authentication/forgot-password";
		assertEquals(driver.getCurrentUrl(), expectedUrl);
		logger.info("Test Case is Passsed");
	}
	
	@Test(priority=7,description="validate Error message appears when enter invalid email")
	public void Tc_Login_007() throws IOException, InterruptedException
	{
		log = reports.createTest("validate Error message appears when enter invalid email");
		String validUname = ExcelFile("Login",3,0);
		String validpwd = ExcelFile("Login",1,1);
		logger.info("user is going to click on SignIn");
		login = new LoginPage(driver);
		login.login_validCredentials(validUname, validpwd);
		Thread.sleep(5000);
		String expectedMessage = "Invalid Email Id or Password";
		assertEquals((login.verifyErrorMessaeForInvalidEmail()), expectedMessage);
		logger.info("Test Case is Passsed");
	}

}
