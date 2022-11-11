package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class ApproveTimeTrackPage extends TestBase{

	@FindBy(xpath="//*[contains(@class, 'statusApprovalSelectorButtonTitle') and contains(text(), 'Ready for Approval, Not Ready, Rejected')]")
	WebElement timeTrackStatusLink;

	@FindBy(name="notReadyForApprovalCbx")
	WebElement notReadyForApprovalCheckBox;

	@FindBy(name="rejectedCbx")
	WebElement rejectedCbxCheckBox;

	@FindBy(name="readyForApprovalCbx")
	WebElement readyForApprovalCbxCheckBox;

	@FindBy(xpath="//button[contains(text(), 'Apply')]")
	WebElement applyBtn;

	@FindBy(xpath="//*[@id='approveButton']")
	WebElement approveBtn;

	@FindBy(xpath="//*[@id='selectAllButton']")
	WebElement selectAllButton;

	@FindBy(xpath="//*[contains(@class, 'filterFieldInput')]")
	WebElement userSearch;

	@FindBy(xpath="//*[contains(@class, 'highlightToken') and contains(text(), 'Moreno')]")
	WebElement userSearchResult;


	public ApproveTimeTrackPage(){
		PageFactory.initElements(driver, this);
	}

	public void clickOntimeTrackStatusLink() {
		timeTrackStatusLink.click();
	}

	public void notReadyForApprovalCheckBox() {
		notReadyForApprovalCheckBox.click();
	}

	public void rejectedCbxCheckBox() {
		rejectedCbxCheckBox.click();
	}

	public void readyForApprovalCbxCheckBox() {
		readyForApprovalCbxCheckBox.click();
	}

	public void applyBtn() {
		applyBtn.click();
	}

	public void selectAllButton() {
		selectAllButton.click();
	}

	public void approveBtn() {
		approveBtn.click();
	}

	public String searchUser(String uname){
		userSearch.sendKeys(uname);
		return userSearchResult.getText();
	}

}
