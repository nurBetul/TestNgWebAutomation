import org.testng.annotations.Test;

public class HomeworkClass1 {
    @Test (dependsOnMethods = "methodA5")
    void methodA1(){
        System.out.println("A1 is running.");
    }
    @Test (dependsOnMethods = "methodA4")
    void methodA2(){
        System.out.println("A2 is running.");
    }
    @Test (dependsOnMethods = "methodA2")
    void methodA3(){
        System.out.println("A3 is running.");
    }
    @Test (dependsOnMethods = "methodA1")
    void methodA4(){
        System.out.println("A4 is running.");

    }
    @Test
    void methodA5(){
        System.out.println("A5 is running.");
    }


}
