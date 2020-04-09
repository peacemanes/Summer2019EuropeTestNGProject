package com.ceybertek.tests.day4_Basic_Locators;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement homeLink=driver.findElement(By.className("nav-link"));
        homeLink.click();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement multipleButtons=driver.findElement(By.tagName("h3"));
        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
}
