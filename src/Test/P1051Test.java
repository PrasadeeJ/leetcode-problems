import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P1051Test {

    private P1051 p1051;

    @Before
    public void setUp() throws Exception {
        p1051 = new P1051();
    }

    @Test
    public void heightChecker() {
        int nums1[] = {1,1,4,2,1,3};
        assertEquals("example1", p1051.heightChecker(nums1),3 );
        int nums2[] = {5,1,2,3,4};
        assertEquals("example1", p1051.heightChecker(nums2),5 );
        int nums3[] = {1,2,3,4,5};
        assertEquals("example1", p1051.heightChecker(nums3),0 );

    }
}