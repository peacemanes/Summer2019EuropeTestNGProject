package com.ceybertek.tests.day8_Types_Of_Elements_2;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {
    @Test
    public void test1()  {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        List<WebElement> buttons=driver.findElements(By.tagName("button"));
        System.out.println("buttons.size() = " + buttons.size());

        Assert.assertEquals(buttons.size(),6,"verify that we have got  6");
        for (WebElement button : buttons) {
            System.out.println(button.getText());
        }
        }
        @Test
        public void test2()  {
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/multiple_buttons");
       // WebElement button=driver.findElements(By.tagName("buttonaasdad"));  nosuchelementexception
            List<WebElement> buttons=driver.findElements(By.tagName("buttonasdsasdad"));
            System.out.println(buttons.size());

    }
}
