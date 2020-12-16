package com.serenity.web.steps;

import com.serenity.web.pages.BasePage;
import com.serenity.web.pages.LoginPage;
import io.cucumber.java.Before;
import net.serenitybdd.core.annotations.events.BeforeScenario;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginSteps extends PageObject {

    /**
     * Class variable
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginSteps.class);
    //Object for the login page class
    private LoginPage loginPage;

    @Before
    public void openWebsite() {
        open();
    }

    /**
     * Step - Enter the email and password
     * @param email the user name
     * @param password the password user
     */
    @Step
    public void enterEmailsAndPassword(String email, String password){
        LOGGER.info("Type email");
        loginPage.typeEmailField(email);
        LOGGER.info("Type password");
        loginPage.typePasswordField(password);
    }

    /**
     * Step - Click on login button
     */
    @Step
    public void clickLoginButton(){
        LOGGER.info("Click on Login button");
        loginPage.clickLoginButton();
    }

    /**
     * Step - Verify response login is displayed
     */
    @Step
    public void isDisplayedResponseLogin(){
        LOGGER.info("Verify response login is displayed");
        Assert.assertTrue("The response login isn't displayed",
                loginPage.isDisplayedResponseLogin());
    }
}
