package com.wadia.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class wadiaSignupPage {

	@FindBy(xpath = "//input[@placeholder='Enter your first name']")
	private WebElement wadiaFirstName;
	@FindBy(xpath = "//input[@placeholder='Enter your middle name']")
	private WebElement wadiaMiddleName;
	@FindBy(xpath = "//input[@placeholder='Enter your last name']")
	private WebElement wadiaLastName;
	@FindBy(xpath = "//input[@placeholder='Enter your email']")
	private WebElement wadiaEmail;
	@FindBy(xpath = "//input[@placeholder='Enter your phone number']")
	private WebElement wadiaPhoneNo;
	@FindBy(xpath = "//input[@placeholder='dd/mm/yyyy']")
	private WebElement wadiaDOB;
	
	@FindBy(xpath = "//select[@class='react-datepicker__year-select']") 
	private WebElement wadiaDOY;
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']") 
	private WebElement wadiaDOM;
	@FindBy(xpath = "//div[@aria-label='Choose Sunday, June 17th, 1990']")
	private WebElement wadiaDOBSelect;
	@FindBy(xpath = "//input[@id='male']")
	private WebElement wadiaGenderMale;
	@FindBy(xpath = "//input[@id='female']")
	private WebElement wadiaGenderFemale;
	@FindBy(xpath = "//input[@id='myInput']")
	private WebElement wadiaCreatePassword;
	@FindBy(xpath = "//input[@id='myInput2']")
	private WebElement wadiaConfirmPassword;
	@FindBy(xpath ="//input[@type='checkbox']") private WebElement WadiaCheckBox;
	@FindBy(xpath = "//span[@class='flex items-center justify-center']")
	private WebElement wadiaaSignUp;


	public wadiaSignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void testWadiaFirstInputField() {
		Assert.assertTrue(wadiaFirstName.isDisplayed(), "Wadia First Name Is visible");
		wadiaFirstName.sendKeys("Allison");
	}

	public void testWadiaMiddleInputField() {
		Assert.assertTrue(wadiaMiddleName.isDisplayed(), "Wadia Middle Name Is visible");
	}

	public void testWadiaLastInputField() {
		Assert.assertTrue(wadiaLastName.isDisplayed(), "Wadia Last Name Is visible");
		wadiaLastName.sendKeys("Gilbert");
	}

	public void testWadiaEmailInputField() {
		Assert.assertTrue(wadiaEmail.isDisplayed(), "Wadia Email Is visible");
		wadiaEmail.sendKeys("hejes20711@adstam.com");
	}

	public void testWadiaPhoneInputField() {
		Assert.assertTrue(wadiaPhoneNo.isDisplayed(), "Wadia Phone number Is visible");
		wadiaPhoneNo.sendKeys("00255200");
	}

	public void testWadiaDOBInputField() {
		Assert.assertTrue(wadiaDOB.isDisplayed(), "Wadia DOB Is visible");
		wadiaDOB.click();
		
		Select s = new Select(wadiaDOY);
		s.selectByVisibleText("1990");
		
		Select s1 = new Select(wadiaDOM);
		s1.selectByVisibleText("June");
		
		Assert.assertTrue(wadiaDOBSelect.isDisplayed(), "June 17th, 1990 is visible");
		wadiaDOBSelect.click();
	}

	public void testWadiaGenderInputField() {
		Assert.assertTrue(wadiaGenderMale.isDisplayed(), "Wadia Male Gender Is visible");
		Assert.assertTrue(wadiaGenderFemale.isDisplayed(), "Wadia Female Gender Is visible");
		wadiaGenderMale.click();
	}

	public void testWadiaPasswordInputField() {
		Assert.assertTrue(wadiaCreatePassword.isDisplayed(), "Wadia Create Password Is visible");
		wadiaCreatePassword.sendKeys("Sample@123");
		Assert.assertTrue(wadiaConfirmPassword.isDisplayed(), "Wadia Confirm Password Is visible");
		wadiaConfirmPassword.sendKeys("Sample@123");
	}

	public void testWadiaSignUpButton() {

		Assert.assertTrue(wadiaaSignUp.isDisplayed(), "Wadia SignUp Button Is visible");
		WadiaCheckBox.click();
		wadiaaSignUp.click();
		
	}

}
