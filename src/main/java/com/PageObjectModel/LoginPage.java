package com.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePkg.BaseClass;

public class LoginPage extends BaseClass
{
public LoginPage ()
	
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//p[contains(text(),'LOGIN / SIGNUP')])[2]") private WebElement login;
	

	@FindBy(xpath="//h3[contains(text(),'Login/Signup')]") private WebElement loginTitle;
	@FindBy(xpath="//input[@class='loginCont__input']") private WebElement mobileNumberlabel;
	@FindBy(xpath="//input[@name='phone']") private WebElement enterMmobileNumber;
	@FindBy(xpath="//button[@class='sc-crHmcD gAiHQL  ']") private WebElement continueButton;
	@FindBy(xpath="//h3[contains(text(),'Verify OTP')]") private WebElement OTPtitle;
	@FindBy(xpath="(//input[@class='verifyOtpCont__otpFiled '])[1]") private WebElement enterOTP;
	@FindBy(xpath="//div[contains(text(),'Enter 4 digit OTP sent to')]") private WebElement enterOTPlabel;
	@FindBy(xpath="//span[contains(text(),'Resend via :')]") private WebElement resendOTP;
	@FindBy(xpath="//span[contains(text(),'WhatsApp')]") private WebElement whatsappoption;
	@FindBy(xpath="//span[contains(text(),'SMS')]") private WebElement smsoption;
	@FindBy(xpath="//h3[contains(text(),'Congratulations')]") private WebElement congratulationsTitle;
	@FindBy(xpath="//p[contains(text(),'Account created successfully')]") private WebElement successfullyLabel;
	@FindBy(xpath="//p[contains(text(),'Just one more thing.')]") private WebElement oneMoreThingLabel;
	@FindBy(xpath="//span[contains(text(),'What do we call you?')]") private WebElement willCallYouLabel;
	@FindBy(xpath="//input[@class='loginCont__input']") private WebElement enterName;
	@FindBy(xpath="(//span[@class='loginCont__label'])[2]") private WebElement emailIDlabel;
	@FindBy(xpath="//input[@placeholder='Enter your email address']") private WebElement enterEmail;
	@FindBy(xpath="//button[contains(text(),'Lets Go')]") private WebElement letsGoButton;
	@FindBy(xpath="//button[contains(text(),'I’ll do it later')]") private WebElement willDoItLater;
	@FindBy(xpath="//div[@class='login__tab_wrapper']") private WebElement profile;
	@FindBy(xpath="//span[@class='profile_name_char']") private WebElement firstNameIcon;
	@FindBy(xpath="//span[@class='uname-truncated uname-truncated2 gr-text-capitalize']") private WebElement profileName;
	@FindBy(xpath="//a[@href='/profile/']") private WebElement namelink;

	
	public WebElement getNamelink() {
		return namelink;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getLoginTitle() {
		return loginTitle;
	}
	public WebElement getMobileNumberlabel() {
		return mobileNumberlabel;
	}
	public WebElement getEnterMmobileNumber() {
		return enterMmobileNumber;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	public WebElement getOTPtitle() {
		return OTPtitle;
	}
	public WebElement getEnterOTP() {
		return enterOTP;
	}
	public WebElement getEnterOTPlabel() {
		return enterOTPlabel;
	}
	public WebElement getResendOTP() {
		return resendOTP;
	}
	public WebElement getWhatsappoption() {
		return whatsappoption;
	}
	public WebElement getSmsoption() {
		return smsoption;
	}
	public WebElement getCongratulationsTitle() {
		return congratulationsTitle;
	}
	public WebElement getSuccessfullyLabel() {
		return successfullyLabel;
	}
	public WebElement getOneMoreThingLabel() {
		return oneMoreThingLabel;
	}
	public WebElement getWillCallYouLabel() {
		return willCallYouLabel;
	}
	public WebElement getEnterName() {
		return enterName;
	}
	public WebElement getEmailIDlabel() {
		return emailIDlabel;
	}
	public WebElement getEnterEmail() {
		return enterEmail;
	}
	public WebElement getLetsGoButton() {
		return letsGoButton;
	}
	public WebElement getWillDoItLater() {
		return willDoItLater;
	}
	public WebElement getProfile() {
		return profile;
	}
	public WebElement getFirstNameIcon() {
		return firstNameIcon;
	}
	public WebElement getProfileName() {
		return profileName;
	}


}
