package com.ceybertek.tests.day6_css;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
       WebElement dontClickButton=driver.findElement(By.cssSelector("#disappearing_button"));
       // WebElement dontClickButton=driver.findElement(By.cssSelector("[onclick='button1()']"));
        String message=dontClickButton.getText();
        System.out.println("message = " + message);

    }
}
