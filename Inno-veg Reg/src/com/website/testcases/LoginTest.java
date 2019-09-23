package com.website.testcases;

import org.testng.annotations.Test;
import com.website.businessLogics.LoginBL;
import com.website.utils.BaseClass;
import com.website.utils.ConfigReader;

public class LoginTest extends BaseClass {

	ConfigReader cr;
	LoginBL lbl;

	@Test(priority = 1)
	public void SimpleLogin() throws Exception {
		
		cr = new ConfigReader();
		lbl = new LoginBL();
		
		
		lbl.Login("prince@rsk-bsl.com", "Prince@123");
		//System.out.println(res);
		if (cr.getLoginText().equalsIgnoreCase("prince@rsk-bsl.com")) {
			
			System.out.println("Test Case Passsed Successfully Logged in");
		}

	}

}
