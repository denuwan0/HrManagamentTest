package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.ApproveTimeTrackPage;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;
import com.hrm.qa.pages.ViewTimeTrackPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ViewTimeTrackPage viewTimeTrackPage;
	ApproveTimeTrackPage approveTimeTrackPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void homePageTitleTest() {
		String homePageTitle = homePage.validateHomePageTitle();
		Assert.assertEquals(homePageTitle, "actiTIME - Enter Time-Track", "Home Page title not matched");
	}

	@Test(priority=2)
	public void gotoViewTimeTrackTest() {
		viewTimeTrackPage = homePage.clickOnViewTimeTrackLink();
	}

	@Test(priority=3)
	public void gotoApproveTimeTrackTest() {
		approveTimeTrackPage = homePage.clickOnApproveTimeTrackLink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
