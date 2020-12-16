package com.serenity.web.pages;

import com.serenity.web.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    /**
     *  Web elements to Login page
     */

    //Email field
    @FindBy(xpath="/html/body/app-root/app-login/div/div/form/div[1]/input")
    private WebElement emailField;

    //Password field
    @FindBy(xpath="/html/body/app-root/app-login/div/div/form/div[2]/div/input")
    private WebElement passwordField;

    //LOGIN button
    @FindBy(xpath="/html/body/app-root/app-login/div/div/form/button")
    private WebElement loginButton;

    //Response Login
    @FindBy(xpath="/html/body/p")
    private WebElement responseLogin;

    /**
     * Type email in the email field
     *
     * @param email email
     */
    public void typeEmailField(String email) {
        type(emailField, email);
    }

    /**
     * Type password in the password field
     *
     * @param password user password
     */
    public void typePasswordField(String password) {
        type(passwordField, password);
    }

    /**
     * Click LOGIN button
     */
    public void clickLoginButton() { click(loginButton); }

    /**
     * Return response login is displayed
     *
     * @return true when the login button is displayed
     */
    public boolean isDisplayedResponseLogin() {
        return isDisplayed(responseLogin);
    }
}
