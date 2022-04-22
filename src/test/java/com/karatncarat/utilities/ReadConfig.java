package com.karatncarat.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfig {

	//create object for properties class
	
	Properties pro;
	
	public ReadConfig() {
		
		File src = new File("./Configuration/config.properties");

		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is " +e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public String getEnvironment() {
		String environment = pro.getProperty("environment");
		return environment;
		
	}
	public String getBrowser() {
		String browser = pro.getProperty("browser");
		return browser;
		
	}
	
	public String getSalesURL() {
	
		String url = pro.getProperty("salesURL");
		return url;
	}
	
	public String getOEURL() {
		
		String oeURL =pro.getProperty("oeURL");
		return oeURL;
	}
	
	
	public String getUserName() {
		
		String salesUsername =pro.getProperty("salesusername");
		return salesUsername;
	}
	
	public String getPassword() {
		
		String salesPassword =pro.getProperty("salespassword");
		return salesPassword;
	}
	
	public String getOEUserName() {
		
		String oeUsername = pro.getProperty("oeusername");
		return oeUsername;
	}
	
	public String getOEPassWord() {
		
		String oePassword =pro.getProperty("oepassword");
		return oePassword;
	}
	public String getChromePath() {
		
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFireFoxPath() {
		
		String firefoxpath= pro.getProperty("firefoxpath");
		return firefoxpath;
	}
}
