package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.ApproveTimeTrackPage;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;
import com.hrm.qa.util.TestUtil;

public class ApproveTimeTrackPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ApproveTimeTrackPage approveTimeTrackPage;

	public ApproveTimeTrackPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//testUtil.switchToFrame();
		approveTimeTrackPage = homePage.clickOnApproveTimeTrackLink();
	}


	@Test(priority=1)
	public void searchUserAndApproveTest() {
		String userName = approveTimeTrackPage.searchUser("Moreno");
		Assert.assertEquals(userName, "Moreno", "Username not matched");
		approveTimeTrackPage.selectAllButton();
		approveTimeTrackPage.approveBtn();
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
