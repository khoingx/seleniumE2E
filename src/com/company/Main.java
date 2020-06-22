package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Main {

//    private String baseURL;
//    private WebDriver driver;
//    private WebElement element;
//
//    @BeforeMethod
//    public void setUp() throws  Exception {
//        System.setProperty("webdriver.chrome.driver", "/Users/khoinguyen/Downloads/chromedriver");
//        driver = new ChromeDriver();
//        baseURL = "https://www.spicejet.com/";
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
    @Test
    public void dropdownTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/khoinguyen/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        //go to the page
        driver.get("https://www.spicejet.com");
        driver.manage().window().maximize();

//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(5000);

        //click on Deals
//        WebElement deal = driver.findElement(By.id("header-vacations"));
//        deal.click();

        //click on to open the main dropdown
        driver.findElement(By.id("divpaxinfo")).click();

//        //select a number of adult
        WebElement element1 = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
        Select s1 = new Select(element1);
        s1.selectByIndex(1);
        Thread.sleep(5000);
        System.out.println(element1.getText());


        //select a number of children
        WebElement element2 = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
        Select s2 = new Select(element2);
        s2.selectByValue("1");
        Thread.sleep(2000);

        Thread.sleep(2000);

//      //click on 1 more dropdown
        WebElement element3 = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        element3.click();
        Select s3 = new Select(element3);
        s3.selectByValue("USD");
    }
}
