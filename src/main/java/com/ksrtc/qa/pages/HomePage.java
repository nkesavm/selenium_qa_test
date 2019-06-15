package com.ksrtc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ksrtc.qa.testbase.TestBase;
import com.ksrtc.qa.util.TestUtil;

public class HomePage extends TestBase {
	
	TestUtil testUtil;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement regLink;
	
	@FindBy(xpath="//a[contains(text(),'Sign-in')]")
	WebElement signInLink;
	
	@FindBy(xpath="//a[contains(text(),'Cancellation')]")
	WebElement cancellationLink;
	
	@FindBy(xpath="//a[contains(text(),'View Ticket')]")
	WebElement viewTicketLink;
	
	@FindBy(xpath="//span[@class='setcCorpHeader']")
	WebElement pageHeader;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateSignInLinkDisplay() {
		return signInLink.isDisplayed();
	}
	
	public boolean validateCancellationLinkDisplay() {
		return cancellationLink.isDisplayed();
	}
	
	public boolean validateViewTicketLinkDisplay() {
		return viewTicketLink.isDisplayed();
	}
	
	public boolean validateRegLinkDisplay() {
		return regLink.isDisplayed();
	}
	
	public void validateRegLink() {
		testUtil.clickWebElement(regLink);
	}
	
	public void validateSignInLink() {
		testUtil.clickWebElement(signInLink);
	}
	
	public void validateViewTicketLink() {
		testUtil.clickWebElement(cancellationLink);
	}
	
	public void validateCancellationLink() {
		testUtil.clickWebElement(viewTicketLink);
	}
	
	public String validateHomePageHeader() {
		return pageHeader.getText();
	}
	
	

}
