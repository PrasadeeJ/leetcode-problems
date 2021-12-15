import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P1929Test {

    private P1929 p1929;

    @Before
    public void setUp() throws Exception {
        p1929 = new P1929();
    }

    @Test
    public void getConcatenation() {
        int[] input1 = {1,2,1};
        int[] output1 = {1,2,1,1,2,1};
        assertArrayEquals( "example1", p1929.getConcatenation(input1), output1);
        int[] input2 = {1,3,2,1};
        int[] output2 = {1,3,2,1,1,3,2,1};
        assertArrayEquals( "example1", p1929.getConcatenation(input2), output2);

    }
}