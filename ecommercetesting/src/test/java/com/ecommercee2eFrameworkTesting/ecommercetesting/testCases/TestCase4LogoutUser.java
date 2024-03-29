package com.ecommercee2eFrameworkTesting.ecommercetesting.testCases;

import com.ecommercee2eFrameworkTesting.ecommercetesting.baseClasses.BaseClass;
import com.ecommercee2eFrameworkTesting.ecommercetesting.pages.TestCase4LogoutUserPage;
import com.ecommercee2eFrameworkTesting.ecommercetesting.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4LogoutUser extends BaseClass {
    @Test
    public void testCase4LogoutUser(){
        TestCase4LogoutUserPage tc4lup = new TestCase4LogoutUserPage(driver);

        //tc 4 Click on Signup / Login Button

        tc4lup.getSignInButton().click();
        System.out.println("sign in Button Clicked");

        //tc 5 verify 'login to your account' is visible

        String loginURL = driver.getCurrentUrl();
        System.out.println("Given"+loginURL);
        Assert.assertEquals(loginURL, Data.BASE_URL + Data.LOGIN_PAGE_URL);
        System.out.println("Login URL is Validate");

        if(tc4lup.getLoginToYourAccountText().isDisplayed())
        {
            String loginToyourText = tc4lup.getLoginToYourAccountText().getText();
            System.out.println(loginToyourText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGIN_TO_YOUR_ACCoUNT_TEXT,loginToyourText);
        }else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(1000);
        //tc 6 Enter correct email address and password

                tc4lup.getEmailAddressInputField().sendKeys(Data.DEMO_EMAIL);
                tc4lup.getPasswordInputField().sendKeys(Data.DEMO_PASSWORD);

        //     TC - 7. Click 'login' button
                tc4lup.getLoginButton().click();

        //     TC - 8. Verify that 'Logged in as username' is visible

                if (tc4lup.getLoggedInAsUsernameText().isDisplayed())
                {
                    String loggedInAsUserText= tc4lup.getLoggedInAsUsernameText().getText();
                    System.out.println(loggedInAsUserText + Data.POSITIVE_MASSAGE);
                    Assert.assertEquals(Data.LOGGED_IN_AS_USER_TEXT,loggedInAsUserText);
                }
                else {
                    System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
                }


        //   TC - 9 Click 'Logout' button

                tc4lup.getLogoutButton().click();
                sleepTest(2000);
        //   TC - 10 Verify that user is navigated to login page

                String loginURL1 = driver.getCurrentUrl();
                System.out.println("Given "+loginURL1);
                Assert.assertEquals(loginURL1 , Data.BASE_URL + Data.LOGIN_PAGE_URL);
                System.out.println("login URL is validate");

                if (tc4lup.getLoginToYourAccountText().isDisplayed())
                {
                    String loginToYourText= tc4lup.getLoginToYourAccountText().getText();
                    System.out.println(loginToYourText + Data.POSITIVE_MASSAGE);
                    Assert.assertEquals(Data.LOGIN_TO_YOUR_ACCoUNT_TEXT,loginToYourText);
                }
                else {
                    System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
                }
                sleepTest(2000);
    }
}
