import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExDataProvider {

    @Test (dataProvider = "DataSource")
    public void searchGoogle(String url, String items) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys(items);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }

    @DataProvider (name = "DataSource", parallel = true)
    public Object[][] getData(){
        return new Object[][]{
                {"http://www.google.com", "shoes"},
                {"http://www.google.com", "computer"},
                {"http://www.google.com", "books"},
                {"http://www.google.com", "phones"},
                {"http://www.google.com", "clothes"}
        };

    }
}
