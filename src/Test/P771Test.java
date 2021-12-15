import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P771Test {

    private P771 p771;

    @Before
    public void setUp() throws Exception {
        p771 = new P771();
    }

    @Test
    public void numJewelsInStones() {
        assertEquals( "example1", p771.numJewelsInStones("aA","aAAbbbb"), 3);
        assertEquals( "example2", p771.numJewelsInStones("z","ZZ"), 0);
    }
}

