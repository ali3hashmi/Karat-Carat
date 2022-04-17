package com.karatncarat.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Sales_Login {

	public static final Logger logs = LogManager.getLogger(Sales_Login.class);

	public static WebDriver driver;//localdriver
	//public static WebDriverWait wait = new WebDriverWait(driver, 30);

	//rdriver-remote driver
	public Sales_Login(WebDriver driver){

		this.driver=driver;
		//ldriver = rdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="uname")
	@CacheLookup
	WebElement txtHrmsId;

	@FindBy(name="passwd")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/input[1]")
	@CacheLookup	
	WebElement loginBtn;


	public void setHrmsId(String hrmsid) {


		if(txtHrmsId.isEnabled()) {
			txtHrmsId.sendKeys(hrmsid);
			logs.info("username is entered");
		}

	}

	public void setPassword(String password) {

		if(txtPassword.isEnabled()) {

			txtPassword.sendKeys(password);		

			logs.info("password is entered");
		}
	}


	public void clickLogin() {
		WebDriverWait loginWait = new WebDriverWait(driver, 10);
		loginWait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		loginBtn.click();	
		logs.info("clicked on login button");
	}


}
