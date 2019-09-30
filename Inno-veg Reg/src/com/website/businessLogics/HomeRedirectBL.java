package com.website.businessLogics;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.website.Pages.HomeRedirectPage;
import com.website.utils.BaseClass;
import com.website.utils.ExcelDataWriter;
import com.website.utils.MethodBank;

public class HomeRedirectBL extends BaseClass {

	MethodBank mb = new MethodBank();

	ExcelDataWriter ExcelLib = new ExcelDataWriter();

	HomeRedirectPage hp = PageFactory.initElements(driver, HomeRedirectPage.class);

	LoginBL lbl = new LoginBL();

	public void GoToHomePage() throws Exception {

		lbl.Login(ExcelLib.getData("user", 0, 0), ExcelLib.getData("user", 0, 1));

		System.out.println("Logged In Successfully");
		extentTest.log(LogStatus.INFO, "Logged In Successfully");

		Thread.sleep(2000);

		mb.clickOnElement(hp.getMenuDropDown());

		mb.HandleClickAction(hp.getAdminTrigger());

		Thread.sleep(3000);

		System.out.println("Inside Admin Portal");

		extentTest.log(LogStatus.INFO, "Navigated to admin Portal");
		// mb.HandleAction(hp.getPageTrigger());

		Thread.sleep(1000);

		mb.clickOnElement(hp.getHomeTrigger());

		mb.WaitForElement(hp.getMetaLocator(), "//label[contains(text(),'Meta Keywords')]");

		if (mb.isElementPresent("//label[contains(text(),'Meta Keywords')]")) {
			System.out.println("Navigated to HomePage ");
			extentTest.log(LogStatus.PASS, "Navigated Successfully to Home Page");
		} else {
			System.out.println("Could not navigated to HomePage");
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(mb.captureScreenshot(driver)));
		}
	}

	public void FillHomePageInfo() throws IOException {

		mb.ClearAndWrite(hp.getMetaKeywords(), "Text");

		mb.ClearAndWrite(hp.getMetaDesc(), "Description");

		mb.HandleKeyBoardEvent(hp.getContentBody(), "This is content Body");

		System.out.println("clicking submit button now");
		extentTest.log(LogStatus.INFO, "Clicked on submit button after filling all the data.");
		mb.javaScriptScroll(hp.getSubmitButton());

		mb.clickOnElement(hp.getSubmitButton());

		if (mb.verifyText(hp.getSuccessHolder(), "Success!")) {
			System.out.println("Home Page Details Submmited successfully");
			extentTest.log(LogStatus.PASS, "Home Page Details Submmited successfully");
		} else
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(mb.captureScreenshot(driver)));

	}

}
