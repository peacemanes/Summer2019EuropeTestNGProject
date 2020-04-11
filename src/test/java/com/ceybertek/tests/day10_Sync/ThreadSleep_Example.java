package com.ceybertek.tests.day10_Sync;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreadSleep_Example {
    WebDriver driver;

    @BeforeMethod
    public void setupmethod() {
        driver = WebDriverFactory.getDriver("chrome");

    driver.manage().window().maximize();
    }


    @AfterMethod
    public void teardownmethod() throws InterruptedException {
       Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void Test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dynamic_loading/3");
       Thread.sleep(6000);
        driver.findElement(By.id("username")).sendKeys("Mike Smith");



    }


}
