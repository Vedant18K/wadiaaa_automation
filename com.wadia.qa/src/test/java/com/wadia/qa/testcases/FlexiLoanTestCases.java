package com.wadia.qa.testcases;

import org.testng.annotations.Test;

import com.wadia.qa.page.FlexiLoanStepper;

public class FlexiLoanTestCases extends LoginPageBaseTest {
	
	@Test
	public void TestFlexiLoan() throws InterruptedException {
		FlexiLoanStepper flexiloan = new FlexiLoanStepper(driver);

		flexiloan.testWadiaLoanAmountTab();
		flexiloan.testWadiaBusinessTab();
		flexiloan.testWadiaPersonalTab();
		flexiloan.testKYCButton();
		
	}
	

}
