package com.wadia.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wadia.qa.page.LoginAttempts;

public class LoginAttemptsTestCases {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Initialize WebDriver (Chrome)
        System.setProperty("webdriver.chrome.driver", "D:\\Automation Project\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://funding.wadiaa.com/customer/login");
    }

    @AfterMethod
    public void tearDown() {
        // Close the WebDriver instance
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void verifyLoginAttempts() throws InterruptedException {
        // Instantiate the LoginAttempts page object
        LoginAttempts login = new LoginAttempts(driver);

        // Fill in the email and password fields once
        login.testWadiaEmailInputField();
        login.testWadiaPasswordField();
        
        // Loop to click the login button 5 times
        for (int i = 0; i < 201; i++) {
            login.testWadiaLoginButton();
            System.out.println(i);
            Thread.sleep(1000); // Add delay if needed
        }
    }
}
