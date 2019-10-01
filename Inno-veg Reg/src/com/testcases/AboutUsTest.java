package com.testcases;

import org.testng.annotations.Test;

import com.website.businessLogics.AboutUsBL;
import com.website.utils.BaseClass;

public class AboutUsTest extends BaseClass {
	
	AboutUsBL logicObject;
	
	
	@Test(priority = 1)
	public void AboutUsFill() throws Exception {
		
		logicObject = new AboutUsBL();
		
		extentTest = reports.startTest("Filling the About Us information");
		
		logicObject.aboutUsInfoFill();
	}
}
