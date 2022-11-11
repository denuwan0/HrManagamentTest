package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//*[contains(@class, 'atLogoImg')]")
	WebElement hrmLogo;

	@FindBy(name="username")
	WebElement username;

	@FindBy(name="pwd")
	WebElement password;

	@FindBy(id="loginButton")
	WebElement loginBtn;

	@FindBy(name="remember")
	WebElement keepMeLoggedIn;

	@FindBy(xpath="//a[contains(text(), 'Forgot your password?')]/@href")
	WebElement forgotPassword;

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	public boolean validateHrmImage() {
		return hrmLogo.isDisplayed();
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}

}
