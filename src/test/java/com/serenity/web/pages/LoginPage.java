package com.serenity.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    /**
     *  Web elements to Login page
     */

    //Email field
    @FindBy(id="email")
    private WebElement emailField;

    //Password field
    @FindBy(id="password")
    private WebElement passwordField;

    //LOGIN button
    @FindBy(xpath="//button[@type='submit']")
    private WebElement loginButton;

    //Response Login
    @FindBy(xpath="//p[@class='z-50 fixed top-0 left-0']")
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
