package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testFb {

    @Test
    public void testingFb() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/khoinguyen/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        //go to the page
        driver.get("https://www.google.com");
        String actualTitle = "Google";
        Assert.assertEquals(driver.getTitle(), actualTitle);

        Thread.sleep(5000);

        //click Sign in button
        WebElement signIn = driver.findElement(By.id("gb_70"));
        signIn.click();
        Thread.sleep(5000);
        String actualSignIn = "Sign in - Google Accounts";
        Assert.assertEquals(driver.getTitle(), actualSignIn);
////
//
        //click Create an account button
        WebElement createAcc = driver.findElement(By.xpath("//span[@class='NlWrkb snByac']"));
        createAcc.click();
        Thread.sleep(5000);
//
////        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//
        //click Create for myself option
        WebElement myselfOpt = driver.findElement(By.xpath("//div[contains(text(),'For myself')]"));
        myselfOpt.click();
        Thread.sleep(5000);

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }
}
