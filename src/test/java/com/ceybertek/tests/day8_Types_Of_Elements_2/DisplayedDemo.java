package com.ceybertek.tests.day8_Types_Of_Elements_2;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement usernameInput=driver.findElement(By.id("username"));
        System.out.println(usernameInput.isDisplayed());
        Assert.assertFalse(usernameInput.isDisplayed(),"verify that inputbox is not displayed");

        WebElement startButton=driver.findElement(By.cssSelector("#start>button"));
        startButton.click();
        Thread.sleep(5000);
        System.out.println(usernameInput.isDisplayed());
        Assert.assertTrue(usernameInput.isDisplayed());
    }
}
