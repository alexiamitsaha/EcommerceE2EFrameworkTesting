package com.ecommercee2eFrameworkTesting.ecommercetesting.testCases;

import com.ecommercee2eFrameworkTesting.ecommercetesting.baseClasses.BaseClass;
import com.ecommercee2eFrameworkTesting.ecommercetesting.pages.TestCase01RegisterUserPage;
import com.ecommercee2eFrameworkTesting.ecommercetesting.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase01RegisterUser extends BaseClass {
    @Test
    public void testCase01RegisterUser(){
        TestCase01RegisterUserPage tc01rup = new TestCase01RegisterUserPage(driver);
        //TestCase 04 - Click on 'SignUp / Login' Button validation
        tc01rup.getSignInButton().click();
        System.out.println("Sign in Button Clicked");

        //testcase -05 Login URL Validation
        String loginURL = driver.getCurrentUrl();
        System.out.println("Given" + loginURL);
        Assert.assertEquals(loginURL, Data.BASE_URL+Data.LOGIN_PAGE_URL);
        System.out.println("Login URL is Validate");

        // Verify 'New User Signup!' is visible
        if (tc01rup.getNewUserSignupText().isDisplayed())
        {
            String newUserSignupText= tc01rup.getNewUserSignupText().getText();
            System.out.println(newUserSignupText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.NEW_USER_SIGNUP_TEXT,newUserSignupText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        // Enter name and email address
        if (tc01rup.getNameInputFieldInSignUpForm().isDisplayed())
        {
            tc01rup.getNameInputFieldInSignUpForm().sendKeys(Data.DEMO_USER_NAME);
        }
        else {
            System.out.println(tc01rup.getNameInputFieldInSignUpForm() + Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);
        if (tc01rup.getEmailInputFieldInSignUpForm().isDisplayed())
        {
            tc01rup.getEmailInputFieldInSignUpForm().sendKeys(Data.DEMO_EMAIL);
        }
        else {
            System.out.println(tc01rup.getEmailInputFieldInSignUpForm() + Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        // Click 'Signup' button

        if(tc01rup.getSignupButton().isDisplayed()){
            String signupButtonText= tc01rup.getSignupButton().getText();
            Assert.assertEquals(Data.SIGNUP_BUTTON_TEXT,signupButtonText);
            System.out.println( "✔" + signupButtonText + "✔" + Data.IS_VISIBLE);
            tc01rup.getSignupButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        // Verify that 'ENTER ACCOUNT INFORMATION' is visible
        if (tc01rup.getEnterAccountInformation().isDisplayed())
        {
            String enterAccountInformationText= tc01rup.getEnterAccountInformation().getText();
            System.out.println(enterAccountInformationText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.ENTER_ACCOUNT_INFORMATION,enterAccountInformationText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Title Mr Mrs radio button validation
        WebElement mr= driver.findElement(By.cssSelector("div:nth-of-type(1) > .top > .radio  input[name='title']"));
        WebElement mrs= driver.findElement(By.cssSelector("div:nth-of-type(2) > .top > .radio  input[name='title']"));
        if(mr.isDisplayed()){
            mr.click();
            mr.isSelected();
            System.out.println("Mr is selected");
        }else {
            System.out.println("Mr not Selected ");
        }
        sleepTest(2000);

        if(mrs.isDisplayed()){
            mrs.click();
            mrs.isSelected();
            System.out.println("Mrs is selected");
        }else {
            System.out.println("Mrs not Selected ");
        }
        sleepTest(2000);

        // Verify that 'Password Input Field' is visible
        if (tc01rup.getPasswordInputField().isDisplayed())
        {
            tc01rup.getPasswordInputField().sendKeys(Data.DEMO_PASSWORD);
            System.out.println("Password Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

        // Fill details: Title, Name, Email, Password, Date of birth

        By day = By.cssSelector("select#days");
        By month =By.cssSelector("select#months");
        By year = By.cssSelector("select#years");


        tc01rup.dropDownSelect(day , "10");
        tc01rup.dropDownSelect(day,"28");

        tc01rup.dropDownSelect(month,"March");
        tc01rup.dropDownSelect(month,"April");
        tc01rup.dropDownSelect(month,"May");
        tc01rup.dropDownSelect(month,"August");
        tc01rup.dropDownSelect(month,"November");

        tc01rup.dropDownSelect(year,"2021");
        tc01rup.dropDownSelect(year,"2020");
        tc01rup.dropDownSelect(year,"2019");
        tc01rup.dropDownSelect(year,"2018");
        tc01rup.dropDownSelect(year,"2017");
        tc01rup.dropDownSelect(year,"2016");
        tc01rup.dropDownSelect(year,"2015");
        tc01rup.dropDownSelect(year,"2014");
        tc01rup.dropDownSelect(year,"2013");
        tc01rup.dropDownSelect(year,"2012");
        tc01rup.dropDownSelect(year,"2011");
        tc01rup.dropDownSelect(year,"2014");
        tc01rup.dropDownSelect(year,"2013");
        tc01rup.dropDownSelect(year,"2012");
        tc01rup.dropDownSelect(year,"2010");

        sleepTest(2000);


        // Select checkbox 'Sign up for our newsletter!

        tc01rup.getNewsletterCheckbox().click();
        if(tc01rup.getNewsletterCheckbox().isSelected())
        {
            System.out.println(Data.POSITIVE_MASSAGE+ "Sign-Up Checkbox Selected");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest( 1000);

        // Select checkbox 'Receive special offers from our partners!

        tc01rup.getReceiveSpecialOfferCheckbox().click();
        if(tc01rup.getReceiveSpecialOfferCheckbox().isSelected())
        {
            System.out.println(Data.POSITIVE_MASSAGE+ "Receive Checkbox Selected");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest( 1000);

        // Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

        //First Name
        if (tc01rup.getFirstNameInputField().isDisplayed())
        {
            tc01rup.getFirstNameInputField().sendKeys(Data.FIRST_NAME);
            System.out.println("First Name Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Last Name
        if (tc01rup.getLastNameInputField().isDisplayed())
        {
            tc01rup.getLastNameInputField().sendKeys(Data.LAST_NAME);
            System.out.println("last Name Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //Company Name
        if (tc01rup.getCompanyNameInputField().isDisplayed())
        {
            tc01rup.getCompanyNameInputField().sendKeys(Data.COMPANY);
            System.out.println("Company Name Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);



        //Address
        if (tc01rup.getAdress1InputField().isDisplayed())
        {
            tc01rup.getAdress1InputField().sendKeys(Data.ADDRESS);
            System.out.println("Adress Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //Address 2
        if (tc01rup.getAdress2InputField().isDisplayed())
        {
            tc01rup.getAdress2InputField().sendKeys(Data.ADDRESS2);
            System.out.println("Adress 2 Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Country DropDown

        By country = By.cssSelector("select#country");

        tc01rup.dropDownSelect(country , "India");
        tc01rup.dropDownSelect(country,"Canada");
        tc01rup.dropDownSelect(country,"Australia");
        tc01rup.dropDownSelect(country,"New Zealand");
        tc01rup.dropDownSelect(country,"Singapore");
        tc01rup.dropDownSelect(country,"United States");

        // State
        if (tc01rup.getStateInputField().isDisplayed())
        {
            tc01rup.getStateInputField().sendKeys(Data.STATE);
            System.out.println("State Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        // City
        if (tc01rup.getCityInputField().isDisplayed())
        {
            tc01rup.getCityInputField().sendKeys(Data.CITY);
            System.out.println("City Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);
        js.executeScript("window.scrollBy(0,300)");



        // Zipcode
        if (tc01rup.getZipCodeInputField().isDisplayed())
        {
            tc01rup.getZipCodeInputField().sendKeys(Data.ZIPCODE);
            System.out.println("Zipcode Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        // Mobile Number
        if (tc01rup.getMobileNumberInputField().isDisplayed())
        {
            tc01rup.getMobileNumberInputField().sendKeys(Data.MOBILE_NUMBER);
            System.out.println("Mobile Number Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Click 'Create Account button'

        if(tc01rup.getCreateAccountButton().isDisplayed()){
            String createAccountButtonText= tc01rup.getCreateAccountButton().getText();
            Assert.assertEquals(Data.CREATE_BUTTON_TEXT,createAccountButtonText);
            System.out.println( "✔" + createAccountButtonText + "✔" + Data.IS_VISIBLE);
            tc01rup.getCreateAccountButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        // Verify that 'ACCOUNT CREATED!' is visible
        if (tc01rup.getAccountCreatedText().isDisplayed())
        {
            String accountCreatedText= tc01rup.getAccountCreatedText().getText();
            System.out.println(accountCreatedText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.ACCOUNT_CREATED_TEXT,accountCreatedText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        // Click on Continue Button
        tc01rup.getContinueButton().click();

        // Verify that 'Logged in as username' is visible
        if (tc01rup.getLoggedInAsUsernameText().isDisplayed())
        {
            String loggedInAsUserText= tc01rup.getLoggedInAsUsernameText().getText();
            System.out.println(loggedInAsUserText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGGED_IN_AS_USER_TEXT,loggedInAsUserText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //TC -17 Account
        tc01rup.getDeleteAccountButton().click();

        //TC- 18

        tc01rup.getDeleteButton().click();
        sleepTest(2000);
        sleepTest(2000);



    }
}
