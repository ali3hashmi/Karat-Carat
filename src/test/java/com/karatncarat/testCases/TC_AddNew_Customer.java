package com.karatncarat.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.karatncarat.utilities.ExcelUtility;
import com.karatncarat.pageObjects.AddNew_Customer;
import com.karatncarat.pageObjects.Sales_Login;

public class TC_AddNew_Customer extends BaseClass {
	
	

	
	@Test(priority = 0)
	public void loginTest() throws IOException {
		
        TC_Sales_Login sl= new TC_Sales_Login();
        sl.loginTest();

	}
	
	@Test(priority = 1,dataProvider = "AddNewCustomer")
	public void addNewCustomerTest(String customerType,String customerTitle,String firstName,String middleName,String lastName,
			String customerGender,String AddressOne,String panNumber,String mobNumberOne,String customerCountry,
			String customerState,String customerCity,String CustEmail,String pinCode) 
			throws InterruptedException {
		
		
		AddNew_Customer addCustomer = new AddNew_Customer(driver);
		
		addCustomer.homeCreateDocumentMenu();
		addCustomer.searchCustomer();
		addCustomer.addNewCustomerLink(); 
		addCustomer.customerType(customerType);	
		addCustomer.customerTitle(customerTitle);	
		addCustomer.custFirstName(firstName);
		addCustomer.custMiddletName(middleName);
		addCustomer.custlastName(lastName);
		addCustomer.selectGender(customerGender);
		addCustomer.addressOne(AddressOne);
		addCustomer.panNumber(panNumber);
		addCustomer.mobileOne(mobNumberOne);
		addCustomer.selectCountry(customerCountry);
		addCustomer.selectState(customerState);
		addCustomer.selectCity(customerCity);
		addCustomer.setEmail(CustEmail);
		addCustomer.setPinCode(pinCode);
		addCustomer.addCustomerBtn();
		
		//String title = driver.getTitle();
		//System.out.println(title);
		if(driver.getTitle().equals("Customer Search Details - Sales")) {
			
			Assert.assertTrue(true);
			logs.info("Test case passed");
		}
		else {
			
			Assert.assertTrue(false);
			logs.info("Test case failed");
		}
	}
	
		@DataProvider(name="AddNewCustomer")
		String[][] getData() throws IOException{

			String path =System.getProperty("user.dir")+"/src/test/java/com/karatncarat/testData/Add new customer.xlsx";

			int rowNum = ExcelUtility.getRowCount(path,"Sheet1");
			System.out.println(rowNum);
			int colNum= ExcelUtility.getCellCount(path, "Sheet1",1);
			System.out.println(colNum);

			String logindata[][]=new String[rowNum][colNum];

			for(int i=1;i<=rowNum;i++) {

				for(int j=0;j<colNum;j++) {

					logindata[i-1][j]= ExcelUtility.getCellData(path, "Sheet1", i, j);
				}
			}
			return logindata;
		}

	}


