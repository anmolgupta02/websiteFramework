package com.testcases;

import org.testng.annotations.Test;

import com.website.businessLogics.HomeRedirectBL;
import com.website.utils.BaseClass;

public class HomeRedirect extends BaseClass {
	
	HomeRedirectBL hbl;
	
	@Test
	public void Navigate() throws Exception {
		
		hbl= new HomeRedirectBL();
		
		hbl.GoToHomePage();
		
	}
	
	

}
