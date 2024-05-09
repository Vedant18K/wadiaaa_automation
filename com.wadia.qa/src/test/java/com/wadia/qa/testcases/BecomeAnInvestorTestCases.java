package com.wadia.qa.testcases;


import org.testng.annotations.Test;

import com.wadia.qa.page.AddFunds;
//import com.wadia.qa.page.BecomeAnInvestor;

public class BecomeAnInvestorTestCases extends LoginPageBaseTest {

	
//	@Test(priority=4)
//	public void TestBecomeAnInvestor() {
//		BecomeAnInvestor investor = new BecomeAnInvestor(driver);
//		investor.verifyBecomeAnInvestor();
//	}
//	
	@Test(priority=5)
	public void TestAddFund() {
		AddFunds funds = new AddFunds(driver) ;
		funds.testAddFund();
		funds.testBankTransferForm();
	}

}
