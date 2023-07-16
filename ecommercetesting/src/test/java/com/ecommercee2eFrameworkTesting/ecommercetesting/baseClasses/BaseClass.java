package com.ecommercee2eFrameworkTesting.ecommercetesting.baseClasses;

import com.ecommercee2eFrameworkTesting.ecommercetesting.utilities.Data;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver.navigate().to("https://www.automationexercise.com/");
        Thread.sleep(1000);
        //Home URL Validation
        String baselink = driver.getCurrentUrl();
        System.out.println("Given"+baselink);
        Assert.assertEquals(baselink, Data.BASE_URL);
        System.out.println("Home URL is Validate");
        Thread.sleep(1000);
    }
    @AfterMethod
    public void afterTest(){
        driver.quit();
    }
    public static void sleepTest(long sleeptime){
        try{
            Thread.sleep(sleeptime);
        } catch (Exception e){

        }
    }

}
