package com.website.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public WebDriver startApplication(WebDriver driver, String BaseURL, String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver","E:\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecho.driver", "E:\\ars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
		else 
			System.out.println("Browser Not supported");
	
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(BaseURL);
		return driver;
	}
	
}
