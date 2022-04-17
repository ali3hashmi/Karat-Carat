package com.karatncarat.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class AddNew_Customer {


	public static final Logger logs = LogManager.getLogger(AddNew_Customer.class);

	public static WebDriver driver;

	public AddNew_Customer(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(partialLinkText = "Home / Create Docume")
	@CacheLookup
	WebElement homecreatedocumentMenu;

	@FindBy(linkText = "Search Customer")
	@CacheLookup
	WebElement searchCustomer;

	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement addNewCustomerLink;

	@FindBy(name="customerType")
	@CacheLookup
	WebElement type;

	@FindBy(name="customerTitles")
	@CacheLookup
	WebElement custtitle;

	@FindBy(name="firstname")
	@CacheLookup
	WebElement firstname;

	@FindBy(name="middlename")
	@CacheLookup
	WebElement middlename;

	@FindBy(name="lastname")
	@CacheLookup
	WebElement lastname;

	@FindBy(name="gender")
	@CacheLookup
	WebElement gender;

	@FindBy(name="address1")
	@CacheLookup
	WebElement address1;

	@FindBy(name="panNumber")
	@CacheLookup
	WebElement pannumber;

	@FindBy(name="mobile")
	@CacheLookup
	WebElement mobile1;


	@FindBy(name="country")
	@CacheLookup
	WebElement country;

	@FindBy(name="state")
	@CacheLookup
	WebElement state;

	@FindBy(name="city")
	@CacheLookup
	WebElement city;

	@FindBy(name="email")
	@CacheLookup
	WebElement email;

	@FindBy(name="pincode")
	@CacheLookup
	WebElement pincode;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/div[2]/form[1]/div[3]/button[1]")	
	@CacheLookup
	WebElement addcustomerbtn;


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
	public void addNewCustomerLink() {

		addNewCustomerLink.click();
		logs.info("Clicked on add new customer link");
	}

	public void customerType(String customerType) {

		if(type.isEnabled()) {
			
			Select custType = new Select(type);
			custType.selectByValue(customerType);
			logs.info("customer type is selected");
		}
		

	}

	public void customerTitle(String customerTitle) {

		if(custtitle.isEnabled()){
			
			Select custTitle = new Select(custtitle);
			custTitle.selectByValue(customerTitle);
			logs.info("Customer title is selected");
		}
		

	}

	public void custFirstName(String firstName) {

		if(firstname.isEnabled()) {
			firstname.sendKeys(firstName);
			logs.info("First name entered");	
		}
		
	}
	public void custMiddletName(String middleName) {

		if(middlename.isEnabled()) {
			middlename.sendKeys(middleName);
			logs.info("middle name entered");
	
		}
	}
	public void custlastName(String lastName) {

		if(lastname.isEnabled()) {
			lastname.sendKeys(lastName);
			logs.info("last name enetered");
		}
		
	}

	public void selectGender(String customerGender) {
		
		
        if(gender.isEnabled()) {
        	Select Gender = new Select(gender);
    		Gender.selectByValue(customerGender);
    		logs.info("Customer geneder is selected");
        }
		
	}

	public void addressOne(String custAddOne) {

		if(address1.isEnabled()) {
			
			address1.sendKeys(custAddOne);
			logs.info("Customer address one is entered");
		}
		
	}
	public void panNumber(String panNum) {

		if(pannumber.isEnabled()) {
			
			pannumber.sendKeys(panNum);
			logs.info("Pan number is entered");
		}
		
	}
	public void mobileOne(String custMobOne) {

		if(mobile1.isEnabled()) {
			mobile1.sendKeys(custMobOne);
			logs.info("Customer mobile one is entered");
		}
		
	}
	public void selectCountry(String customerCountry) {

		if(country.isEnabled()) {
			Select Country = new Select(country);
			Country.selectByValue(customerCountry);
			logs.info("Customer country is selected");
		}
		
	}
	public void selectState(String customerState) {

		if(state.isEnabled()) {
			Select State = new Select(state);
			State.selectByValue(customerState);
			logs.info("Customer state is selected");
		}
		
	}
	public void selectCity(String customerCity) {
		
		if(city.isEnabled()){
			
			Select City = new Select(city);
			City.selectByValue(customerCity);
			logs.info("Customer city is selected");
		}
		
	}
	public void setEmail(String custEmail) {

		if(email.isEnabled()) {
			
			email.sendKeys(custEmail);
			logs.info("Customer email is entered");
		}
		
	}
	public void setPinCode(String custPinCode) {

		if(pincode.isEnabled()) {
			pincode.sendKeys(custPinCode);
			logs.info("Customer pincode is entered");	
		}
		
	}
	
	public void addCustomerBtn() {
		
		if(addcustomerbtn.isEnabled()) {
			
			addcustomerbtn.click();
			logs.info("clicked on add customer button");
		}		
		
		
	}


}
