package com.insurance.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolicyServiceSeleniumTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080");  // URL of your web application
    }

    @Test
    public void testCreatePolicy() throws IOException {
        WebElement policyHolderName = driver.findElement(By.id("policyHolderName"));
        WebElement policyId = driver.findElement(By.id("policyId"));
        WebElement createPolicyButton = driver.findElement(By.id("createPolicyButton"));

        policyHolderName.sendKeys("udit");
        policyId.sendKeys("POL123456");
        createPolicyButton.click();

        WebElement successMessage = driver.findElement(By.id("successMessage"));
        assertEquals("Policy created successfully", successMessage.getText());

        // Take screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("screenshot.png"));
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
