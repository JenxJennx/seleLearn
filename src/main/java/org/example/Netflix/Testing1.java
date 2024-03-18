package org.example.Netflix;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Testing1 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver(); //use of polymorphism to create an instance of chromedriver and assigning it to a variable of type webdriver. Interact with chromedriver through the webdriver interface
        System.setProperty("webdriver.chrome.driver", "chromedriver"); //Provides the path to the webdriver executable for Chrome. Its a map key and value
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //ensures the webdriver waits certains amount of time before doing its search so it doesnt throw an exception
        webDriver.manage().window().maximize();
        webDriver.get("https://www.verizon.com/");
        WebElement signInButton = webDriver.findElement(By.id("gnav20-sign-id"));

        signInButton.click();
//        WebElement signInAccount = webDriver.findElement(By.className("<p class=\"gnav20-signin-content-title\">Sign in</p>"));
//        signInAccount.click();

        String expectedSignIn = "Sign in";
        WebElement actualSignIn = webDriver.findElement(By.id("gnav20-sign-id"));

        if(actualSignIn.getText().equals(expectedSignIn)){
            System.out.println("The sign in is SignIn");
        }
        else{
            System.out.println("The sign in is not correct");
        }
        webDriver.navigate().to("https://www.google.com/");

        WebElement searchBar = webDriver.findElement(By.cssSelector("#APjFqb"));
        String searchStr = "Romantic killer anime";
        searchBar.sendKeys(searchStr);

        searchBar.sendKeys(Keys.ENTER);

        //webDriver.close();


    }
}
