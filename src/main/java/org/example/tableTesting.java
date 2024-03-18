package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class tableTesting {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://localhost:63342/selePractice/org/example/table.html?_ijt=9japutbg44vfoq3dp997mgvm7t&_ij_reload=RELOAD_ON_SAVE");
        //driver.close();

        WebElement link = driver.findElement(By.cssSelector("body > table > tbody > tr:nth-child(2) > td:nth-child(4) > a"));
        link.click();
        String title = driver.getTitle();
        String expectedTitle = "Watch Romantic Killer | Netflix Official Site";
        if(expectedTitle.equals(title)){
            System.out.println(title);
            System.out.println("True");
        }
        else{
            System.out.println("Not the correct title in the page");
        }
        WebElement signInButton = driver.findElement(By.cssSelector("#appMountPoint > div > div.nmtitle-wrapper.with-fixed-header > div > div.nm-content-header-section.nm-content-header-right > a"));
        signInButton.click();

        String signInTitle = driver.getTitle();
        String expectedSignInTitle = "Netflix";
        System.out.println(signInTitle);
        if(signInTitle.equals(expectedSignInTitle)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        WebElement signInInputUser = driver.findElement(By.id("id_userLoginId"));
        String username = "hhayek@yahoo.com";
        signInInputUser.sendKeys(username);

        WebElement signInPasswordInput = driver.findElement(By.id("id_password"));
        String password = "Devon2004@@";
        signInPasswordInput.sendKeys(password);




        WebElement submitButton = driver.findElement(By.cssSelector("#appMountPoint > div > div.login-body > div > div > div.hybrid-login-form-main > form > button"));
        submitButton.click();

        //driver.close();

    }
}
