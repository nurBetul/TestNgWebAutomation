import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Hw8Class4 {
    @Test
    void class4Method1(){
        System.out.println("class4 method1");
    }
    @Test(groups = "compatibility")
    void invokeFirefox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\nurbe\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.expedia.com");
        System.out.println("Firefox browser, expedia");
    }
    @Test
    void class4Method2(){
        System.out.println("class4 method2");
    }
    @Test (groups = "compatibility")
    void compatibilityMethod4(){
        System.out.println("This is compatibility method");
    }





}
