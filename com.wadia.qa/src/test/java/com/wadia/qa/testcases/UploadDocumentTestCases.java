package com.wadia.qa.testcases;

import org.testng.annotations.Test;

import com.wadia.qa.page.DocumentUpload;

public class UploadDocumentTestCases extends LoginPageBaseTest {
	
	@Test
	public void verifyDocumentUpload() {
		DocumentUpload dupload = new DocumentUpload(driver);
        String filePath = "C:\\Users\\91967\\Desktop\\Test Document\\BankStatementChequing (1).jpg";
		dupload.testDocumentUpload();
		dupload.verifyDocumentUpload(filePath);	
	}

}
