package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuggestiveDropdown {

    @BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/khoinguyen/Downloads/chromedriver");

//        Thread.sleep(3000);
    }

    @Test
    public void SuggestiveDropdown() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vietnamairlines.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
}
