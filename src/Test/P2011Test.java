import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P2011Test {

    private P2011 p2011;

    @Before
    public void setUp() throws Exception {
        p2011 = new P2011();
    }

    @Test
    public void finalValueAfterOperations() {
        String[] input1 = {"--X","X++","X++"};
        assertEquals( "example1", p2011.finalValueAfterOperations(input1), 1);
        String[] input2 = {"++X","++X","X++"};
        assertEquals( "example1", p2011.finalValueAfterOperations(input2), 3);
        String[] input3 = {"X++","++X","--X","X--"};
        assertEquals( "example1", p2011.finalValueAfterOperations(input3), 0);
    }
}