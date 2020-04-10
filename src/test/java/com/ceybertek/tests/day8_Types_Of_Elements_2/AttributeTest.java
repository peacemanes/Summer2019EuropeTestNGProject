package com.ceybertek.tests.day8_Types_Of_Elements_2;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement radioButton = driver.findElement(By.id("blue"));

        System.out.println(radioButton.getAttribute("name"));
        System.out.println(radioButton.getAttribute("id"));
        System.out.println(radioButton.getAttribute("type"));
        System.out.println(radioButton.getAttribute("href"));
        System.out.println(radioButton.getAttribute("checked"));
        System.out.println(radioButton.getAttribute("outerHTML"));
        System.out.println(radioButton.getAttribute("innerHTML"));

    }
}