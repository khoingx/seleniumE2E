package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testFb {

    @Test
    public void testingFb() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/khoinguyen/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        //go to the page
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //click Sign in button
        WebElement signIn = driver.findElement(By.id("gb_70"));
        signIn.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //click Create an account button
        WebElement createAcc = driver.findElement(By.xpath("//span[@class='NlWrkb snByac']"));
        createAcc.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        //click Create for myself option
        WebElement myselfOpt = driver.findElement(By.xpath("//div[contains(text(),'For myself')]"));
        myselfOpt.click();

        //select birthday from dropdown list
//        WebElement day = driver.findElement(By.id("day"));
//        Select select_day = new Select(day);
//        select_day.selectByValue("5");
    }
}
