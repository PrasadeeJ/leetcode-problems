import java.util.Arrays;
import java.util.stream.Collectors;

public class P1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counter = new int[101];
        for (int num:nums) {
            counter[num]++;
        }
        int sum = 0;
        int[] sum1 = new int[101];
        for (int i = 0; i < 101; i++) {
            sum1[i] = sum;
            sum += counter[i];
        }
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = sum1[nums[i]];
        }
        return output;
    }



    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ints = smallerNumbersThanCurrent(nums);
        System.out.println(
                Arrays.stream(ints)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(", ", "[", "]")));
    }
}
