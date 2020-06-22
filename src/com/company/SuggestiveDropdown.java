package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuggestiveDropdown {

    @BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/khoinguyen/Downloads/chromedriver");

    }

    @Test
    public void SuggestiveDropdown() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vietnamairlines.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //click on Flight
        WebElement flight = driver.findElement(By.id("#flightBook"));
        flight.click();

        //clear data in departure input box
        WebElement from = driver.findElement(By.id("#city-from-roundtrip"));
        from.clear();
        from.sendKeys("han");

        ////div[@id='bookYourTripFrom']//div[@class='tab-content content-form']
        driver.findElement(By.xpath("//div[@id='from-bookYourTripFrom-vietnam']//div[@class='locationName'][contains(text(),'Hanoi (HAN), Vietnam')]")).click();

    }
}
