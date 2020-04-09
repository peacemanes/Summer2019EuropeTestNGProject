package com.ceybertek.tests.day4_Basic_Locators;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullNameInput= driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Hayri Brown");
        WebElement emailInput= driver.findElement(By.name("email"));
        emailInput.sendKeys("test@gmail.com");
        WebElement submitButton=driver.findElement(By.name("wooden_spoon"));
        submitButton.click();
        String expectedMessage= "Thank you for signing up. Click the button below to return to the home page.";
        WebElement confirmationMessage=driver.findElement(By.name("signup_message"));
        String actualMessage =confirmationMessage.getText();
        if(expectedMessage.equals(actualMessage)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("actualMessage = " + actualMessage);
            System.out.println("expectedMessage = " + expectedMessage);
        }

        driver.quit();
    }
}
