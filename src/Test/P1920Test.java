import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P1920Test {

    private P1920 p1920;

    @Before
    public void setUp() throws Exception {
        p1920 = new P1920();
    }

    @Test
    public void buildArray() {
        int[] nums1 = {0,2,1,5,3,4};
        int[] output1 = {0,1,2,4,5,3};
        assertArrayEquals("example1", p1920.buildArray(nums1),output1 );
        int[] nums2 = {5,0,1,2,3,4};
        int[] output2 = {4,5,0,1,2,3};
        assertArrayEquals("example2", p1920.buildArray(nums2),output2 );

    }
}