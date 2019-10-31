import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

@Test
public class RetryFailedTestClass implements IRetryAnalyzer {
    private int retryCnt=0;
    private int maxRetsyCnt=2;


    public boolean retry(ITestResult result) {
        if(retryCnt < maxRetsyCnt){
            System.out.println("Retrying " + result.getName()+ " again and the count is " + retryCnt+1);
            retryCnt++;
            return true;
        }
        return false;
    }
}
