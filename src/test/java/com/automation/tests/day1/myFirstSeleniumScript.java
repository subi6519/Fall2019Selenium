package com.automation.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstSeleniumScript {


    public static void main(String[] args) {
        //Set up chromedriver
        WebDriverManager.chromedriver().setup();
        //create chromedriver object
        ChromeDriver driver = new ChromeDriver();
        //open some website
        driver.get("http://google.com");

    }
}
