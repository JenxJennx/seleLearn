package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class clicking {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://wikipedia.org");
        WebElement englishButton = webDriver.findElement(By.id("js-link-box-en"));

        englishButton.click();
        String expectedWelcomeTitle = "Welcome to Wikipedia,";
        WebElement titleOfEngliSH = webDriver.findElement(By.id("mp-welcome"));

        if(titleOfEngliSH.getText().equals(expectedWelcomeTitle)){
            System.out.println("Test has passed");
        }
        else{
            System.out.println("Test failed");
        }
        //webDriver.close();
    }
}
