import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P1828Test {

    private P1828 p1828;

    @Before
    public void setUp() throws Exception {
        p1828 = new P1828();
    }

    @Test
    public void countPoints() {
        int[][] points1 = {{1,3},{3,3},{5,3},{2,2}};
        int[][] queries1 = {{2,3,1},{4,3,1},{1,1,2}};
        int[] response1 = {3,2,2};
        assertArrayEquals( "example1", p1828.countPoints(points1,queries1), response1);
        int[][] points2 = {{1,1},{2,2},{3,3},{4,4},{5,5}};
        int[][] queries2 = {{1,2,2},{2,2,2},{4,3,2},{4,3,3}};
        int[] response2 = {2,3,2,4};
        assertArrayEquals( "example2", p1828.countPoints(points2,queries2), response2);

    }
}