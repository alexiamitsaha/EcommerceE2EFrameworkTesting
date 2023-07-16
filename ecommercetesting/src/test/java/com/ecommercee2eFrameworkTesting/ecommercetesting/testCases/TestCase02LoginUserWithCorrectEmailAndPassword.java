package com.ecommercee2eFrameworkTesting.ecommercetesting.testCases;

import com.ecommercee2eFrameworkTesting.ecommercetesting.baseClasses.BaseClass;
import com.ecommercee2eFrameworkTesting.ecommercetesting.pages.Testcase02LoginUserWithCorrectEmailAndpasswordPage;
import com.ecommercee2eFrameworkTesting.ecommercetesting.utilities.Data;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase02LoginUserWithCorrectEmailAndPassword extends BaseClass {
    @Test
    public void testCase02LoginUserWithCorrectEmailAndPassword() {
        Testcase02LoginUserWithCorrectEmailAndpasswordPage tc2luwceapp = new Testcase02LoginUserWithCorrectEmailAndpasswordPage(driver);

        // Click on 'Signup / Login' button
        tc2luwceapp.getSignInButton().click();
        System.out.println("Sign in Button Clicked");

        // Verify 'Login to your account' is visible

        String loginURL = driver.getCurrentUrl();
        System.out.println("Given" +loginURL);
        Assert.assertEquals(loginURL , Data.BASE_URL + Data.LOGIN_PAGE_URL);
        System.out.println("login URL is validate");

        if (tc2luwceapp.getLoginToYourAccountText().isDisplayed())
        {
            String loginToYourText = tc2luwceapp.getLoginToYourAccountText().getText();
            System.out.println(loginToYourText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGIN_TO_YOUR_ACCoUNT_TEXT,loginToYourText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        // Enter correct email address and password

        tc2luwceapp.getEmailAddressInputField().sendKeys(Data.DEMO_EMAIL);
        tc2luwceapp.getPasswordInputField().sendKeys(Data.DEMO_PASSWORD);

        // Click 'login' button
        tc2luwceapp.getLoginButton().click();

        // Verify that 'Logged in as username' is visible

        if (tc2luwceapp.getLoggedInAsUsernameText().isDisplayed())
        {
            String loggedInAsUserText= tc2luwceapp.getLoggedInAsUsernameText().getText();
            System.out.println(loggedInAsUserText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGGED_IN_AS_USER_TEXT,loggedInAsUserText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        // Click 'Delete Account' button
        tc2luwceapp.getDeleteAccountButton().click();

        // Verify that 'ACCOUNT DELETED!' is visible

        tc2luwceapp.getDeleteButton().click();
        sleepTest(2000);
        sleepTest(2000);
    }
}
