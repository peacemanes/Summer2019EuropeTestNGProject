package com.ceybertek.tests.day2_webdriver_basics;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.get("https://www.google.com");
    }
}
