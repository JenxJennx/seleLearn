import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class udemyTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromeDriver");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.verizon.com/home/internet/");
        FluentWait wait = new FluentWait(driver);

        WebElement signUpButton = driver.findElement(By.cssSelector("#gnav20-sign-id-mobile > span > span"));
        wait.ignoring(NoSuchElementException.class);

        //Clicking with javascript executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", signUpButton);

        //setting up timeouts
        ((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");
        //driver.close();

        //changing the webpage
        //((JavascriptExecutor) driver).executeScript("window.location = 'https://wikipedia.com'");

        //scroll webpage
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");


    }
}
