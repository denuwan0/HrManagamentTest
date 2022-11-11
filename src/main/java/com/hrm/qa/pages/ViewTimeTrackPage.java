package com.hrm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.util.TestUtil;

public class ViewTimeTrackPage extends TestBase{

	@FindBy(xpath="//*[contains(@class, 'dashedLink')]")
	WebElement timeTrackForLink;

	@FindBy(xpath="//*[contains(@class, 'userName')] and contains(text(), 'Moreno, Andrew')")
	WebElement userLink;

	@FindBy(xpath="//td[contains(@class, 'generatePDF') and contains(text(), 'Export to PDF')]")
	WebElement reportLink;

	public ViewTimeTrackPage(){
		PageFactory.initElements(driver, this);
	}

	public void clickOntimeTrackForLink() {
		Actions action = new Actions(driver);
		action.moveToElement(timeTrackForLink).click().perform();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	public void clickOnUserLink() {
		Actions action = new Actions(driver);
		action.moveToElement(userLink).click().perform();

	}

	public void clickOnreportLink() {
		reportLink.click();
	}

}
