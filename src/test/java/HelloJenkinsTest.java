import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloJenkinsTest {

    @Test
    public void testAddition() {

        int a = 10;
        int b = 20;

        assertEquals(30, a + b);
    }

    @Test
    public void testSubtraction() {

        int a = 20;
        int b = 10;

        assertEquals(10, a - b);
    }
}