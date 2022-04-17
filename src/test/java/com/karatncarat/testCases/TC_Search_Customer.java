package com.karatncarat.testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.karatncarat.pageObjects.Sales_Login;
import com.karatncarat.pageObjects.Search_Customer;

public class TC_Search_Customer extends BaseClass {

	@Test(priority = 0)
	public void custLoginTest() throws IOException {

		TC_Sales_Login sl = new TC_Sales_Login();
		sl.loginTest();
	}

	/**
	 * @throws InterruptedException 
	 * 
	 */
	@Test(priority = 1)
	public void custSearchTest() throws InterruptedException {

		Search_Customer searchCust = new Search_Customer(driver);
		searchCust.homeCreateDocumentMenu();
		searchCust.searchCustomer();
		//searchCust.customerID("8");
		//searchCust.searchSubmit();
		//String title = driver.getTitle();
		//System.out.println(title);

		//search using switch condition
		String custSearchOption ="moreFilters";
		String searchInputValue="ali.ashmi@inubesolutions.com";
		int selectOption = 0;

		//create an array list for select option
		/*ArrayList<Object> selectOption=new ArrayList<Object>();
		selectOption.add(0, "Address");
		selectOption.add(1, "City");
		selectOption.add(2, "State");
		selectOption.add(3, "Pin Code");
		selectOption.add(4, "Email");*/

		if(custSearchOption.equals("moreFilters")) {

			selectOption=5;
			//selectOption.get(3);
		}

		//String inputOption="123456";

		/*if(custSearchOption.equals("moreFilters")) {

			 selectOption="Pin Code";
			 inputOption ="123456";
		}*/

		switch(custSearchOption) {

		case "custID":
			searchCust.customerID(searchInputValue);
			searchCust.searchSubmit();
			break;
		case "custName":
			searchCust.customerName(searchInputValue);
			searchCust.searchSubmit();
			break;
		case "contactNum":
			searchCust.contactNumber(searchInputValue);
			searchCust.searchSubmit();
			break;
		case "loyCard":
			searchCust.loyaltyCard(searchInputValue);
			searchCust.searchSubmit();
			break;
		case "moreFilters":
			searchCust.addMoreFilter();
			searchCust.selectOption(selectOption);
			searchCust.inputOption(searchInputValue);
			searchCust.applyButton();
			searchCust.searchSubmit();	
			//Thread.sleep(1000);
			//searchCust.clearBtn();

		case " ":
			searchCust.searchSubmit();
			break;
		}

		//String title = driver.getTitle();
		//System.out.println(title);

		if(driver.getTitle().equalsIgnoreCase("Customer Search Details - Sales")) {

			Assert.assertTrue(true);
			logs.info("Search test case passed");
		}
		else {

			Assert.assertTrue(false);
			logs.info("Search test case failed");
		}
	}

}
