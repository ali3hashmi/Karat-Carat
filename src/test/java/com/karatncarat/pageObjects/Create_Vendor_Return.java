package com.karatncarat.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Create_Vendor_Return {
	
	public static final Logger logs = LogManager.getLogger(Create_Vendor_Return.class);
	public static WebDriver driver;
	
	public Create_Vendor_Return(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
}
