package com.website.businessLogics;


import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.website.Pages.LoginPage;
import com.website.utils.BaseClass;
import com.website.utils.MethodBank;

public class LoginBL extends BaseClass {

	
	MethodBank mb = new MethodBank();

	LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
	
	public String Login(String Email, String Password) throws Exception {
		//WaitForElement(loginTrigger, triggerPath);
		
		
		mb.clickOnElement(lp.getLoginTrigger());
		
		mb.enterbox(lp.getEmailField(), Email);
		
		mb.enterbox(lp.getPasswordField(), Password);
		
		mb.clickOnElement(lp.getSubmitButton());
		extentTest.log(LogStatus.INFO, "Login Button Clicked after entering email and password");
		Thread.sleep(3000);
		String res = mb.getText(lp.getNameHolder());
		return res;

		
	}
	
	
	public String LoginWithWrongCred(String Email, String Pass) {
		
		
		mb.clickOnElement(lp.getLoginTrigger());
		mb.enterbox(lp.getEmailField(), Email);
		mb.enterbox(lp.getPasswordField(), Pass);
		mb.clickOnElement(lp.getSubmitButton());
		extentTest.log(LogStatus.INFO, "Login Button Clicked after entering invaild email and password");
		String res = mb.getErrorMsg(lp.getErrorHolder());
		return res;
		
	}


	public Boolean logout() {
		
		mb.clickOnElement(lp.getMenuDropDown());
		mb.HandleClickAction(lp.getlogoutTrigger());
		return true;
	}
}
