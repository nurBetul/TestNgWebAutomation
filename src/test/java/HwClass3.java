import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class HwClass3 {


    @Test (groups = {"smoketest"})
    void class3Method1(){
        System.out.println("Hw class3 method 1 executed.");

    }

    @Test
    void class3Method2(){
        System.out.println("Hw class3 method 2 executed.");
    }
}
