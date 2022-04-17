package com.karatncarat.testCases;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.karatncarat.utilities.ReadConfig;






public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	public String baseURL= readConfig.getAppURL();
	public String username=readConfig.getUserName();
	public String password=readConfig.getPassword();

	public static WebDriver driver;
	public static final Logger logs = LogManager.getLogger(BaseClass.class);
	//public static WebDriverWait wait = new WebDriverWait(driver, 30);
	

	@SuppressWarnings("deprecation")
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {

		

		//String projectPath = System.getProperty("user.dir");
		//System.out.println(projectPath);
			
	    //PropertyConfigurator.configure("log4j.properties");

		if(br.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", readConfig.getFireFoxPath());
			driver = new FirefoxDriver();
		}

		driver.get(baseURL);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

		

	}

	@AfterClass
	public void tearDown() throws InterruptedException {

		Thread.sleep(5000);
		driver.quit();
	}
	
	
		
	
		
		
}
