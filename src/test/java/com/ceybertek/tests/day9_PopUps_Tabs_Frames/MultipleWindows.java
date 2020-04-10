package com.ceybertek.tests.day9_PopUps_Tabs_Frames;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {

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
    public void Test1() {

        driver.get("http://practice.cybertekschool.com/windows");

        System.out.println("Before clicking the link " + driver.getTitle());
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println("After clicking the link " + driver.getTitle());

        String currentWindowHandle = driver.getWindowHandle();
        System.out.println("currentWindowHandle = " + currentWindowHandle);

        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println(windowHandles.size());

        for (String handle : windowHandles) {
            if (!currentWindowHandle.equals(handle)) {
                System.out.println(handle);
                driver.switchTo().window(handle);
            }

        }
        System.out.println("After switching " + driver.getTitle());
        System.out.println(driver.findElement(By.tagName("h3")).getText());
    }

    @Test
    public void morethanTwoWindows() {

        driver.get("http://practice.cybertekschool.com/windows");

        String targetWindowTitle = "New Window";
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println(driver.getWindowHandles().size());
        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            driver.switchTo().window(handle);

            if (driver.getTitle().equals(targetWindowTitle)) {
                break;

            }

        }
        System.out.println("After loop title is " + driver.getTitle());


    }
}