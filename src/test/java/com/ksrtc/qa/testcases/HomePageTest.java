package com.ksrtc.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ksrtc.qa.pages.HomePage;
import com.ksrtc.qa.testbase.TestBase;

public class HomePageTest extends TestBase {
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
	}
	
	@Test(priority=1)
	public void homePageTitleTest() {
		String homePageTitle = homePage.validateHomePageTitle();
		Assert.assertEquals(homePageTitle, "Kerala State Road Transport Corporation.");
	}
	
	@Test(priority=2)
	public void homePageHeaderTest() {
		String homePageHeader = homePage.validateHomePageHeader();
		Assert.assertEquals(homePageHeader, "Kerala State Road Transport Corporation");
	}
	
	@Test(priority=3)
	public void signInLinkDisplayTest() {
		boolean  signInLink = homePage.validateSignInLinkDisplay();
		Assert.assertTrue(signInLink);
	}
	
	@Test(priority=4)
	public void registrationLinkDisplayTest() {
		boolean  regLink = homePage.validateRegLinkDisplay();
		Assert.assertTrue(regLink);
	}
	
	@Test(priority=5)
	public void viewTicketLinkDisplayTest() {
		boolean  viewTicketLink = homePage.validateViewTicketLinkDisplay();
		Assert.assertTrue(viewTicketLink);
	}
	
	@Test(priority=6)
	public void cancellationLinkDisplayTest() {
		boolean  cancellationLink = homePage.validateCancellationLinkDisplay();
		Assert.assertTrue(cancellationLink);
	}
	
	@Test(priority=7)
	public void registrationLinkClickTest() {
		homePage.validateRegLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
