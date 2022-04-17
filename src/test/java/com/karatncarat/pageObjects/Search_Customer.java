package com.karatncarat.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_Customer {
	
	public static final Logger logs = LogManager.getLogger(Search_Customer.class);
	public static WebDriver driver;
	
	public Search_Customer(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(partialLinkText = "Home / Create Docume")
	@CacheLookup
	WebElement homecreatedocumentMenu;

	@FindBy(linkText = "Search Customer")
	@CacheLookup
	WebElement searchCustomer;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement customerID;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]")
	@CacheLookup
	WebElement searchBtn;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	@CacheLookup
	WebElement customerName;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement contactNumber;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/input[1]")
	@CacheLookup
	WebElement LoyaltyCard;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")
	@CacheLookup
	WebElement addMoreFilter;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectOption;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement inputOption;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
	@CacheLookup
	WebElement applyBtn;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[3]")
	@CacheLookup
	WebElement clear;
	public void homeCreateDocumentMenu() {
		

		homecreatedocumentMenu.click();
		logs.info("clicked on home/create document menu");
	}

	public void searchCustomer() {

		if(searchCustomer.isDisplayed()) {
			
			searchCustomer.click();
			logs.info("clicked on search customer");
			
		}	

	}
	
	public void customerID(String custID) {
		
		if(customerID.isEnabled()) {
			
			customerID.clear();
			customerID.sendKeys(custID);
			logs.info("Customer ID is entered");
		}
	}
	
	public void customerName(String custName) {
		
		if(customerName.isEnabled()) {
			customerName.clear();
			customerName.sendKeys(custName);
			logs.info("Customer Name is entered");
		}
	}
	
	public void contactNumber(String custNum) {
		if(contactNumber.isEnabled()) {
			contactNumber.clear();
			contactNumber.sendKeys(custNum);
			logs.info("Contact number is entered");
		}
	}
	
	public void loyaltyCard(String loyCard) {
		if(LoyaltyCard.isEnabled()) {
			LoyaltyCard.clear();
			LoyaltyCard.sendKeys(loyCard);
			logs.info("Loyalty card is entered");
		}
	}
	public void addMoreFilter() {
		
		if(addMoreFilter.isDisplayed()) {
			
			addMoreFilter.click();
			logs.info("clicked on add more filter button");
		}
		
	}
	
	public void selectOption(int option) {
		if(selectOption.isEnabled()) {
			
		
			Select optionType = new Select(selectOption);
			optionType.selectByIndex(option);
			logs.info("option type has been selected");
		}
		
	}
	public void inputOption(String input) {
		
		if(inputOption.isEnabled()) {
			
			inputOption.clear();
			inputOption.sendKeys(input);
			logs.info("input has been given");
		}
	}
	
	public void applyButton() {
		
		if(applyBtn.isDisplayed()) {
			
			applyBtn.click();
			logs.info("clicked on apply button");
		}
	}
	public void searchSubmit() {
		
		if(searchBtn.isDisplayed()) {
			
			searchBtn.click();
			logs.info("Search button is clicked");
		}
	}
	
	public void clearBtn() {
		
		if(clear.isDisplayed()) {
			
			clear.click();
			logs.info("clicked on clear button");
		}
	}
}
