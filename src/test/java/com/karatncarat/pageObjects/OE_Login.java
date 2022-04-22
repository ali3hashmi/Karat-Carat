package com.karatncarat.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OE_Login {

	
	public static final Logger logs = LogManager.getLogger(OE_Login.class);
	public  WebDriver driver;
	
	public OE_Login(WebDriver driver) {
		 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='uname']")
	@CacheLookup
	WebElement oeUserName;
	
	@FindBy(xpath = "//input[@id='passwd']")
	@CacheLookup
	WebElement oePassWord;
	
	@FindBy(xpath = "//input[@value='Login']")
	@CacheLookup
	WebElement loginBtn;
	
	public void userName(String un) {
		
		oeUserName.sendKeys(un);
		logs.info("username is entered");
	}
	
	public void passWord(String pwd) {
		
		oePassWord.sendKeys(pwd);
		logs.info("password is entered");
	}
	
	public void login() {
		
		loginBtn.click();
		logs.info("clicked on login button");
	}
	
	
}
