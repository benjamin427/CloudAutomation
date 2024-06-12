package com.testautomationdevelopment.pageObjects;


import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Assert;

public class googleSearch_Edge {
    WebDriver edgeDriver = new EdgeDriver();
    String base_url = "https://google.com";

    public void testNavigateWebsiteURL() {
        edgeDriver.get(base_url);
    }

    public void testUserInputword(String word) {
        edgeDriver.findElement(By.className("gLFyf")).sendKeys(word);
        Assert.assertEquals(word + edgeDriver.getTitle(), word + edgeDriver.getTitle());
    }

    public void testClickGoogleButton() {
        String element = "gNO89b";
        edgeDriver.findElement(By.className(element)).click();
        Assert.assertNotNull(element);
    }

    public void endEdgeBrowser() {
        edgeDriver.close();
    }
}
