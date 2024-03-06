package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class textTest {
    public static void main(String[] args) {
        WebDriver webdriver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webdriver.manage().window().maximize();
        webdriver.get("https://www.wikipedia.org");

        WebElement searchBox = webdriver.findElement(By.id("searchInput"));
        String searchStr = "Selenium Webdriver";
        searchBox.sendKeys(searchStr);

        WebElement searchButton = webdriver.findElement(By.cssSelector("#search-form > fieldset > button"));
        searchButton.click();


    }
}
