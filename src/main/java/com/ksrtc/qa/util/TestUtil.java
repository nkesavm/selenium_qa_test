package com.ksrtc.qa.util;

import org.openqa.selenium.WebElement;

public class TestUtil {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public void sendKeysToWebElement(WebElement element, String value) {
		if(element.isDisplayed()) {
			System.out.println("The element "+element+ "is displayed");
			element.sendKeys(value);
		} else {
			System.out.println("The element "+element+"is not displayed");
		}	
	}
	
	public void clickWebElement(WebElement element) {
		if(element.isDisplayed()) {
			System.out.println("The element "+element+ "is displayed");
			element.click();
		} else {
			System.out.println("The element "+element+"is not displayed and not clickable");
		}	
	}

}
