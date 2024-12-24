import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class VerizonTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://verizon.com");


        WebElement searchBar = driver.findElement(By.id("gnav20-search-icon"));
        searchBar.click();
        WebElement searchInput = driver.findElement(By.id("search_box_gnav_input"));
        searchInput.sendKeys("iPhone 15");
        searchInput.submit();

        WebElement iphoneScreenSearchBar = driver.findElement(By.id("search_box_one_search_input"));
        Actions actions = new Actions(driver);
        actions.keyDown(iphoneScreenSearchBar, Keys.SHIFT);
        actions.sendKeys("ToBeUpperCase");
        actions.keyUp(Keys.SHIFT);





        driver.quit();
    }
}
