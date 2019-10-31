import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;

public class HwClass1 {
    @Test (groups = {"smoketest"})
    void class1Method1(){
        System.out.println("Hw class1 method 1 executed.");

    }
    @AfterGroups (groups = {"smoketest"})
    void class1Method2(){
        System.out.println("Hw class1 method 2 executed.");
    }
}
