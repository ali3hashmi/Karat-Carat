package com.karatncarat.testCases;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.grid.config.EnvConfig;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.karatncarat.utilities.ReadConfig;


import com.karatncarat.testCases.*;



public class BaseClass {

	static ReadConfig readConfig = new ReadConfig();
	public static String environment = readConfig.getEnvironment();
	public static String browser = readConfig.getBrowser();
	public static String salesURL= readConfig.getSalesURL();
	public static String oeURL = readConfig.getOEURL();
	public static String salesusername=readConfig.getUserName();
	public static String salespassword=readConfig.getPassword();
	public static String oeusername = readConfig.getOEUserName();
	public static String oepassword =readConfig.getOEPassWord();



	public static WebDriver driver;
	public static final Logger logs = LogManager.getLogger(BaseClass.class);
	
	//public static TC_Sales_Login tsl=new TC_Sales_Login();
	//public BaseClass bs = new BaseClass();
	//public static WebDriverWait wait = new WebDriverWait(driver, 30);


	@SuppressWarnings("deprecation")
	@Parameters("browser")
	@BeforeClass
	public void SetUp() throws IOException {
	
		//String projectPath = System.getProperty("user.dir");
		//System.out.println(projectPath);

		//PropertyConfigurator.configure("log4j.properties");

		if(browser.equalsIgnoreCase("googleChrome") && environment.equalsIgnoreCase("sales")) {
				
				System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
				driver = new ChromeDriver();

				driver.get(salesURL);
				
				//driver.navigate().to(salesURL);

							
		}
		else if(browser.equalsIgnoreCase("googleChrome") && environment.equalsIgnoreCase("orderExecution")) {
			
			System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
			driver = new ChromeDriver();

			driver.get(oeURL);
			
		}
		else if(browser.equalsIgnoreCase("fireFox") && environment.equalsIgnoreCase("sales")) {

			System.setProperty("webdriver.gecko.driver", readConfig.getFireFoxPath());
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("fireFox") && environment.equalsIgnoreCase("orderExecution")) {

			System.setProperty("webdriver.gecko.driver", readConfig.getFireFoxPath());
			driver = new FirefoxDriver();
		}	
	
		
		//driver.get(salesURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//l.urlSetup();
}	
	
	
	

	
	@AfterClass
	public void tearDown() throws InterruptedException {

		Thread.sleep(5000);
		driver.quit();
	}






}
