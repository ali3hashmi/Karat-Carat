package com.karatncarat.testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.karatncarat.pageObjects.Create_Design_Order;
import com.karatncarat.pageObjects.Sales_Login;
import com.karatncarat.pageObjects.Search_Customer;
import com.karatncarat.utilities.ExcelUtility;

public class TC_Create_Design_Order  extends BaseClass{
	
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

		TC_Search_Customer src = new TC_Search_Customer();
		src.custSearchTest();
		
	}	
	
	@Test(priority = 2,dataProvider = "CreateDesignOrder")
	public void createDesignTest(String segment,String jewel,String grossWt,String netWt,String dueMonth,String dueYear,
			String dueDay,String designBy,String designer,
			String numberOfDes,String pageRefNo,String desInst,String mode,String custDueMonth,String custDueYear,String custDueDay,
			String stoneSegment,String stoneMainCat,String StoneSubCat,String stoneRate,String stonePcs,String stoneWts,String stoneCond,
			String accMainCat,String accSubCat,String accRate,String accPcs,String accWts,String accCond) {
		
		//int segment=2,jewel=3;
		
		Boolean sReq =true;
		Boolean accReq=true;	
		Create_Design_Order ds = new Create_Design_Order(driver);
		ds.actionButton();
		ds.createDesignOrder();
		ds.segmentType(segment);
		ds.jewelType(jewel);
		ds.expectedGrossWt(grossWt);
		ds.expectedNetWt(netWt);
		
		
		if(grossWt.equals(netWt)) {
			
			
			ds.designForm();
			
		}
		else {
			
			ds.stoneDetails();
			ds.stoneRequired(sReq);
			ds.addStoneDetails();
			ds.stoneSegment(stoneSegment);
			ds.stoneMainCat(stoneMainCat);
			ds.stoneSubCat(StoneSubCat);
			ds.stoneRate(stoneRate);
			ds.stoneCustPieces(stonePcs);
			ds.stoneCustWeights(stoneWts);
			ds.stoneCustPrice();
			ds.stoneCondition(stoneCond);
			ds.addButton();
			ds.accDetails();
			ds.accessoryRequired(accReq);
			ds.addAccessoryDetails();
			ds.accMainCategory(accMainCat);
			ds.accSubCategory(accSubCat);
			ds.accessoryRate(accRate);
			ds.accCustPieces(accPcs);
			ds.accCustWeights(accWts);
			ds.accCustPrice();
			ds.accConditions(accCond);
			ds.accAddButton();
			ds.designForm();
			
		}
		
		
		ds.designDueDate();
		ds.designDueMonth(dueMonth);
		ds.designDueYear(dueYear);
		ds.designDueDay(dueDay);
		ds.designBy(designBy);
		ds.designerName(designer);
		ds.noOfDesigns(numberOfDes);
		ds.pageRefNO(pageRefNo);
		ds.uploadDesign();
		ds.designInstruction(desInst);
		ds.designIntimationMode(mode);
		ds.custDueDate();
		ds.custDueMonth(custDueMonth);
		ds.custDueYear(custDueYear);
		ds.custDueDay(custDueDay);
		ds.nextButton();
		
		
	}
	
		@DataProvider(name="CreateDesignOrder")
		String[][] getData() throws IOException{

			String path =System.getProperty("user.dir")+"/src/test/java/com/karatncarat/testData/Create design order.xlsx";

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

