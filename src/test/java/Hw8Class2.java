import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Hw8Class2 {

    @Test
    void class2Method1(){
        System.out.println("Class2 Method1");

    }

    @Test(groups = "compatibility")
    void invokeFirefox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\nurbe\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.amazon.com");
        System.out.println("Firefox browser, amazon");

    }
    @Test
    void class2Method2(){
        System.out.println("Class2 Method2");

    }

    @Test (groups = "compatibility")
    void compatibilityMethod2(){
        System.out.println("This is compatibility method");
    }
}
