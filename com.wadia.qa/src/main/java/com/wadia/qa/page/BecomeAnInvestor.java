package com.wadia.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BecomeAnInvestor {
	
	@FindBy(xpath="//button[@class='bg-[#3F5C88] rounded p-3 w-4/5']")private WebElement becomeAnInvestor;
	
	
	public BecomeAnInvestor(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyBecomeAnInvestor() {
		Assert.assertTrue(becomeAnInvestor.isDisplayed(), "Not Display");
		becomeAnInvestor.click();
	}

}
