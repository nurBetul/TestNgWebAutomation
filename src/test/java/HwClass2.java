import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class HwClass2 {

    @Test
    void class2Method1(){
        System.out.println("Hw class2 method 1 executed.");

    }

    @Test (groups = {"smoketest"})
    void class2Method2(){
        System.out.println("Hw class2 method 2 executed.");
    }
}
