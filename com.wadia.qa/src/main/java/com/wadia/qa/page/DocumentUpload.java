package com.wadia.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DocumentUpload {
	
	@FindBy(xpath = "//a[@href='#documentDetails']")private WebElement documentTab;
	@FindBy(xpath = "//a[@href='#standardDocument']")private WebElement standardDocument;
	@FindBy(xpath = "(//*[@class='flex flex-col items-center px-4 py-6 bg-white text-blue rounded-lg tracking-wide cursor-pointer'])[1]") private WebElement documentUpload;
	@FindBy(xpath = "//select[@id='documentName']")private WebElement selctDocument;
	@FindBy(xpath = "//span[@class='text-gray']")private WebElement uploadDocument;

	public DocumentUpload(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void testDocumentUpload() {
		documentTab.click();
		standardDocument.click();
		documentUpload.click();
	
		Select s = new Select(selctDocument);
		s.selectByVisibleText("Commercial Bank statement(s) for the last 6 months");
		
	}
	
	public void verifyDocumentUpload(String filePath) {
		uploadDocument.click();
		uploadDocument.sendKeys(filePath);

	}
	
}
