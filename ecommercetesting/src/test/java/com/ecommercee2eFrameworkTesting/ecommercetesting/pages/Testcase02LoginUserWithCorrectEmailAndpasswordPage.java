package com.ecommercee2eFrameworkTesting.ecommercetesting.pages;

import com.ecommercee2eFrameworkTesting.ecommercetesting.baseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Testcase02LoginUserWithCorrectEmailAndpasswordPage extends BasePage {
    public Testcase02LoginUserWithCorrectEmailAndpasswordPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="[href='\\/login']")
    public WebElement signInButton;
    public WebElement getSignInButton(){
        return signInButton;
    }

    @FindBy(css=".login-form > h2")
    public WebElement loginToYourAccountText;
    public WebElement getLoginToYourAccountText(){
        return loginToYourAccountText;
    }

    @FindBy(css=".login-form > form[method='post'] > input[name='email']")
    public WebElement emailAddressInputField;
    public WebElement getEmailAddressInputField(){
        return emailAddressInputField;
    }

    @FindBy(css="form[method='post'] > input[name='password']")
    public WebElement passwordInputField;
    public WebElement getPasswordInputField(){
        return passwordInputField;
    }

    @FindBy(css=".login-form > form[method='post'] > .btn.btn-default")
    public WebElement loginButton;
    public WebElement getLoginButton(){
        return loginButton;
    }

    @FindBy(css = "li:nth-of-type(9) > a")
    public WebElement loggedInAsUsernameText;
    public WebElement getLoggedInAsUsernameText() {
        return loggedInAsUsernameText;
    }

    @FindBy(css = ".nav.navbar-nav > li:nth-of-type(5) > a")
    public WebElement deleteAccountButton;
    public WebElement getDeleteAccountButton() {
        return deleteAccountButton;
    }

    @FindBy(css = ".button-form > .btn.btn-danger")
    public WebElement deleteButton;
    public WebElement getDeleteButton() {
        return deleteButton;
    }

}
