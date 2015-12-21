import static org.junit.Assert.*;

import david.test.HelloWorld;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by dbatty on 12/21/2015.
 */
public class HelloWorldTest {

    private HelloWorld h;

    @Before
    public void setUp() throws Exception
    {
        h = new HelloWorld();
    }

    @Test
    public void testMain() throws Exception {
        assertEquals(h.getMessage(),"HelloWorld");
    }
}