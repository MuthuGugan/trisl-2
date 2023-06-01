package com.RunnerPkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BasePkg.BaseClass;
import com.BasePkg.PageObjectManager;

public class LoginTest extends BaseClass
{
	static PageObjectManager pm = new PageObjectManager();
	@Test(priority=1)
	public static void browserLaunch()
	{
		brwsrlnch("chrome");
	}

	@Test(priority=2)
	public static void urlLaunch()
	{
		launchURL("https://www.goibibo.com/");
		implicitWait();

		//expicitWait(pm.getLp().getEnterMmobileNumber());
	}
	@Test(priority=3)
	public static void login() throws Exception 
	{
		explicitWaitforVisibleElement(pm.getLp().getEnterMmobileNumber());
		elementDisplayed(pm.getLp().getLoginTitle());
		inputValues(pm.getLp().getEnterMmobileNumber(),"8667451769");
		clickOnElement(pm.getLp().getContinueButton());
		elementDisplayed(pm.getLp().getOTPtitle());
		elementDisplayed(pm.getLp().getEnterOTPlabel());
	}

	@Test(priority=4)
	public static void homeProfile() throws Exception
	{

		Thread.sleep(20000);
		driver.navigate().refresh();
		String profileTxt = pm.getLp().getProfile().getText();
		System.out.println("Profile Get Text : "+profileTxt);
		
		String profileName = pm.getLp().getProfileName().getText();
		System.out.println("Profile Name : "+profileName);
		mousehover(pm.getLp().getFirstNameIcon());

	}

	//profile page validation
	@Test(priority=5)
	public static void myProfile()
	{
		mousehover(pm.getLp().getFirstNameIcon());
		//expicitWait(pm.getLp().getProfileName());
		//clickOnElement(pm.getLp().getProfileName());
		String expectedName="MuthukumarC";
		String actualName=pm.getMp().getNameField().getText();
		Assert.assertEquals(actualName, expectedName);

		clickOnElement(pm.getLp().getNamelink());
		
		String expectedNumber="8667451769";
		String actualNumber=pm.getMp().getMobileNumberField().getText();
		Assert.assertEquals(actualNumber, expectedNumber);

		String expectedEmail="muthukumarcm003@gmail.com";
		String actualEmail=pm.getMp().getEmailfield().getText();
		Assert.assertEquals(actualEmail, expectedEmail);

	}

	@Test(priority=6)
	public static void personalInformation()
	{
		elementDisplayed(pm.getMp().getPersonalInformationField());
		elementDisplayed(pm.getMp().getMobileNumberLabel());
		elementEnabled(pm.getMp().getMobileNumber());
		elementDisplayed(pm.getMp().getGreenTickforMobileNumber());
		elementDisplayed(pm.getMp().getEmailIDLabel());
		elementEnabled(pm.getMp().getEmailID());
		elementEnabled(pm.getMp().getVerifyLink());
		elementDisplayed(pm.getMp().getFirstNameLabel());
		elementEnabled(pm.getMp().getFirstName());
		inputValues(pm.getMp().getLastName(), "Gugan");
		elementDisplayed(pm.getMp().getGenderLabel());
		elementEnabled(pm.getMp().getMaleField());
		elementEnabled(pm.getMp().getFemaleField());
		clickOnElement(pm.getMp().getMaleField());
		clickOnElement(pm.getMp().getYearField());
		dropdownSelect(pm.getMp().getYearField(),"value", "1995");
		dropdownSelect(pm.getMp().getMonthField(),"value", "6");
		elementEnabled(pm.getMp().getPersonalCancelButton());
		clickOnElement(pm.getMp().getPersonalSaveButton());


	}

	@Test(priority=7)
	public static void billingInformation()
	{
		elementDisplayed(pm.getMp().getBillingInformationField());
		inputValues(pm.getMp().getAddressField(), "79/1, Vivekananthar street, Dubai");
		inputValues(pm.getMp().getPincodeField(), "643001");
		clickOnElement(pm.getMp().getStateField());
		clickOnElement(pm.getMp().getTamilnaduOption());
		elementEnabled(pm.getMp().getBillingInformationCancelButton());
		clickOnElement(pm.getMp().getBillingInformationSaveButton());

	}

}
