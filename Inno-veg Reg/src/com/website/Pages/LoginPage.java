package com.website.Pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.website.utils.BaseClass;


public class LoginPage extends BaseClass{


	String triggerPath = "//*[@id=loginLink";

	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	WebElement loginTrigger;

	@FindBy(xpath = "//input[@name='Email']")
	WebElement EmailField;

	@FindBy(xpath = "//input[@name='Password']")
	WebElement PasswordField;

	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg px-5']")
	WebElement SubmitButton;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/form[1]/ul[1]/li[1]/a[1]")
	WebElement NameHolder;
	

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

}
