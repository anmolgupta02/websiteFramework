package com.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.website.businessLogics.LoginBL;
import com.website.utils.BaseClass;
import com.website.utils.ConfigReader;
import com.website.utils.ExcelDataWriter;

public class LoginTest extends BaseClass {

	ConfigReader cr;
	LoginBL lbl;
	ExcelDataWriter edw;

	@Test(priority = 1)
	public void SimpleLogin() throws Exception {

		extentTest = reports.startTest("Login Test");
		cr = new ConfigReader();
		lbl = new LoginBL();
		edw = new ExcelDataWriter();

		String Username = edw.getData("user", 0, 0);
		String Password = edw.getData("user", 0, 1);

		System.out.println("Credentials Found->" + Username + "&" + Password);

		// String res = lbl.Login("prince@rsk-bsl.com", "Prince@123");
		String res = lbl.Login(Username, Password);

		System.out.println(res);
		if (cr.getLoginText().equalsIgnoreCase(res)) {

			System.out.println("Test Case Passsed Successfully Logged in");
			extentTest.log(LogStatus.PASS, "User logged In successfully");
		}

		Thread.sleep(2000);

		Boolean flag = lbl.logout();

		if (flag) {
			System.out.println("Logged Out Successfully");
			extentTest.log(LogStatus.INFO, "User Logged Out Now");
		}
	}

	@Test(priority = 2)
	public void LoginWithWrongCred() throws Exception {

		cr = new ConfigReader();

		lbl = new LoginBL();

		extentTest = reports.startTest("Test for login with wrong credentials.");
		Thread.sleep(3000);
		String res = lbl.LoginWithWrongCred("anmol@rsk-bsl.com", "Anmol@123");

		if (cr.getLoginError().equalsIgnoreCase(res)) {
			System.out.println("Test Case Pass for wrong Cred.");
			extentTest.log(LogStatus.PASS, "Test Case Pass for wrong Cred.");
		}

		Thread.sleep(200);

	}

}
