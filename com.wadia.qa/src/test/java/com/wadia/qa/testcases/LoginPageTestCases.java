package com.wadia.qa.testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import com.wadia.qa.page.wadiaLoginPage;

public class LoginPageTestCases extends LoginPageBaseTest {

	@Test (priority = 1)
	public void TestInvesterLoginPage() {
		wadiaLoginPage investerLogin = new wadiaLoginPage(driver);
		String ExpectedUrl1 = "https://lending-platform-demo.corpsdlc.com/customer/login";
		WebDriverWait wait1 = new WebDriverWait(driver, 50); // Adjust timeout as needed
		wait1.until(ExpectedConditions.urlToBe(ExpectedUrl1));
		investerLogin.testWadiaEmailInputField();
		investerLogin.testWadiaPasswordField();
		investerLogin.testWadiaLoginButton();
		
	}

}
