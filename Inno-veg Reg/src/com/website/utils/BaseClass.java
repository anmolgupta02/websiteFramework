package com.website.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	//To handle nullpointer exception use static keyword.
	public static WebDriver driver; 
	
	public ConfigReader config;
	public BrowserFactory bf;
	
	@BeforeTest
	public void getBrowser() throws Exception {
		bf = new BrowserFactory();
		config = new ConfigReader();
		
	 	
		driver = bf.startApplication(driver, config.getbaseURL(), config.getBrowserName());
	}
	
	@AfterTest
	public void Teardown() {
		driver.quit();
	}
	
	
}
