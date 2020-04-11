package com.ceybertek.tests.day10_File_Upload;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilePath_Example {
    @Test
    public void test1(){
        System.out.println(System.getProperty("user.dir"));
        String projectPath=System.getProperty("user.dir");
        String relativePath= "src/test/resources/testfile.txt";
        String filePath=projectPath+"/"+relativePath;




    }







    @Test
    public void test2(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/upload");

       // System.out.println(System.getProperty("os.name"));
        //System.out.println(System.getProperty("user.dir"));
        String projectPath=System.getProperty("user.dir");
        String relativePath= "src/test/resources/testfile.txt";
        String filePath=projectPath+"/"+relativePath;

        driver.findElement(By.name("file")).sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();
        String actualfileName= driver.findElement(By.id("uploaded-files")).getText();

        // System.out.println(actualfileName);

        Assert.assertEquals(actualfileName,"testfile.txt","Verify the file name");





    }


}
