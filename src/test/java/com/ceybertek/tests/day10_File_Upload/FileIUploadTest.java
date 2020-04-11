package com.ceybertek.tests.day10_File_Upload;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileIUploadTest {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
         driver.get("http://practice.cybertekschool.com/upload");

         driver.findElement(By.name("file")).sendKeys("C:\\Users\\hbayg\\OneDrive\\Desktop\\file.txt");

         driver.findElement(By.id("file-submit")).click();
       String actualfileName= driver.findElement(By.id("uploaded-files")).getText();

       // System.out.println(actualfileName);

        Assert.assertEquals(actualfileName,"file.txt","Verify the file name");
    }




}
