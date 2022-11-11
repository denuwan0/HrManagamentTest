package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class UsersPage extends TestBase{

	//@FindBy(xpath="//*[contains(@class, 'components_button_label') and contains(@text, 'New User')]")
	@FindBy(xpath="//div[@class='components_button_label' and contains(text(),'New User')]")
	WebElement newUserBtn;

	@FindBy(xpath="//div[@class='components_button_label' and contains(text(),'Bulk Invitations')]")
	WebElement bulkUserBtn;

	@FindBy(xpath="//input[@id='createUserPanel_firstNameField']")
	WebElement firstName;

	//@FindBy(id="createUserPanel_firstNameField")
	//WebElement firstName;

	@FindBy(xpath="//input[@id='createUserPanel_lastNameField']")
	WebElement lastName;

	//@FindBy(id="createUserPanel_lastNameField")
	//WebElement lastName;

	@FindBy(xpath="//input[@id='createUserPanel_emailField']")
	WebElement userEmail;

	//@FindBy(id="createUserPanel_emailField")
	//WebElement userEmail;

	@FindBy(xpath="//div[@class='components_button_label' and contains(text(),'Save & Send Invitation')]")
	WebElement saveBtn;

	public UsersPage(){
		PageFactory.initElements(driver, this);
	}

	public void clickOnNewUserBtn() {
		//Actions action = new Actions(driver);
		//action.moveToElement(newUserBtn).click().perform();
		newUserBtn.click();
	}

	public void clickOnBulkUserBtn() {
		//Actions action = new Actions(driver);
		//action.moveToElement(bulkUserBtn).click().perform();
		bulkUserBtn.click();
	}

	public void clickOnsaveBtn() {
		//Actions action = new Actions(driver);
		//action.moveToElement(saveBtn).click().perform();
		saveBtn.click();
	}

	public void createNewUser(String fName, String lName, String eMail) {

		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		userEmail.sendKeys(eMail);
		saveBtn.click();

	}

}
