package com.ceybertek.tests.day4_Basic_Locators;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullNameInput= driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Mike Smith with Tagname");
        WebElement emailInput= driver.findElement(By.name("email"));
        emailInput.sendKeys("test@gmail.com");
        WebElement submitButton=driver.findElement(By.tagName("button"));
        submitButton.click();
        WebElement signupMessage=driver.findElement(By.tagName("h3"));
        String theMessage=signupMessage.getText();
        System.out.println(theMessage);
       // System.out.println(driver.findElement(By.tagName("h3")).getText());


    }
}



