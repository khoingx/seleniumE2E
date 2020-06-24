package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.util.concurrent.TimeUnit;

public class CalendarTesting {

    @Test
    public void calendarTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/khoinguyen/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        //go to the page
        driver.get("https://www.spicejet.com");
        Thread.sleep(5000);

        //click on departure city on a one way trip
        WebElement fromCity = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        fromCity.click();

        //select Hyderabad as a departure
        driver.findElement(By.xpath("//a[@text='Hyderabad (HYD)']")).click();
        Thread.sleep(2000);

        //select Chennai as an arrival
        //xpath (//a[@value='MAA'])[2]
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        //select current date
        WebElement currentDate = driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active"));
        currentDate.click();

    }
}
