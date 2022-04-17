package com.karatncarat.pageObjects;

import java.util.List;

import javax.xml.xpath.XPath;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.karatncarat.testCases.TC_Search_Customer;

public class Create_Design_Order {

	public static final Logger logs = LogManager.getLogger(Create_Design_Order.class);
	public static WebDriver driver;

	//public Actions builder = new Actions(driver);
	//public Action act;

	public Create_Design_Order(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//search customer web elements
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

	//create design order wed elements
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/button[1]")
	@CacheLookup
	WebElement actionBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement createDesignOrder;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/uib-accordion[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement designForm;

	@FindBy(name = "segmentType-1")
	@CacheLookup
	WebElement segmentType;

	@FindBy(name = "jewelType-1")
	@CacheLookup
	WebElement jewelType;

	@FindBy(name="expectedFromWeight-1")
	@CacheLookup
	WebElement expectedGrossWt;

	@FindBy(name = "expectedToWeight-1")
	@CacheLookup
	WebElement expectedNetWt;

	@FindBy(name = "designDueDate-1")
	@CacheLookup
	WebElement designDueDate;

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	@CacheLookup
	WebElement dueDateMonth;

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	@CacheLookup
	WebElement dueDateYear;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//td")
	@CacheLookup
	List<WebElement> dueDate;


	@FindBy(name = "designerType-1")
	@CacheLookup
	WebElement designBy;


	@FindBy(name = "designerName-1")
	@CacheLookup
	WebElement designerName;

	@FindBy(name = "noofDesign-1")
	@CacheLookup
	WebElement noOfDesigns;

	@FindBy(name = "refNo-1")
	@CacheLookup
	WebElement pageRefNo;


	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/uib-accordion[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]")
	@CacheLookup
	WebElement browseDesign;

	@FindBy(name = "designDesc-1")
	@CacheLookup
	WebElement designDesc;

	@FindBy(name = "designIntmode-1")
	@CacheLookup
	WebElement intimationMode;

	@FindBy(name = "custApprovalDueDate-1")
	@CacheLookup
	WebElement custDueDate;    

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	@CacheLookup
	WebElement custDueMonth;

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	@CacheLookup
	WebElement custDueYear;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//td")
	@CacheLookup
	List<WebElement> custDueDay;

	@FindBy(partialLinkText = "Stone Detai")
	@CacheLookup
	WebElement stoneDetails;

	@FindBy(css = "input[value='1'][name='stoneReq-1']")
	@CacheLookup
	WebElement stoneRequired;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/uib-accordion[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]/i[1]")
	@CacheLookup
	WebElement addStone;

	@FindBy(xpath = "//select[@name='segment']")
	@CacheLookup
	WebElement stoneSegment;

	@FindBy(xpath = "//select[@name='mainCategory']")
	@CacheLookup
	WebElement stoneMainCategory;

	@FindBy(xpath = "//select[@name='subCategory']")
	@CacheLookup
	WebElement stoneSubCategory;

	@FindBy(xpath = "//select[@name='rate']")
	@CacheLookup
	WebElement stoneRate;

	@FindBy(xpath = "//input[@name='custPieces']")
	@CacheLookup
	WebElement stoneCustPcs;

	@FindBy(xpath = "//input[@name='custWeight']")
	@CacheLookup
	WebElement stoneCustWt;

	@FindBy(xpath = "//input[@name='custPrice']")
	@CacheLookup
	WebElement stoneCostPrice;

	@FindBy(xpath = "//select[@name='condition']")
	@CacheLookup
	WebElement condition;

	@FindBy(xpath = "//button[@class='btn btn-primary ng-binding']")
	@CacheLookup
	WebElement addButton;

	@FindBy(xpath = "//button[@class='btn btn-warning']")
	@CacheLookup
	WebElement cancelButton;

	@FindBy(xpath = "//a[normalize-space()='Accessory Details']")
	@CacheLookup
	WebElement accDetails;

	@FindBy(css = "input[value='1'][name='accReq-1']")
	@CacheLookup
	WebElement accRequired;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/uib-accordion[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[3]/div[1]/div[2]/div[1]/div[3]/button[1]")
	@CacheLookup
	WebElement addAccessory;

	@FindBy(xpath = "//select[@name='mainCategory']")
	@CacheLookup
	WebElement accMainCategory;

	@FindBy(xpath = "//select[@name='subCategory']")
	@CacheLookup
	WebElement accSubCategory;

	@FindBy(xpath = "//select[@name='rate']")
	@CacheLookup
	WebElement accRate;

	@FindBy(xpath = "//input[@name='custPieces']")
	@CacheLookup
	WebElement accCustPieces;

	@FindBy(xpath="//input[@name='custWeight']")
	@CacheLookup
	WebElement accCustWts;

	@FindBy(xpath ="//input[@name='custPrice']")
	@CacheLookup
	WebElement accCustPrice;

	@FindBy(xpath = "//select[@name='condition']")
	@CacheLookup
	WebElement accCondition;

	@FindBy(xpath = "//button[@class='btn btn-primary ng-binding']")
	@CacheLookup
	WebElement accAddBtn;

	@FindBy(xpath = "//button[@class='btn btn-warning']")
	@CacheLookup
	WebElement accCancelBtn;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[3]")
	@CacheLookup
	WebElement nextBtn;

	@FindBy(name = "isAdvancedPayment")
	@CacheLookup
	List<WebElement> advancePayment;

	
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

	public void actionButton() {

		if(actionBtn.isEnabled()) {
			actionBtn.click();
			logs.info("clicked on action button");
		}
	}

	public void createDesignOrder() {

		if(createDesignOrder.isEnabled()) {
			createDesignOrder.click();
			logs.info("Clicked on create design order");

		}

		else {
			logs.info("fail");
		}
	}

	public void designForm() {

		designForm.click();
		logs.info("clicked on design form");
	}

	public void segmentType(String segment) {

		if(segmentType.isEnabled()) {

			Select segmenttype = new Select(segmentType);
			segmenttype.selectByVisibleText(segment);
			logs.info("segment type is selected");
		}
	}

	public void jewelType(String jewel) {

		if(jewelType.isEnabled()) {

			Select jeweltype = new Select(jewelType);
			jeweltype.selectByVisibleText(jewel);
			logs.info("jewel type is selected");
		}
	}

	public void expectedGrossWt(String grossWt) {

		if(expectedGrossWt.isEnabled()) {

			expectedGrossWt.clear();
			expectedGrossWt.sendKeys(String.valueOf(grossWt));
			logs.info("expected gross wt is entered");
		}
	}
	public void expectedNetWt(String netWt) {

		if(expectedNetWt.isEnabled()) {

			expectedNetWt.clear();
			expectedNetWt.sendKeys(String.valueOf(netWt));
			logs.info("expected net wt is entered");
		}
	}

	public void designDueDate() {

		if(designDueDate.isEnabled()) {

			designDueDate.click();
			logs.info("clicked design due date");
		}
	}

	public void designDueMonth(String dueMonth) {

		dueDateMonth.click();
		Select month = new Select(dueDateMonth);
		month.selectByVisibleText(dueMonth);

		logs.info("Due date month has selected");
		/*if(dueDateMonth.isSelected()) {

			logs.info("Due date month has selected");
		}*/

	}

	public void designDueYear(String dueYear) {

		dueDateYear.click();
		Select year = new Select(dueDateYear);
		year.selectByVisibleText(dueYear);

		logs.info("due date year has selected");
		/*if(dueDateYear.isSelected()) {

			logs.info("due date year has selected");
		}*/
	}
	public void designDueDay(String dueDay) {

		System.out.println(dueDay);
		for(WebElement dd:dueDate) {

			String dt = dd.getText();
			//System.out.println(dt);
			if(dt.equals(dueDay)) {


				dd.click();
				break;

			}
		}
		logs.info("due day is selected");

	}
	public void designBy(String designedBy) {

		if(designBy.isEnabled()) {

			Select design = new Select(designBy);
			design.selectByVisibleText(designedBy);
			logs.info("designer is selected");
		}
	}
	public void designerName(String designer) {

		if(designerName.isEnabled()) {

			Select nod = new Select(designerName);
			nod.selectByVisibleText(designer);
			logs.info("designer name is selected");
		}
	}

	public void noOfDesigns(String numberOfDesigns) {

		if(noOfDesigns.isEnabled()) {

			noOfDesigns.sendKeys(numberOfDesigns);
			logs.info("no of designs entered");
		}
	}

	public void pageRefNO(String pageRefNum) {

		if(pageRefNo.isEnabled()) {

			pageRefNo.sendKeys(pageRefNum);
			logs.info("Page ref no is entered");
		}
	}

	public void uploadDesign() {

		if(browseDesign.isEnabled()) {

			browseDesign.sendKeys("C:\\Users\\USER\\Downloads\\bangle.jpg");
			//browseDesign.sendKeys(path);
			logs.info("designs has been uploaded");
		}
	}

	public void designInstruction(String desc) {

		if(designDesc.isEnabled()) {

			designDesc.sendKeys(desc);
			logs.info("design instruction is entered");
		}
	}

	public void designIntimationMode(String iMode) {

		if(intimationMode.isEnabled()) {

			Select mode = new Select(intimationMode);
			mode.selectByVisibleText(iMode);
			logs.info("intimation mode has selected");
		}
	}

	public void custDueDate() {

		if(custDueDate.isEnabled()) {

			custDueDate.click();
			logs.info("clicked on customer due date");
		}
	}

	public void custDueMonth(String dueMonth) {

		custDueMonth.click();
		Select month = new Select(custDueMonth);
		month.selectByVisibleText(dueMonth);
		logs.info("customer due month selected");

	}

	public void custDueYear(String dueYear) {

		custDueYear.click();
		Select year = new Select(custDueYear);
		year.selectByVisibleText(dueYear);
		logs.info("customer due year selected");
	}

	public void custDueDay(String dueDay) {

		for(WebElement dd:custDueDay) {

			String dt = dd.getText();
			if(dt.equals(dueDay)) {

				dd.click();
				break;
			}
		}
	}
	public void stoneDetails() {

		//stoneDetails.click();
		//Actions builder = new Actions(driver);
		//Action mouseClick = builder.moveToElement(stoneDetails).build();
		stoneDetails.click();
		logs.info("clicked on stone details");
	}

	public void stoneRequired(Boolean sRequired) {

		//stoneRequired.click();
		//logs.info("stone required is true");
		if(stoneRequired.isEnabled()) {

			stoneRequired.click();
			logs.info("stone required click as yes");

		}	
	}

	public void addStoneDetails() {

		if(addStone.isEnabled()) {

			addStone.click();
			logs.info("clicked on add stone button");
		}
	}

	public void stoneSegment(String sSegment) {

		Select segment = new Select(stoneSegment);
		segment.selectByValue(sSegment);
		if(segment.equals(sSegment)) {

			logs.info("stone segment is selected");
		}
	}

	public void stoneMainCat(String mainCat) {

		Select mainCategory = new Select(stoneMainCategory);
		mainCategory.selectByValue(mainCat);
		if(mainCategory.equals(mainCat)) {
			logs.info("stone main category selected");
		}

	}

	public void stoneSubCat(String subCat) {

		Select subCategory = new Select(stoneSubCategory);
		subCategory.selectByValue(subCat);
		if(subCategory.equals(subCat)) {

			logs.info("stone sub category selected");
		}
	}

	public void stoneRate(String sRate) {

		Select rate=new Select(stoneRate);
		rate.selectByVisibleText(sRate);
		if(rate.equals(sRate)) {

			logs.info("stone rate entered");	
		}
	}

	public void stoneCustPieces(String custPcs) {

		if(stoneCustPcs.isEnabled()) {

			stoneCustPcs.sendKeys(custPcs);
			logs.info("customer pieces entered");
		}
	}
	public void stoneCustWeights(String custWts) {

		if(stoneCustWt.isEnabled()) {

			/*Actions builder = new Actions(driver);
			Action act = builder.moveToElement(stoneCustWt).click().keyDown(stoneCustWt,Keys.SHIFT).sendKeys(stoneCustWt,custWts)
					//.keyUp(stoneCustWt, Keys.SHIFT)
					//.doubleClick(stoneCustWt).contextClick().release().build();*/
			stoneCustWt.sendKeys(custWts);
			//act.perform();
			logs.info("customer wts entered");
		}
	}

	public void stoneCustPrice() {

		Actions costPrice = new Actions(driver);
		costPrice.moveToElement(stoneCostPrice).click().build().perform();
		logs.info("stone cost price is calculated");

	}

	public void stoneCondition(String sCondition) {

		Select sCond = new Select(condition);
		sCond.selectByVisibleText(sCondition);

		if(sCond.equals(sCondition)) {

			logs.info("stone condition selected");
		}
	}

	public void addButton() {

		if(addButton.isEnabled()) {

			addButton.click();
			logs.info("stone details has been added");
		}
	}

	public void cancelButton() {

		if(cancelButton.isEnabled()) {

			cancelButton.click();
			logs.info("stone details has been cancelled");
		}
	}

	public void accDetails() {

		if(accDetails.isEnabled()) {

			//Actions act = new Actions(driver);
			//act.moveToElement(accDetails).click().build().perform();
			accDetails.click();
			logs.info("clicked on accessory details");

		}

	}

	public void accessoryRequired(Boolean accReq) {

		if(accRequired.isEnabled()) {

			accRequired.click();
			logs.info("accessory required is selected");
		}
	}

	public void addAccessoryDetails() {

		if(addAccessory.isEnabled()) {

			addAccessory.click();
			logs.info("clicked on add accessory button");
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	public void accMainCategory(String accMainCat) {

		Select acMainCat = new Select(accMainCategory);
		acMainCat.selectByValue(accMainCat);
		if(acMainCat.equals(accMainCat)) {

			logs.info("Accessory main category selected");
		}

	}

	@SuppressWarnings("unlikely-arg-type")
	public void accSubCategory(String accSubCat) {

		Select acSubCat = new Select(accSubCategory);
		acSubCat.selectByValue(accSubCat);
		if(acSubCat.equals(accSubCat)) {

			logs.info("Accessory sub category selected");
		}

	}
	@SuppressWarnings("unlikely-arg-type")
	public void accessoryRate(String acRate) {

		Select accessoryRate = new Select(accRate);
		accessoryRate.selectByVisibleText(acRate);
		if(accessoryRate.equals(acRate)) {

			logs.info("Accessory rate is selected");
		}

	}

	public void accCustPieces(String accCustPcs) {

		if(accCustPieces.isEnabled()) {

			accCustPieces.sendKeys(accCustPcs);
			logs.info("accessory customer pieces entered");
		}
	}
	public void accCustWeights(String accCustWt) {

		if(accCustWts.isEnabled()) {

			accCustWts.sendKeys(accCustWt);
			logs.info("accessory customer weights entered");
		}
	}
	public void accCustPrice() {

		Actions act = new Actions(driver);
		act.moveToElement(accCustPrice).click().build().perform();
		logs.info("accessory customer weights entered");

	}

	public void accConditions(String accCond) {

		Select acCond= new Select(accCondition);
		acCond.selectByVisibleText(accCond);
		if(acCond.equals(accCond)) {

			logs.info("accessory condition is selected");
		}
	}

	public void accAddButton() {

		if(accAddBtn.isEnabled()) {

			accAddBtn.click();
			logs.info("clicked on acc add button");
		}
	}

	public void accCancelButton() {

		if(accCancelBtn.isEnabled()) {

			accCancelBtn.click();
			logs.info("clicked on acc cancel button");
		}
	}



	public void nextButton() {

		if(nextBtn.isEnabled()) {

			nextBtn.click();
			logs.info("clicked on next button");
		}
	}
	
	public void advancePayment(Boolean advPay) {
		
		System.out.println("No of elements : " + advancePayment.size());
		for(int i=0;i<advancePayment.size();i++) {
			
			System.out.println("Advance payment options are "+ advancePayment.get(i).getAttribute("value"));
			
		}
		
		
	}
}



