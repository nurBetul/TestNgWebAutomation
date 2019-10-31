import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class ExpectedExceptions {
    @Test (expectedExceptions = {ArithmeticException.class, NoSuchElementException.class, NullPointerException.class})
    public void divisionWithException(){
        double a = 1/0;
    }

    @Test
    public void divisionWithException2(){

       try{double b = 2/0;
       } catch (ArithmeticException e){
           System.out.println("Test passed anyway :)");
       }


    }
}
