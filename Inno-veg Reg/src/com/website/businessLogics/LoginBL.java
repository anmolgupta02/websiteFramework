package com.website.businessLogics;

import org.openqa.selenium.support.PageFactory;

import com.website.Pages.LoginPage;
import com.website.utils.BaseClass;
import com.website.utils.MethodBank;

public class LoginBL extends BaseClass {

	
	MethodBank mb = new MethodBank();

	LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
	
	public void Login(String Email, String Password) throws Exception {
		//WaitForElement(loginTrigger, triggerPath);
		
		
		mb.clickOnElement(lp.getLoginTrigger());
		
		mb.enterbox(lp.getEmailField(), Email);
		
		mb.enterbox(lp.getPasswordField(), Password);
		
		mb.clickOnElement(lp.getSubmitButton());

		Thread.sleep(3000);
		String res = mb.getText(lp.getNameHolder());
		//return res;

	}
}
