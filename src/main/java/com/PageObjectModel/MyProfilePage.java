package com.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePkg.BaseClass;

public class MyProfilePage extends BaseClass
{
	public MyProfilePage ()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//p[@class='sc-1u0cego-11 betzbV']") private WebElement nameField;
	@FindBy(xpath="(//p[@class='sc-1u0cego-8 hbGjrz'])[1]") private WebElement mobileNumberField;
	@FindBy(xpath="(//p[@class='sc-1u0cego-8 hbGjrz'])[2]") private WebElement emailfield;
	@FindBy(xpath="//p[@class='hdrTxt']") private WebElement personalInformationField;
	@FindBy(xpath="//label[contains(text(),'Mobile Number')]") private WebElement mobileNumberLabel;
	@FindBy(xpath="//input[@class='sc-1rcrzmh-2 eyIsoo']") private WebElement mobileNumber;
	@FindBy(xpath="//span[@class='sc-87taa1-0 gwwRqg undefined verifiedIcon']") private WebElement greenTickforMobileNumber;
	@FindBy(xpath="//label[contains(text(),'Email ID')]") private WebElement emailIDLabel;
	@FindBy(xpath="//input[@id='Email ID']") private WebElement emailID;
	@FindBy(xpath="//span[@class='sc-1ynzkq2-2 gkmCwD']") private WebElement verifyLink;
	@FindBy(xpath="//label[contains(text(),'First Name')]") private WebElement firstNameLabel;
	@FindBy(xpath="//input[@id='First Name']") private WebElement firstName;
	@FindBy(xpath="//input[@id='Last Name']") private WebElement lastName;
	@FindBy(xpath="//p[contains(text(),'Gender')]") private WebElement genderLabel;
	@FindBy(xpath="//span[contains(text(),'Male')]") private WebElement maleField;
	@FindBy(xpath="//span[contains(text(),'Female')]") private WebElement femaleField;
	@FindBy(xpath="//label[contains(text(),'Enter Date of Birth')]") private WebElement dateOfBirthField;
	@FindBy(xpath="//select[@name='year']") private WebElement yearField;
	@FindBy(xpath="//select[@name='month']") private WebElement monthField;
	@FindBy(xpath="(//button[@class='sc-1v8myus-0 fRjXMS'])[1]") private WebElement personalSaveButton;
	@FindBy(xpath="(//button[@class='sc-1v8myus-1 bDmSth'])[1]") private WebElement personalCancelButton;
	@FindBy(xpath="//p[contains(text(),'Billing Information')]") private WebElement billingInformationField;
	@FindBy(xpath="//label[contains(text(),'Enter Billing Address')]") private WebElement addressField;
	@FindBy(xpath="//label[contains(text(),'Enter Pincode')]") private WebElement pincodeField;
	@FindBy(xpath="//div[@class='sc-1c0c8we-1 EkaOj']") private WebElement stateField;
	@FindBy(xpath="//li[contains(text(),'Tamil Nadu')]") private WebElement tamilnaduOption;
	@FindBy(xpath="(//button[@class='sc-1v8myus-0 fRjXMS'])[2]") private WebElement billingInformationSaveButton;
	@FindBy(xpath="(//button[@class='sc-1v8myus-1 bDmSth'])[2]") private WebElement billingInformationCancelButton;
	
	
	public WebElement getNameField() {
		return nameField;
	}
	public WebElement getMobileNumberField() {
		return mobileNumberField;
	}
	public WebElement getEmailfield() {
		return emailfield;
	}
	public WebElement getPersonalInformationField() {
		return personalInformationField;
	}
	public WebElement getMobileNumberLabel() {
		return mobileNumberLabel;
	}
	public WebElement getMobileNumber() {
		return mobileNumber;
	}
	public WebElement getGreenTickforMobileNumber() {
		return greenTickforMobileNumber;
	}
	public WebElement getEmailIDLabel() {
		return emailIDLabel;
	}
	public WebElement getEmailID() {
		return emailID;
	}
	public WebElement getVerifyLink() {
		return verifyLink;
	}
	public WebElement getFirstNameLabel() {
		return firstNameLabel;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getGenderLabel() {
		return genderLabel;
	}
	public WebElement getMaleField() {
		return maleField;
	}
	public WebElement getFemaleField() {
		return femaleField;
	}
	public WebElement getDateOfBirthField() {
		return dateOfBirthField;
	}
	public WebElement getYearField() {
		return yearField;
	}
	public WebElement getMonthField() {
		return monthField;
	}
	public WebElement getPersonalSaveButton() {
		return personalSaveButton;
	}
	public WebElement getPersonalCancelButton() {
		return personalCancelButton;
	}
	public WebElement getBillingInformationField() {
		return billingInformationField;
	}
	public WebElement getAddressField() {
		return addressField;
	}
	public WebElement getPincodeField() {
		return pincodeField;
	}
	public WebElement getStateField() {
		return stateField;
	}
	public WebElement getTamilnaduOption() {
		return tamilnaduOption;
	}
	public WebElement getBillingInformationSaveButton() {
		return billingInformationSaveButton;
	}
	public WebElement getBillingInformationCancelButton() {
		return billingInformationCancelButton;
	}
	

}
