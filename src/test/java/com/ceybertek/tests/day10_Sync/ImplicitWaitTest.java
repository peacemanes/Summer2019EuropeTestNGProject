package com.ceybertek.tests.day10_Sync;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest {

    WebDriver driver;

    @BeforeMethod
    public void setupmethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void teardownmethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void Dynamicloading() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
        //   Thread.sleep(6000);
        String message=  driver.findElement(By.id("finish")).getText();
        System.out.println(message);


    }
}
