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
		
		
		String res = lbl.Login("prince@rsk-bsl.com", "Prince@123");
		System.out.println(res);
		if (cr.getLoginText().equalsIgnoreCase(res)) {
			
			System.out.println("Test Case Passsed Successfully Logged in");	
		}
		
		Thread.sleep(2000);
		
		Boolean flag = lbl.logout();
		
		if(flag) {
			System.out.println("Logged Out Successfully");
		}
	}
	
	@Test(priority = 2)
	public void LoginWithWrongCred() throws Exception{
		
		cr = new ConfigReader();
		
		lbl = new LoginBL();
		
		Thread.sleep(3000);
		String res = lbl.LoginWithWrongCred("anmol@rsk-bsl.com", "Anmol@123");
		
		if(cr.getLoginError().equalsIgnoreCase(res)) {
			System.out.println("Test Case Pass for wrong Cred.");
		}
		
		Thread.sleep(200);
		
	}
	

}
