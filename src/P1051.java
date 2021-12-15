import java.util.Arrays;

public class P1051 {

    public static int heightChecker(int[] heights) {
        int[] initial = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < initial.length; i++) {
            if (heights[i] != initial[i]) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {1,1,4,2,1,3};
        System.out.println(heightChecker(nums));

    }
}
