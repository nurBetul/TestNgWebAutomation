import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelDataProvider {
    @BeforeClass
    public void setThread(ITestContext con){
        con.getCurrentXmlTest().getSuite().setDataProviderThreadCount(3);
    }

    @Test (dataProvider = "DataSource")
    public void test(int i, String y) {
        long id = Thread.currentThread().getId();
        System.out.println(i + " - "+ y + " has been executed in thread number " + id);

    }

    @DataProvider (name= "DataSource", parallel = true)
    public Object[][] getData(){
        return new Object[][]{
                {1,"a"},
                {2,"b"},
                {3,"c"},
                {4,"e"},
                {5,"f"},
                {6,"g"},
                {7,"h"},
                {8,"i"},
                {9,"j"},
                {10,"k"}
        };
    }

}
