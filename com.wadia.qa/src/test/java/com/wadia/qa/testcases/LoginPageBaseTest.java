package com.wadia.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class LoginPageBaseTest {
	 protected static WebDriver driver;
	 
	 @BeforeSuite
	 public void setup() {
	        System.setProperty("webdriver.chrome.driver", "D:\\Automation Project\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        driver = new ChromeDriver(options);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://lending-platform-demo.corpsdlc.com/customer/login");
	    }

//	 @AfterSuite
//	 public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }

}
