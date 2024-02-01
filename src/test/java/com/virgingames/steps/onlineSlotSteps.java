package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.OnlineSlotPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class onlineSlotSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I Click On {string} Tab")
    public void iClickOnOnlineSlotsTab(String menu) {
        new HomePage().selectTopMenu(menu);
    }

    @Then("I Verify Text {string}")
    public void iVerifyTextYourFavouriteOnlineSlotsAllInOnePlace(String text) {
        Assert.assertEquals(new OnlineSlotPage().getTextOfYourFavouriteOnlineSlotsAllInOnePlace(),text);
    }
}
