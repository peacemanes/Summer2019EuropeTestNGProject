package com.ceybertek.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_navigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.get("http://www.cybertekschool.com");
        driver.get("http://www.amazon.com");

       /* WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.cybertekschool.com");
        driver.get("http://www.google.com");

        */
        System.out.println(driver.getTitle());
    }
}
