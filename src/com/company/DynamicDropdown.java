package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicDropdown {

//    private String baseURL = "";
//    private WebDriver driver;
//    private WebElement element;

    @BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/khoinguyen/Downloads/chromedriver");

//        Thread.sleep(3000);
    }

    @Test
    public void dynamicDropdown() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
//        baseURL = "https://www.spicejet.com/";
        driver.get("https://www.spicejet.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //select checkbox
        WebElement student = driver.findElement(By.cssSelector("input[id*='StudentDiscount']"));
        student.click();
        Thread.sleep(3000);

        WebElement senior = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
        senior.click();
        Thread.sleep(3000);

        //click on departure city
        WebElement fromCity = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        fromCity.click();

        //select Hyderabad as a departure
        driver.findElement(By.xpath("//a[@text='Hyderabad (HYD)']")).click();
        Thread.sleep(2000);

        //select Chennai as an arrival
        //xpath (//a[@value='MAA'])[2]
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();


    }
}
