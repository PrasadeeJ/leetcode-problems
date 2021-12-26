import java.util.Arrays;
import java.util.stream.Collectors;

public class P1480 {

    public static int[] runningSum(int[] nums) {
        int[]  output = new int[nums.length];
        int sum= 0;
        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            output[i] = sum;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ints = runningSum(nums);
        System.out.println(
                Arrays.stream(ints)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(", ", "[", "]")));
    }
}
