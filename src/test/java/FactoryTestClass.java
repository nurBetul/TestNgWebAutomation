import org.testng.annotations.Factory;

public class FactoryTestClass {
    @Factory
    public Object[] factory(){
        return new Object[] {new ClassTest("http://www.google.com","shoes"), new ClassTest("http://www.google.com","computer"), new ClassTest("http://www.google.com","books")};
    }
}
