package com.website.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {

	//To handle nullpointer exception use static keyword.
	public static WebDriver driver; 
	
	public ConfigReader config;
	public BrowserFactory bf;
	
	public static ExtentReports reports;
	public static ExtentTest extentTest;
	
	public MethodBank mb;
	
	@BeforeTest
	public void getBrowser() throws Exception {
		bf = new BrowserFactory();
		config = new ConfigReader();
		mb = new MethodBank();
		
		reports = new ExtentReports(System.getProperty("user.dir")+"/reports/Report_at_" + mb.getTimeFormat() +".html");
		
		driver = bf.startApplication(driver, config.getbaseURL(), config.getBrowserName());
	}
	
	@AfterTest
	public void Teardown() {
		
		reports.flush();
		
		driver.quit();
	}
	
	
}
