import org.testng.annotations.*;

public class HwClass4 {
    @Test (groups = {"smoketest"})
    void class4Method1(){
        System.out.println("Hw class4 method 1 executed.");

    }

    @BeforeGroups (groups = {"smoketest"})
    void class4Method2(){
        System.out.println("Hw class4 method 2 executed.");
    }
}
