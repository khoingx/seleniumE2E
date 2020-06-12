package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/khoinguyen/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("divpaxinfo")).click();
     //   driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
                s.selectByValue("2");
    }
}
