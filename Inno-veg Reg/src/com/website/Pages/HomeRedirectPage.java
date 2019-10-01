package com.website.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.website.utils.BaseClass;

public class HomeRedirectPage extends BaseClass {

	//WebElements Initialization

	@FindBy(xpath = "//a[@id='profileDropdown']")
	private WebElement MenuDropDown;
	
	@FindBy(xpath = "//a[contains(text(),'Admin Settings')]")
	private WebElement AdminTrigger;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	private WebElement HomeTrigger;
	
	@FindBy(xpath = "//label[contains(text(),'Meta Keywords')]")
	private WebElement MetaLocator;
	
	@FindBy (xpath = "//input[@id='MetaKeywords']")
	private WebElement MetaKeywords;
	
	@FindBy (xpath = "//input[@id='MetaDescription']")
	private WebElement MetaDesc;
	
	@FindBy(xpath = "//td[@class='k-editable-area']")
	private WebElement ContentBody;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement SubmitButton; 
	
	@FindBy(xpath = "//h4[contains(text(),'Success!')]")
	private WebElement successHolder;
	
	//Getter Methods Starts
	
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
