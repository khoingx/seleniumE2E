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

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/khoinguyen/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        //go to the page
        driver.get("https://www.spicejet.com");
//        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        //click on main dropdown
        driver.findElement(By.id("divpaxinfo")).click();

        //click on sub dropdown then select targeted value
        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//        s.selectByValue("2");
        s.selectByIndex(6);
    }
}
