import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {

    @Parameters ({"url","username","password"})
    @Test
    public void testCase4(String url, String username, String password){
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
        System.out.println("I logged in");
    }
}
