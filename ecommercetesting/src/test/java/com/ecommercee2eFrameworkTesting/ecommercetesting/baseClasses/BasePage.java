package com.ecommercee2eFrameworkTesting.ecommercetesting.baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public BasePage (WebDriver driver){
        this.driver = driver;
        this.inItpage();
    }

    private void inItpage() {
        PageFactory.initElements(driver,this);
    }
}
