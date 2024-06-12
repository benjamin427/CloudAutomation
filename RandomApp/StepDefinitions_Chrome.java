package com.testautomationdevelopment.RandomApp;

import io.cucumber.java.en.*;
import com.testautomationdevelopment.pageObjects.googleSearch_Chrome;

public class StepDefinitions_Chrome {

    googleSearch_Chrome c_driver = new googleSearch_Chrome();

    @Given("Website url using Chrome")
    public void navigateURL() {
        c_driver.testNavigateWebsiteURL();
    }

    @Then("Enter a word in the text field")
    public void userEnterRandomWord() {
        c_driver.testUserInputword("DevOps");
    }

    @And("Click the search button")
    public void googleSearchButton() {
        c_driver.testClickGoogleButton();
    }

    @Then("Close browser")
    public void closeChromeBrowser() {
        c_driver.endChromeBrowser();
    }

}
