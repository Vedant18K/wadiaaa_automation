package com.wadia.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class AddFunds {
	@FindBy(xpath = "//button[@class='bg-[#3F5C88] px-[60px] md:px-[50px] lg:px-[72px] py-[14px] text-white rounded-lg cursor-pointer']")
	private WebElement addButton;
	@FindBy(xpath = "//input[@id='bankTransfer']")
	private WebElement bankTransfer;
	@FindBy(xpath = "//input[@id='paymentGateway']")
	private WebElement paymentGateway;
	@FindBy(xpath = "//input[@name='transactionId']")
	private WebElement transactionId;
	@FindBy(xpath = "//input[@placeholder='dd/mm/yyyy']")
	private WebElement businessDate;
	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	private WebElement wadiaBusinessYear;
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	private WebElement wadiaBusinessMonth;
	@FindBy(xpath = "//div[@aria-label='Choose Tuesday, April 23rd, 2024']")
	private WebElement wadiaBusinessDate;
	@FindBy(xpath = "//select[@name='transferFromAccount']")
	private WebElement transferFromAccount;
	@FindBy(xpath = "//select[@name='transferToAccount']")
	private WebElement transferToAccount;
	@FindBy(xpath = "//input[@name='amount']")
	private WebElement amount;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButon;

	public AddFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void testAddFund() {
		addButton.click();
		bankTransfer.isDisplayed();
		paymentGateway.isDisplayed();
		bankTransfer.click();
	}

	public void testBankTransferForm() {
		transactionId.sendKeys("fjif-e3223");
		businessDate.click();
		Select s = new Select(wadiaBusinessYear);
		s.selectByVisibleText("2024");
		Select s1 = new Select(wadiaBusinessMonth);
		s1.selectByVisibleText("April");
		Assert.assertTrue(wadiaBusinessDate.isDisplayed(), " April 23rd, 2024");
		wadiaBusinessDate.click();
		Select s3 = new Select(transferFromAccount);
		s3.selectByVisibleText("Qasim bin Ahmed bin Zahir Al Ismaili - 452423423424243");
		Select s4 = new Select(transferToAccount);
		s4.selectByVisibleText("Asim - 546576556434");
		amount.sendKeys("12000");
		submitButon.click();
	}
}
