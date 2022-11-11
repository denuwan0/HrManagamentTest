package com.hrm.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;
import com.hrm.qa.pages.ViewTimeTrackPage;
import com.hrm.qa.util.TestUtil;

public class ViewTimeTrackPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ViewTimeTrackPage viewTimeTrackPage;

	public ViewTimeTrackPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//testUtil.switchToFrame();
		viewTimeTrackPage = homePage.clickOnViewTimeTrackLink();
	}

	@Test(priority=1)
	public void changeUserTest() {
		viewTimeTrackPage.clickOntimeTrackForLink();
		viewTimeTrackPage.clickOnUserLink();
	}



	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
