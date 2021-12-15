import java.util.Arrays;
import java.util.stream.Collectors;

public class P1920 {

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i <nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ints = buildArray(nums);
        System.out.println(
                Arrays.stream(ints)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(", ", "[", "]")));
    }
}
