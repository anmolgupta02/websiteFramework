package com.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.website.businessLogics.HomeRedirectBL;
import com.website.utils.BaseClass;

public class HomeRedirect extends BaseClass {
	
	HomeRedirectBL hbl;
	
	@Test(priority = 1)
	public void Navigate() throws Exception {
		
		extentTest = reports.startTest("Navigate to Home Page calling Login Logic");
		
		hbl= new HomeRedirectBL();
		
		hbl.GoToHomePage();
	
		
	}
	
	@Test(priority = 2)
	public void FillHomePageInfo() throws Exception{
		
		extentTest = reports.startTest("Fill in home page Information");
		
		hbl.FillHomePageInfo();
	}
	
}
