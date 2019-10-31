import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest2 {

    @Test
    public void testToBeFailed(){
        Assert.assertTrue(false);
    }
}
