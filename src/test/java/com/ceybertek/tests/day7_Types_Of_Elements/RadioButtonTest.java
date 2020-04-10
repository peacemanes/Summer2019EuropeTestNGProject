package com.ceybertek.tests.day7_Types_Of_Elements;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {
    @Test
    public void RadioButton(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton=driver.findElement(By.id("blue"));
        WebElement RedRadioButton=driver.findElement(By.id("red"));

        System.out.println("Is blue button selected "+blueRadioButton.isSelected());
        System.out.println("Is red button selected "+RedRadioButton.isSelected());

        Assert.assertTrue(blueRadioButton.isSelected(),"verify blueradiobutton is selected");
        Assert.assertFalse(RedRadioButton.isSelected(),"verify that red button is not selected");
        System.out.println("Clicking radio button");
       RedRadioButton.click();

        System.out.println("Is blue button selected "+blueRadioButton.isSelected());
        System.out.println("Is red button selected "+RedRadioButton.isSelected());

        Assert.assertFalse(blueRadioButton.isSelected(),"verify blue button is not selected");
        Assert.assertTrue(RedRadioButton.isSelected(),"verify that red button is selected");



    }

}
