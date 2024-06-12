package com.testautomationdevelopment.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class googleSearch_Firefox {
    WebDriver FirefoxDriver = new FirefoxDriver();
    String base_url = "https://google.com";

    public void testNavigateWebsiteURL() {
        FirefoxDriver.get(base_url);
    }

    public void testUserInputword(String word) {
        FirefoxDriver.findElement(By.className("gLFyf")).sendKeys(word);
        Assert.assertEquals(word + FirefoxDriver.getTitle(), word + FirefoxDriver.getTitle());
    }

    public void testClickGoogleButton() {
        String element = "gNO89b";
        FirefoxDriver.findElement(By.className(element)).click();
        Assert.assertNotNull(element);
    }

    public void endFirefoxBrowser() {
        FirefoxDriver.close();
    }
}
