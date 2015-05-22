import junit.framework.TestCase;

/**
 * Created by indix on 22/5/15.
 */
public class SimpleCalculatorTest extends TestCase {

    public void testMultiply() throws Exception {
        assertEquals(15, new SimpleCalculator().multiply(5, 3));
    }

    public void testMultiply2() throws Exception {
        assertEquals(15, new SimpleCalculator().multiply(3, 5));
    }

}