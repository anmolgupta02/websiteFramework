package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.Pages.LoginPage;
import com.website.utils.BaseClass;
import com.website.utils.ConfigReader;

public class LoginTest extends BaseClass{

	
	LoginPage lp;
	ConfigReader cr;
	
	@Test(priority = 1)
	public void SimpleLogin() throws Exception {
		lp = PageFactory.initElements(driver, LoginPage.class);
		cr = new ConfigReader();
		
		String res = lp.Login("prince@rsk-bsl.com", "Prince@123");
		System.out.println(res);
		if(cr.getLoginText().equalsIgnoreCase(res)) {
			System.out.println("Test Case Passsed Successfully Logged in");
		}
		
		
	}
	
	
}
