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
	
	@FindBy (xpath = "//input[@id='MetaKeywords']")
	WebElement MetaKeywords;
	
	@FindBy (xpath = "//input[@id='MetaDescription']")
	WebElement MetaDesc;
	
	@FindBy(xpath = "//td[@class='k-editable-area']")
	WebElement ContentBody;
	
	@FindBy (xpath = "//button[@type='submit']")
	WebElement SubmitButton; 
	
	 
	
	@FindBy(xpath = "//h4[contains(text(),'Success!')]")
	WebElement successHolder;
	
	
	public WebElement getSuccessHolder() {
		return successHolder;
	}
	

	public WebElement getMetaKeywords() {
		return MetaKeywords;
	}


	public WebElement getMetaDesc() {
		return MetaDesc;
	}


	public WebElement getContentBody() {
		return ContentBody;
	}


	public WebElement getSubmitButton() {
		return SubmitButton;
	}


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
