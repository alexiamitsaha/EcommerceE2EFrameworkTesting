package com.ecommercee2eFrameworkTesting.ecommercetesting.pages;

import com.ecommercee2eFrameworkTesting.ecommercetesting.baseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase10VerifySubscriptionInHomepagePages extends BasePage {
    public TestCase10VerifySubscriptionInHomepagePages(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".single-widget h2")
    public WebElement subscriptionText;
    public WebElement getSubscriptionText(){
        return subscriptionText;
    }

    @FindBy(css="input#susbscribe_email")
    public WebElement emailInputField;
    public WebElement getEmailInputField(){
        return emailInputField;
    }

    @FindBy(css="button#subscribe")
    public WebElement arrowButton;
    public WebElement getArrowButton(){
        return arrowButton;
    }
}
