import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P1512Test {

    private P1512 p1512;

    @Before
    public void setUp() throws Exception {
        p1512 = new P1512();
    }

    @Test
    public void numIdenticalPairs() {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        assertEquals( "example1", p1512.numIdenticalPairs(nums1), 4);
        int[] nums2 = {1,1,1,1};
        assertEquals( "example2", p1512.numIdenticalPairs(nums2), 6);
        int[] nums3 = {1,2,3};
        assertEquals( "example2", p1512.numIdenticalPairs(nums3), 0);

    }
}