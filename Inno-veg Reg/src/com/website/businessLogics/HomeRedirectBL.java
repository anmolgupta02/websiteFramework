package com.website.businessLogics;

import org.openqa.selenium.support.PageFactory;

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
		
		Thread.sleep(3000);
		
		mb.clickOnElement(hp.getMenuDropDown());
		
		mb.HandleAction(hp.getAdminTrigger());
		
		Thread.sleep(3000);
		
		//mb.HandleAction(hp.getPageTrigger());
		
		Thread.sleep(1000);
		
		mb.clickOnElement(hp.getHomeTrigger());
		
		
		
	}
	
}
