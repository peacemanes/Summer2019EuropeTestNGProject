package com.ceybertek.tests.day3_WebElement_Intro;

import com.ceybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    /**Verify confirmation message
     •	open browser
     •	go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     •	enter any email
     •	verify that email is displayed in the input box
     •	click on Retrieve password
     •	verify that confirmation message says 'Your e-mail's been sent!'

     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInputBox=driver.findElement(By.name("email"));
        String expectedEmail="test@gmail.com";
        emailInputBox.sendKeys(expectedEmail);

       // String actualEmail= emailInputBox.getText();  works %99
        String actualEmail= emailInputBox.getAttribute("value");
        if(expectedEmail.equals(actualEmail)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actualEmail = " + actualEmail);
            System.out.println("expectedEmail = " + expectedEmail);
        }
        WebElement retrivePasswordButton=driver.findElement(By.id("form_submit"));
        retrivePasswordButton.click();
        String expectedMessage="Your e-mail's been sent!";
        WebElement messageElement=driver.findElement(By.name("confirmation_message"));
        String actualMessage=messageElement.getText();


        if(expectedMessage.equals(actualMessage)) {
            System.out.println("Pass");

        } else{
            System.out.println("Fail");
            System.out.println("actualMessage = " + actualMessage);
            System.out.println("expectedMessage = " + expectedMessage);
        }


        Thread.sleep(3000);
          driver.quit();
    }
}

