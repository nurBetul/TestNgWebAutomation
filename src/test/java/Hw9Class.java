import org.testng.annotations.*;

public class Hw9Class {
    @BeforeClass
    void login(){
        System.out.println("Logged in");
    }
    @BeforeMethod
    void prepareData(){
        System.out.println("Data prepared");
    }

    @AfterMethod
    void displayData(){
        System.out.println("Data displayed");

    }
    @Test
    void changeData(){
        System.out.println("Data changed");
    }

    @Test
    void changeDataAgain(){
        System.out.println("Data changed again");
    }

    @AfterClass
    void logout(){
        System.out.println("Logged out");
    }





}
