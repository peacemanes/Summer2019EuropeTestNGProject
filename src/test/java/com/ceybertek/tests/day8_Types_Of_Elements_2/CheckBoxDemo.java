package com.ceybertek.tests.day8_Types_Of_Elements_2;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {

    @Test
    public  void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1=driver.findElement(By.xpath("//input[1]"));
        WebElement checkbox2=driver.findElement(By.xpath("//input[2]"));

        System.out.println("checkbox1.isSelected() "+checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() "+checkbox2.isSelected());

        Assert.assertFalse(checkbox1.isSelected(),"verify that checkbox1 is not selected");
        Assert.assertTrue(checkbox2.isSelected(),"verify that checkbox2 is  selected");
            checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected(),"verify that checkbox1 is  selected");
        Assert.assertTrue(checkbox2.isSelected(),"verify that checkbox2 is  selected");
    }
}
