package com.ecommercee2eFrameworkTesting.ecommercetesting.pages;

import com.ecommercee2eFrameworkTesting.ecommercetesting.baseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase7VerifyTestCasesPage_Page extends BasePage {
    public TestCase7VerifyTestCasesPage_Page(WebDriver driver) {
        super(driver);
    }


    @FindBy(css=".nav.navbar-nav > li:nth-of-type(5) > a")
    public WebElement testCasesButton;
    public WebElement getTestCasesButton(){
        return testCasesButton;
    }


}
