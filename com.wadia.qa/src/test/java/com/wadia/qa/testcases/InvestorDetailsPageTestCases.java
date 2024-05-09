package com.wadia.qa.testcases;

import org.testng.annotations.Test;

import com.wadia.qa.page.InvestorDetails;

public class InvestorDetailsPageTestCases extends LoginPageBaseTest{
	
	@Test
	public void testInvestmentDetails() {
		InvestorDetails investordetails = new InvestorDetails(driver);
		investordetails.testInvestDetails();
	}

	
	

}
