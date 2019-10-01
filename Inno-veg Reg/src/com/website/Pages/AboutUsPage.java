package com.website.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage {
	
	
	//WebElement Initialization. 
	@FindBy(linkText = "About Us")
	private WebElement aboutUsTrigger;
	
	@FindBy(xpath = "//input[@id='MetaKeywords']")
	private WebElement metaKeyWords;
	
	@FindBy(xpath = "//input[@id='MetaDescription']")
	private WebElement metaDescription; 
	
	@FindBy(xpath = "//input[@id='Title']")
	private WebElement title;
	
	@FindBy(xpath = "//input[@id='Summary']")
	private WebElement summary;
	
	@FindBy(xpath = "//a[@id='ui-id-2']")
	private WebElement contentTrigger;
	
	@FindBy(xpath = "//td[@class='k-editable-area']")
	private WebElement textBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//h4[contains(text(),'Success!')]")
	private WebElement successMsgHolder;
	
	
	
	//Getters for accessing the above WebElements starts. 
	public WebElement getSuccessMsgHolder() {
		return successMsgHolder;
	}

	public WebElement getErrorMsgHolder() {
		return errorMsgHolder;
	}

	@FindBy(xpath = "")
	WebElement errorMsgHolder;

	public WebElement getAboutUsTrigger() {
		return aboutUsTrigger;
	}

	public WebElement getMetaKeyWords() {
		return metaKeyWords;
	}

	public WebElement getMetaDescription() {
		return metaDescription;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getSummary() {
		return summary;
	}

	public WebElement getContentTrigger() {
		return contentTrigger;
	}

	public WebElement getTextBox() {
		return textBox;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	

}
