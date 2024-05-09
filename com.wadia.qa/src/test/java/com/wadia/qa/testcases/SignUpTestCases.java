package com.wadia.qa.testcases;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import com.wadia.qa.page.wadiaSignupPage;

public class SignUpTestCases extends LoginPageBaseTest {
	

	
	@Test
	public void TestInvestorSignUpPage() {
		wadiaSignupPage investerSignUp = new wadiaSignupPage(driver);
	    String ExpectedUrl ="https://lending-platform-demo.corpsdlc.com/signup";
		WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust timeout as needed
	    wait.until(ExpectedConditions.urlToBe(ExpectedUrl));
	    
		investerSignUp.testWadiaFirstInputField();
		investerSignUp.testWadiaMiddleInputField();
		investerSignUp.testWadiaLastInputField();
		investerSignUp.testWadiaEmailInputField();
		investerSignUp.testWadiaPhoneInputField();
		investerSignUp.testWadiaDOBInputField();
		investerSignUp.testWadiaGenderInputField();
		investerSignUp.testWadiaPasswordInputField();
		investerSignUp.testWadiaSignUpButton();
	}
	
	

}
