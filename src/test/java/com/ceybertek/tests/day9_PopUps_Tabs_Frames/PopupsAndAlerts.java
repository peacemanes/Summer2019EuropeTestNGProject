package com.ceybertek.tests.day9_PopUps_Tabs_Frames;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {


            WebDriver driver;

            @BeforeMethod
            public void setupmethod(){
                driver=WebDriverFactory.getDriver("chrome");

            }


            @AfterMethod
            public void teardownmethod() throws InterruptedException {
                Thread.sleep(3000);
                driver.quit();
            }

    @Test
    public void Test1(){

        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        driver.findElement(By.xpath("//*[text()='Destroy the World'] ")).click();
        driver.findElement(By.xpath("//*[text()='No']")).click();

    }

    @Test
    public void Alerts() throws InterruptedException {
                driver.get("http://practice.cybertekschool.com/javascript_alerts");
                driver.findElement(By.xpath("//button[1]")).click();
                Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();
        alert.accept();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[2]")).click();
        Thread.sleep(3000);
        alert.dismiss();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[3]")).click();
        Thread.sleep(2000);
        alert.sendKeys("Mike Smith");
        alert.accept();


            }


}
