package com.wadia.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvestorDetails {

	@FindBy(xpath = "//*[contains(@class,'px-3 pt-2 flex flex-row items-center w-[450px]')][2]")
	private WebElement riskMedium;

	public InvestorDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void testInvestDetails() {

		riskMedium.click();
	}

}
