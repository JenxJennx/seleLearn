package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.wikipedia.org");

        //driver.findElement(By.cssSelector("#www-wikipedia-org > main > div.central-textlogo > h1 > span")).getText();

        WebElement titleOfWebPage = driver.findElement(By.cssSelector("#www-wikipedia-org > main > div.central-textlogo > h1 > span"));

        String title =  titleOfWebPage.getText();

        String expectedText = "Wikipedia";

        if(title.equals(expectedText)){
            System.out.println("Test has passed!");
        }
        else{
            System.out.println("Test did not pass");
            driver.close();
            throw new Exception();
        }

    }
}