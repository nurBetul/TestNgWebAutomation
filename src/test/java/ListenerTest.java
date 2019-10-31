import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//@Listeners (Listener.class)
public class ListenerTest {

    @Test
    public void test () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.demo.guru99.com/v4");
        Thread.sleep(1000);
        driver.findElement(By.name("uid")).sendKeys("mngr230511");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("baryzYb");
        Thread.sleep(1000);
        driver.findElement(By.name("btnLogin")).click();
        Thread.sleep(1000);
        String str = driver.findElement(By.linkText("Demo Site")).getText();
        if(str.contains("Demo")){
            Assert.assertTrue(true);
            System.out.println("passed");
        }
        else{
            Assert.assertTrue(false);
            System.out.println("failed");
        }


    }
}
