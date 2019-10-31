import org.testng.annotations.Test;

public class GroupingTests {
    @Test (groups = {"SmokeTest"})
    public void Test1(){
        System.out.println("Test 1 is executed.Smoke1");
    }
    @Test
    public void Test2(){
        System.out.println("Test 2 is executed.");
    }
    @Test
    public void Test3(){
        System.out.println("Test 3 is executed.");
    }
    @Test (groups = {"SmokeTest"})
    public void Test4(){
        System.out.println("Test 4 is executed.Smoke2");
    }
}
