package com.serenity.web.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import utils.AutomationException;

public class BasePage extends PageObject {

    /**
     * Verify the element is displayed
     *
     * @param element web element
     * @return Element displayed
     */
    public boolean isDisplayed(WebElement element) {
        waitFor(element);
        return element.isDisplayed();
    }

    /**
     * Type in the element
     *
     * @param element web element
     * @param text text for the type
     */
    public void type(WebElement element, String text){
        if (isDisplayed(element)) {
            element.sendKeys(text);
        }
    }

    /**
     * Click in the element
     *
     * @param element mobile element
     */
    public void click(WebElement element) {
        if (isDisplayed(element)) {
            element.click();
        } else {
            throw new AutomationException("Element isn't displayed");
        }
    }

    /**
     * Verify the element is present in the screen
     *
     * @param element web element
     * @return true, when element is present in the screen
     */
    public boolean isElementPresent(WebElement element) {
        return element != null;
    }

}
