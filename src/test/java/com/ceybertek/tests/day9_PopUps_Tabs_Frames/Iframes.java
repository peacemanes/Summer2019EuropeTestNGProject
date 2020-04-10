package com.ceybertek.tests.day9_PopUps_Tabs_Frames;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Iframes {
    WebDriver driver;

    @BeforeMethod
    public void setupmethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }


    @AfterMethod
    public void teardownmethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void Test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/iframe");
        ;
        driver.switchTo().frame("mce_0_ifr");
        //  Thread.sleep(5000);
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("We use Name Or Id");

        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).clear();

        driver.findElement(By.id("tinymce")).sendKeys("We use Index here");
        driver.switchTo().parentFrame();

        WebElement frameElement = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frameElement);
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("We located WebElement");
    }
        @Test
        public void multipleFrames()  {
    driver.get("http://practice.cybertekschool.com/nested_frames");

    driver.switchTo().frame("frame-top");

    driver.switchTo().frame("frame-middle");
            System.out.println(driver.findElement(By.id("content")).getText());

            driver.switchTo().parentFrame();

            driver.switchTo().frame(2);
            System.out.println(driver.findElement(By.tagName("body")).getText());

            driver.switchTo().defaultContent();
            driver.switchTo().frame(1);
            System.out.println(driver.findElement(By.tagName("body")).getText());
        }








    }



