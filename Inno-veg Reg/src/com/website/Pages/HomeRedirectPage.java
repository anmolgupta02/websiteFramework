package com.website.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.website.utils.BaseClass;

public class HomeRedirectPage extends BaseClass {

	

	@FindBy(xpath = "//a[@id='profileDropdown']")
	WebElement MenuDropDown;
	
	@FindBy(xpath = "//a[contains(text(),'Admin Settings')]")
	WebElement AdminTrigger;
	
	
//
//	@FindBy(xpath = "	")
//	WebElement PageTrigger;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement HomeTrigger;
	
	@FindBy(xpath = "//label[contains(text(),'Meta Keywords')]")
	WebElement MetaLocator;
	
	
//	public WebElement getPageTrigger() {
//		return PageTrigger;
//	}
	
	

	public WebElement getHomeTrigger() {
		return HomeTrigger;
	} 
	
	
	public WebElement getMenuDropDown() {
		return MenuDropDown;
	}
	
	public WebElement getAdminTrigger() {
		return AdminTrigger;
	}
	
	public WebElement getMetaLocator() {
		return MetaLocator;
	}
}
