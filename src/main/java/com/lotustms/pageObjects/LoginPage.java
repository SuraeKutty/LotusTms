package com.lotustms.pageObjects;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

import com.lotustms.actiondriver.Action;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.lotustms.base.BaseClass_lotusTms;

public class LoginPage extends BaseClass_lotusTms {

	   WebDriver driver;
	   Action action= new Action();
	   
    public LoginPage(WebDriver ldriver) {
	   this.driver = ldriver;
	   PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//input[@placeholder='E-Mail']")
    WebElement Email;
    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement Password;
    @FindBy(how=How.XPATH, using ="//span[text()='SIGN IN']/parent::button")
    WebElement Signin;
    @FindBy(how=How.XPATH, using ="//mat-form-field[2]//following::small")
    WebElement verifyErrorMessage;
    @FindBy(how=How.XPATH, using ="(//mat-form-field)[1]//mat-error")
    WebElement VerifiedErrorMessageForEmailfield;
    @FindBy(how=How.XPATH, using ="(//mat-form-field)[2]//mat-error")
    WebElement VerifiedErrorMessageForPasswordfield;
    @FindBy(how=How.XPATH, using ="//a[@href='#/authentication/forgot-password']")
    WebElement forgetPassword;
    @FindBy(how=How.XPATH, using ="//input[@placeholder='Email']")
    WebElement email_forgetPassword;
    @FindBy(how=How.XPATH, using ="//span[text()='Submit']//parent::button")
    WebElement submit_email_forgetPassword;
    @FindBy(how=How.XPATH, using ="//mat-form-field[1]//mat-error")
    WebElement verifyErrorMessage_forgetPass;
    @FindBy(how=How.XPATH, using ="//span[text()='Return to Login']//parent::button")
    WebElement returnToLogin_button;
    @FindBy(how=How.XPATH, using ="//span[text()='VERIFY']/parent::button")
    WebElement verifyButtonOtpTextBox;
    @FindBy(how=How.XPATH, using ="//span[text()='VERIFY']/parent::button")
    WebElement verifyErrorMessaeForInvalidEmail;

    
	public String OutlookMailReader(String mailFolderName, String emailSubjectContent, String emailContent, int lengthOfOTP) {
		String hostName = "smtp-mail.outlook.com";//change it according to your mail
        String username = "surendarm2207@outlook.com";//username 
        String password = "Subakutty@98";
        int messageCount;
        int unreadMsgCount;
        String emailSubject;
        Message emailMessage;
        String number=null ;
        Properties sysProps = System.getProperties();
        sysProps.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(sysProps, null);
            Store store = session.getStore();
            store.connect(hostName, username, password);
            Folder emailBox = store.getFolder(mailFolderName);
            emailBox.open(Folder.READ_WRITE);
            messageCount = emailBox.getMessageCount();
            System.out.println("Total Message Count: " + messageCount);
            unreadMsgCount = emailBox.getNewMessageCount();
            System.out.println("Unread Emails count:" + unreadMsgCount);

            for(int i=messageCount; i>(messageCount-unreadMsgCount); i--)
            {
                emailMessage = emailBox.getMessage(i);
                emailSubject = emailMessage.getSubject();

                if(emailSubject.contains(emailSubjectContent))

                {
                    System.out.println("OTP mail found");
                    String line;
                    StringBuffer buffer = new StringBuffer();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(emailMessage.getInputStream()));

                    while ((line = reader.readLine()) != null) {
                        buffer.append(line);
                    }

                    String messageContent=emailContent;

                    String result = buffer.toString().substring(buffer.toString().indexOf(messageContent));
                    System.out.println("result :"+result);
    				Document html = Jsoup.parse(result.toString());
    			    number = html.body().getElementsByTag("p").text();
    				System.out.println("OTP :" + number);
                    break;
                }
                emailMessage.setFlag(Flags.Flag.SEEN, true);
            }
            emailBox.close(true);

            store.close();
        } catch (Exception mex) {
            mex.printStackTrace();
            System.out.println("OTP Not found ");
        }
        return number;
	}
	
    
    public void login_validCredentials(String email, String pass) throws InterruptedException
    {
    	action.scrollByVisibilityOfElement(driver, Email);
    	action.type(Email, email);
    	action.type(Password, pass);
    	action.JSClick(driver, Signin);
//    	Thread.sleep(5000);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement authenticationPage =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//mat-card//input)[1]")));
//		authenticationPage.sendKeys(OutlookMailReader("Inbox","Your Verification Code","login",6));
//		action.scrollByVisibilityOfElement(driver, verifyButtonOtpTextBox);
//    	action.click(driver, verifyButtonOtpTextBox);
    }

	

	public void Username(String Username)
	{
		Email.sendKeys(Username);

	}
	public void Password(String Pass)
	{
		Password.sendKeys(Pass);
	}
	public void Submit()
	{
		Signin.click();
	}

	public String Verified() {
		String verifyErrorMsg = verifyErrorMessage.getText();
		return verifyErrorMsg;
	}
	
	public String VerifiedErrorMessageForEmailfield() {
		String verifyErrorMsg = VerifiedErrorMessageForEmailfield.getText();
		return verifyErrorMsg;
	}
	
	public String VerifiedErrorMessageForPasswordfield() {
		String verifyErrorMsg = VerifiedErrorMessageForPasswordfield.getText();
		return verifyErrorMsg;
	}
	
	public String verifyErrorMessaeForInvalidEmail() {
		String verifyErrorMsg = verifyErrorMessaeForInvalidEmail.getText();
		return verifyErrorMsg;
	}
	public void forgetPassword() {
	action.JSClick(driver, forgetPassword);
		
	}
	
	
	public void email_forgetPassword(String email)
	{
		action.explicitWait(driver, email_forgetPassword, 10);
	action.scrollByVisibilityOfElement(driver, email_forgetPassword);
	action.type(email_forgetPassword, email);
	}
	
	public void submit_email_forgetPassword()
	{
		action.explicitWait(driver, submit_email_forgetPassword, 20);
		action.scrollByVisibilityOfElement(driver, submit_email_forgetPassword);
		action.JSClick(driver, submit_email_forgetPassword);
	}
	
	public String verifyErrorMessage_forgetPass() {
		String verifyErrorMsg = verifyErrorMessage_forgetPass.getText();
		return verifyErrorMsg;
	}
	
	public void returnToLogin()
	{
		action.scrollByVisibilityOfElement(driver, returnToLogin_button);
	}

}
