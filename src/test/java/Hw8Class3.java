import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hw8Class3 {

    @Test
    void class3Method1(){
        System.out.println("class3 method1");
    }

    @Test(groups = "compatibility")
    void invokeChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nurbe\\Downloads\\chromedriver_77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ebay.com");
        System.out.println("Chrome browser, ebay");

    }

    @Test
    void class3Method2(){
        System.out.println("class3 method2");
    }

    @Test (groups = "compatibility")
    void compatibilityMethod3(){
        System.out.println("This is compatibility method");
    }
}
