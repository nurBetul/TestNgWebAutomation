
    import org.testng.annotations.Test;
    public class ClassTest
    {
        String url;
        String item;
        public ClassTest(String url, String item)
        {
            this.url = url;
            this.item = item;
        }
        @Test
        public void test2()
        {
            System.out.println("test2");
        }
        @Test
        public void test3()
        {
            System.out.println("test3");
        }
    }

