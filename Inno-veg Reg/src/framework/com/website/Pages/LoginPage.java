package framework.com.website.Pages;

import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.website.utils.MethodBank;

public class LoginPage {
		
	MethodBank mb;
	
	String triggerPath = "//*[@id=loginLink";
	
	@FindBy
	(xpath="//a[contains(text(),'Log in')]")
	WebElement loginTrigger;
	
	@FindBy
	(xpath="//input[@name='Email']")
	WebElement EmailField;
	
	@FindBy
	(xpath="//input[@name='Password']")
	WebElement PasswordField;
	
	@FindBy
	(xpath="//input[@class='btn btn-primary btn-lg px-5']")
	WebElement SubmitButton;	
	
	@FindBy
	(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/form[1]/ul[1]/li[1]/a[1]")
	WebElement NameHolder;
	
	
	public String Login(String Email, String Password) throws Exception{
		mb = new MethodBank();
		
		//mb.WaitForElement(loginTrigger, triggerPath);
		mb.clickOnElement(loginTrigger);
		mb.enterbox(EmailField, Email);
		mb.enterbox(PasswordField, Password);
		mb.clickOnElement(SubmitButton);
		
		Thread.sleep(3000);
		String res = mb.getText(NameHolder);
		return res;
		
	}
	
	


}



