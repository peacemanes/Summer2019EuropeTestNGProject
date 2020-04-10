package com.ceybertek.tests.day8_Types_Of_Elements_2;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {
    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement=driver.findElement(By.id("state"));
        Select statelist=new Select(dropdownElement);

        List<WebElement> options=statelist.getOptions();
        System.out.println(options.size());
        for (WebElement option : options) {
            System.out.println(option.getText());

        }
        }
        @Test
        public void test2() throws InterruptedException {
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/dropdown");

            WebElement dropdownElement=driver.findElement(By.id("state"));
            Select statelist=new Select(dropdownElement);
            String expectedOption="Select a State";
           String actualoption=statelist.getFirstSelectedOption().getText();
            Assert.assertEquals(actualoption,expectedOption,"verify that first selected option is Select a State");

            Thread.sleep(2000);
            statelist.selectByVisibleText("Tennessee");
            actualoption=statelist.getFirstSelectedOption().getText();
            Assert.assertEquals(actualoption,"Tennessee");

            Thread.sleep(2000);
            statelist.selectByIndex(32);
            System.out.println(statelist.getFirstSelectedOption().getText());
            actualoption=statelist.getFirstSelectedOption().getText();
            Assert.assertEquals(actualoption,"New Mexico");

            Thread.sleep(2000);
            statelist.selectByValue("TN");
            System.out.println(statelist.getFirstSelectedOption().getText());
        }


}
