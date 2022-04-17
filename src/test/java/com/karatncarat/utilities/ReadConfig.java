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
	
	public String getAppURL() {
	
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() {
		
		String username =pro.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		
		String password =pro.getProperty("password");
		return password;
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
