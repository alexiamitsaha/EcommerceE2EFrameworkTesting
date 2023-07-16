package com.ecommercee2eFrameworkTesting.ecommercetesting.testCases;

import com.ecommercee2eFrameworkTesting.ecommercetesting.baseClasses.BaseClass;
import com.ecommercee2eFrameworkTesting.ecommercetesting.pages.TestCase3LoginUserWithIncorrectEmailAndPasswordPage;
import com.ecommercee2eFrameworkTesting.ecommercetesting.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3LoginUserWithIncorrectEmailAndPassword extends BaseClass {
    @Test
    public void testCase3LoginUserWithIncorrectEmailAndPassword() {
        TestCase3LoginUserWithIncorrectEmailAndPasswordPage tc3luwieap = new TestCase3LoginUserWithIncorrectEmailAndPasswordPage(driver);

        //Test Case 04 Signuo/ Login Buttton

        tc3luwieap.getSignInButton().click();
        System.out.println("Sign in Button Clicked");

        // Test Case 05 Login to your Account is visible

        String loginURL = driver.getCurrentUrl();
        System.out.println("Givern" + loginURL);
        Assert.assertEquals(loginURL, Data.BASE_URL + Data.LOGIN_PAGE_URL);
        System.out.println("Login URL is Validate");

        if (tc3luwieap.getLoginToYourAccountText().isDisplayed()){
            String loginToyourText= tc3luwieap.getLoginToYourAccountText().getText();
            System.out.println(loginToyourText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGIN_TO_YOUR_ACCoUNT_TEXT, loginToyourText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Test Case 6 Enter incorrect email address and password
        tc3luwieap.getEmailAddressInputField().sendKeys(Data.DEMO_INCORRECT_EMAIL);
        tc3luwieap.getPasswordInputField().sendKeys(Data.DEMO_INCORRECT_PASSWORD);

        //TestCase 7 Click 'login' button
        tc3luwieap.getLoginButton().click();
        //TestCase 8 8. Verify error 'Your email or password is incorrect!' is visible

        if (tc3luwieap.getYourEmailOrPasswordIsIncorrectText().isDisplayed())
        {
            String yourEmailOrPasswordIsIncorrectText = tc3luwieap.getYourEmailOrPasswordIsIncorrectText().getText();
            System.out.println(yourEmailOrPasswordIsIncorrectText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.YOUR_EMAIL_OR_PASSWORD_IS_INCORRECT, yourEmailOrPasswordIsIncorrectText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);
    }
}
