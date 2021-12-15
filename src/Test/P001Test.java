import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P001Test {

    private P001 p001;

    @Before
    public void setUp() throws Exception {
        p001 = new P001();
    }

    @Test
    public void twoSum() {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        int[] output1 = {0,1};
        assertArrayEquals("example1", p001.twoSum(nums1, target1),output1 );
        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] output2 = {1,2};
        assertArrayEquals("example1", p001.twoSum(nums2, target2),output2 );
        int[] nums3 = {3,3};
        int target3 = 6;
        int[] output3 = {0,1};
        assertArrayEquals("example1", p001.twoSum(nums3, target3),output3);
    }
}