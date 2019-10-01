package com.website.Pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.website.utils.BaseClass;


public class LoginPage extends BaseClass{


	String triggerPath = "//*[@id=loginLink";
	
	//WebElement Initialization.
	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	private WebElement loginTrigger;

	@FindBy(xpath = "//input[@name='Email']")
	private WebElement EmailField;

	@FindBy(xpath = "//input[@name='Password']")
	private WebElement PasswordField;

	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg px-5']")
	private WebElement SubmitButton;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/form[1]/ul[1]/li[1]/a[1]")
	private WebElement NameHolder;
	
	@FindBy(xpath="//li[contains(text(),'Invalid login attempt.')]")
	private WebElement ErrorHolder;
	
	@FindBy(xpath = "//a[@id='profileDropdown']")	
	private WebElement MenuDropDown;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement logoutButton;
	
	//Getters for accesseing the above webElements starts. 
	public WebElement getMenuDropDown() {
		return MenuDropDown;
	}

	public WebElement getErrorHolder() {
		return ErrorHolder;
	}

	public String getTriggerPath() {
		return triggerPath;
	}

	public WebElement getLoginTrigger() {
		return loginTrigger;
	}

	public WebElement getEmailField() {
		return EmailField;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public WebElement getNameHolder() {
		return NameHolder;
	}

	public WebElement getlogoutTrigger() {
		return logoutButton;
	}

}
