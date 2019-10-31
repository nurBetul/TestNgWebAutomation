import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.annotation.ParametersAreNonnullByDefault;

public class Hw10Class {
    public String word;

    @Factory (dataProvider = "DataSource")
    public Hw10Class(String word){
        this.word = word;
    }

    @Parameters ("url")
    @Test
    public void invokeChrome(String url){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

    }

    @DataProvider (name="DataSource")
    public Object[][] getData(){
        return new Object[][]{
                {"http://www.google.com", "shoes"},
                {"http://www.google.com", "computer"},
                {"http://www.google.com", "books"}
        };

    }
}
