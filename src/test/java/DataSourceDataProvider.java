import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSourceDataProvider {
    @Test (dataProvider = "DataSource")
    public void test1(String url, String item) throws InterruptedException {
        System.out.println(url + "is being reached by " + item);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='q']")));
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys(item);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys(Keys.ENTER);


    }

    @DataProvider (name = "DataSource")
    public Object[][] getData(){
        return new Object[][]{
                {"http://www.google.com", "shoes"},
                {"http://www.google.com", "computer"},
                {"http://www.google.com", "books"}
        };
    }


}
