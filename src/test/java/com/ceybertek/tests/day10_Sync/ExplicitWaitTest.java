package com.ceybertek.tests.day10_Sync;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitTest {
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
    public void Dynamicloading() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        driver.findElement(By.tagName("button")).click();

        WebElement username = driver.findElement(By.id("username"));
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOf(username));


        username.sendKeys("Mike Smith");


    }
    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
         driver.findElement(By.xpath("//button[contains(text(),'Enable')]")).click();


        WebElement inputBox= driver.findElement(By.cssSelector("input[type='text']"));

         WebDriverWait wait= new WebDriverWait(driver,30);
         wait.until(ExpectedConditions.elementToBeClickable(inputBox));

         inputBox.sendKeys("Something Something");



    }







}
