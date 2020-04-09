package com.ceybertek.tests.day5_Xpath;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://amazon.com");
        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("Selenium");
        WebElement searchbutton=driver.findElement(By.xpath("//input[@value='Go']"));
        searchbutton.click();
        String resultMessage= driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
        System.out.println(resultMessage);
    }
}
