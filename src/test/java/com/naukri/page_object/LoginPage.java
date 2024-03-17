package com.naukri.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath = "//a[@class='nI-gNb-header__logo nI-gNb-company-logo']/child::img")
	public static WebElement logo;

	@FindBy(xpath = "//a[@title='Jobseeker Login']")
	public static WebElement LoginButton;

	@FindBy(xpath = "//label[contains(.,'Email ID / Username')]/following::input[1]")
	public static WebElement UserName;

	@FindBy(xpath = "//input[@type='password']")
	public static WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement SubmitButton;
	
	@FindBy(xpath = "//div[@class='view-profile-wrapper']/child::a")
	public static WebElement VerifyLogo;
}
