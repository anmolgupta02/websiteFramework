package com.website.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties prop; 
	
	public ConfigReader() throws Exception {
		
		String filepath = System.getProperty("user.dir")+"/Configurations/config.properties";
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);		
	}
	
	public String getBrowserName() {
		return prop.getProperty("browser");
	}
	
	public String getbaseURL() {
		return prop.getProperty("baseURL");
	}
	
	public String getLoginText() {
		return prop.getProperty("loginText");
	}
	
	public String getLoginError() {
		return prop.getProperty("ErrorMessageCredentials");
	}
	
	
	
}
