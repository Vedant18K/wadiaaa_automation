package com.wadia.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FlexiLoanStepper {
	

		@FindBy(xpath ="//a[@href='/loan-application/flexi-loan/loan-process']") private WebElement WadiaFlexiLoanButton;
		@FindBy(xpath = "//input[@placeholder='Enter Amount']")private WebElement wadiaLoanAmount;
		@FindBy(xpath = "//input[@placeholder='Enter Tenure']")private WebElement wadiaLoanTenure;
		@FindBy(xpath = "//span[@class='flex items-center justify-center']")private WebElement NextButton;
		@FindBy(xpath = "//select[@id='Business']") private WebElement ConstitutionofOrganization;
		@FindBy(xpath = "//select[@id='']") private WebElement PurposeofLoan;
		@FindBy(xpath = "//span[@class='flex items-center justify-center']") private WebElement businessNextButton;
		
		@FindBy(xpath = "//input[@placeholder='Enter Business Name']")private WebElement businessName;
		@FindBy(xpath = "//input[@placeholder='Enter Owner Name']")private WebElement ownerName;
		@FindBy(xpath = "//input[@placeholder='Enter Business Email']")private WebElement businessEmail;
		@FindBy(xpath = "//input[@placeholder='Enter Business Phone']")private WebElement businessPhone;
		@FindBy(xpath = "//input[@placeholder='Enter Business Website']")private WebElement businessWebsite;
		@FindBy(xpath = "//input[@placeholder='dd/mm/yyyy']")private WebElement businessDate;
		@FindBy(xpath = "//select[@class='react-datepicker__year-select']") private WebElement wadiaBusinessYear;
		@FindBy(xpath = "//select[@class='react-datepicker__month-select']") private WebElement wadiaBusinessMonth;
		@FindBy(xpath = "//div[@aria-label='Choose Sunday, June 17th, 1990']")private WebElement wadiaBusinessDate;
		@FindBy(xpath = "//input[@placeholder='Enter Business CR Number']")private WebElement businessCRNumber;
//		@FindBy(xpath = "//select[@id='typeOfBusiness']")private WebElement businessConstitutionOrganization;
		@FindBy(xpath = "//span[@class='flex items-center justify-center']")private WebElement businessDetailsButton;
		@FindBy(xpath = "//input[@placeholder='Enter Business address']")private WebElement businessAddress;
		@FindBy(xpath = "//select[@id='country']")private WebElement businessCountry;
		@FindBy(xpath = "//select[@id='state']")private WebElement businessState;
		@FindBy(xpath = "//select[@id='city']")private WebElement businessCity;
		@FindBy(xpath = "//input[@placeholder='Postal Code/ P.O. Box No.']")private WebElement businesszipCode;
		@FindBy(xpath = "//span[@class='flex items-center justify-center']") private WebElement businessAddressNextButton;		
		
		@FindBy(xpath = "//button[@class='w-full px-4 py-2 tracking-wide text-sm font-medium text-white transition-colors duration-200 transform bg-[#3F5C88] rounded  focus:outline-none disabled:opacity-60']")private WebElement personalNextButton;
		@FindBy(xpath = "//input[@name='permanentAddressLine1']")private WebElement personalAddressDetailsLine1;
		@FindBy(xpath = "//input[@name='permanentAddressLine2']")private WebElement personalAddressDetailsLine2;
		@FindBy(xpath = "//select[@id='country']")private WebElement selectCountry;
		@FindBy(xpath = "//select[@id='state']")private WebElement selectState;
		@FindBy(xpath = "//select[@id='city']")private WebElement selectCity;
		@FindBy(xpath = "//input[@name='permanentZip']")private WebElement zipCode;
		@FindBy(xpath = "//span[@class='flex items-center justify-center']")private WebElement PermanentAddressButton;
		@FindBy(xpath = "//input[@type='checkbox']")private WebElement checkBoxCurrentAddress;
		@FindBy(xpath = "//span[@class='flex items-center justify-center']")private WebElement CurrentAddressButton;
		
		
		@FindBy(xpath = "//button[@class='w-ful px-4 items-center py-2 tracking-wide text-sm font-medium text-white transition-colors duration-200 transform bg-[#3F5C88] rounded  focus:outline-none disabled:opacity-60']")private WebElement KYCNextButton;
		@FindBy(xpath = "//*[text()='Go to Loan Details']") private WebElement goToLoanDetailsButton;
		
		public FlexiLoanStepper(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		
		public void testWadiaLoanAmountTab() {
			Assert.assertTrue(WadiaFlexiLoanButton.isDisplayed(),"Wadia Flexi LoanButton is not display");
			WadiaFlexiLoanButton.click();
			
			Assert.assertTrue(wadiaLoanAmount.isDisplayed(), "wadia Loan Amount is not display");
			wadiaLoanAmount.sendKeys("15026");
			
			Assert.assertTrue(wadiaLoanTenure.isDisplayed(), "wadia Loan Tenure is not display");
			wadiaLoanTenure.sendKeys("16");
			
			Assert.assertTrue(NextButton.isDisplayed(), "Next Button is not display");
			NextButton.click();
			
			Assert.assertTrue(ConstitutionofOrganization.isDisplayed(), "Constitution of Organization is not display");
			Select s = new Select(ConstitutionofOrganization);
			s.selectByVisibleText("Sole Proprietorship (SPC)");
			
			Assert.assertTrue(PurposeofLoan.isDisplayed(), "Purpose of Loan is not display");
			Select s1 = new Select(PurposeofLoan);
			s1.selectByVisibleText("Trade finance");
			
			Assert.assertTrue(businessNextButton.isDisplayed(), "business Next Button is not display");
			businessNextButton.click();
			
		}
			
		public void testWadiaBusinessTab() {
			Assert.assertTrue(businessName.isDisplayed(),"business Name is not display");
			businessName.sendKeys("macaroni");
			
			Assert.assertTrue(ownerName.isDisplayed(),"owner Name is not display");
			ownerName.sendKeys("Gonzales");
			
			Assert.assertTrue(businessEmail.isDisplayed(),"business Email is not display");
			businessEmail.sendKeys("coxeki2253@felibg.com");
			
			Assert.assertTrue(businessPhone.isDisplayed(),"business Phone is not display");
			businessPhone.sendKeys("90012000");
			
			Assert.assertTrue(businessWebsite.isDisplayed(),"business Website is not display");
			
			Assert.assertTrue(businessDate.isDisplayed(),"business Date is not display");
			businessDate.click();
			
			
			
			Select s = new Select(wadiaBusinessYear);
			s.selectByVisibleText("1990");
			
			Select s1 = new Select(wadiaBusinessMonth);
			s1.selectByVisibleText("June");
			
			Assert.assertTrue(wadiaBusinessDate.isDisplayed(), "June 17th, 1990 is visible");
			wadiaBusinessDate.click();
			
			Assert.assertTrue(businessCRNumber.isDisplayed(),"business CR Number is not display");
			businessCRNumber.sendKeys("0119123");

			
			Assert.assertTrue(businessDetailsButton.isDisplayed(),"business Details Button is not display");
			businessDetailsButton.click();
			
			Assert.assertTrue(businessAddress.isDisplayed(),"business Address is not display");
			businessAddress.sendKeys("Shatti Al Qurum");
			
			Assert.assertTrue(businessCountry.isDisplayed(),"business Country is not display");
			Select s2 = new Select(businessCountry);
			s2.selectByVisibleText("Oman");
			
			Assert.assertTrue(businessState.isDisplayed(),"business State is not display");
			Select s3 = new Select(businessState);
			s3.selectByVisibleText("Muscat Governorate");
			
			Assert.assertTrue(businessCity.isDisplayed(),"business City is not display");
			Select s4 = new Select(businessCity);
			s4.selectByVisibleText("Muscat");
			
			Assert.assertTrue(businesszipCode.isDisplayed(),"business zip Code is not display");
			businesszipCode.sendKeys("547");
			
			Assert.assertTrue(businessAddressNextButton.isDisplayed(),"business Address Next Button is not display");
			businessAddressNextButton.click();
			
						
		}
			
		public void testWadiaPersonalTab() {
			
			Assert.assertTrue(personalNextButton.isDisplayed(),"personal Next Button is not display");
			personalNextButton.click();
			
			Assert.assertTrue(personalAddressDetailsLine1.isDisplayed(), "personal Address Details Line1 is not display");
			personalAddressDetailsLine1.sendKeys("1548 Camden Ave");
			
			Assert.assertTrue(personalAddressDetailsLine2.isDisplayed(), "personal Address Details Line2 is not display");
			personalAddressDetailsLine2.sendKeys("5144 Smokey Ln");
			
			Assert.assertTrue(selectCountry.isDisplayed(), "select Country is not display");
			Select s5 = new Select(selectCountry);
			s5.selectByVisibleText("Oman");
			
			Assert.assertTrue(selectCountry.isDisplayed(), "select Country is not display");
			Select s6 = new Select(selectState);
			s6.selectByVisibleText("Muscat Governorate");
			
			Assert.assertTrue(selectCountry.isDisplayed(), "select Country is not display");
			Select s7 = new Select(selectCity);
			s7.selectByVisibleText("Muscat");
			
			Assert.assertTrue(zipCode.isDisplayed(), "zip Code is not display");
			zipCode.sendKeys("548");
			
			Assert.assertTrue(PermanentAddressButton.isDisplayed(), "Permanent Address Button is not display");
			PermanentAddressButton.click();
			
			Assert.assertTrue(checkBoxCurrentAddress.isDisplayed(), "checkBox Current Address is not display");
			checkBoxCurrentAddress.click();
			
			Assert.assertTrue(CurrentAddressButton.isDisplayed(), "Current Address Button is not display");
			CurrentAddressButton.click();
		}
		
		public void testKYCButton() {
			KYCNextButton.click();
			goToLoanDetailsButton.click();
		}

		
	}


