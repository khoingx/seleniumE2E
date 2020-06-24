package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Main {

    @Test
    public void dropdownTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/khoinguyen/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        //go to the page
        driver.get("https://www.spicejet.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //select checkbox
        WebElement student = driver.findElement(By.cssSelector("input[id*='StudentDiscount']"));
        student.click();
        Assert.assertTrue(student.isSelected());
        Thread.sleep(3000);

//        WebElement senior = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
//        senior.click();
//        Thread.sleep(3000);
//        Assert.assertFalse(senior.isSelected());
//
//        WebElement family = driver.findElement(By.cssSelector("input[id*='friendsandfamily"));
//        family.click();
//        Thread.sleep(2000);

        //click on Deals
//        WebElement deal = driver.findElement(By.id("header-vacations"));
//        deal.click();

        //click on to open the main dropdown
        WebElement passengers = driver.findElement(By.id("divpaxinfo"));
        passengers.click();
//        driver.findElement(By.id("divpaxinfo")).click();

//        //select a number of adult
        WebElement element1 = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
        Select s1 = new Select(element1);
        s1.selectByIndex(1);
        Thread.sleep(2000);

        //select a number of children
//        WebElement element2 = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
//        Select s2 = new Select(element2);
//        s2.selectByIndex(1);
//        Thread.sleep(3000);

        //print out text of main checkbox
        System.out.println(passengers.getText());
        Assert.assertEquals(passengers.getText(), "2 Adult");

//      //click on 1 more dropdown
//        WebElement element3 = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//        element3.click();
//        Select s3 = new Select(element3);
//        s3.selectByValue("USD");
    }
}
