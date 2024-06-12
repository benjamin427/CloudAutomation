package com.testautomationdevelopment.RandomApp;

import io.cucumber.java.en.*;
import com.testautomationdevelopment.pageObjects.googleSearch_Edge;

public class StepDefinitions_Edge {
    
    googleSearch_Edge e_driver = new googleSearch_Edge();

    @Given("Navigate to the website url using Edge browser")
    public void gotoURL() {
        e_driver.testNavigateWebsiteURL();
    }

    @Then("Enter a random word in the text field")
    public void EnterRandomWord() {
        e_driver.testUserInputword("AI");
    }

    @And("Click the google search button")
    public void clickGoogleSearchButton() {
        e_driver.testClickGoogleButton();
    }

    @Then("Close Edge browser")
    public void closeEdgeBrowser() {
        e_driver.endEdgeBrowser();
    }
}
