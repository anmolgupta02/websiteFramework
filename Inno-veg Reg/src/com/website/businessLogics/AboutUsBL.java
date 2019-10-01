package com.website.businessLogics;

import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.website.Pages.AboutUsPage;
import com.website.utils.BaseClass;
import com.website.utils.ExcelDataWriter;
import com.website.utils.MethodBank;

public class AboutUsBL extends BaseClass{
	
	MethodBank mb;
	HomeRedirectBL hbl;
	
	AboutUsPage pageObject = PageFactory.initElements(driver, AboutUsPage.class);
	
	ExcelDataWriter edw = new ExcelDataWriter();
	
	//Method for fill information in the page of About us. 
	public void aboutUsInfoFill() throws Exception {
		
		//Object Initialization
		mb = new MethodBank();
		hbl = new HomeRedirectBL();
		
		//Method to initiate login process and then redirecting to admin portal.
		hbl.redirectToAdmin();
		
		extentTest.log(LogStatus.INFO, "Initiating core logic");
		
		//Core Logic
		mb.clickOnElement(pageObject.getAboutUsTrigger());
		Thread.sleep(2000);
		mb.enterbox(pageObject.getMetaKeyWords(), "Meta");
		mb.enterbox(pageObject.getMetaDescription(),"Description");
		mb.ClearAndWrite(pageObject.getTitle(), "About Innoveg");
		mb.ClearAndWrite(pageObject.getSummary(), edw.getData("Data", 0, 0));
		mb.clickOnElement(pageObject.getContentTrigger());
		mb.HandleKeyBoardEvent(pageObject.getTextBox(), "Test");
		mb.javaScriptScroll(pageObject.getSubmitButton());
		mb.clickOnElement(pageObject.getSubmitButton());
		
		Thread.sleep(2000);
		if((mb.getText(pageObject.getSuccessMsgHolder()).equalsIgnoreCase("Success!"))) {
			extentTest.log(LogStatus.PASS, "The information is saved successfully");
		}else
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(mb.captureScreenshot(driver))+"Unable to submit the information");
	}
	

}
