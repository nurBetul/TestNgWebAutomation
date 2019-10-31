import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hw8Class1 {
    @Test
    void class1Method1(){
        System.out.println("Class1 Method1");
    }

    @Test (groups = "compatibility")
    void invokeChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nurbe\\Downloads\\chromedriver_77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println("Chrome browser, google");

    }

    @Test
    void class1Method2(){
        System.out.println("Class1 Method2");
    }

    @Test (groups = "compatibility")
    void compatibilityMethod1(){
        System.out.println("This is compatibility method");
    }




}
