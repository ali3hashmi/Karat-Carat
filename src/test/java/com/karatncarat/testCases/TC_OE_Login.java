package com.karatncarat.testCases;


import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.karatncarat.pageObjects.OE_Login;

public class TC_OE_Login extends BaseClass{
	
	@Test
	public void oeLoginTest() {
		
		OE_Login olg = new OE_Login(driver);
		
		olg.userName(oeusername);
		olg.passWord(oepassword);
		olg.login();
		String title = driver.getTitle();
		String str=driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(str);
		
		if(driver.getCurrentUrl().equalsIgnoreCase("http://103.1.114.170:2008/OrderExecution/login")) {
			
			Assert.assertTrue(true);
			System.out.println("Test case passed");
			logs.info("test case passed");
		}
		else {
			
			Assert.assertTrue(false);
			System.out.println("test case failed");
			logs.info("test case failed");
		}
	}

	
}
