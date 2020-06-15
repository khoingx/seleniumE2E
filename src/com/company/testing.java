package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testing {

    @Test
    public void dropdownTesing() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/khoinguyen/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //go to the page
        driver.get("https://www.spicejet.com");
        Thread.sleep(5000);

//        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        //click on to open the main dropdown
        driver.findElement(By.id("divpaxinfo")).click();

        //select a number of adult
        WebElement element1 = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
        Select s1 = new Select(element1);
        s1.selectByValue("1");
        Thread.sleep(5000);

        //select a number of children
        WebElement element2 = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
        Select s2 = new Select(element2);
        s2.selectByValue("1");
        Thread.sleep(5000);


//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

//        Thread.sleep(2000);
        //click on 1 more dropdown
        WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        currency.click();
        Select s3 = new Select(currency);
        s3.selectByValue("USD");
    }
}
