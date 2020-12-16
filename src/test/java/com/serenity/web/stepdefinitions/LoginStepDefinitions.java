package com.serenity.web.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import com.serenity.web.steps.LoginSteps;

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    /**
     * Given - I enter the "<email>" email and "<password>" password
     *
     * @param email user name value
     * @param password password value
     */
    @Given("I enter the {string} email and {string} password")
    public void iEnterTheEmailAndPassword(String email, String password) {
        loginSteps.enterEmailsAndPassword(email, password);
    }

    @When("I press LOGIN button")
    public void iPressLOGINButton() {
        loginSteps.clickLoginButton();
    }

    @Then("I verify the response exists on the page")
    public void iVerifyTheResponseExistsOnThePage() {
    loginSteps.isDisplayedResponseLogin();
    }
}
