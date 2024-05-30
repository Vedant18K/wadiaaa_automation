package com.wadia.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginAttempts {
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement wadiaEmail;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement wadiaPassword;
	@FindBy(xpath = "//span[@class='flex items-center justify-center']")
	private WebElement wadiaLogin;
	
	public LoginAttempts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void testWadiaEmailInputField() {
		Assert.assertTrue(wadiaEmail.isDisplayed(), "Wadia Email is Display");
		wadiaEmail.sendKeys("vedede5378@fresec.com");

	}

	public void testWadiaPasswordField() {
		Assert.assertTrue(wadiaPassword.isDisplayed(), "Wadia Password is Display");
		wadiaPassword.sendKeys("Sample@13");
	}

	public void testWadiaLoginButton() {
		Assert.assertTrue(wadiaLogin.isDisplayed(), "Wadia Login Button is Display");
		wadiaLogin.click();
	}
	

    // Method to clear the input fields
    public void clearFields() {
        wadiaEmail.clear();
        wadiaPassword.clear();
    }

	
}
