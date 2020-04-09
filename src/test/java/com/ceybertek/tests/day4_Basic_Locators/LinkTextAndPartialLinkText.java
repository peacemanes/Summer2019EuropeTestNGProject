package com.ceybertek.tests.day4_Basic_Locators;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkText {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        //WebElement link3=driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
        //link3.click();

        //driver.findElement(By.linkText("Home")).click();
        WebElement link6=driver.findElement(By.partialLinkText("Example 6"));
        link6.click();
    }
}
