package com.lotustms.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.w3c.dom.DOMConfiguration;
import org.apache.logging.log4j.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.lotustms.utility.ScreenShot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_lotusTms {
	public static WebDriver driver;
	public static ExtentReports reports;
	public ExtentTest log;
//	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
//	public static Logger logger;
	
	@BeforeSuite
	public void reportsInitialization() {
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(
				System.getProperty("user.dir") + "/Reports/Midcities_" + ScreenShot.getCurrentDateTime() + ".html"));
		reports = new ExtentReports();
		reports.attachReporter(extent);
	}
	


	
	@BeforeMethod
	public void CommonProperties()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		driver = new ChromeDriver(option);
		
		driver.get("https://prodev.lotustms.com");
//		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1440, 900));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod()
	public void screenShotAttacher(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			log.fail("Test case failed", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.captureScreenshot(driver, result.getName())).build());
		} else if (result.getStatus()==ITestResult.SUCCESS){
			log.pass("Test case Passed", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.captureScreenshot(driver, result.getName())).build());
		}
		reports.flush();
//		driver.close();
	}
	
	
	public String ExcelFile(String getsheet, int getRow, int getCell) throws IOException {
		FileInputStream file = new FileInputStream("D:\\eclipse-workspace\\LotusTMS\\LotusTMS\\MidcitiesInput.xlsx");
		XSSFWorkbook Workboook = new XSSFWorkbook(file);
		XSSFSheet sheet = Workboook.getSheet(getsheet);
		Row row = sheet.getRow(getRow);
		Cell cell = row.getCell(getCell);
		DataFormatter formatter = new DataFormatter();
		String text = formatter.formatCellValue(cell);
		return text;
	}
	
	public String randomestring()
	{
		String generateString = RandomStringUtils.randomAlphanumeric(8);
		return (generateString);
	}
	
	public String randomeWord()
	{
		String generateString = RandomStringUtils.randomAlphabetic(8);
		return (generateString);
	}
	
	public String randomeNumber()
	{
		String generateString = RandomStringUtils.randomNumeric(10);
		return (generateString);
	}
	public String randomeFourNumber()
	{
		String generateString = RandomStringUtils.randomNumeric(4);
		return (generateString);
	}
	
}
