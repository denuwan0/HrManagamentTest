package com.hrm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;
import com.hrm.qa.pages.UsersPage;
import com.hrm.qa.util.TestUtil;

public class UsersPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	UsersPage usersPage;

	String sheetName = "users";


	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		//usersPage = new UsersPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		usersPage = homePage.clickOnUsersLink();
	}

	@DataProvider
	public Object[][] getHRMTestData(){
		Object data [][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(priority=1, dataProvider="getHRMTestData")
	public void validateCreateNewUser(String firstName, String lastName, String email){
		usersPage.clickOnNewUserBtn();
		usersPage.createNewUser(firstName, lastName, email);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
