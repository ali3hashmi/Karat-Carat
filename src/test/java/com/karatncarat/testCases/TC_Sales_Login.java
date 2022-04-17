package com.karatncarat.testCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.karatncarat.pageObjects.Sales_Login;

public class TC_Sales_Login extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
		
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		
		logs.info("URL is opened");
		
		Sales_Login sLogin = new Sales_Login(driver);
		
		sLogin.setHrmsId(username);
		//logs.info("username is entered");
		sLogin.setPassword(password);
		//logs.info("password is entered");
		sLogin.clickLogin();
		//logs.info("clicked on login button");
		//String title = driver.getTitle();
		//System.out.println(title);
		
		if(driver.getTitle().equals("Sales - Dashboard - Sales")) {
			
			Assert.assertTrue(true);
			System.out.println("Test case passed");
			
		}
		else {
			
			Assert.assertTrue(false);
			System.out.println("Test case failed");
		}
	}

}
