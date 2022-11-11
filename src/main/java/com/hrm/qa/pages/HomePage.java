package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//*[contains(@class, 'userProfileLink')]")
	WebElement loggedUser;

	@FindBy(xpath="//div[contains(@class, 'label') and contains(text(), 'Tasks')]")
	WebElement tasksLink;

	@FindBy(xpath="//div[contains(@class, 'label') and contains(text(), 'Reports')]")
	WebElement reportsLink;

	@FindBy(xpath="//div[contains(@class, 'label') and contains(text(), 'Users')]")
	WebElement usersLink;

	@FindBy(xpath="//div[contains(@class, 'popup_menu_button_calendar')]")
	WebElement calendars;

	@FindBy(xpath="//div[contains(@class, 'popup_menu_button_settings')]")
	WebElement settings;

	@FindBy(xpath="//div[contains(@class, 'popup_menu_button_tips')]")
	WebElement tips;

	@FindBy(xpath="//div[contains(@class, 'logoSwitcherText') and contains(text(), 'Switch to actiPLANS')]")
	WebElement actiPlansLink;

	@FindBy(xpath="//a[contains(@class, 'item') and contains(text(), 'Approve Time-Track')]")
	WebElement approveTimeTrackLink;

	@FindBy(xpath="//a[contains(@class, 'item') and contains (text(), 'View Time-Track')]")
	WebElement viewTimeTrackLink;

	public HomePage(){
		PageFactory.initElements(driver, this);
	}

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public boolean validateLoggedUser(){
		return loggedUser.isDisplayed();
	}

	public ActiPlansPage clickOnActPlanLink() {
		actiPlansLink.click();
		return new ActiPlansPage();
	}

	public TasksPage clickOnTasksLink() {
		tasksLink.click();
		return new TasksPage();
	}

	public ReportsPage clickOnReportsLink() {
		reportsLink.click();
		return new ReportsPage();
	}

	public UsersPage clickOnUsersLink() {
		usersLink.click();
		return new UsersPage();
	}

	public ViewTimeTrackPage clickOnViewTimeTrackLink() {
		viewTimeTrackLink.click();
		return new ViewTimeTrackPage();
	}

	public ApproveTimeTrackPage clickOnApproveTimeTrackLink() {
		approveTimeTrackLink.click();
		return new ApproveTimeTrackPage();
	}

}
