package com.testautomationdevelopment.pageObjects;


import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class googleSearch_Chrome {

    WebDriver chromeDriver = new ChromeDriver();
    String base_url = "https://google.com";

    public void testNavigateWebsiteURL() {
        chromeDriver.get(base_url);
    }

    public void testUserInputword(String word) {
        chromeDriver.findElement(By.className("gLFyf")).sendKeys(word);
        Assert.assertEquals(word + chromeDriver.getTitle(), word + chromeDriver.getTitle());
    }

    public void testClickGoogleButton() {
        String element = "gNO89b";
        chromeDriver.findElement(By.className(element)).click();
        Assert.assertNotNull(element);
    }

    public void endChromeBrowser() {
        chromeDriver.close();
    }
}
