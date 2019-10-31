import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExListener implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

        iTestContext.getCurrentXmlTest().getSuite().setDataProviderThreadCount(6);

    }

    public void onFinish(ITestContext iTestContext) {
        iTestContext.getCurrentXmlTest().getSuite().setDataProviderThreadCount(1);
    }
}
