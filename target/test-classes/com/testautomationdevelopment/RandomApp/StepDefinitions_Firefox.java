package com.testautomationdevelopment.RandomApp;


import io.cucumber.java.en.*;
import com.testautomationdevelopment.pageObjects.googleSearch_Firefox;

public class StepDefinitions_Firefox {
    
    googleSearch_Firefox f_driver = new googleSearch_Firefox();

    @Given("Navigate to the website url using Firefox")
    public void navigateGoogleURL() {
        f_driver.testNavigateWebsiteURL();
    }

    @Then("Type a word in the text field")
    public void RandomWord() {
        f_driver.testUserInputword("Robotic Process Automation");
    }

    @And("Click button")
    public void Button() {
        f_driver.testClickGoogleButton();
    }

    @Then("Close Firefox browser")
    public void closeFirefoxBrowser() {
        f_driver.endFirefoxBrowser();
    }
}
