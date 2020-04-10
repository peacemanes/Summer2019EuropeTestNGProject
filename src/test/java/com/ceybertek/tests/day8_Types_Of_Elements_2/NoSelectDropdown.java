package com.ceybertek.tests.day8_Types_Of_Elements_2;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {
    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownelement = driver.findElement(By.id("dropdownMenuLink"));
        dropdownelement.click();
        List<WebElement> listOfLinks = driver.findElements(By.className("dropdown-item"));
        System.out.println("number of links " + listOfLinks.size());


        System.out.println(listOfLinks.get(0).getText());
        for (WebElement listOfLink : listOfLinks) {
            System.out.println(listOfLink.getText());

        }

           // driver.findElement(By.linkText("Yahoo")).click();
            listOfLinks.get(3).click();

    }

}