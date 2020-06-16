package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicDropdown {

    private String baseURL;
    private WebDriver driver;
    private WebElement element;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/khoinguyen/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        baseURL = "https://www.spicejet.com/";
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @Test
    public void dynamicDropdown() {
        driver.get(baseURL);
        Thread.sleep(3000);

        WebElement fromCity = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        fromCity.click();

        //select Hyderbad
        driver.findElement(By.xpath("//a[@text='Hyderabad (HYD)']")).click();
        Thread.sleep(2000);

        //xpath (//a[@value='MAA'])[2]
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

    }
}
