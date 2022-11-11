package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		//homePage = new HomePage();
	}

	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "actiTIME - Login", "Login Page title not matched");
	}

	@Test(priority=2)
	public void hrmLogoImageTest() {
		boolean flag1 = loginPage.validateHrmImage();
		Assert.assertTrue(flag1,"Login Page HRM logo not found");
	}

	@Test(priority=3)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean flag2 = homePage.validateLoggedUser();
		Assert.assertTrue(flag2, "username not found");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
